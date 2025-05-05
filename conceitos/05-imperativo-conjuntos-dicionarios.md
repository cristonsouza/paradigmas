# 05 - IMPERATIVO - Conjuntos e Dicionários

## Conjuntos (Sets)

Um `Set` é uma coleção que não contém elementos duplicados e a ordem dos elementos não é garantida.

**Tipos de Sets em Kotlin:**

Kotlin oferece dois tipos principais de `Set`:

* **`Set` (imutável):** Um conjunto somente leitura. Uma vez criado, você não pode adicionar ou remover elementos.
* **`MutableSet` (mutável):** Um conjunto que permite adicionar e remover elementos.

**Criação de Sets:**

Você pode criar `Sets` usando as seguintes funções:

* **`setOf()`:** Cria um `Set` contendo os elementos fornecidos.
    ```kotlin
    val frutas = setOf("maçã", "banana", "laranja")
    println(frutas) 
    // Saída: [maçã, banana, laranja] (a ordem pode variar)
    ```

* **`mutableSetOf()`:** Cria um `MutableSet` contendo os elementos fornecidos.
    ```kotlin
    val numeros = mutableSetOf(1, 2, 3, 2, 4)
    println(numeros) 
    // Saída: [1, 2, 3, 4] (duplicatas são removidas)
    ```

    Para criar um MutableSet vazio, utilize `mutableMapOf<Tipo>()`.
    ```kotlin
    val numeros = mutableSetOf<Int>()
    ```

**Operações Comuns em Sets:**

Aqui estão algumas operações comuns que você pode realizar em `Sets`:

* **`size`:** Retorna o número de elementos no conjunto.
    ```kotlin
    println(frutas.size) // Saída: 3
    ```

* **`contains(element)`:** Verifica se o conjunto contém o elemento especificado.
    ```kotlin
    println(frutas.contains("banana")) // Saída: true
    println(frutas.contains("uva"))    // Saída: false
    ```

* **`add(element)` (somente para `MutableSet`):** Adiciona um elemento ao conjunto. Se o elemento já existir, o conjunto não é modificado.
    ```kotlin
    val cores = mutableSetOf("vermelho", "verde")
    cores.add("azul")
    println(cores) // Saída: [vermelho, verde, azul]
    cores.add("vermelho")
    println(cores) // Saída: [vermelho, verde, azul] (nenhuma alteração)
    ```

* **`remove(element)` (somente para `MutableSet`):** Remove o elemento especificado do conjunto.
    ```kotlin
    cores.remove("verde")
    println(cores) 
    // Saída: [vermelho, azul]
    // Obs.: apenas retorna 'false' quando 'element' não está no conjunto.
    ```

* **`union(otherSet)`:** Retorna um novo conjunto contendo todos os elementos deste conjunto e do outro conjunto.
    ```kotlin
    val conjunto1 = setOf(1, 2, 3)
    val conjunto2 = setOf(3, 4, 5)
    val uniao = conjunto1.union(conjunto2)
    println(uniao) 
    // Saída: [1, 2, 3, 4, 5]
    ```

* **`intersect(otherSet)`:** Retorna um novo conjunto contendo apenas os elementos que estão presentes em ambos os conjuntos.
    ```kotlin
    val intersecao = conjunto1.intersect(conjunto2)
    println(intersecao) 
    // Saída: [3]
    ```

* **`subtract(otherSet)`:** Retorna um novo conjunto contendo os elementos deste conjunto que não estão presentes no outro conjunto.
    ```kotlin
    val diferenca = conjunto1.subtract(conjunto2)
    println(diferenca) 
    // Saída: [1, 2]
    ```

**Iteração em Sets:**

Você pode iterar sobre os elementos de um `Set` usando um loop `for`:

```kotlin
val letras = setOf('a', 'b', 'c')
for (letra in letras) {
    println(letra)
}
// A saída pode ser em qualquer ordem:
// a
// c
// b
```

**Quando usar Sets?**

`Sets` são úteis quando você precisa armazenar uma coleção de elementos únicos e a ordem dos elementos não é importante. Alguns casos de uso comuns incluem:

* Remover duplicatas de uma lista.
* Verificar a presença de um elemento em uma coleção de forma eficiente.
* Realizar operações de conjunto como união, interseção e diferença.








## Dicionários (Maps)

Um `Map` é uma coleção que armazena pares de chave-valor. Cada chave é única dentro do mapa e está associada a um valor específico. Os mapas são úteis quando você precisa acessar valores rapidamente com base em uma chave.

**Tipos de Maps em Kotlin:**

Kotlin oferece dois tipos principais de `Map`:

* **`Map` (imutável):** Representa um mapa somente leitura. Uma vez criado, você não pode adicionar ou remover pares de chave-valor.
* **`MutableMap` (mutável):** Um mapa que permite adicionar, remover e atualizar pares de chave-valor.

**Criação de Maps:**

Você pode criar `Maps` usando as seguintes funções:

* **`mapOf()`:** Cria um `Map` contendo os pares de chave-valor fornecidos. Os pares são definidos usando a notação `chave to valor`.
    ```kotlin
    val idades = mapOf("Alice" to 30, "Bob" to 25, "Charlie" to 35)
    println(idades) 
    // Saída: {Alice=30, Bob=25, Charlie=35} (a ordem pode variar)
    ```

* **`mutableMapOf()`:** Cria um `MutableMap` contendo os pares de chave-valor fornecidos.
    ```kotlin
    val pontuacoes = mutableMapOf("JogadorA" to 100, "JogadorB" to 150)
    println(pontuacoes) 
    // Saída: {JogadorA=100, JogadorB=150}
    ```

    Para criar um MutableMap vazio, utilize `mutableMapOf<TipoChave, TipoValor>()`.
    ```kotlin
    val idades: MutableMap<String, Int> = mutableMapOf()
    ```


