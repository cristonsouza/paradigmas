import kotlin.math.sqrt

fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Dado um valor inteiro recebido, retorne a string "positivo", "nulo" ou "negativo",
     * dependendo do sinal do valor recebido.
     * Ex.: determinarSinal( 2) retorna "positivo".
     *      determinarSinal(-5) retorna "negativo".
     */
    fun determinarSinal(valor: Int): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("determinarSinal(2)", "positivo", determinarSinal(2))
    assertEquals("determinarSinal(4)", "positivo", determinarSinal(4))
    assertEquals("determinarSinal(-5)", "negativo", determinarSinal(-5))
    assertEquals("determinarSinal(0)", "nulo", determinarSinal(0))
    assertEquals("determinarSinal(-11)", "negativo", determinarSinal(-11))
    println("Todos os testes passaram para a função determinarSinal!")
    */

    /**
     * Forneça a função 'calculadora' que recebe dois valores inteiros e um operador em caráter 
     * ('+', '-', '*' ou '/')
     * e retorna uma string contendo o resultado da operação (um inteiro convertido para string, se 
     * a operação for válida). 
     * Se a operação não pode ser realizada, retorna a string "invalida".
     * Ex.: calculadora(2, 3, '+') retorna "5".
     *      calculadora(2, 3, '-') retorna "-1".
     *      calculadora(2, 0, '/') retorna "invalida".
     *      calculadora(2, 3, 'x') retorna "invalida".
     * Obs.: Use 'toString()' para converter o resultado da operação em string.
     */
    fun calculadora(a: Int, b: Int, operador: Char): String {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return ""
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calculadora(2, 3, '+')", "5", calculadora(2, 3, '+'))
    assertEquals("calculadora(2, 3, '-')", "-1", calculadora(2, 3, '-'))
    assertEquals("calculadora(2, 3, '*')", "6", calculadora(2, 3, '*'))
    assertEquals("calculadora(2, 3, '/')", "0", calculadora(2, 3, '/'))
    assertEquals("calculadora(2, 0, '/')", "invalida", calculadora(2, 0, '/'))
    assertEquals("calculadora(2, 3, 'x')", "invalida", calculadora(2, 3, 'x'))
    println("Todos os testes passaram para a função calculadora!")
    */

    /**
     * Forneça a função 'verificarAprovacao' que recebe as notas de 2 provas (P1 e P2) e a nota da 
     * prova final (PF), e 
     * retorna verdadeiro se o aluno foi aprovado, e falso caso contrário.
     * Seja M a média de P1 e P2.
     * O aluno é aprovado se M >= 7.0, independente da nota fornecido para a prova final.
     * Se 4.0 <= M < 7.0, o aluno é aprovado se PF >= 4.0 e a média entre M e PF for maior ou igual 
     * a 5.0.
     * Em todos os os outros casos, o aluno é reprovado.
     * Ex.: verificarAprovacao(7.0, 8.0, 0.0) retorna true.
     *      verificarAprovacao(6.0, 5.0, 3.0) retorna false.
     *      verificarAprovacao(6.0, 5.0, 4.0) retorna false.
     *      verificarAprovacao(6.0, 5.0, 4.5) retorna true.
     */
    fun verificarAprovacao(p1: Double, p2: Double, pf: Double): Boolean {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return false
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("verificarAprovacao(7.0, 8.0, 0.0)", true, verificarAprovacao(7.0, 8.0, 0.0))
    assertEquals("verificarAprovacao(6.0, 5.0, 3.0)", false, verificarAprovacao(6.0, 5.0, 3.0))
    assertEquals("verificarAprovacao(6.0, 5.0, 4.0)", false, verificarAprovacao(6.0, 5.0, 4.0))
    assertEquals("verificarAprovacao(6.0, 5.0, 4.5)", true, verificarAprovacao(6.0, 5.0, 4.5))
    println("Todos os testes passaram para a função verificarAprovacao!")
    */

    /**
     * Um funcionário trabalha de segunda a sexta, de 8 até 11:59 e de 14 até 17:59. 
     * No sábado, ele trabalha apenas de 8 até 11:59.
     *
     * Forneça a função 'trabalhandoOuNao' que recebe um dia (1 a 7), uma hora (0 a 23) e um minuto 
     * (0 a 59) e retorna um booleano indicando se o funcionário está trabalhando ou não.
     * Os dias da semana são representados pelos códigos inteiros abaixo:
     *      1 = DOM, 2 = SEG, 3 = TER, 4 = QUA, 5 = QUI, 6 = SEX, 7 = SAB
     */
    fun trabalhandoOuNao(dia: Int, hora: Int, minuto: Int): Boolean {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return false
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("trabalhandoOuNao(1, 8, 0)", false, trabalhandoOuNao(1, 8, 0))
    assertEquals("trabalhandoOuNao(2, 8, 0)", true, trabalhandoOuNao(2, 8, 0))
    assertEquals("trabalhandoOuNao(2, 11, 59)", true, trabalhandoOuNao(2, 11, 59))
    assertEquals("trabalhandoOuNao(2, 12, 0)", false, trabalhandoOuNao(2, 12, 0))
    assertEquals("trabalhandoOuNao(2, 14, 0)", true, trabalhandoOuNao(2, 14, 0))
    assertEquals("trabalhandoOuNao(7, 14, 0)", false, trabalhandoOuNao(7, 14, 0))
    assertEquals("trabalhandoOuNao(4, 18, 0)", false, trabalhandoOuNao(4, 18, 0))
    println("Todos os testes passaram para a função trabalhandoOuNao!")
    */

    /**
     * Forneça a função `maiorValor`, que recebe 6 números inteiros e retorna o maior deles.
     * Ex.: maiorValor(5, 2, 4, 1, 3, 6) retorna 6.
     * Dica: declare uma variável auxiliar para armazenar o maior valor encontrado até o momento.
     */
    fun maiorValor(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("maiorValor(5, 2, 4, 1, 3, 6)", 6, maiorValor(5, 2, 4, 1, 3, 6))
    assertEquals("maiorValor(1, 1, 1, 1, 1, 1)", 1, maiorValor(1, 1, 1, 1, 1, 1))
    assertEquals("maiorValor(1, 2, 3, 4, 5, 0)", 5, maiorValor(1, 2, 3, 4, 5, 0))
    assertEquals("maiorValor(-1, -2, -3, -4, -5, -6)", -1, maiorValor(-1, -2, -3, -4, -5, -6))
    println("Todos os testes passaram para a função maiorValor!")
    */

    /**
     * Forneça a função `meio`, que recebe 3 números inteiros e retorna o elemento do meio caso os 
     * 3 valores sejam colocados em ordem crescente.
     * Ex.: meio(5, 2, 4) retorna 4.
     *      meio(6, 5, 7) retorna 6.
     */
    fun meio(a: Int, b: Int, c: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("meio(5, 2, 4)", 4, meio(5, 2, 4))
    assertEquals("meio(6, 5, 7)", 6, meio(6, 5, 7))
    assertEquals("meio(1, 2, 3)", 2, meio(1, 2, 3))
    println("Todos os testes passaram para a função meio!")
    */

    /**
     * Receba dois inteiros e diga se ambos são divisíveis por 3 ou ambos divisíveis por 5.
     * O valor de retorno é um booleano.
     * Ex.: divisivelPor3ou5(3,  4) retorna false.
     *      divisivelPor3ou5(5, 10) retorna true.
     */
    fun divisivelPor3ou5(a: Int, b: Int): Boolean {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return false
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("divisivelPor3ou5(3, 4)", false, divisivelPor3ou5(3, 4))
    assertEquals("divisivelPor3ou5(5, 0)", true, divisivelPor3ou5(5, 0))
    assertEquals("divisivelPor3ou5(0, 3)", true, divisivelPor3ou5(0, 3))
    assertEquals("divisivelPor3ou5(5, 10)", true, divisivelPor3ou5(5, 10))
    assertEquals("divisivelPor3ou5(5, 9)", false, divisivelPor3ou5(5, 9))
    assertEquals("divisivelPor3ou5(0, 3)", true, divisivelPor3ou5(0, 3))
    assertEquals("divisivelPor3ou5(10, 9)", false, divisivelPor3ou5(10, 9))
    assertEquals("divisivelPor3ou5(15, 45)", true, divisivelPor3ou5(15, 45))
    println("Todos os testes passaram para a função divisivelPor3ou5!")
    */

    /**
     * Receba três valores inteiros. Retorne a quantidade de valores iguais dentre os três.
     * Ex.: quantidadeIguais(3, 3, 1) retorna 2.
     *      quantidadeIguais(4, 4, 4) retorna 3.
     *      quantidadeIguais(1, 3, 2) retorna 0.
     */
    fun quantidadeIguais(a: Int, b: Int, c: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("quantidadeIguais(3, 3, 1)", 2, quantidadeIguais(3, 3, 1))
    assertEquals("quantidadeIguais(1, 3, 3)", 2, quantidadeIguais(1, 3, 3))
    assertEquals("quantidadeIguais(4, 4, 4)", 3, quantidadeIguais(4, 4, 4))
    assertEquals("quantidadeIguais(1, 5, 1)", 2, quantidadeIguais(1, 5, 1))
    assertEquals("quantidadeIguais(1, 3, 2)", 0, quantidadeIguais(1, 3, 2))
    assertEquals("quantidadeIguais(6, 5, 4)", 0, quantidadeIguais(6, 5, 4))
    println("Todos os testes passaram para a função quantidadeIguais!")
    */

    /**
     * Dada uma equação do 2o grau, calcule as raízes reais da equação.
     * Entrada: 3 valores ponto flutuante, corresponde aos parâmetros 'a', 'b' e 'c' de uma equação 
     *          do 2o grau.
     * Saída: Uma tupla contendo um booleano (verdadeiro apenas se há raízes reais) e dois valores 
     *        ponto flutuante (menor raiz e maior raiz, ou zeros caso não haja raízes reais).
     * 
     * Ex.: calcularRaizes(5.0,  3.0,   5.0) retorna (false, 0.0, 0.0)
     *      calcularRaizes(1.0, -1.0, -20.0) retorna (true, -4.0, 5.0)
     */
    fun calcularRaizes(a: Double, b: Double, c: Double): Triple<Boolean, Double, Double> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Triple(false, 0.0, 0.0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularRaizes(5.4, 25.0, -12.0)", Triple(true, -5.068101913740091, 0.4384722841104621), calcularRaizes(5.4, 25.0, -12.0))
    assertEquals("calcularRaizes(3.0, -7.0, 4.0)", Triple(true, 1.0, 1.3333333333333333), calcularRaizes(3.0, -7.0, 4.0))
    assertEquals("calcularRaizes(9.0, -12.0, 4.0)", Triple(true, 0.6666666666666666, 0.6666666666666666), calcularRaizes(9.0, -12.0, 4.0))
    assertEquals("calcularRaizes(5.0, 3.0, 5.0)", Triple(false, 0.0, 0.0), calcularRaizes(5.0, 3.0, 5.0))
    assertEquals("calcularRaizes(1.0, -1.0, -20.0)", Triple(true, -4.0, 5.0), calcularRaizes(1.0, -1.0, -20.0))
    assertEquals("calcularRaizes(1.0, -1.0, 20.0)", Triple(false, 0.0, 0.0), calcularRaizes(1.0, -1.0, 20.0))
    assertEquals("calcularRaizes(1.0, -1.0, 20.0)", Triple(false, 0.0, 0.0), calcularRaizes(1.0, -1.0, 20.0))
    println("Todos os testes passaram para a função calcularRaizes!")
    */
}
