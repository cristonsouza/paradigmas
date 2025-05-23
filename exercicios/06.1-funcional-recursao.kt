
fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Dados dois valores inteiros A e B recebidos como parâmetro, retorne a soma de todos os valores de A até B (incluindo A e B).
     * Se A for maior que B, retorne 0.
     * Versão usando recursão de cauda.
     */
    fun somaIntervaloRecursivo(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaIntervaloRecursivo(1, 10)", 55, somaIntervaloRecursivo(1, 10))
    assertEquals("somaIntervaloRecursivo(10, 20)", 165, somaIntervaloRecursivo(10, 20))
    assertEquals("somaIntervaloRecursivo(1, 100)", 5050, somaIntervaloRecursivo(1, 100))
    assertEquals("somaIntervaloRecursivo(10, 5)", 0, somaIntervaloRecursivo(10, 5))
    assertEquals("somaIntervaloRecursivo(10, 10)", 10, somaIntervaloRecursivo(10, 10))
    println("Todos os testes passaram para a função somaIntervaloRecursivo!")
    */

    /**
     * Dados dois valores inteiros A e B recebidos como parâmetro, retorne a soma de todos os valores pares de A até B (possivelmente incluindo A e B).
     * Se A for maior que B, retorne 0.
     * Versão usando recursão de cauda.
     */
    fun somaParesIntervaloRecursivo(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaParesIntervaloRecursivo(1, 10)", 30, somaParesIntervaloRecursivo(1, 10))
    assertEquals("somaParesIntervaloRecursivo(10, 20)", 90, somaParesIntervaloRecursivo(10, 20))
    assertEquals("somaParesIntervaloRecursivo(1, 100)", 2550, somaParesIntervaloRecursivo(1, 100))
    assertEquals("somaParesIntervaloRecursivo(10, 5)", 0, somaParesIntervaloRecursivo(10, 5))
    assertEquals("somaParesIntervaloRecursivo(10, 10)", 10, somaParesIntervaloRecursivo(10, 10))
    println("Todos os testes passaram para a função somaParesIntervaloRecursivo!")
    */

    /*
     * O jogo Blackjack permite descartar cartas Ás, reduzindo em 10 o total de pontos para cada 
     * carta Ás descartada. Dado o total de pontos das cartas de um jogador e a quantidade de cartas
     * Ás que ele dispõe, retorne o total de pontos mais próximo possível de 21 pontos que pode ser 
     * obtido, sem ultrapassar 21 pontos (se possível).
     * Versão usando recursão de cauda.
     */
    fun blackjack(pontos: Int, ases: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("blackjack(21, 3)", 21, blackjack(21, 3))
    assertEquals("blackjack(22, 0)", 22, blackjack(22, 0))
    assertEquals("blackjack(22, 1)", 12, blackjack(22, 1))
    assertEquals("blackjack(22, 2)", 12, blackjack(22, 2))
    assertEquals("blackjack(32, 2)", 12, blackjack(32, 2))
    assertEquals("blackjack(43, 1)", 33, blackjack(43, 1))
    assertEquals("blackjack(43, 4)", 13, blackjack(43, 4))
    assertEquals("blackjack(41, 4)", 21, blackjack(41, 4))
    println("Todos os testes passaram para a função blackjack!")
    */

    /*
     * Dado um inteiro n, retona o n-ésimo termo da sequência de Fibonacci.
     * Sequência de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     * O termo 0 é o primeiro termo da sequência.
     * O n-ésimo termo é a soma dos dois termos anteriores.
     * Versão usando recursão de cauda.
     */
    fun fibonacci(n: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("fibonacci(0)", 0, fibonacci(0))
    assertEquals("fibonacci(1)", 1, fibonacci(1))
    assertEquals("fibonacci(2)", 1, fibonacci(2))
    assertEquals("fibonacci(3)", 2, fibonacci(3))
    assertEquals("fibonacci(4)", 3, fibonacci(4))
    assertEquals("fibonacci(5)", 5, fibonacci(5))
    assertEquals("fibonacci(6)", 8, fibonacci(6))
    assertEquals("fibonacci(7)", 13, fibonacci(7))
    assertEquals("fibonacci(8)", 21, fibonacci(8))
    println("Todos os testes passaram para a função fibonacci!")
    */
}