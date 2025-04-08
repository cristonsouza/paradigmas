import kotlin.math.sqrt

fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Forneça a função 'mercantilV1' que recebe o valor do produto, o chute do 1o jogador e o chute 
     * do 2o jogador, e retorna uma string indicando o vencedor ("primeiro", "segundo" ou "empate").
     * O vencedor é o jogador cujo chute está mais próximo do valor do produto.
     * Se ambos os chutes estiverem a mesma distância do valor do produto, o resultado é um "empate".
     * Ex.: mercantilV1(10.0, 9.0, 11.0) retorna "empate".
     *      mercantilV1(10.0, 9.0, 12.0) retorna "primeiro".
     * Obs.: Use comandos de seleção (ao invés da função 'abs') para calcular a distância entre os 
     *       chutes e o valor do produto.
     */
    fun mercantilV1(valorProduto: Double, chute1: Double, chute2: Double): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("mercantilV1(10.0, 9.0, 11.0)", "empate", mercantilV1(10.0, 9.0, 11.0))
    assertEquals("mercantilV1(10.0, 9.0, 12.0)", "primeiro", mercantilV1(10.0, 9.0, 12.0))
    assertEquals("mercantilV1(10.0, 9.0, 8.0)", "primeiro", mercantilV1(10.0, 9.0, 8.0))
    assertEquals("mercantilV1(10.0, 9.0, 10.0)", "segundo", mercantilV1(10.0, 9.0, 10.0))
    assertEquals("mercantilV1(10.0, 12.0, 9.0)", "segundo", mercantilV1(10.0, 12.0, 9.0))
    println("Todos os testes passaram para a função mercantilV1!")
    */

    /**
     * Cada produto tem um valor ponto flutuante que nenhum dos competidores conhece. 
     * O primeiro competidor chuta um valor. 
     * O segundo competidor chuta se acha que o valor real é maior ou menor que o valor chutado pelo 
     * primeiro competidor.
     * Quando o primeiro competidor acerta o valor, ele ganha o jogo independentemente do chute do segundo.
     * Portanto, neste jogo não pode haver empate.
     *
     * Forneça a função 'mercantilV2' que recebe o valor do produto, o chute do 1o jogador e a 
     * escolha do 2o jogador ('m' para menor ou 'M' para maior), e retorna uma string indicando o 
     * vencedor ("primeiro" ou "segundo").
     *
     * Ex.: mercantilV2(10.0,  9.0, 'm') retorna "primeiro".
     *      mercantilV2(10.0, 11.0, 'm') retorna "segundo".
     *      mercantilV2(10.0, 11.0, 'M') retorna "primeiro".
     */
    fun mercantilV2(valorProduto: Double, chute1: Double, escolha2: Char): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("mercantilV2(10.0, 9.0, 'm')", "primeiro", mercantilV2(10.0, 9.0, 'm'))
    assertEquals("mercantilV2(10.0, 11.0, 'm')", "segundo", mercantilV2(10.0, 11.0, 'm'))
    assertEquals("mercantilV2(10.0, 11.0, 'M')", "primeiro", mercantilV2(10.0, 11.0, 'M'))
    assertEquals("mercantilV2(10.0, 10.0, 'm')", "primeiro", mercantilV2(10.0, 10.0, 'm'))
    assertEquals("mercantilV2(10.0, 10.0, 'M')", "primeiro", mercantilV2(10.0, 10.0, 'M'))
    println("Todos os testes passaram para a função mercantilV2!")
    */

    /**
     * Forneça a função 'quizHarryPotter' as respostas das 4 perguntas do quiz abaixo, e retorna a 
     * quantidade de acertos.
     * 
     * 1 - A que casa pertencia Harry Potter e seus amigos ?
     * a) Hufflepuff
     * b) Ravenclaw
     * c) Slytherin
     * d) Gryffindor [RESPOSTA CORRETA]
     *
     * 2 - Qual o nome verdadeiro do personagem o qual é conhecido por aquele que não deve ser nomeado ?
     * a) Tom Riddle [RESPOSTA CORRETA]
     * b) Draco Malfoy
     * c) Bellatrix Lestrange
     * d) Pedro Pettigrew
     *
     * 3 - Quais dessa opções não é uma Relíquia da Morte ?
     * a) A varinha de sabugueiro
     * b) A pedra da ressurreição
     * c) A pedra filosofal [RESPOSTA CORRETA]
     * d) A capa de invisibilidade
     *
     * 4 - O ministério da magia proibiu o uso de três feitiços, conhecidos como as maldições imperdoáveis, 
     *     por ela possuírem caráter maligno e o objetivo cruel. Marque opção abaixo que não corresponde 
     *     a umas das maldições imperdoáveis:
     * a) Crucio
     * b) Imperio
     * c) Avada Kedavra
     * d) Expecto Patronum [REPOSTA CORRETA]
     * 
     * Ex.: quizHarryPotter('d', 'b', 'c', 'c') retorna 2.
     */
    fun quizHarryPotter(resposta1: Char, resposta2: Char, resposta3: Char, resposta4: Char): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("quizHarryPotter('d', 'b', 'c', 'c')", 2, quizHarryPotter('d', 'b', 'c', 'c'))
    assertEquals("quizHarryPotter('d', 'a', 'c', 'd')", 4, quizHarryPotter('d', 'a', 'c', 'd'))
    assertEquals("quizHarryPotter('a', 'a', 'a', 'a')", 1, quizHarryPotter('a', 'a', 'a', 'a'))
    assertEquals("quizHarryPotter('b', 'b', 'b', 'b')", 0, quizHarryPotter('b', 'b', 'b', 'b'))
    println("Todos os testes passaram para a função quizHarryPotter!")
    */

    /**
     * Forneça a função 'jokenpo' que retorna o resultado do jogo pedra, papel e tesoura.
     * Os jogadores podem escolher entre R(rock), P(paper) e S(scissor), que correspondem ao nosso 
     * pedra, papel e tesoura (nesta ordem).
     * A entrada são dois caracteres, um para cada jogador, e a saída é uma string indicando o 
     * resultado do jogo ("jog1", "jog2" ou "empate").
     *
     * Quem ganha:
     * - Pedra ganha de tesoura
     * - Tesoura ganha de papel
     * - Papel ganha de pedra
     *
     * Ex.: jokenpo('R', 'R') retorna "empate".
     *      jokenpo('R', 'P') retorna "jog2".
     *      jokenpo('R', 'S') retorna "jog1".
     */
    fun jokenpo(jog1: Char, jog2: Char): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("jokenpo('R', 'R')", "empate", jokenpo('R', 'R'))
    assertEquals("jokenpo('R', 'P')", "jog2", jokenpo('R', 'P'))
    assertEquals("jokenpo('R', 'S')", "jog1", jokenpo('R', 'S'))
    assertEquals("jokenpo('P', 'R')", "jog1", jokenpo('P', 'R'))
    assertEquals("jokenpo('P', 'S')", "jog2", jokenpo('P', 'S'))
    assertEquals("jokenpo('S', 'R')", "jog2", jokenpo('S', 'R'))
    assertEquals("jokenpo('S', 'P')", "jog1", jokenpo('S', 'P'))
    println("Todos os testes passaram para a função jokenpo!")
    */

    /**
     * Forneça a função 'zerimOuUm' que 3 valores inteiros indicando o número de dedos utilizados por 
     * cada jogador, e retorna uma string indicando o resultado do jogo ("primeiro", "segundo", "terceiro" 
     * ou "empate").
     * Cada jogador pode utilizar 0 ou 1 dedos.
     * O jogador que fornecer um número de dedos diferente dos outros dois vence.
     * Se todos os jogadores fornecerem o mesmo número de dedos, o resultado é um empate.
     * Ex.: zerimOuUm(0, 0, 0) retorna "empate".
     *      zerimOuUm(0, 1, 1) retorna "primeiro".
     *      zerimOuUm(0, 0, 1) retorna "terceiro".
     */
    fun zerimOuUm(a: Int, b: Int, c: Int): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("zerimOuUm(0, 0, 0)", "empate", zerimOuUm(0, 0, 0))
    assertEquals("zerimOuUm(0, 1, 1)", "primeiro", zerimOuUm(0, 1, 1))
    assertEquals("zerimOuUm(0, 0, 1)", "terceiro", zerimOuUm(0, 0, 1))
    assertEquals("zerimOuUm(1, 0, 1)", "segundo", zerimOuUm(1, 0, 1))
    println("Todos os testes passaram para a função zerimOuUm!")
    */

    /**
     * No zerim ou um americano, cada participante coloca quantos dedos quiser na roda. 
     * Um dos participantes soma os dedos e aponta para cada participante enquanto conta. 
     * Ganha aquele que estiver sendo apontado no momento que a contagem coincidir com a soma dos dedos.
     * Suponha que existem 4 jogadores. O contador, o jogador 1, aponta pra cima e diz "zero", e então 
     * aponta pra si mesmo e diz "um", aponta para o jogador 2 e diz "dois", para o jogador 3 e diz 
     * "três", para o jogador 4 e diz "quatro", volta a apontar para si e diz "cinco", e assim 
     * sucessivamente até a contagem atingir o total de dedos.
     * 
     * Forneça a função 'zerimOuUmAmericano' que recebe os números dos 4 jogadores e retorna uma 
     * string indicando o número do jogador que ganhou ("jog1", "jog2", "jog3", "jog4") ou "nenhum" 
     * se a soma deu 0.
     * Ex.: zerimOuUmAmericano(1,  0, 0, 0) retorna "jog1".
     *      zerimOuUmAmericano(2, 10, 1, 1) retorna "jog2".
     *      zerimOuUmAmericano(0, 0, 0, 0) retorna "nenhum".
     */
    fun zerimOuUmAmericano(jog1: Int, jog2: Int, jog3: Int, jog4: Int): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("zerimOuUmAmericano(0, 0, 0, 0)", "nenhum", zerimOuUmAmericano(0, 0, 0, 0))
    assertEquals("zerimOuUmAmericano(1, 0, 0, 0)", "jog1", zerimOuUmAmericano(1, 0, 0, 0))
    assertEquals("zerimOuUmAmericano(0, 3, 0, 0)", "jog3", zerimOuUmAmericano(0, 3, 0, 0))
    assertEquals("zerimOuUmAmericano(2, 2, 2, 2)", "jog4", zerimOuUmAmericano(2, 2, 2, 2))
    assertEquals("zerimOuUmAmericano(1, 1, 1, 1)", "jog4", zerimOuUmAmericano(1, 1, 1, 1))
    assertEquals("zerimOuUmAmericano(2, 1, 1, 1)", "jog1", zerimOuUmAmericano(2, 1, 1, 1))
    assertEquals("zerimOuUmAmericano(2, 10, 1, 1)", "jog2", zerimOuUmAmericano(2, 10, 1, 1))
    println("Todos os testes passaram para a função zerimOuUmAmericano!")
    */

    /**
     * Forneça a função 'droneDeEntrega' que recebe os 3 lados de uma caixa e a altura e largura de 
     * uma janela e retorna se um booleano indicando se existe alguma forma da caixa passar pela janela.
     * A caixa pode ser rotacionada, mas não pode ser desmontada.
     * Ex.: droneDeEntrega(10, 20, 30, 25, 15) retorna true.
     *      droneDeEntrega(10, 20, 30, 15, 10) retorna false.
     * Obs.: Não ordene os lados da caixa (apenas faça as comparações necessárias).
     */
    fun droneDeEntrega(lado1: Int, lado2: Int, lado3: Int, largura: Int, altura: Int): Boolean {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return false
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("droneDeEntrega(10, 20, 30, 25, 15)", true, droneDeEntrega(10, 20, 30, 25, 15))
    assertEquals("droneDeEntrega(10, 20, 30, 15, 10)", false, droneDeEntrega(10, 20, 30, 15, 10))
    assertEquals("droneDeEntrega(10, 20, 30, 30, 20)", true, droneDeEntrega(10, 20, 30, 30, 20))
    assertEquals("droneDeEntrega(10, 20, 30, 20, 10)", true, droneDeEntrega(10, 20, 30, 20, 10))
    assertEquals("droneDeEntrega(10, 20, 30, 10, 5)", false, droneDeEntrega(10, 20, 30, 10, 5))
    println("Todos os testes passaram para a função droneDeEntrega!")
    */

    /**
     * Assuma que a distância entre os dois marcadores de horas consecutivas é 6 centímetros. 
     * Ou seja, se a formiga sai do ponto 00:00 e anda até 01:00, ela anda 6 centímetros, o que 
     * equivale a dizer que cada 10 min equivale a 1 cm para o ponteiro das horas. 
     * Ex.: De 02:00 até 03:30 são então 9 centímetros. 
     * Para simplificar, a formiga sempre vai iniciar sua caminhada em valores múltiplos de 10 nos minutos.
     * Dado a posição inicial da formiga no relógio, a direção que ela está caminhado H(horário) 
     * A(anti-horário) e quantos centímetros ela caminhou (um inteiro), informe em que posição do 
     * relógio ela vai terminar sua caminhada.
     *
     * Forneça a função 'formiga' que recebe a hora e o minuto que a formiga começa sua caminhada, o
     * sentido que ela anda ('H' para horário ou 'A' para anti-horário) e a distância caminhada em 
     * centímetros. Para simplificar, o meio dia será representado pelo horário 00:00 e não por 12:00.
     * A saída é a posição (hora e minuto) que ela termina sua caminhada.
     *
     * Ex.: formiga(2, 0, 'H', 6) retorna (3, 0).
     *      formiga(2, 0, 'A', 3) retorna (1, 30).
     * 
     * Dicas:
     * - Converta inicialmente tudo para centímetro como se estivesse calculando a distancia entre o 
     *   ponto 00:00 e o ponto atual. Depois faça a operação de forma modular (utilizando o operador 
     *   de resto da divisão). Então reconverta o resultado para hora.
     * - Para converter para centímetro, multiplique a hora por 6, e divida os minutos por 10. 
     *   Ex.: 04:20 equivale a 4 * 6 + 20 / 10 = 26 centímetros do ponto meio dia.
     * - Após isso, opere utilizando soma (horário) ou subtração(anti-horário) o valor obtido com a 
     *   distância percorrida pela formiga.
     * - Você precisará fazer uma operação modular para "recolocar" esse valor dentro do relógio 
     *   novamente.
     * - Perceba que o relógio inteiro possui 12 * 6 = 72 centímetros. Talvez o valor que você 
     *   calculou, seja maior que 72 ou menor que 0. Você pode "consertá-lo" fazendo (valor % 72). 
     *   Se esse valor for negativo, some com 72 para reposicionar dentro do relógio. 
     * - Agora você precisa converter esses centímetros de volta pra um horário válido.
     *   Divida por 6 para saber quantas horas você possui.
     *   O resto da divisão por 6 equivale aos minutos. Pegue o resto da divisão e multiplique por 10. 
     *   Pronto, resultado obtido!
     */
    fun formiga(hora: Int, minuto: Int, sentido: Char, distancia: Int): Pair<Int, Int> {
            // <FORNEÇA AQUI SUA SOLUÇÃO>
            return Pair(0, 0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("formiga(0, 40, 'A', 1)", Pair(0, 30), formiga(0, 40, 'A', 1))
    assertEquals("formiga(0, 10, 'A', 2)", Pair(11, 50), formiga(0, 10, 'A', 2))
    assertEquals("formiga(7, 40, 'A', 915)", Pair(11, 10), formiga(7, 40, 'A', 915))
    assertEquals("formiga(5, 10, 'H', 492)", Pair(3, 10), formiga(5, 10, 'H', 492)) 
    assertEquals("formiga(9, 10, 'H', 27)", Pair(1, 40), formiga(9, 10, 'H', 27))
    assertEquals("formiga(2, 10, 'A', 926)", Pair(3, 50), formiga(2, 10, 'A', 926))
    assertEquals("formiga(0, 0, 'H', 736)", Pair(2, 40), formiga(0, 0, 'H', 736))
    assertEquals("formiga(11, 20, 'A', 429)", Pair(11, 50), formiga(11, 20, 'A', 429))
    assertEquals("formiga(2, 20, 'H', 123)", Pair(10, 50), formiga(2, 20, 'H', 123))
    assertEquals("formiga(7, 10, 'A', 802)", Pair(5, 30), formiga(7, 10, 'A', 802))
    assertEquals("formiga(6, 0, 'A', 167)", Pair(2, 10), formiga(6, 0, 'A', 167))
    assertEquals("formiga(1, 40, 'A', 42)", Pair(6, 40), formiga(1, 40, 'A', 42))
    assertEquals("formiga(9, 30, 'A', 919)", Pair(0, 20), formiga(9, 30, 'A', 919))
    assertEquals("formiga(8, 10, 'H', 324)", Pair(2, 10), formiga(8, 10, 'H', 324))
    assertEquals("formiga(11, 0, 'A', 526)", Pair(7, 20), formiga(11, 0, 'A', 526))
    assertEquals("formiga(7, 20, 'H', 873)", Pair(8, 50), formiga(7, 20, 'H', 873))
    assertEquals("formiga(2, 20, 'H', 281)", Pair(1, 10), formiga(2, 20, 'H', 281))
    assertEquals("formiga(9, 30, 'H', 327)", Pair(4, 0), formiga(9, 30, 'H', 327))
    assertEquals("formiga(8, 50, 'H', 729)", Pair(10, 20), formiga(8, 50, 'H', 729))
    assertEquals("formiga(1, 50, 'H', 895)", Pair(7, 0), formiga(1, 50, 'H', 895))
    assertEquals("formiga(6, 30, 'H', 367)", Pair(7, 40), formiga(6, 30, 'H', 367))
    assertEquals("formiga(2, 20, 'A', 750)", Pair(9, 20), formiga(2, 20, 'A', 750))
    println("Todos os testes passaram para a função formiga!")
    */
}
