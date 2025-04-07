
# 02 - IMPERATIVO - Operadores lógicos e relacionais, comandos de seleção

## Operadores Relacionais

Esses operadores são usados para **comparar dois valores** e o resultado dessa comparação é sempre um valor booleano (`true` ou `false`). Aqui estão os principais operadores relacionais em Kotlin:

* `==`: Igual a (retorna `true` se os dois valores são iguais).
* `!=`: Diferente de (retorna `true` se os dois valores não são iguais).
* `>`: Maior que (retorna `true` se o valor da esquerda é maior que o da direita).
* `<`: Menor que (retorna `true` se o valor da esquerda é menor que o da direita).
* `>=`: Maior ou igual a (retorna `true` se o valor da esquerda é maior ou igual ao da direita).
* `<=`: Menor ou igual a (retorna `true` se o valor da esquerda é menor ou igual ao da direita).

**Exemplo:**

```kotlin
val a = 10
val b = 5
val c = 10

println(a == b)  // Saída: false
println(a != b)  // Saída: true
println(a > b)   // Saída: true
println(a < b)   // Saída: false
println(a >= c)  // Saída: true
println(b <= c)  // Saída: true
```

## Operadores Lógicos

Os operadores lógicos são usados para **combinar ou negar expressões booleanas**. Os principais são:

* `&&` (AND): Conjunção lógica. Retorna `true` se **ambas** as expressões conectadas forem `true`. Caso contrário, retorna `false`.
* `||` (OR): Disjunção lógica. Retorna `true` se **pelo menos uma** das expressões conectadas for `true`. Retorna `false` somente se ambas forem `false`.
* `!` (NOT): Negação lógica. Retorna o valor booleano oposto da expressão. Se a expressão for `true`, retorna `false`, e se for `false`, retorna `true`.

**Exemplo:**

```kotlin
val x = true
val y = false
val z = 7

println(x && z > 5)  // Saída: true (x é true E z > 5 é true)
println(x && y)      // Saída: false (y é false)
println(x || y)      // Saída: true (x é true)
println(y || z < 2)  // Saída: false (y é false E z < 2 é false)
println(!x)         // Saída: false (negação de true)
println(!y)         // Saída: true (negação de false)
```

Esses operadores são frequentemente usados em conjunto com estruturas de controle de fluxo como `if`, `else if`, `while` e `for` para criar lógicas condicionais complexas em seus programas.


## Comandos de seleção

Em Kotlin, os comandos de seleção permitem que você **execute diferentes blocos de código dependendo do resultado de uma condição**. Eles são essenciais para criar programas com lógica flexível e adaptável. Os principais comandos de seleção em Kotlin são `if`, `else if` e `else`, além do `when`.

### `if`, `else if`, `else`

A estrutura `if` é a mais básica. Ela avalia uma condição booleana e executa um bloco de código se a condição for `true`. Opcionalmente, você pode usar `else if` para verificar outras condições se a condição do `if` anterior for `false`, e um bloco `else` para executar um código caso nenhuma das condições anteriores seja `true`.

**Sintaxe:**

```kotlin
if (condicao1) {
    // Bloco de código a ser executado se condicao1 for true
} else if (condicao2) {
    // Bloco de código a ser executado se 
    // condicao1 for false E condicao2 for true
} else {
    // Bloco de código a ser executado se 
    // todas as condições anteriores forem false
}
```

**Exemplo:**

```kotlin
val idade = 18

if (idade < 16) {
    println("Não pode votar")
} else if (idade < 18) {
    println("Voto opcional")
} else {
    println("Voto obrigatório")
}
```

**`if` como expressão:**

Em Kotlin, o `if` também pode ser usado como uma expressão, o que significa que ele **pode retornar um valor**. O valor retornado será o da **última expressão dentro do bloco** cuja condição foi verdadeira.

```kotlin
val numero = -5
val tipo = if (numero > 0) {
    "Positivo"
} else if (numero < 0) {
    "Negativo"
} else {
    "Zero"
}
println("O número é $tipo") // Saída: O número é Negativo
```


### `when`

O comando `when` é uma **alternativa mais concisa** e flexível ao encadeamento de **múltiplos `if-else if`**. Ele compara um valor com diversas condições e executa o bloco de código associado à primeira condição que for satisfeita.

**Sintaxe:**

```kotlin
when (expressao) {
    valor1 -> {
        // Bloco de código a ser executado se 
        // expressao == valor1
    }
    valor2 -> {
        // Bloco de código a ser executado se 
        // expressao == valor2
    }
    valor3, valor4 -> {
        // Bloco de código a ser executado se 
        // expressao == valor3 OU expressao == valor4
    }
    in intervalo -> {
        // Bloco de código a ser executado se expressao 
        // estiver dentro do intervalo
    }
    !in outroIntervalo -> {
        // Bloco de código a ser executado se expressao 
        // NÃO estiver dentro do intervalo
    }
    is Tipo -> {
        // Bloco de código a ser executado se expressao 
        // for do tipo Tipo (smart cast)
    }
    else -> {
        // Bloco de código a ser executado se nenhuma 
        // das condições anteriores for satisfeita
    }
}
```

**Exemplos:**

```kotlin
val diaDaSemana = 3

when (diaDaSemana) {
    1 -> println("Domingo")
    2 -> println("Segunda-feira")
    3 -> println("Terça-feira")
    4 -> println("Quarta-feira")
    5 -> println("Quinta-feira")
    6 -> println("Sexta-feira")
    7 -> println("Sábado")
    else -> println("Dia inválido")
}

val nota = 8

when (nota) {
    in 0..4 -> println("Reprovado")
    in 5..6 -> println("Em recuperação")
    in 7..10 -> println("Aprovado")
    else -> println("Nota inválida")
}

val x = "texto"

when (x) {
    is String -> println("É uma String: ${x.length}")
    is Int -> println("É um Inteiro: $x")
    else -> println("Tipo não reconhecido")
}
```

**`when` como expressão:**

Assim como o `if`, o `when` também pode ser usado como uma expressão para retornar um valor.

```kotlin
val operacao = "+"
val resultado = when (operacao) { 
    "+" -> "Soma"
    "-" -> "Subtração"
    "*" -> "Multiplicação"
    "/" -> "Divisão"
    else -> "Operação desconhecida"
}
println("A operação é $resultado") // Saída: A operação é Soma
```

Quando usado como expressão, o `when` deve ser **exaustivo**, o que significa que ele **deve cobrir todas as possibilidades ou ter um bloco `else`**.
