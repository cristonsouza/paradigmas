import kotlin.math.max

/**
 * Nas questões a seguir, você irá implementar funções que utilizam os tipos algébricos (ADT) definidos abaixo.
 */

// Representa uma opção que pode ter um valor (Algum) ou não (Nenhum).
sealed class Opcao<out A>
data class Algum<A>(val valor: A) : Opcao<A>()
object Nenhum : Opcao<Nothing>()

// Representa uma árvore binária, onde as folhas não possuem valor e cada nó interno possuem um valor e referências para 
// as subárvores esquerda e direita. É um tipo recursivo.
sealed class Arvore<out A> {
    object Folha : Arvore<Nothing>()
    data class No<A>(val valor: A, val esquerda: Arvore<A>, val direita: Arvore<A>) : Arvore<A>()
}

fun main() {

    // Função auxiliar para verificar os resultados dos testes (não modifique)
    fun <T> assertEquals(funcao: String, esperado: T, resultado: T, fun_compare: (T, T) -> Boolean = { a, b -> a == b }) {
        if (!fun_compare(esperado, resultado)) {
            throw AssertionError("Falha em $funcao: Esperado $esperado, Obtido $resultado")
        }
    }

    /**
     * Verifique se uma 'Opcao' tem valor.
     * Ou seja, retorne 'true' se a opção é 'Algum' e 'false' se for 'Nenhum'.
     */
    fun <A> temValor(opcao: Opcao<A>): Boolean {
        return false
    }

    /*
    assertEquals("temValor", true, temValor(Algum(10)))
    assertEquals("temValor", false, temValor(Nenhum))
    println("Todos os testes passaram para a função temValor!")
    */

    /**
     * Retorne o dobro de um valor Opcao, se presente. Caso contrário, retorne Nenhum.
     * Note que o retorno é do tipo Opcao<Int>.
     */
    fun dobrarOpcao(opcao: Opcao<Int>): Opcao<Int> {
        return Nenhum
    }

    /*
    assertEquals("dobrarOpcao", Algum(10), dobrarOpcao(Algum(5)))
    assertEquals("dobrarOpcao", Nenhum, dobrarOpcao(Nenhum))
    println("Todos os testes passaram para a função dobrarOpcao!")
    */

    /**
     * Calcule a altura de uma "Arvore" representada pelo tipo 'Arvore'.
     * A altura de uma folha é 0.
     * A altura de um nó interno é 1 + o máximo entre as alturas das subárvores esquerda e direita.
     */
    fun <A> alturaArvore(arvore: Arvore<A>): Int {
        return 0
    }

    /*
    val arvore1: Arvore<Int> = Arvore.No(1, Arvore.No(2, Arvore.Folha, Arvore.Folha), Arvore.No(3, Arvore.Folha, Arvore.Folha))
    val arvore2: Arvore<String> = Arvore.No("a", Arvore.No("b", Arvore.No("c", Arvore.Folha, Arvore.Folha), Arvore.Folha), Arvore.Folha)
    assertEquals("alturaArvore", 2, alturaArvore(arvore1))
    assertEquals("alturaArvore", 3, alturaArvore(arvore2))
    assertEquals("alturaArvore", 0, alturaArvore(Arvore.Folha))
    println("Todos os testes passaram para a função alturaArvore!")
    */

    /**
     * Conte o número de nós em uma "Arvore".
     * Uma folha não tem nós, então retorna 0.
     * Um nó interno conta como 1 + o número de nós nas subárvores esquerda e direita.
     */
    fun <A> contarNosArvore(arvore: Arvore<A>): Int {
        return 0
    }

    /*
    assertEquals("contarNosArvore", 3, contarNosArvore(arvore1))
    assertEquals("contarNosArvore", 3, contarNosArvore(arvore2))
    assertEquals("contarNosArvore", 0, contarNosArvore(Arvore.Folha))
    println("Todos os testes passaram para a função contarNosArvore!")
    */

    /**
     * Retorne uma lista (tipo 'List') contendo os valores armazenados nos nós internos de uma 'Arvore', percorrida em pré-ordem.
     * Pré-ordem: primeiro o valor do nó raiz, depois os valores da subárvore esquerda e, por fim, os valores da subárvore direita.
     * Se a árvore for uma folha, retorne uma lista vazia.
     */
    fun <A> preOrdemArvore(arvore: Arvore<A>): List<A> {
        return listOf<A>()
    }

    /*
    val arvorePreOrdem: Arvore<String> = Arvore.No("a", Arvore.No("b", Arvore.No("d", Arvore.Folha, Arvore.Folha), Arvore.No("e", Arvore.Folha, Arvore.Folha)), Arvore.No("c", Arvore.No("f", Arvore.Folha, Arvore.Folha), Arvore.Folha))
    val resultadoEsperado: List<String> = listOf("a", "b", "d", "e", "c", "f")
    assertEquals("preOrdemArvore", resultadoEsperado, preOrdemArvore(arvorePreOrdem))
    println("Todos os testes passaram para a função preOrdemArvore!")
    */
}
