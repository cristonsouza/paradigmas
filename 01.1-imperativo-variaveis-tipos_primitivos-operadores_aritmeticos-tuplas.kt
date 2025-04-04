import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun assertEquals(funcao: String, esperado: Any, resultado: Any) {
        if (esperado != resultado) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Forneça a função `celsiusToFahrenheit` que recebe uma temperatura em graus Celsius e retorna 
     * esta temperatura convertida em graus Fahrenheit.
     * Fórmula de conversão: F = (9/5)⋅C+32, onde C é a temperatura em Celsius, e F é a temperatura 
     * em Fahrenheit.
     * Ex.: celsiusToFahrenheit(10.0) retorna 50.0.
     */
    fun celsiusToFahrenheit(celsius: Double): Double {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0.0
    }
    
    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("celsiusToFahrenheit(10.0)", 50.0, celsiusToFahrenheit(10.0))
    assertEquals("celsiusToFahrenheit(0.0)", 32.0, celsiusToFahrenheit(0.0))
    assertEquals("celsiusToFahrenheit(5.5)", 41.9, celsiusToFahrenheit(5.5))
    println("Todos os testes passaram para a função celsiusToFahrenheit!")
    */

    /**
     * Forneça a função `mediaPonderada` que recebe 3 notas (1a prova, 2a prova e trabalho, nesta 
     * ordem) e retorna a média ponderada desta notas.
     * A 1a prova tem peso 5, a 2a prova tem peso 3, e o trabalho tem peso 2.
     * Ex: mediaPonderada(8.5, 6, 7) retorna 7.45, pois, (5*8.5 + 3*6 + 2*7) / 10 = 7.45.
     */
    fun mediaPonderada(prova1: Double, prova2: Double, trabalho: Double): Double {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0.0
    }

    /*
    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    assertEquals("mediaPonderada(8.5, 6, 7)", 7.45, mediaPonderada(8.5, 6.0, 7.0))
    assertEquals("mediaPonderada(5.0, 5.0, 5.0)", 5.0, mediaPonderada(5.0, 5.0, 5.0))
    assertEquals("mediaPonderada(1.0, 2.0, 3.0)", 1.7, mediaPonderada(1.0, 2.0, 3.0))
    println("Todos os testes passaram para a função mediaPonderada!")
    */

    /**
     * Forneça a função `conversaoTempo` que recebe um tempo total em segundos e retorna um Pair 
     * contendo este tempo em horas e minutos, e o restante em segundos.
     * Ex.: conversaoTempo(7384) retorna Triple(2, 3, 4), pois 7384 segundos = 2 horas, 3 minutos e 
     *      4 segundos.
     */
    fun conversaoTempo(segundosTotais: Int): Triple<Int, Int, Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Triple(0, 0, 0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("conversaoTempo(7384)", Triple(2, 3, 4), conversaoTempo(7384))
    assertEquals("conversaoTempo(60)", Triple(0, 1, 0), conversaoTempo(60))
    assertEquals("conversaoTempo(3601)", Triple(1, 0, 1), conversaoTempo(3601))
    println("Todos os testes passaram para a função conversaoTempo!")
    */

    /**
     * Forneça a função `premioLoteria` que recebe o valor apostado por cada um dos 3 apostadores, e 
     * o prêmio total a ser repartido. Cada apostador ganha uma fração do prêmio proporcional ao valor 
     * apostado.
     * Ex: premioLoteria(10, 20, 30, 1200) retorna Triple(200.0, 400.0, 600.0).
     * -- Ganho do 1o: 200.0, pois 1200 * (10 / (10+20+30)) = 200
     * -- Ganho do 2o: 400.0, pois 1200 * (20 / (10+20+30)) = 400
     * -- Ganho do 3o: 600.0, pois 1200 * (30 / (10+20+30)) = 600
     */
    fun premioLoteria(aposta1: Double, aposta2: Double, aposta3: Double, premioTotal: Double): Triple<Double, Double, Double> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Triple(0.0, 0.0, 0.0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("premioLoteria(10.0, 20.0, 30.0, 1200.0)", Triple(200.0, 400.0, 600.0), premioLoteria(10.0, 20.0, 30.0, 1200.0))
    assertEquals("premioLoteria(1.5, 1.5, 1.5, 31.5)", Triple(10.5, 10.5, 10.5), premioLoteria(1.5, 1.5, 1.5, 31.5))
    assertEquals("premioLoteria(1.0, 2.0, 3.0, 120.0)", Triple(20.0, 40.0, 60.0), premioLoteria(1.0, 2.0, 3.0, 120.0))
    println("Todos os testes passaram para a função premioLoteria!")
    */

    /**
     * Forneça a função 'calcularIMC' que recebe o peso e a altura de uma pessoa, e retorna o IMC 
     * (Índice de Massa Corporal) dela.
     * O IMC é calculado pela fórmula: IMC = peso / (altura * altura).
     * Ex.: calcularIMC(70.0, 1.75) retorna 22.86.
     */
    fun calcularIMC(peso: Double, altura: Double): Double {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0.0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularIMC(70.0, 1.75)", 22.857142857142858, calcularIMC(70.0, 1.75))
    assertEquals("calcularIMC(60.0, 1.60)", 23.437499999999996, calcularIMC(60.0, 1.60))
    assertEquals("calcularIMC(80.0, 1.80)", 24.691358024691358, calcularIMC(80.0, 1.80))
    println("Todos os testes passaram para a função calcularIMC!")
    */

    /**
     * Forneça a função `distancia`, que recebe dois pontos no plano `(x1,y1)` e `(x2,y2)` (ou seja, 
     * recebe dois Pairs com dois elementos cada), e retorna a distância entre estes pontos, dada 
     * pela fórmula sqrt((x1−x2)^2+(y1−y2)^2).
     * Obs.: `sqrt` é a função que fornece a raiz quadrada.
     * Ex: distancia((3,7), (1,4)) retorna 3.605551275463989.
     */
    fun distancia(ponto1: Pair<Double, Double>, ponto2: Pair<Double, Double>): Double {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0.0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("distancia((3,7), (1,4))", 3.605551275463989, distancia(Pair(3.0, 7.0), Pair(1.0, 4.0)))
    assertEquals("distancia((7,3), (4,-1))", 5.0, distancia(Pair(7.0, 3.0), Pair(4.0, -1.0)))
    assertEquals("distancia((1,8), (-4,12))", 6.4031242374328485, distancia(Pair(1.0, 8.0), Pair(-4.0, 12.0)))
    assertEquals("distancia((0,0), (0,0))", 0.0, distancia(Pair(0.0, 0.0), Pair(0.0, 0.0)))
    assertEquals("distancia((47.88,43.91), (34.8,40.02))", 13.646189944449699, distancia(Pair(47.88, 43.91), Pair(34.8, 40.02)))
    println("Todos os testes passaram para a função distancia!")
    */

    /**
     * Crie uma função que calcule a potencia de um numero (apenas chame uma função da biblioteca padrão).
     * Obs.: Use a função `pow` do Double para calcular a potência (ex.: 2.0.pow(3)), mas lembre-se 
     * que ela retorna um Double.
     *       Para converter para Int, use a função `toInt()`.
     * Ex.: calcularPotencia(2, 5) retorna 32.
     */
    fun calcularPotencia(base: Int, expoente: Int): Int {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return 0
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularPotencia(2, 5)", 32, calcularPotencia(2, 5))
    assertEquals("calcularPotencia(3, 4)", 81, calcularPotencia(3, 4))
    assertEquals("calcularPotencia(5, 3)", 125, calcularPotencia(5, 3))
    assertEquals("calcularPotencia(10, 2)", 100, calcularPotencia(10, 2))
    assertEquals("calcularPotencia(2, 0)", 1, calcularPotencia(2, 0))
    println("Todos os testes passaram para a função calcularPotencia!")
    */

    /**
     * Inicialize duas variáveis inteiras com valores recebidos como parâmetro,
     * troque os valores destas duas variáveis, em seguida retorne um Pair com os valores delas
     * (na mesma ordem em que foram declaradas).
     */
    fun trocarValores(a: Int, b: Int): Pair<Int, Int> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Pair(0, 0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("trocarValores(2, 3)", Pair(3, 2), trocarValores(2, 3))
    assertEquals("trocarValores(1, 2)", Pair(2, 1), trocarValores(1, 2))
    assertEquals("trocarValores(1, 1)", Pair(1, 1), trocarValores(1, 1))
    assertEquals("trocarValores(0, 0)", Pair(0, 0), trocarValores(0, 0))
    println("Todos os testes passaram para a função trocarValores!")
    */

    /**
     * Dados dois inteiros 'a' e 'b' recebidos como entrada,
     * retorne um Triple contendo o resultado da divisão inteira, o resto da divisão
     * e o resultado da divisão fracionária de 'a' por 'b'.
     */
    fun calcularDivisao(a: Int, b: Int): Triple<Int, Int, Double> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Triple(0, 0, 0.0)
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularDivisao(7, 3)", Triple(2, 1, 7.0 / 3.0), calcularDivisao(7, 3))
    assertEquals("calcularDivisao(10, 2)", Triple(5, 0, 5.0), calcularDivisao(10, 2))
    assertEquals("calcularDivisao(5, 3)", Triple(1, 2, 5.0 / 3.0), calcularDivisao(5, 3))
    println("Todos os testes passaram para a função calcularDivisao!")
    */

    /**
     * Escreva uma função para auxiliar vendedores. A partir de um valor total recebido, retornar:
     * - o total a pagar com desconto de 10% (para o caso de venda à vista);
     * - o valor de cada parcela, no parcelamento em 3 x sem juros;
     * - a comissão do vendedor, no caso da venda ser à vista (5% sobre o valor com desconto )
     * - a comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
     */
    fun calcularValores(valorTotal: Double): Triple<Double, Double, Pair<Double, Double>> {
        // <FORNEÇA AQUI SUA SOLUÇÃO>
        return Triple(0.0, 0.0, Pair(0.0, 0.0))
    }

    // <INCLUA O TRECHO ABAIXO PARA TESTAR SUA SOLUÇÃO>
    /*
    assertEquals("calcularValores(100.0)", Triple(90.0, 100.0 / 3.0, Pair(4.5, 5.0)), calcularValores(100.0))
    assertEquals("calcularValores(200.0)", Triple(180.0, 200.0 / 3.0, Pair(9.0, 10.0)), calcularValores(200.0))
    assertEquals("calcularValores(300.0)", Triple(270.0, 100.0, Pair(13.5, 15.0)), calcularValores(300.0))
    println("Todos os testes passaram para a função calcularValores!")
    */
}
