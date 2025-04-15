# 04 - IMPERATIVO - Listas

Listas são estruturas de dados super flexíveis e você vai usar bastante. Basicamente, uma lista é uma **coleção ordenada de itens**. Você pode ter listas que permitem ou não a modificação depois de criadas. Vamos dar uma olhada nestes dois tipos:

**1. `List` (Imutável):**

* Uma `List` em Kotlin é **imutável**, o que significa que depois de criada, você **não pode adicionar, remover ou alterar os elementos** diretamente. Pense nela como uma lista fixa.
* Você cria uma `List` usando a função `listOf()`.

   ```kotlin
   val cores: List<String> = listOf("vermelho", "azul", "verde")
   println(cores) // Saída: [vermelho, azul, verde]

   println("Primeira cor: ${cores[0]}") // Acessando elementos pelo índice (começa em 0)
   println("Número de cores: ${cores.size}") // Obtendo o tamanho da lista

   // As seguintes linhas dariam erro de compilação, pois a lista é imutável:
   // cores.add("amarelo")
   // cores.removeAt(0)
   // cores[1] = "ciano"
   ```

**2. `MutableList` (Mutável):**

* Uma `MutableList`, como o próprio nome sugere, é **mutável**. Isso quer dizer que você pode adicionar, remover e alterar os elementos depois que a lista é criada.
* Você cria uma `MutableList` usando a função `mutableListOf()`.

   ```kotlin
   val frutas: MutableList<String> = mutableListOf("maçã", "banana")
   println(frutas) // Saída: [maçã, banana]

   frutas.add("laranja") // Adicionando um novo elemento
   println(frutas) // Saída: [maçã, banana, laranja]

   frutas.remove("banana") // Remove primeira ocorrência de um valor
   println(frutas) // Saída: [maçã, laranja]

   frutas[0] = "morango" // Alterando um elemento pelo índice
   println(frutas) // Saída: [morango, laranja]

   println("Número de frutas: ${frutas.size}") // Obtendo o tamanho
   ```

**Operações Comuns em Listas (tanto `List` quanto `MutableList`):**

* **Acessar elementos:** Use o índice (começando em 0) com colchetes `[]`.
* **Obter o tamanho:** Use a propriedade `.size`.
* **Verificar se um elemento existe:** Use o operador `in`.

   ```kotlin
   val temMorango    = "morango"  in frutas // Armazena true
   val naoTemMorango = "morango" !in frutas // Armazena false   
   ```

* **Iterar sobre os elementos:** Use loops como `for`, ou a função `forEach`.

   ```kotlin
   for (fruta in frutas) {
       println("Eu gosto de $fruta")
   }

   frutas.forEach { fruta ->
       println("Outra fruta: $fruta")
   }
   ```

**Operações Comuns em Listas Mutáveis:**

**- Adicionando Elementos:**

* **`add(element: E)`:** Adiciona o elemento no final da lista.

    ```kotlin
    val numeros = mutableListOf(1, 2)
    numeros.add(3)
    println(numeros) // Saída: [1, 2, 3]
    ```

* **`add(index: Int, element: E)`:** Adiciona o elemento no índice especificado, deslocando os elementos seguintes.

    ```kotlin
    numeros.add(1, 4) // Adiciona 4 no índice 1
    println(numeros) // Saída: [1, 4, 2, 3]
    ```

* **`addAll(elements: Collection<E>)`:** Adiciona todos os elementos de outra coleção ao final da lista.

    ```kotlin
    val maisNumeros = listOf(5, 6)
    numeros.addAll(maisNumeros)
    println(numeros) // Saída: [1, 4, 2, 3, 5, 6]
    ```

**- Removendo Elementos:**

* **`remove(element: E)`:** Remove a primeira ocorrência do elemento especificado. Retorna `true` se o elemento foi removido, `false` caso contrário.

    ```kotlin
    val cores = mutableListOf("vermelho", "azul", "verde", "azul")
    cores.remove("azul")
    println(cores) // Saída: [vermelho, verde, azul]
    ```

* **`removeAt(index: Int)`:** Remove o elemento no índice especificado.

    ```kotlin
    cores.removeAt(0)
    println(cores) // Saída: [verde, azul]
    ```

**- Outras Operações Úteis:**

* **Operador `[]`:** Substitui o elemento no índice especificado pelo novo elemento. Também serve para acessar o elementos neste índice.

    ```kotlin
    val letras = mutableListOf('a', 'b', 'c')
    letras[1] = 'x'
    println(letras) // Saída: [a, x, c]
    ```

* **`indexOf(element: E)`:** Retorna o índice da primeira ocorrência do elemento especificado, ou -1 se o elemento não estiver na lista.

    ```kotlin
    val linguagens = mutableListOf("Java", "Kotlin", "Python", "Kotlin")
    println(linguagens.indexOf("Kotlin")) // Saída: 1
    ```

* **`lastIndexOf(element: E)`:** Retorna o índice da última ocorrência do elemento especificado, ou -1 se o elemento não estiver na lista.

    ```kotlin
    println(linguagens.lastIndexOf("Kotlin")) // Saída: 3
    ```

**Escolhendo entre `List` e `MutableList`:**

A dica principal é: **comece com `List` (imutável) sempre que possível.** Isso torna seu código mais seguro e fácil de entender, pois você garante que a coleção não será alterada inesperadamente. Use `MutableList` apenas quando você realmente precisar modificar a lista.

**Observações:**
- Kotlin não permite índices negativos (como em Python). Vai obter um `IndexOutOfBoundsException` se usar índices negativos ou excedendo o tamanho da lista menos 1.
- Para construir uma lista mutável partindo de uma lista imutável, estas são opções simples:
   - O método `.toMutableList()` retorna uma cópia mutável de uma lista imutável.
   - Pode criar uma lista mutável vazia com `mutableListOf<Int>()`, e em seguida usar o método `.addAll(elements: Collection<E>)` visto anteriormente.
