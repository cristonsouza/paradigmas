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

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun <T> assertEquals(funcao: String, esperado: T, resultado: T, fun_compare: (T, T) -> Boolean = { a, b -> a == b }) {
        if (!fun_compare(esperado, resultado)) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    // Função auxiliar para comparar duas listas do tipo 'Lista<A>' (utilizada nos casos de teste).
    fun <A> comparaListas(lista1: Lista<A>, lista2: Lista<A>): Boolean = when (lista1) {
        is Lista.Nil -> lista2 is Lista.Nil
        is Lista.Cons -> lista2 is Lista.Cons && (lista1.head == lista2.head) && comparaListas(lista1.tail, lista2.tail)
    }

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
    assertEquals("calcularArea", 78.53981633974483, calcularArea(Circulo(5.0)))
    assertEquals("calcularArea", 24.0, calcularArea(Retangulo(4.0, 6.0)))
    assertEquals("calcularArea", 12.0, calcularArea(Triangulo(3.0, 8.0)))
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
    assertEquals("avaliarExpressao", 11, avaliarExpressao(Adicao(Numero(5), Multiplicacao(Numero(2), Numero(3)))))
    assertEquals("avaliarExpressao", 10, avaliarExpressao(Numero(10)))
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
    assertEquals("comprimentoLista", 3, comprimentoLista(lista1))
    assertEquals("comprimentoLista", 2, comprimentoLista(lista2))
    assertEquals("comprimentoLista", 0, comprimentoLista(Lista.Nil))
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
    assertEquals("inverterLista", listaInvertida1, inverterLista(lista1), ::comparaListas)
    assertEquals("inverterLista", listaInvertida2, inverterLista(lista2), ::comparaListas)
    assertEquals("inverterLista", Lista.Nil, inverterLista(Lista.Nil), ::comparaListas)
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
    assertEquals("maximoLista", 15, maximoLista(listaMax))
    assertEquals("maximoLista", 5, maximoLista(Lista.Cons(5, Lista.Nil)))
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
    val r1: Lista<Int> = Lista.Cons(1, Lista.Cons(2, Lista.Cons(3, Lista.Cons(4, Lista.Nil))))
    val r2: Lista<String> = Lista.Cons("a", Lista.Cons("b", Lista.Cons("c", Lista.Cons("d", Lista.Nil))))
    assertEquals("concatenaListas", r1, concatenaListas(Lista.Cons(1, Lista.Cons(2, Lista.Nil)), Lista.Cons(3, Lista.Cons(4, Lista.Nil))), ::comparaListas)
    assertEquals("concatenaListas", r2, concatenaListas(Lista.Cons("a", Lista.Cons("b", Lista.Nil)), Lista.Cons("c", Lista.Cons("d", Lista.Nil))), ::comparaListas)
    assertEquals("concatenaListas", Lista.Nil, concatenaListas(Lista.Nil, Lista.Nil), ::comparaListas)
    println("Todos os testes passaram para a função concatenaListas!")
    */
}
