
/* 
Implemente cada exercícios usando duas versões: uma usando recursão de cauda e outra usando filter/map/fold 
*/

fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /*
        No jogo da cobrinha, quando a cabeça passa do limite direito, ela reaparece do lado esquerdo.
        Quando passa do limite inferior, reaparece na parte de cima.
        Imagine o jogo apenas com a cabeça da cobra.
        A tela é quadrada, formada por N quadrados de largura e N quadrados de altura.
        O quadrado de posição (0, 0) é o mais em cima na esquerda, e o quadrado de posição (N-1, N-1) é o mais embaixo na direita.
        O X cresce para a direita e o Y cresce para baixo.

        A cabeça da cobra pode estar apontada para 4 possíveis direções:
            [U] Up(Cima), [D] Down (Baixo), [L] Left (Esquerda), [R] Right (Direita).

        Imagine que a cada segundo a cabeça da cobra se move 1 posição.
        Você deve fazer um código que calcule a posição da cabeça da cobra dada
        - a dimensão do tabuleiro N,
        - a posição inicial (X, Y),
        - a direção da cabeça C (U, D, L ou R),
        - e a quantidade de segundos S.

        Entrada: N, X, Y, C, S.
        Saída: X e Y da posição final da cobra.

        Exemplos:
        - Entrada: 10, 4, 3, R, 1
        Saída: 5, 3
        - Entrada: 10, 4, 3, R, 8
        Saída: 2, 3
        - Entrada: 10, 4, 5, U, 1
        Saída: 3, 5
     */
    fun cobra(N: Int, X: Int, Y: Int, C: Char, S: Int): Pair<Int, Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Pair(0, 0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("cobra(10, 4, 3, 'R', 1)", Pair(5, 3), cobra(10, 4, 3, 'R', 1))
    assertEquals("cobra(10, 4, 3, 'R', 8)", Pair(2, 3), cobra(10, 4, 3, 'R', 8))
    assertEquals("cobra(10, 4, 5, 'D', 1)", Pair(4, 6), cobra(10, 4, 5, 'D', 1))
    assertEquals("cobra(10, 4, 5, 'L', 1)", Pair(3, 5), cobra(10, 4, 5, 'L', 1))
    assertEquals("cobra(8, 6, 1, 'D', 43)", Pair(6, 4), cobra(8, 6, 1, 'D', 43))
    assertEquals("cobra(20, 6, 12, 'L', 21)", Pair(5, 12), cobra(20, 6, 12, 'L', 21))
    assertEquals("cobra(7, 5, 6, 'D', 13)", Pair(5, 5), cobra(7, 5, 6, 'D', 13))
    assertEquals("cobra(11, 9, 10, 'R', 36)", Pair(1, 10), cobra(11, 9, 10, 'R', 36))
    assertEquals("cobra(16, 8, 7, 'L', 32)", Pair(8, 7), cobra(16, 8, 7, 'L', 32))
    assertEquals("cobra(15, 2, 13, 'D', 35)", Pair(2, 3), cobra(15, 2, 13, 'D', 35))
    assertEquals("cobra(14, 0, 10, 'U', 19)", Pair(0, 5), cobra(14, 0, 10, 'U', 19))
    assertEquals("cobra(12, 1, 4, 'D', 42)", Pair(1, 10), cobra(12, 1, 4, 'D', 42))
    assertEquals("cobra(14, 11, 5, 'D', 34)", Pair(11, 11), cobra(14, 11, 5, 'D', 34))
    assertEquals("cobra(22, 4, 20, 'D', 20)", Pair(4, 18), cobra(22, 4, 20, 'D', 20))
    assertEquals("cobra(18, 10, 1, 'R', 6)", Pair(16, 1), cobra(18, 10, 1, 'R', 6))
    assertEquals("cobra(18, 14, 14, 'R', 31)", Pair(9, 14), cobra(18, 14, 14, 'R', 31))
    assertEquals("cobra(10, 5, 4, 'D', 36)", Pair(5, 0), cobra(10, 5, 4, 'D', 36))
    assertEquals("cobra(10, 6, 9, 'L', 7)", Pair(9, 9), cobra(10, 6, 9, 'L', 7))
    assertEquals("cobra(9, 0, 0, 'L', 14)", Pair(4, 0), cobra(9, 0, 0, 'L', 14))
    assertEquals("cobra(12, 2, 8, 'D', 0)", Pair(2, 8), cobra(12, 2, 8, 'D', 0))
    assertEquals("cobra(12, 0, 0, 'U', 38)", Pair(0, 10), cobra(12, 0, 0, 'U', 38))
    assertEquals("cobra(9, 6, 2, 'U', 49)", Pair(6, 7), cobra(9, 6, 2, 'U', 49))
    assertEquals("cobra(17, 16, 15, 'R', 39)", Pair(4, 15), cobra(17, 16, 15, 'R', 39))
    assertEquals("cobra(17, 12, 4, 'U', 39)", Pair(12, 16), cobra(17, 12, 4, 'U', 39))
    assertEquals("cobra(20, 10, 14, 'U', 17)", Pair(10, 17), cobra(20, 10, 14, 'U', 17))
    assertEquals("cobra(6, 5, 2, 'L', 42)", Pair(5, 2), cobra(6, 5, 2, 'L', 42))
    assertEquals("cobra(17, 0, 8, 'R', 36)", Pair(2, 8), cobra(17, 0, 8, 'R', 36))
    assertEquals("cobra(6, 3, 5, 'R', 19)", Pair(4, 5), cobra(6, 3, 5, 'R', 19))
    assertEquals("cobra(5, 4, 1, 'L', 47)", Pair(2, 1), cobra(5, 4, 1, 'L', 47))
    assertEquals("cobra(16, 1, 3, 'L', 27)", Pair(6, 3), cobra(16, 1, 3, 'L', 27))
    assertEquals("cobra(12, 4, 5, 'L', 36)", Pair(4, 5), cobra(12, 4, 5, 'L', 36))
    assertEquals("cobra(10, 6, 3, 'D', 24)", Pair(6, 7), cobra(10, 6, 3, 'D', 24))
    assertEquals("cobra(13, 5, 0, 'L', 3)", Pair(2, 0), cobra(13, 5, 0, 'L', 3))
    assertEquals("cobra(24, 6, 0, 'R', 15)", Pair(21, 0), cobra(24, 6, 0, 'R', 15))
    assertEquals("cobra(5, 4, 1, 'D', 18)", Pair(4, 4), cobra(5, 4, 1, 'D', 18))
    assertEquals("cobra(10, 6, 1, 'L', 5)", Pair(1, 1), cobra(10, 6, 1, 'L', 5))
    assertEquals("cobra(24, 16, 20, 'R', 41)", Pair(9, 20), cobra(24, 16, 20, 'R', 41))
    assertEquals("cobra(15, 13, 10, 'U', 14)", Pair(13, 11), cobra(15, 13, 10, 'U', 14))
    assertEquals("cobra(9, 7, 5, 'R', 43)", Pair(5, 5), cobra(9, 7, 5, 'R', 43))
    assertEquals("cobra(16, 3, 13, 'D', 36)", Pair(3, 1), cobra(16, 3, 13, 'D', 36))
    assertEquals("cobra(17, 9, 9, 'R', 25)", Pair(0, 9), cobra(17, 9, 9, 'R', 25))
    assertEquals("cobra(12, 6, 1, 'U', 45)", Pair(6, 4), cobra(12, 6, 1, 'U', 45))
    assertEquals("cobra(14, 11, 1, 'L', 18)", Pair(7, 1), cobra(14, 11, 1, 'L', 18))
    assertEquals("cobra(13, 6, 12, 'R', 29)", Pair(9, 12), cobra(13, 6, 12, 'R', 29))
    assertEquals("cobra(21, 13, 4, 'D', 13)", Pair(13, 17), cobra(21, 13, 4, 'D', 13))
    assertEquals("cobra(23, 14, 21, 'R', 18)", Pair(9, 21), cobra(23, 14, 21, 'R', 18))
    assertEquals("cobra(13, 4, 0, 'L', 17)", Pair(0, 0), cobra(13, 4, 0, 'L', 17))
    assertEquals("cobra(21, 14, 0, 'U', 33)", Pair(14, 9), cobra(21, 14, 0, 'U', 33))
    assertEquals("cobra(15, 14, 7, 'L', 44)", Pair(0, 7), cobra(15, 14, 7, 'L', 44))
    assertEquals("cobra(15, 5, 14, 'U', 36)", Pair(5, 8), cobra(15, 5, 14, 'U', 36))
    assertEquals("cobra(14, 12, 4, 'R', 47)", Pair(3, 4), cobra(14, 12, 4, 'R', 47))
    assertEquals("cobra(12, 3, 4, 'R', 11)", Pair(2, 4), cobra(12, 3, 4, 'R', 11))
    assertEquals("cobra(7, 2, 6, 'D', 46)", Pair(2, 3), cobra(7, 2, 6, 'D', 46))
    assertEquals("cobra(13, 8, 1, 'D', 10)", Pair(8, 11), cobra(13, 8, 1, 'D', 10))
    println("Todos os testes passaram para a função cobra!")
    */


    /*
        O sapo começa no fundo do poço, a 0 metros de profundidade.
        Sabendo que o sapinho vai tentar sair do poço, use as seguintes regras para mostrar os saltos do sapo até a saída:
        - O sapo começa no fundo de um poço de profundidade P cm.
        - A cada salto ele sobe S centímetros.
        - Enquanto se recupera para o próximo salto, ele escorrega E centímetros.

        Imprima todas as posições de aterrissagem dos saltos do sapinho.

        Entrada: P, S, E inteiros, um por linhas. S sempre será maior que E.
        Saída: lista contendo as posições de salto e aterrissagem do sapinho até que ele saia do poço.

        Exemplo:
        Entrada: p = 10, s = 3, e = 1
        Saída: [3, 5, 7, 9]
        Explicação: O sapo salta 3 cm (anote o 3), depois escorrega 1 cm e atinge 2 cm.
                    Na próxima iteração, ele salta 3 cm e chega a 5 cm (anote o 5), depois escorrega 1 cm e chega a 4 cm.
                    E assim por diante. No último salto ele atinge 10 cm, então ele sai do poço e não escorrega mais.
    */
    fun saltosSapo(p: Int, s: Int, e: Int): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("saltosSapo(500, 100, 20)", listOf(100, 180, 260, 340, 420, 500), saltosSapo(500, 100, 20))
    assertEquals("saltosSapo(100, 80, 10)", listOf(80), saltosSapo(100, 80, 10))
    assertEquals("saltosSapo(800, 300, 50)", listOf(300, 550, 800), saltosSapo(800, 300, 50))
    assertEquals("saltosSapo(300, 55, 30)", listOf(55, 80, 105, 130, 155, 180, 205, 230, 255, 280), saltosSapo(300, 55, 30))
    assertEquals("saltosSapo(10, 2, 1)", listOf(2, 3, 4, 5, 6, 7, 8, 9, 10), saltosSapo(10, 2, 1))
    println("Todos os testes passaram para a função saltosSapo!")
    */


    /*
        Dada uma lista de inteiros em ordem não decrescente, retorne uma lista com os valores que mais se repetem (em ordem não decrescente).
        Se houver mais de um valor que se repete, retorne todos eles.

        Exemplos:

        Entrada: [1, 2, 3, 4, 5, 6]
        Saída: [1, 2, 3, 4, 5, 6]

        Entrada: [1, 1, 2, 3, 4, 5, 6]
        Saída: [1]

        Entrada: [1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6]
        Saída: [1, 2]

        Divida o problema em duas funções:
        - Uma função que conta o maior número de repetições de um valor na lista.
        - Outra função que coleta os valores que mais se repetem, usando o resultado da primeira função.
        Para cada função, implemente duas versões: uma usando recursão de cauda e outra usando filter/map/fold.
     */
    fun mais_repetidos(lista: List<Int>): List<Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return listOf<Int>()
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("mais_repetidos(listOf(1, 2, 3, 4, 5, 6))", listOf(1, 2, 3, 4, 5, 6), mais_repetidos(listOf(1, 2, 3, 4, 5, 6)))
    assertEquals("mais_repetidos(listOf(1, 1, 2, 3, 4, 5, 6))", listOf(1), mais_repetidos(listOf(1, 1, 2, 3, 4, 5, 6)))
    assertEquals("mais_repetidos(listOf(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6))", listOf(1, 2), mais_repetidos(listOf(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6)))
    assertEquals("mais_repetidos(listOf(1, 1, 1, 1)", listOf(1), mais_repetidos(listOf(1, 1, 1, 1)))
    assertEquals("mais_repetidos(listOf(2, 2, 2, 4, 4, 4))", listOf(2, 4), mais_repetidos(listOf(2, 2, 2, 4, 4, 4)))
    assertEquals("mais_repetidos(listOf(1, 3, 5, 5, 7, 9, 9))", listOf(5, 9), mais_repetidos(listOf(1, 3, 5, 5, 7, 9, 9)))
    assertEquals("mais_repetidos(listOf(1, 1, 4, 4, 7, 9))", listOf(1, 4), mais_repetidos(listOf(1, 1, 4, 4, 7, 9)))
    assertEquals("mais_repetidos(listOf(1, 2, 2, 3, 3))", listOf(2, 3), mais_repetidos(listOf(1, 2, 2, 3, 3)))
    assertEquals("mais_repetidos(listOf(1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5))", listOf(4, 5), mais_repetidos(listOf(1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5)))
    println("Todos os testes passaram para a função mais_repetidos!")
    */


    /*
        Mário só consegue pular até um bloco acima do nível
        atual, ou descer um bloco. Se a diferença entre os
        níveis for maior que um bloco ele precisará fazer
        um movimento de parkour.

        Dado um cenário, calcule quantos movimentos de parkour
        o Mário vai precisar para percorrer o cenário.

        Um cenário é um vetor de números positivos onde o vetor
        representa a altura dos blocos.

        O vetor 1, 1, 3, 3, 4, 6, 4, 2, 2, 1 seria como o
        seguinte cenário:

        _ _ _ _ _ # _ _ _ _
        _ _ _ _ _ # _ _ _ _
        _ _ _ _ # # # _ _ _
        _ _ # # # # # _ _ _
        _ _ # # # # # # # _
        # # # # # # # # # #
        Nele, o Mário precisa de 4 movimentos de parkour.

        Entrada: lista de inteiros positivos representando o cenário.
        Saída: a quantidade de movimentos de parkour.
     */
    fun parkour(cenario: List<Int>): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("parkour(listOf(1, 1, 3, 3, 4, 6, 4, 2, 2, 1))", 4, parkour(listOf(1, 1, 3, 3, 4, 6, 4, 2, 2, 1)))
    assertEquals("parkour(listOf(1, 2, 1, 2, 3))", 0, parkour(listOf(1, 2, 1, 2, 3)))
    assertEquals("parkour(listOf(4, 2, 5, 4, 5, 3))", 3, parkour(listOf(4, 2, 5, 4, 5, 3)))
    assertEquals("parkour(listOf(1, 3, 5, 7, 6, 5, 4, 3))", 3, parkour(listOf(1, 3, 5, 7, 6, 5, 4, 3)))
    assertEquals("parkour(listOf(4, 2, 5, 3, 6, 4, 3, 4, 3, 2, 3, 2, 3, 5))", 6, parkour(listOf(4, 2, 5, 3, 6, 4, 3, 4, 3, 2, 3, 2, 3, 5)))
    println("Todos os testes passaram para a função parkour!")
    */


    /*
        Dada uma lista com zeros e uns, calcule a quantidade de zeros que não é vizinha de um 1.
        Um zero é vizinho de um 1 se o 1 está na posição imediatamente anterior ou posterior ao zero.
        Entrada: lista de inteiros (0s e 1s).
        Saída: a quantidade de zeros que não são vizinhos de um 1.

        Exemplos:
        Entrada: [0, 1, 0, 0, 1]
        Saída: 0

        Entrada: [0, 0, 1, 0, 0]
        Saída: 2

        Entrada: [0, 0, 0, 0, 0]
        Saída: 5
     */
    fun vizinhos(lista: List<Int>): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("vizinhos(listOf(0, 1, 0, 0, 1))", 0, vizinhos(listOf(0, 1, 0, 0, 1)))
    assertEquals("vizinhos(listOf(0, 0, 0, 0, 0))", 5, vizinhos(listOf(0, 0, 0, 0, 0)))
    assertEquals("vizinhos(listOf(1, 1, 0, 0))", 1, vizinhos(listOf(1, 1, 0, 0)))
    assertEquals("vizinhos(listOf(0, 0, 1, 0, 0))", 2, vizinhos(listOf(0, 0, 1, 0, 0)))
    assertEquals("vizinhos(listOf(1, 0, 0, 0, 0, 0, 1))", 3, vizinhos(listOf(1, 0, 0, 0, 0, 0, 1)))
    assertEquals("vizinhos(listOf(0, 1, 0, 0, 1, 0))", 0, vizinhos(listOf(0, 1, 0, 1, 0)))
    println("Todos os testes passaram para a função vizinhos!")
    */
}