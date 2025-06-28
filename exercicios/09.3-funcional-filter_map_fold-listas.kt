
fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Função que recebe uma lista L de inteiros e uma função F (que recebe inteiro e retorna booleano),
     * e retorna uma lista com os elementos de L que satisfazem a função F (elementos para os quais 
     * F retorna true), na mesma ordem que ocorrem em L.
     * Não utilize a função 'filter', mas pode usar 'map' e 'fold'.
     */
    fun filtrarLista(lista: List<Int>, funcao: (Int) -> Boolean): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 == 0 })", 
                 listOf(2, 4), filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 == 0 }))
    assertEquals("filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 != 0 })",
                 listOf(1, 3, 5), filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 != 0 }))
    assertEquals("filtrarLista(listOf(1, 2, 3, 4, 5), { it > 3 })",
                 listOf(4, 5), filtrarLista(listOf(1, 2, 3, 4, 5), { it > 3 }))
    assertEquals("filtrarLista(listOf(1, 2, 3, 4, 5), { it < 3 })",
                 listOf(1, 2), filtrarLista(listOf(1, 2, 3, 4, 5), { it < 3 }))
    println("Todos os testes passaram para a função filtrarLista!")
    */

    /**
     * Função que recebe uma lista L de inteiros e uma função F (que recebe inteiro e retorna inteiro),
     * e retorna uma nova lista com os elementos de L após aplicar a função F a cada elemento de L, 
     * na mesma ordem que ocorrem em L.
     * Não utilize a função 'map', mas pode usar 'filter' e 'fold'.
     */
    fun aplicarFuncao(lista: List<Int>, funcao: (Int) -> Int): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("aplicarFuncao(listOf(1, 2, 3, 4, 5), { it * 2 })", 
                 listOf(2, 4, 6, 8, 10), aplicarFuncao(listOf(1, 2, 3, 4, 5), { it * 2 }))
    assertEquals("aplicarFuncao(listOf(1, 2, 3, 4, 5), { it + 1 })",
                 listOf(2, 3, 4, 5, 6), aplicarFuncao(listOf(1, 2, 3, 4, 5), { it + 1 }))
    println("Todos os testes passaram para a função aplicarFuncao!")
    */

    /**
     * Função que recebe uma string S e retorna um booleano indicando se S é um palíndromo.
     * Versão usando filter, map, fold.
     * Não utilize a função 'reversed', nem gere uma nova string com os caracteres de S invertidos.
     * Dica: Uma opção é fazer um fold que compara os caracteres de S nas extremidades.
     *       Ou seja, comparamos o elemento da posição 0 com o elemento da posição n-1, onde n é o tamanho de S.
     *       Depois, comparamos o elemento da posição 1 com o elemento da posição n-2, e assim por diante.
     *       De modo geral, comparamos o elemento da posição i com o elemento da posição n-i-1.
     *       O fold é executado no range de 0 até n/2 (indices da 1a metade da string S).
     */
    fun ehPalindromo(palavra: String): Boolean {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return false
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("ehPalindromo(\"ovo\")", true, ehPalindromo("ovo"))
    assertEquals("ehPalindromo(\"arara\")", true, ehPalindromo("arara"))
    assertEquals("ehPalindromo(\"radar\")", true, ehPalindromo("radar"))
    assertEquals("ehPalindromo(\"reviver\")", true, ehPalindromo("reviver"))
    assertEquals("ehPalindromo(\"rever\")", true, ehPalindromo("rever"))
    assertEquals("ehPalindromo(\"reconhecer\")", false, ehPalindromo("reconhecer"))
    println("Todos os testes passaram para a função ehPalindromo!")
    */
}