**Acesso a Valores:**

Você pode acessar o valor associado a uma chave de várias maneiras:

* **Usando o operador de índice `[]`:**
    ```kotlin
    val idadeAlice = idades["Alice"]
    println(idadeAlice) // Saída: 30

    val idadeDesconhecida = idades["David"]
    println(idadeDesconhecida) // Saída: null (se a chave não existir)
    ```
    **Obs.:** Ao usar o `[]` dentro de uma expressão, pode encontrar um erro do tipo `Argument type mismatch: actual type is 'Int?', but 'Int' was expected`. É possível resolver usando a função `getOrDefault` (a seguir).
    A causa deste erro ficará clara na aula sobre tipos algébricos.

* **Usando a função `get(key)`:**
    ```kotlin
    val idadeBob = idades.get("Bob")
    println(idadeBob) // Saída: 25

    val idadeEva = idades.get("Eva")
    println(idadeEva) // Saída: null (se a chave não existir)
    ```

* **Usando a função `getValue(key)`:** Esta função é semelhante a `get()`, mas lança uma exceção (`NoSuchElementException`) se a chave não existir.
    ```kotlin
    val idadeCharlie = idades.getValue("Charlie")
    println(idadeCharlie) // Saída: 35

    // A linha abaixo lançará uma exceção
    // val idadeFrank = idades.getValue("Frank")
    ```

* **Usando a função `getOrDefault(key, defaultValue)`:** Esta função é semelhante a `get()`, mas retorna `defaultValue` se a chave não existir.
    ```kotlin
    val idadeFrank = idades.getOrDefault("Frank", 0) // Saída: 0
    ```


**Operações Comuns em Maps:**

Aqui estão algumas operações comuns que você pode realizar em `Maps`:

* **`size`:** Retorna o número de pares de chave-valor no mapa.
    ```kotlin
    println(idades.size) // Saída: 3
    ```

* **`containsKey(key)`:** Verifica se o mapa contém a chave especificada.
    ```kotlin
    println(idades.containsKey("Alice")) // Saída: true
    println(idades.containsKey("David")) // Saída: false
    ```

* **`containsValue(value)`:** Verifica se o mapa contém o valor especificado.
    ```kotlin
    println(idades.containsValue(30)) // Saída: true
    println(idades.containsValue(40)) // Saída: false
    ```

* **`put(key, value)` (somente para `MutableMap`):** Adiciona um novo par de chave-valor ao mapa ou atualiza o valor de uma chave existente.
    ```kotlin
    pontuacoes.put("JogadorC", 200)
    println(pontuacoes) // Saída: {JogadorA=100, JogadorB=150, JogadorC=200}

    pontuacoes.put("JogadorA", 120) // Atualiza o valor da chave "JogadorA"
    println(pontuacoes) // Saída: {JogadorA=120, JogadorB=150, JogadorC=200}
    ```

* **`remove(key)` (somente para `MutableMap`):** Remove o par de chave-valor associado à chave especificada. Retorna o valor associado à chave removida ou `null` se a chave não existir.
    ```kotlin
    val pontuacaoRemovida = pontuacoes.remove("JogadorB")
    println("Pontuação removida: $pontuacaoRemovida, Mapa após remoção: $pontuacoes")
    // Saída: Pontuação removida: 150, Mapa após remoção: {JogadorA=120, JogadorC=200}

    val pontuacaoNaoExistente = pontuacoes.remove("JogadorD")
    println("Pontuação removida: $pontuacaoNaoExistente, Mapa após remoção: $pontuacoes")
    // Saída: Pontuação removida: null, Mapa após remoção: {JogadorA=120, JogadorC=200}
    ```

* **`putAll(otherMap)` (somente para `MutableMap`):** Adiciona todos os pares de chave-valor de outro mapa a este mapa.
    ```kotlin
    val novasPontuacoes = mapOf("JogadorD" to 180, "JogadorE" to 220)
    pontuacoes.putAll(novasPontuacoes)
    println(pontuacoes) 
    // Saída: {JogadorA=120, JogadorC=200, JogadorD=180, JogadorE=220}
    ```

**Iteração em Maps:**

Você pode iterar sobre os pares de chave-valor de um `Map` de várias maneiras:

* **Iterando sobre as entradas (chave-valor):**
    ```kotlin
    for ((chave, valor) in idades) {
        println("Nome: $chave, Idade: $valor")
    }
    // Saída (a ordem pode variar):
    // Nome: Alice, Idade: 30
    // Nome: Bob, Idade: 25
    // Nome: Charlie, Idade: 35
    ```

* **Iterando sobre as chaves:**
    ```kotlin
    for (chave in idades.keys) {
        println("Chave: $chave")
    }
    // Saída (a ordem pode variar):
    // Chave: Alice
    // Chave: Bob
    // Chave: Charlie
    ```

* **Iterando sobre os valores:**
    ```kotlin
    for (valor in idades.values) {
        println("Valor: $valor")
    }
    // Saída (a ordem pode variar):
    // Valor: 30
    // Valor: 25
    // Valor: 35
    ```

**Quando usar Maps?**

`Maps` são úteis quando você precisa associar informações a chaves exclusivas e precisa acessar esses dados de forma eficiente usando essas chaves. Alguns casos de uso comuns incluem:

* Representar bancos de dados simples em memória (ex.: configurações de um programa).
* Contar a frequência de palavras em um texto.
* Mapear identificadores a objetos.
