# 08 - FUNCIONAL - filter, map, fold

## Composição de Funções

A composição de funções é a prática de combinar funções mais simples para construir funções mais complexas. **O resultado de uma função se torna a entrada da próxima.** 

**Exemplo:**

```kotlin
// Função para adicionar 2
fun addTwo(x: Int): Int = x + 2

// Função para multiplicar por 3
fun multiplyByThree(x: Int): Int = x * 3

// Compondo as funções manualmente
fun composeFunctions(x: Int): Int {
    val result1 = addTwo(x)
    val result2 = multiplyByThree(result1)
    return result2
}

// Uma forma mais funcional de compor (encadeamento)
fun main() {
    val number = 5
    val composedResult = multiplyByThree(addTwo(number))
    println("Composição manual: ${composeFunctions(number)}") // Saída: 21
    println("Composição encadeada: $composedResult") // Saída: 21
}
```

---

## Função Lambda

Uma função lambda é uma **função anônima**, ou seja, uma função que não tem nome.

**Sintaxe básica:**

```kotlin
{ parâmetros -> corpo_da_função }
```

**Exemplo:**

```kotlin
fun main() {
    // Lambda simples que soma dois números
    val soma: (Int, Int) -> Int = { a, b -> a + b }
    println("A soma de 5 e 3 é: ${soma(5, 3)}") // Saída: A soma de 5 e 3 é: 8

    // Lambda que imprime uma mensagem
    val saudacao: (String) -> Unit = { nome -> println("Olá, $nome!") }
    saudacao("Mundo") // Saída: Olá, Mundo!

    // Lambda sem parâmetros
    val semParametros: () -> String = { "Esta é uma lambda sem parâmetros." }
    println(semParametros()) // Saída: Esta é uma lambda sem parâmetros.
}
```

---

## Funções de Ordem Superior

Funções de ordem superior são **funções que podem receber outras funções como parâmetros, ou retornar uma função, ou ambas.**

**Exemplo:**

```kotlin
// Função de ordem superior que executa uma operação em um número
fun applyOperation(number: Int, operation: (Int) -> Int): Int {
    return operation(number)
}

// Funções que serão passadas como parâmetros
fun increment(x: Int): Int = x + 1
fun square(x: Int): Int = x * x

fun main() {
    val num = 10

    val resultIncrement = applyOperation(num, ::increment)
    println("Incrementado: $resultIncrement") // Saída: 11

    val resultSquare = applyOperation(num, ::square)
    println("Quadrado: $resultSquare") // Saída: 100

    // Usando uma lambda como parâmetro
    val resultMultiplyByFive = applyOperation(num) { it * 5 }
    println("Multiplicado por 5: $resultMultiplyByFive") // Saída: 50

    // Função de ordem superior que retorna uma função
    fun getMultiplier(factor: Int): (Int) -> Int {
        return { x -> x * factor }
    }

    val multiplyByTen = getMultiplier(10)
    println("Multiplicado por 10 (usando função retornada): ${multiplyByTen(5)}") // Saída: 50
}
```

---

## `filter`

A função `filter` é usada para criar uma nova coleção contendo apenas os elementos da coleção original que satisfazem uma determinada condição (um predicado).

**Exemplo:**

```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filtrar números pares
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Números pares: $evenNumbers") // Saída: [2, 4, 6, 8, 10]

    // Filtrar strings com mais de 3 caracteres
    val names = listOf("Ana", "João", "Maria", "Pedro", "Luana")
    val longNames = names.filter { it.length > 4 }
    println("Nomes com mais de 4 caracteres: $longNames") // Saída: [Maria, Pedro, Luana]
}
```

---

## `map`

A função `map` transforma cada elemento de uma coleção aplicando uma função a ele, e retorna uma nova coleção com os resultados das transformações.

**Exemplo:**

```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Dobrar cada número
    val doubledNumbers = numbers.map { it * 2 }
    println("Números dobrados: $doubledNumbers") // Saída: [2, 4, 6, 8, 10]

    // Converter uma lista de strings para o tamanho de cada string
    val words = listOf("Kotlin", "is", "awesome")
    val wordLengths = words.map { it.length }
    println("Tamanho das palavras: $wordLengths") // Saída: [6, 2, 7]
}
```

---

## `fold`

`fold` (também conhecido como `reduce` em algumas linguagens) é usado para **combinar todos os elementos de uma coleção em um único valor, aplicando uma operação a cada elemento e acumulando o resultado**. Ele requer um valor inicial. `reduce` é similar, mas não requer um **valor inicial** e usa o primeiro elemento da coleção como ponto de partida.

**Exemplo:**

```kotlin
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Somar todos os números (com valor inicial 0)
    val sum = numbers.fold(0) { accumulator, number -> accumulator + number }
    println("Soma dos números (fold): $sum") // Saída: 15

    // Concatenar strings
    val words = listOf("Kotlin", "is", "fun")
    val sentence = words.fold("") { acc, word -> "$acc $word" }
    println("Frase (fold): \"$sentence\"") // Saída: "Kotlin is fun"

    // Multiplicar todos os números (com valor inicial 1)
    val product = numbers.fold(1) { accumulator, number -> accumulator * number }
    println("Produto dos números (fold): $product") // Saída: 120
}
```

---

## `range` (revisão)

Em Kotlin, `range` é uma maneira conveniente de **criar uma sequência de valores**.

**Exemplo:**

```kotlin
fun main() {
    // Range de inteiros (inclusivo)
    val intRange = 1..5 // Equivalente a [1, 2, 3, 4, 5]
    println("Range de inteiros (1..5): $intRange")

    // Range reverso
    val reversedRange = 5 downTo 1 // Equivalente a [5, 4, 3, 2, 1]
    println("Range reverso (5 downTo 1): $reversedRange")
    for (i in reversedRange) {
        print("$i ") // Saída: 5 4 3 2 1
    }
    println()

    // Range com step (passo)
    val steppedRange = 1..10 step 2 // Equivalente a [1, 3, 5, 7, 9]
    println("Range com step (1..10 step 2): $steppedRange")
    for (i in steppedRange) {
        print("$i ") // Saída: 1 3 5 7 9
    }
    println()

    // Range exclusivo do último elemento
    val untilRange = 1 until 5 // Equivalente a [1, 2, 3, 4]
    println("Range até (1 until 5): $untilRange")
    for (i in untilRange) {
        print("$i ") // Saída: 1 2 3 4
    }
    println()

    // Range de caracteres
    val charRange = 'a'..'d'
    println("Range de caracteres ('a'..'d'): $charRange")
    for (char in charRange) {
        print("$char ") // Saída: a b c d
    }
    println()
}
```
