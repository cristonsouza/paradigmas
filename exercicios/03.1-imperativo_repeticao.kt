
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
     * Versão usando comandos de repetição.
     */
    fun somaIntervaloRepeticao(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaIntervaloRepeticao(1, 10)", 55, somaIntervaloRepeticao(1, 10))
    assertEquals("somaIntervaloRepeticao(10, 20)", 165, somaIntervaloRepeticao(10, 20))
    assertEquals("somaIntervaloRepeticao(1, 100)", 5050, somaIntervaloRepeticao(1, 100))
    assertEquals("somaIntervaloRepeticao(10, 5)", 0, somaIntervaloRepeticao(10, 5))
    assertEquals("somaIntervaloRepeticao(10, 10)", 10, somaIntervaloRepeticao(10, 10))
    println("Todos os testes passaram para a função somaIntervaloRepeticao!")
    */

    /**
     * Dados dois valores inteiros A e B recebidos como parâmetro, retorne a soma de todos os valores pares de A até B (possivelmente incluindo A e B).
     * Se A for maior que B, retorne 0.
     * Versão usando comandos de repetição.
     */
    fun somaParesIntervaloRepeticao(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaParesIntervaloRepeticao(1, 10)", 30, somaParesIntervaloRepeticao(1, 10))
    assertEquals("somaParesIntervaloRepeticao(10, 20)", 90, somaParesIntervaloRepeticao(10, 20))
    assertEquals("somaParesIntervaloRepeticao(1, 100)", 2550, somaParesIntervaloRepeticao(1, 100))
    assertEquals("somaParesIntervaloRepeticao(10, 5)", 0, somaParesIntervaloRepeticao(10, 5))
    assertEquals("somaParesIntervaloRepeticao(10, 10)", 10, somaParesIntervaloRepeticao(10, 10))
    println("Todos os testes passaram para a função somaParesIntervaloRepeticao!")
    */

    /*
     * O jogo Blackjack permite descartar cartas Ás, reduzindo em 10 o total de pontos para cada 
     * carta Ás descartada. Dado o total de pontos das cartas de um jogador e a quantidade de cartas
     * Ás que ele dispõe, retorne o total de pontos mais próximo possível de 21 pontos que pode ser 
     * obtido, sem ultrapassar 21 pontos (se possível).
     * Versão usando comandos de repetição.
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
     * Versão usando comandos de repetição.
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