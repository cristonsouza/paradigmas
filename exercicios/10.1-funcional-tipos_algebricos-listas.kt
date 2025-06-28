import kotlin.math.PI
import kotlin.math.max

/**
 * Nas questões a seguir, você irá implementar funções que utilizam os tipos algébricos (ADT) definidos abaixo.
 */

// A definição de "Forma" aceitas círculos, retângulos e triângulos como formas geométricas (apenas).
sealed class Forma
data class Circulo(val raio: Double) : Forma()
data class Retangulo(val largura: Double, val altura: Double) : Forma()
data class Triangulo(val base: Double, val altura: Double) : Forma()

// Definição recursiva de uma expressão que contém números e permite as operações de adição e multiplicação.
sealed class Expressao
data class Numero(val valor: Int) : Expressao()
data class Adicao(val esquerda: Expressao, val direita: Expressao) : Expressao()
data class Multiplicacao(val esquerda: Expressao, val direita: Expressao) : Expressao()

// Representa uma lista encadeada, onde 'Nil' é o final da lista e 'Cons' é um nó com dados do 1o elemento (head) e 
// outra lista contendo os elementos restantes (tail). É um tipo recursivo.
sealed class Lista<out A> {
    object Nil : Lista<Nothing>()
    data class Cons<A>(val head: A, val tail: Lista<A>) : Lista<A>()
}

