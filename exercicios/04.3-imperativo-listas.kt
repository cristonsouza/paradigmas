
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
     * Versão usando comandos de repetição.
     */
    fun filtrarLista(lista: List<Int>, funcao: (Int) -> Boolean): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("filtrarLista([1, 2, 3, 4, 5], { it % 2 == 0 })", listOf(2, 4), filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 == 0 }))
    assertEquals("filtrarLista([1, 2, 3, 4, 5], { it % 2 != 0 })", listOf(1, 3, 5), filtrarLista(listOf(1, 2, 3, 4, 5), { it % 2 != 0 }))
    assertEquals("filtrarLista([1, 2, 3, 4, 5], { it > 3 })", listOf(4, 5), filtrarLista(listOf(1, 2, 3, 4, 5), { it > 3 }))
    assertEquals("filtrarLista([1, 2, 3, 4, 5], { it < 3 })", listOf(1, 2), filtrarLista(listOf(1, 2, 3, 4, 5), { it < 3 }))
    assertEquals("filtrarLista([1, 2, 3, 4, 5], { it == 3 })", listOf(3), filtrarLista(listOf(1, 2, 3, 4, 5), { it == 3 }))
    println("Todos os testes passaram para a função filtrarLista!")
    */

    /**
     * Função que recebe uma lista L de inteiros e uma função F (que recebe inteiro e retorna inteiro),
     * e retorna uma nova lista com os elementos de L após aplicar a função F a cada elemento de L, 
     * na mesma ordem que ocorrem em L.
     * Versão usando comandos de repetição.
     */
    fun aplicarFuncao(lista: List<Int>, funcao: (Int) -> Int): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("aplicarFuncao([1, 2, 3, 4, 5], { it * 2 })", listOf(2, 4, 6, 8, 10), aplicarFuncao(listOf(1, 2, 3, 4, 5), { it * 2 }))
    assertEquals("aplicarFuncao([1, 2, 3, 4, 5], { it + 1 })", listOf(2, 3, 4, 5, 6), aplicarFuncao(listOf(1, 2, 3, 4, 5), { it + 1 }))
    println("Todos os testes passaram para a função aplicarFuncao!")
    */

    /**
     * Função que recebe uma lista L de inteiros, um valor inicial inteiro A e uma função F que 
     * recebe dois inteiros e retorna um inteiro. Esta função aplica F ao valor A e ao primeiro 
     * elemento de L e copia o resultado para A. Em seguida, aplica F ao valor A e ao segundo 
     * elemento de L e copia o resultado para A, e assim por diante. A função retorna o valor final 
     * de A.
     * Versão usando comandos de repetição.
     */
    fun dobrarLista(lista: List<Int>, valorInicial: Int, funcao: (Int, Int) -> Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("dobrarLista([1, 2, 3, 4, 5], 0, { a, b -> a + b })", 15, dobrarLista(listOf(1, 2, 3, 4, 5), 0, { a, b -> a + b }))
    assertEquals("dobrarLista([1, 2, 3, 4, 5], 1, { a, b -> a * b })", 120, dobrarLista(listOf(1, 2, 3, 4, 5), 1, { a, b -> a * b }))
    println("Todos os testes passaram para a função dobrarLista!")
    */

    /**
     * Função que recebe uma string S e retorna um booleano indicando se S é um palíndromo.
     * Versão usando comandos de repetição.
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