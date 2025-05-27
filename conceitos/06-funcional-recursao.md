# 06 - FUNCIONAL - Restrições e recursão

## Programação Funcional

A **programação funcional** é um paradigma de programação que trata a **computação como funções matemáticas** e **evita estados mutáveis** e dados modificáveis. Em vez de sequências de comandos que alteram o estado do programa (como na programação imperativa), na programação funcional você trabalha com expressões.

### Restrições Essenciais

Na programação funcional, há duas restrições importantes que promovem um código mais previsível e livre de efeitos colaterais:

#### 1. Restrição ao Uso de Comandos de Atribuição (Imutabilidade)

O conceito central aqui é a **imutabilidade**. Isso significa que, uma vez que um valor é atribuído a uma variável, ele não pode ser alterado. Em Kotlin, isso é fortemente incentivado com o **uso de `val` em vez de `var`**.

**Por que isso é bom?**

* **Menos bugs:** Se um valor não pode ser alterado, é muito **mais fácil rastrear seu comportamento** e evitar modificações inesperadas que podem levar a erros difíceis de depurar.
* **Código mais previsível:** Funções que operam apenas em valores de entrada e produzem valores de saída, **sem alterar nada fora de seu escopo**, são chamadas de **funções puras**. Elas são mais fáceis de testar e raciocinar sobre elas.
* **Concorrência simplificada:** Em sistemas multi-threaded, dados mutáveis são uma fonte comum de problemas de concorrência (como condições de corrida). Com dados imutáveis, você não precisa se preocupar com múltiplos threads alterando o mesmo dado simultaneamente.

**Exemplo em Kotlin (Sem atribuição/mutabilidade):**

Em vez de modificar uma lista existente, criamos uma nova com as transformações.

```kotlin
// Abordagem Imperativa (com mutabilidade)
fun dobrarValoresMutavel(lista: MutableList<Int>) {
    for (i in lista.indices) {
        lista[i] = lista[i] * 2
    }
}

val numerosMutaveis = mutableListOf(1, 2, 3)
dobrarValoresMutavel(numerosMutaveis)
println("Lista mutável dobrada: $numerosMutaveis") // Saída: [2, 4, 6]

// Abordagem Funcional (com imutabilidade)
fun dobrarValoresRecursivo(lista: List<Int>): List<Int> {

    // Caso base: se a lista estiver vazia, retorna uma lista vazia
    if (lista.isEmpty()) {
        return emptyList()
    }

    // Pega o primeiro elemento e o resto da lista
    val cabeca = lista.first()
    val cauda = lista.drop(1) // drop(1) retorna uma nova lista sem o primeiro elemento

    // Dobra o primeiro elemento e concatena com o resultado da recursão para a cauda
    return listOf(cabeca * 2) + dobrarValoresRecursivo(cauda)
}

val numerosImutaveis = listOf(1, 2, 3)
val numerosDobrados = dobrarValoresRecursivo(numerosImutaveis)
println("Lista original imutável: $numerosImutaveis") // Saída: [1, 2, 3]
println("Nova lista dobrada (recursiva): $numerosDobrados") // Saída: [2, 4, 6]
```

#### 2. Restrição ao Uso de Laços (loops)

Em programação funcional, evitamos loops imperativos (como `for` e `while`). Em vez disso, usamos **funções de ordem superior** (funções que recebem funções, como `map`, `filter`, `fold`) ou **recursão**. Essas funções abstraem o processo de iteração e operam em coleções de dados.

**Por que isso é bom?**

* **Código mais conciso e legível:** As funções de ordem superior expressam a *intenção* da operação de forma mais clara do que um loop manual.
* **Menos propenso a erros:** Você **não precisa gerenciar índices ou condições de parada de loop** manualmente, o que reduz a chance de erros como loops infinitos ou erros de "off-by-one".
* **Mais fácil de paralelizar:** Muitas dessas operações podem ser paralelizadas automaticamente pelo framework ou linguagem, sem que você precise escrever código complexo para isso.

**Exemplo em Kotlin (Sem laços):** (além do exemplo anterior)

```kotlin
val produtos = listOf(
    Pair("Camiseta", 29.90),
    Pair("Calça Jeans", 89.90),
    Pair("Meia", 9.50),
    Pair("Boné", 35.00)
)

// Abordagem Imperativa (com laço 'for')
fun calcularTotalImperativo(produtos: List<Pair<String, Double>>): Double {
    var total = 0.0
    for (produto in produtos) {
        total += produto.second
    }
    return total
}

println("Total imperativo: ${calcularTotalImperativo(produtos)}")

// Abordagem Funcional (usando recursão para calcular o total)
fun calcularTotalRecursivo(produtos: List<Pair<String, Double>>): Double {

    // Caso base: se a lista estiver vazia, o total é 0
    if (produtos.isEmpty()) {
        return 0.0
    }

    // Pega o preço do primeiro produto e soma com o resultado da recursão para o resto da lista
    val precoCabeca = produtos.first().second
    val cauda = produtos.drop(1)

    return precoCabeca + calcularTotalRecursivo(cauda)
}

println("Total recursivo: ${calcularTotalRecursivo(produtos)}") // Saída: 164.4
```

---

### Recursão de Cauda (Tail Recursion)

Quando evitamos laços, a **recursão** se torna uma ferramenta fundamental para repetir operações. No entanto, a **recursão comum pode levar a problemas de estouro de pilha** (`StackOverflowError`) em linguagens que não otimizam chamadas recursivas, pois cada chamada de função adiciona um novo frame à pilha de chamadas.

A **recursão de cauda** (tail recursion) é um tipo especial de recursão onde a **chamada recursiva é a última operação** executada na função. Isso permite que o **compilador otimize** a chamada recursiva, **transformando-a em uma iteração** (basicamente, um loop), eliminando assim o risco de estouro de pilha.

**Em Kotlin**, você pode indicar que uma função deve ser otimizada para recursão de cauda usando a **palavra-chave `tailrec`**. O **compilador verificará se a função realmente é uma recursão de cauda**; caso contrário, ele dará um erro de compilação.


**Exemplo em Kotlin (Fatorial com recursão normal vs. recursão de cauda):**

```kotlin
// Recursão Normal (não otimizada)
fun fatorialNormal(n: Int): Long {
    if (n == 0) {
        return 1
    }
    return n * fatorialNormal(n - 1) // Multiplicação ocorre APÓS a chamada recursiva
}

println("Fatorial de 5 (normal): ${fatorialNormal(5)}") // Saída: 120
// fatorialNormal(20000) // causaria StackOverflowError para valores grandes de n

fun fatorialCauda(n: Int): Long {
    
    // Recursão de Cauda (otimizada com 'tailrec')
    tailrec fun auxiliar(n: Int, acumulador: Long = 1): Long {
        if (n == 0) return acumulador
    
        // A chamada recursiva é a ÚLTIMA operação
        return auxiliar(n - 1, n * acumulador)
    }
    
    return auxiliar(n)
}

println("Fatorial de 5 (cauda): ${fatorialCauda(5)}") // Saída: 120
// fatorialCauda(20000) // funcionaria sem StackOverflowError
```

No exemplo do fatorial, a função `fatorialNormal` realiza uma **multiplicação *depois* da chamada recursiva**, o que impede a otimização de cauda. Já em `fatorialCauda`, a multiplicação `acumulador * n` é calculada *antes* da chamada recursiva, e o **resultado é passado como um novo argumento para o acumulador**, tornando a chamada recursiva a última operação.