fun main() {

    /**
     * Calcule a área de uma forma geométrica definida pelo tipo 'Forma'.
     * Se for um círculo, use a fórmula π * raio². Kotlin disponibiliza a constante PI.
     * Se for um retângulo, use a fórmula largura * altura.
     * Se for um triângulo, use a fórmula (base * altura) / 2.
     */
    fun calcularArea(forma: Forma): Double {
        return 0.0
    }

    /*
    assert(calcularArea(Circulo(5.0)) == 78.53981633974483) { "Falha no teste 3: ${calcularArea(Circulo(5.0))}" }
    assert(calcularArea(Retangulo(4.0, 6.0)) == 24.0) { "Falha no teste 4: ${calcularArea(Retangulo(4.0, 6.0))}" }
    assert(calcularArea(Triangulo(3.0, 8.0)) == 12.0) { "Falha no teste 5: ${calcularArea(Triangulo(3.0, 8.0))}" }
    println("Todos os testes passaram para a função calcularArea!")
    */

    /**
     * Determine o valor de uma expressão aritmética definida pelo tipo 'Expressao'.
     * Se for um número, retorne seu valor.
     * Se for uma adição, some os valores das expressões à esquerda e à direita (recursivamente).
     * Se for uma multiplicação, multiplique os valores das expressões à esquerda e à direita (recursivamente).
     * Obs.: Quanto terminar, experimente avaliar apenas número e adição, para ver o erro de compilação indicando que o 
     *       when precisa ser exaustivo (faltando a multiplicação).
     */
    fun avaliarExpressao(expressao: Expressao): Int {
        return 0
    }

    /*
    assert(avaliarExpressao(Adicao(Numero(5), Multiplicacao(Numero(2), Numero(3)))) == 11) { "Falha no teste 1: ${avaliarExpressao(Adicao(Numero(5), Multiplicacao(Numero(2), Numero(3))))}" }
    assert(avaliarExpressao(Numero(10)) == 10) { "Falha no teste 2: ${avaliarExpressao(Numero(10))}" }
    println("Todos os testes passaram para a função avaliarExpressao!")
    */

    /**
     * Calcule o comprimento de uma Lista representada pelo tipo 'Lista'.
     * Uma lista vazia (Nil) tem comprimento 0.
     * Uma lista com pelo menos um elemento (Cons) tem comprimento 1 + comprimento da lista restante (tail).
     */
    fun <A> comprimentoLista(lista: Lista<A>): Int {
        return 0
    }

    /*
    val lista1: Lista<Int> = Lista.Cons(1, Lista.Cons(2, Lista.Cons(3, Lista.Nil)))
    val lista2: Lista<String> = Lista.Cons("a", Lista.Cons("b", Lista.Nil))
    assert(comprimentoLista(lista1) == 3) { "Falha no teste 1: ${comprimentoLista(lista1)}" }
    assert(comprimentoLista(lista2) == 2) { "Falha no teste 2: ${comprimentoLista(lista2)}" }
    assert(comprimentoLista(Lista.Nil) == 0) { "Falha no teste 3: ${comprimentoLista(Lista.Nil)}" }
    println("Todos os testes passaram para a função comprimentoLista!")
    */

    /**
     * Inverta uma lista representada pelo tipo 'Lista'.
     * Crie uma função auxiliar recursiva, que acumula a lista invertida (construída com 'Cons' e inicializada com 'Nil').
     * Obs.: filter/map/fold são definidas para 'list', não para 'Lista'.
     */
    fun <A> inverterLista(lista: Lista<A>): Lista<A> {
        return Lista.Nil
    }

    /*
    val listaInvertida1: Lista<Int> = Lista.Cons(3, Lista.Cons(2, Lista.Cons(1, Lista.Nil)))
    val listaInvertida2: Lista<String> = Lista.Cons("b", Lista.Cons("a", Lista.Nil))
    assert(inverterLista(lista1) == listaInvertida1) { "Falha no teste 4: ${inverterLista(lista1)}" }
    assert(inverterLista(lista2) == listaInvertida2) { "Falha no teste 5: ${inverterLista(lista2)}" }
    assert(inverterLista(Lista.Nil) == Lista.Nil) { "Falha no teste 6: ${inverterLista(Lista.Nil)}" }
    println("Todos os testes passaram para a função inverterLista!")
    */

    /**
     * Encontra o máximo valor em uma lista de Int representada pelo tipo 'Lista<Int>'.
     * Para listas vazias, retorne Int.MIN_VALUE.
     */
    fun maximoLista(lista: Lista<Int>): Int {
        return 0
    }

    /*
    val listaMax: Lista<Int> = Lista.Cons(5, Lista.Cons(10, Lista.Cons(2, Lista.Cons(15, Lista.Nil))))
    assert(maximoLista(listaMax) == 15) { "Falha no teste 13: ${maximoLista(listaMax)}" }
    assert(maximoLista(Lista.Cons(5, Lista.Nil)) == 5) { "Falha no teste 14: ${maximoLista(Lista.Cons(5, Lista.Nil))}" }
    println("Todos os testes passaram para a função maximoLista!")
    */

    /**
     * Concatena duas Listas representadas pelo tipo 'Lista'.
     * Dica: Percorra recursivamente a primeira lista. 
     *       Recursivamente, adicione a cauda da primeira lista no início da segunda lista.
     */
    fun <A> concatenaListas(lista1: Lista<A>, lista2: Lista<A>): Lista<A> {
        return Lista.Nil
    }

    /*
    val listaConcatenada1: Lista<Int> = Lista.Cons(1, Lista.Cons(2, Lista.Cons(3, Lista.Cons(4, Lista.Nil))))
    val listaConcatenada2: Lista<String> = Lista.Cons("a", Lista.Cons("b", Lista.Cons("c", Lista.Cons("d", Lista.Nil))))
    assert(concatenaListas(Lista.Cons(1, Lista.Cons(2, Lista.Nil)), Lista.Cons(3, Lista.Cons(4, Lista.Nil)) ) == listaConcatenada1) { "Falha no teste 15: ${concatenaListas(Lista.Cons(1, Lista.Cons(2, Lista.Nil)), Lista.Cons(3, Lista.Cons(4, Lista.Nil)) )}" }
    assert(concatenaListas(Lista.Cons("a", Lista.Cons("b", Lista.Nil)), Lista.Cons("c", Lista.Cons("d", Lista.Nil)) ) == listaConcatenada2) { "Falha no teste 16: ${concatenaListas(Lista.Cons("a", Lista.Cons("b", Lista.Nil)), Lista.Cons("c", Lista.Cons("d", Lista.Nil)) )}" }
    assert(concatenaListas(Lista.Nil, Lista.Nil) == Lista.Nil) { "Falha no teste 17: ${concatenaListas(Lista.Nil, Lista.Nil)}" }
    println("Todos os testes passaram para a função concatenaListas!")
    */
}