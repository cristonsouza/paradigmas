# 03 - IMPERATIVO - Comandos de repetição

**1. `for` Loops:**

* **Iterando sobre coleções ou arrays:** Essa é a forma mais comum. Você percorre cada item de uma lista, um array ou qualquer outra coleção.

    ```kotlin
    val frutas = listOf("maçã", "banana", "laranja")
    for (fruta in frutas) {
        println("Eu gosto de $fruta")
    }

    val numeros = arrayOf(1, 2, 3, 4, 5)
    for (numero in numeros) {
        println("O número é $numero")
    }
    ```

* **Iterando sobre um intervalo:** Você pode definir um ponto de início e um ponto final, e o loop vai passar por todos os valores nesse intervalo.

    ```kotlin
    for (i in 1..5) { // De 1 até 5 (inclusive)
        println("Número: $i")
    }

    for (i in 5 downTo 1) { // De 5 até 1 (inclusive), de forma decrescente
        println("Contagem regressiva: $i")
    }

    for (i in 1 until 5) { // De 1 até 4 (o 5 não entra)
        println("Número (until): $i")
    }

    for (i in 1..10 step 2) { // De 1 até 10, pulando de 2 em 2
        println("Número com step: $i")
    }
    ```

**2. `while` Loops:**

* O `while` continua executando o bloco de código enquanto uma condição for verdadeira. É importante garantir que a condição eventualmente se torne falsa para evitar loops infinitos!

    ```kotlin
    var contador = 0
    while (contador < 5) {
        println("Contador: $contador")
        contador++
    }
    ```

**3. `do-while` Loops:**

* Bem parecido com o `while`, mas a grande diferença é que o bloco de código dentro do `do-while` é executado *pelo menos uma vez*, antes da condição ser verificada.

    ```kotlin
    var numero = 10
    do {
        println("Número (do-while): $numero")
        numero--
    } while (numero > 0)
    ```

**4. `repeat` Function:**

* Se você precisa executar um bloco de código um número fixo de vezes, a função `repeat` é super concisa. Ela recebe o número de repetições e uma função (lambda) que será executada.

    ```kotlin
    repeat(3) {
        println("Olá!")
    }

    // A variável 'it' fornece o núm. da iteração, começando de 0.
    repeat(5) { 
        println("Repetição número: $it")
    }

    // Caso queira usar outro nome para o núm. da iteração...
    repeat(5) { index ->
        println("Repetição número: $index")
    }
    ```

Cada um desses comandos tem seu lugar e sua melhor aplicação. O `for` é ótimo para iterar sobre **coleções e intervalos**, o `while` e `do-while` são úteis quando a **repetição depende de uma condição** que pode mudar, e o `repeat` é perfeito para repetições simples com um **número definido**.
