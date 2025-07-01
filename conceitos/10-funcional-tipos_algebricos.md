# Tipos de Dados Algébricos (ADTs) e Reconhecimento de Padrões

**"Álgebra de tipos"** define as **operações utilizadas para construir novos tipos** de dados a partir de tipos existentes.

## Operação "produto"
A operação "produto" consiste em agrupar vários tipos, como fazemos em classes e estruturas.

Em Kotlin, usamos `data class` para criar tipos de produto.

**Exemplo**: um `Envio` que contém informações sobre uma transportadora **E** um código de rastreio.
```kotlin
data class Envio(val transportadora: String, val codigoRastreio: String)

fun main() {
    val meuPedidoEnviado = Envio(transportadora = "Correios", codigoRastreio = "BR123456789BR")    
    println("Seu pedido foi enviado pela ${meuPedidoEnviado.transportadora} com o código ${meuPedidoEnviado.codigoRastreio}.")
}
```

### `data class`

É uma classe cujo propósito é armazenar dados. Kotlin gera automaticamente métodos como `equals`, `hashCode`, `toString`, e `copy`.

Algumas características:
- Representação legível (implementada no `toString`).
- Comparação dos conteúdos (implementada no `equals`), não das referências.
- Pode herdar de outras classes, mas não pode ser herdada por outras classes.


## Operação "soma"
A operação "soma" permite que um tipo **possa ser um de vários tipos diferentes**.

Em Kotlin, o resultado da "soma" é um `sealed class`, e as diferentes opções (subclasses) são representadas por `data class` (subclasses com dados) ou `object` (subclasses sem dados).

**Exemplo**: Uma requisição de rede pode ser um sucesso **OU** uma falha **OU** pode estar em andamento.
O sucesso contém os dados recebidos e o código de retorno, a falha contém uma mensagem de erro e o estado de carregamento não contém dados.
```kotlin
sealed class ResultadoRequisicao {
    data class Sucesso(val conteudo: String, val cod_retorno: Int) : ResultadoRequisicao()
    data class Falha(val msg: String) : ResultadoRequisicao()
    object Carregando : ResultadoRequisicao()
}

fun exibirStatus(resultado: ResultadoRequisicao) {
    when (resultado) {
        is ResultadoRequisicao.Sucesso -> {
            println("Dados recebidos com sucesso: ${resultado.conteudo} (com código ${resultado.cod_retorno})")
        }
        is ResultadoRequisicao.Falha -> {
            println("Ocorreu um erro: resultado.msg")
        }
        is ResultadoRequisicao.Carregando -> {
            println("Aguarde, carregando dados...")
        }
    }
}

fun main() {
    val resultadoSucesso = ResultadoRequisicao.Sucesso("Dados recebidos...", 0)
    val resultadoFalha = ResultadoRequisicao.Falha("Sem conexão com a internet")
    val resultadoCarregando = ResultadoRequisicao.Carregando

    exibirStatus(resultadoSucesso)
    exibirStatus(resultadoFalha)
    exibirStatus(resultadoCarregando)
}
```
Saída:
```
Dados recebidos com sucesso: Dados recebidos... (com código 0)
Ocorreu um erro: resultado.msg
Aguarde, carregando dados...
```

### Reconhecimento (exaustivo) de padrões

O `sealed class` informa ao compilador que todas as subclasses são conhecidas em tempo de compilação (definidas no mesmo arquivo), permitindo que o compilador avise caso algum subtipo não esteja considerado em uma expressão `when`.

**Exemplo** (anterior): removendo a condição `is ResultadoRequisicao.Falha` em `exibirStatus`, o compilador irá gerar o erro abaixo:
```
Error: 'when' expression must be exhaustive. Add the 'is Falha' branch or an 'else' branch.
```

### Quando a operação "soma" resulta em um tipo paramétrico

**Exemplo** (anterior): suponha que desejamos ter flexibilidade no tipo armazenado em caso de sucesso.

```kotlin
data class Dados(val conteudo: String, val cod_retorno: Int)

sealed class ResultadoRequisicao<out T> {
    data class Sucesso<T>(val dados: T) : ResultadoRequisicao<T>()
    data class Falha(val msg: String) : ResultadoRequisicao<Nothing>()
    object Carregando : ResultadoRequisicao<Nothing>()
}

fun exibirStatus(resultado: ResultadoRequisicao<Dados>) {
    when (resultado) {
        is ResultadoRequisicao.Sucesso -> {
            println("Dados recebidos com sucesso: ${resultado.dados.conteudo} (código {resultado.dados.cod_retorno})")
        }
        is ResultadoRequisicao.Falha -> {
            println("Ocorreu um erro: resultado.msg")
        }
        is ResultadoRequisicao.Carregando -> {
            println("Aguarde, carregando dados...")
        }
    }
}

fun main() {
    val resultadoSucesso = ResultadoRequisicao.Sucesso(Dados("Dados recebidos...", 0))
    val resultadoFalha = ResultadoRequisicao.Falha("Sem conexão com a internet")
    val resultadoCarregando = ResultadoRequisicao.Carregando

    exibirStatus(resultadoSucesso)
    exibirStatus(resultadoFalha)
    exibirStatus(resultadoCarregando)
}
```
- `out T` indica que se `T` é um subtipo de `U`, então `ResultadoRequisicao<T>` é um subtipo de `ResultadoRequisicao<U>`.
    - Isto é necessário para garantir que o tipo `Sucesso<T>` seja um subtipo de `ResultadoRequisicao<T>`, para qualquer tipo `T`.
- As outras ocorrências de `ResultadoRequisicao` precisam ter parâmetro de tipo `Nothing`, pois não são parametrizados por `T`.
    - Funciona pois `Nothing` é um subtipo de todos os outros tipos: `ResultadoRequisicao<Nothing>` é um subtipo de `ResultadoRequisicao<T>` para qualquer tipo `T`.
- Obs.: O `is` no `when` é opcional quando o subtipo é um `object`. Ou seja, não é obrigatório usar em `is ResultadoRequisicao.Carregando`.

### Como evitar o uso da classe "soma" como prefixo das subclasses

**Exemplo** (anterior): para evitar ter que usar o prefixo `ResultadoRequisicao` em cada uso, podemos declarar as subclasses fora das chaves do `sealed class`.
```kotlin
sealed class ResultadoRequisicao
data class Sucesso<T>(val dados: T) : ResultadoRequisicao()
data class Falha(val msg: String) : ResultadoRequisicao()
object Carregando : ResultadoRequisicao()
```

## Tipos recursivos

Quando a definição de um tipo utiliza ele mesmo.

**Exemplo**: em um sistema de arquivos, podemos ter arquivos e diretórios, onde um diretório pode conter outros arquivos e diretórios, formando uma estrutura recursiva.
```kotlin
sealed class NoSistemaArquivos {
    data class Arquivo(val nome: String, val tamanho: Long) : NoSistemaArquivos()
    data class Diretorio(val nome: String, val conteudos: List<NoSistemaArquivos>) : NoSistemaArquivos()
}
```
- Note que `Diretorio` contém uma lista de outros `NoSistemaArquivos`, onde cada um pode ser um `Arquivo` ou outro `Diretorio`.
