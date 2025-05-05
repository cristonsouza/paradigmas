
fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Função que recebe duas strings e retorna uma tupla contendo o número de palavras
     * que ocorrem nas duas strings e o número de palavras que ocorrem em pelo menos
     * uma das strings.
     * 
     * Obs.: O método s.split(" ") retorna a lista de palavras contidas na string s.
     * Exemplo: "ola mundo ola".split(" ") retorna a lista ["ola", "mundo", "ola"].
     */
    fun contarPalavrasComuns(s1: String, s2: String): Pair<Int, Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Pair(0, 0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("contarPalavrasComuns('ola mundo', 'ola')", Pair(1, 2), contarPalavrasComuns("ola mundo", "ola"))
    assertEquals("contarPalavrasComuns('ola mundo', 'ola mundo')", Pair(2, 2), contarPalavrasComuns("ola mundo", "ola mundo"))
    assertEquals("contarPalavrasComuns('ola mundo', 'mundo')", Pair(1, 2), contarPalavrasComuns("ola mundo", "mundo"))
    assertEquals("contarPalavrasComuns('ola mundo', 'ola mundo ola')", Pair(2, 2), contarPalavrasComuns("ola mundo", "ola mundo ola"))
    assertEquals("contarPalavrasComuns('ola mundo', 'ola mundo cruel mundo')", Pair(2, 3), contarPalavrasComuns("ola mundo", "ola mundo cruel mundo"))
    println("Todos os testes passaram para a função contarPalavrasComuns!")
    */

    /**
     * Função que recebe um dicionário com o preço de cada produto e outro dicionário
     * com a quantidade de itens de cada produto no carrinho. Nos dois dicionários,
     * a chave é o nome do produto. A função deve retornar o valor total dos itens no carrinho.
     */
    fun calcularTotal(precos: Map<String, Double>, carrinho: Map<String, Int>): Double {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0.0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularTotal({arroz=2.5, feijao=3.0}, {arroz=2, feijao=1})", 8.0, calcularTotal(mapOf("arroz" to 2.5, "feijao" to 3.0), mapOf("arroz" to 2, "feijao" to 1)))
    assertEquals("calcularTotal({arroz=2.5, feijao=3.0}, {arroz=2, feijao=2})", 11.0, calcularTotal(mapOf("arroz" to 2.5, "feijao" to 3.0), mapOf("arroz" to 2, "feijao" to 2)))
    assertEquals("calcularTotal({arroz=2.5, feijao=3.0}, {arroz=2, feijao=3})", 14.0, calcularTotal(mapOf("arroz" to 2.5, "feijao" to 3.0), mapOf("arroz" to 2, "feijao" to 3)))
    println("Todos os testes passaram para a função calcularTotal!")
    */

    /**
     * Função que recebe uma string S e retorna um dicionário cuja chave é uma palavra
     * e cujo valor é o número de ocorrência da palavra em S.
     */
    fun contarPalavras(s: String): Map<String, Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return mapOf()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("contarPalavras('ola mundo')", mapOf("ola" to 1, "mundo" to 1), contarPalavras("ola mundo"))
    assertEquals("contarPalavras('ola mundo ola')", mapOf("ola" to 2, "mundo" to 1), contarPalavras("ola mundo ola"))
    assertEquals("contarPalavras('ola mundo ola mundo')", mapOf("ola" to 2, "mundo" to 2), contarPalavras("ola mundo ola mundo"))
    println("Todos os testes passaram para a função contarPalavras!")
    */

    /**
     * Função recebe uma lista de tuplas. O primeiro elemento da tupla é o número do sapato e o segundo elemento é uma letra ('D' para pé direito e 'E' para pé esquerdo).
     * Retorne o número de pares de sapatos que podem ser formados (mesmo número, um do pé direito e um do pé esquerdo).
     * Cada sapato (elemento da lista) só pode ser usado em no máximo um par.
     * Dica: Use um dicionário para guardar a quantidade de sapatos de pé direito encontrados até então e que ainda não formaram par, onde a chave é o número do sapato.
     * Faça o mesmo para os sapatos de pé esquerdo.
     */
    fun contarParesSapatos(sapatos: List<Pair<Int, Char>>): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("contarParesSapatos(listOf(40 to 'D', 41 to 'E', 41 to 'D', 40 to 'E'))", 2, contarParesSapatos(listOf(40 to 'D', 41 to 'E', 41 to 'D', 40 to 'E')))
    assertEquals("contarParesSapatos(listOf(38 to 'E', 39 to 'E', 40 to 'D', 38 to 'D', 40 to 'D', 37 to 'E'))", 1, contarParesSapatos(listOf(38 to 'E', 39 to 'E', 40 to 'D', 38 to 'D', 40 to 'D', 37 to 'E')))
    assertEquals("contarParesSapatos(listOf(30 to 'E', 31 to 'E', 31 to 'D', 31 to 'E', 30 to 'D', 31 to 'D', 31 to 'D', 31 to 'E', 30 to 'D', 31 to 'D'))", 4, contarParesSapatos(listOf(30 to 'E', 31 to 'E', 31 to 'D', 31 to 'E', 30 to 'D', 31 to 'D', 31 to 'D', 31 to 'E', 30 to 'D', 31 to 'D')))
    assertEquals("contarParesSapatos(listOf(44 to 'D', 40 to 'E', 44 to 'D', 43 to 'E', 42 to 'E', 40 to 'D', 41 to 'D', 42 to 'D', 43 to 'D', 43 to 'E'))", 3, contarParesSapatos(listOf(44 to 'D', 40 to 'E', 44 to 'D', 43 to 'E', 42 to 'E', 40 to 'D', 41 to 'D', 42 to 'D', 43 to 'D', 43 to 'E')))
    assertEquals("contarParesSapatos(listOf(59 to 'D', 59 to 'E', 59 to 'D', 60 to 'D', 59 to 'D', 60 to 'D', 60 to 'E', 59 to 'E', 59 to 'D', 60 to 'D'))", 3, contarParesSapatos(listOf(59 to 'D', 59 to 'E', 59 to 'D', 60 to 'D', 59 to 'D', 60 to 'D', 60 to 'E', 59 to 'E', 59 to 'D', 60 to 'D')))
    assertEquals("contarParesSapatos(listOf(56 to 'D', 59 to 'D', 58 to 'E', 56 to 'D', 60 to 'E', 56 to 'D', 57 to 'E', 59 to 'E', 58 to 'D', 56 to 'D', 57 to 'D', 60 to 'E'))", 3, contarParesSapatos(listOf(56 to 'D', 59 to 'D', 58 to 'E', 56 to 'D', 60 to 'E', 56 to 'D', 57 to 'E', 59 to 'E', 58 to 'D', 56 to 'D', 57 to 'D', 60 to 'E')))
    assertEquals("contarParesSapatos(listOf(40 to 'D', 41 to 'E', 41 to 'D', 40 to 'E'))", 2, contarParesSapatos(listOf(40 to 'D', 41 to 'E', 41 to 'D', 40 to 'E')))
    println("Todos os testes passaram para a função contarParesSapatos!")
    */
}
