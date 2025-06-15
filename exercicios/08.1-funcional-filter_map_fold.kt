
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
     * Versão usando map/filter/fold.
     */
    fun somaIntervaloFuncional(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaIntervaloFuncional(1, 10)", 55, somaIntervaloFuncional(1, 10))
    assertEquals("somaIntervaloFuncional(10, 20)", 165, somaIntervaloFuncional(10, 20))
    assertEquals("somaIntervaloFuncional(1, 100)", 5050, somaIntervaloFuncional(1, 100))
    assertEquals("somaIntervaloFuncional(10, 5)", 0, somaIntervaloFuncional(10, 5))
    assertEquals("somaIntervaloFuncional(10, 10)", 10, somaIntervaloFuncional(10, 10))
    println("Todos os testes passaram para a função somaIntervaloFuncional!")
    */

    /**
     * Dados dois valores inteiros A e B recebidos como parâmetro, retorne a soma de todos os valores pares de A até B (possivelmente incluindo A e B).
     * Se A for maior que B, retorne 0.
     * Versão usando map/filter/fold.
     */
    fun somaParesIntervaloFuncional(a: Int, b: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaParesIntervaloFuncional(1, 10)", 30, somaParesIntervaloFuncional(1, 10))
    assertEquals("somaParesIntervaloFuncional(10, 20)", 90, somaParesIntervaloFuncional(10, 20))
    assertEquals("somaParesIntervaloFuncional(1, 100)", 2550, somaParesIntervaloFuncional(1, 100))
    assertEquals("somaParesIntervaloFuncional(10, 5)", 0, somaParesIntervaloFuncional(10, 5))
    assertEquals("somaParesIntervaloFuncional(10, 10)", 10, somaParesIntervaloFuncional(10, 10))
    println("Todos os testes passaram para a função somaParesIntervaloFuncional!")
    */

    /*
     * O jogo Blackjack permite descartar cartas Ás, reduzindo em 10 o total de pontos para cada 
     * carta Ás descartada. Dado o total de pontos das cartas de um jogador e a quantidade de cartas
     * Ás que ele dispõe, retorne o total de pontos mais próximo possível de 21 pontos que pode ser 
     * obtido, sem ultrapassar 21 pontos (se possível).
     * Versão usando map/filter/fold.
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
     * Dado um inteiro n, retorna o n-ésimo termo da sequência de Fibonacci.
     * Sequência de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     * O termo 0 é o primeiro termo da sequência.
     * O n-ésimo termo é a soma dos dois termos anteriores.
     * Versão usando map/filter/fold.
     * Dica: Você pode fazer um fold onde o acumulador é um Pair representando 
     *       os dois últimos termos da sequência.
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

    /**
     * Dada uma lista de inteiros L e uma função F que recebe um inteiro e retorna um inteiro, 
     * retorne a soma dos valores obtidos ao aplicar F a cada elemento de L.
     * Versão usando map/filter/fold.
     */
    fun somaFuncaoLista(lista: List<Int>, funcao: (Int) -> Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("somaFuncaoLista(listOf(1, 2, 3, 4), { it })", 10, somaFuncaoLista(listOf(1, 2, 3, 4), { it }))
    assertEquals("somaFuncaoLista(listOf(1, 2, 3, 4), { it * 2 })", 20, somaFuncaoLista(listOf(1, 2, 3, 4), { it * 2 }))
    assertEquals("somaFuncaoLista(listOf(1, 2, 3, 4), { it * 3 })", 30, somaFuncaoLista(listOf(1, 2, 3, 4), { it * 3 }))
    assertEquals("somaFuncaoLista(listOf(1, 2, 3, 4), { it * 4 })", 40, somaFuncaoLista(listOf(1, 2, 3, 4), { it * 4 }))
    assertEquals("somaFuncaoLista(listOf(1, 2, 3, 4), { it * 5 })", 50, somaFuncaoLista(listOf(1, 2, 3, 4), { it * 5 }))
    println("Todos os testes passaram para a função somaFuncaoLista!")
    */
}