# Listas em Prolog

- Listas são estruturas de dados com **definição recursiva**:
    - **Caso base**: lista vazia.
    - **Passo recursivo**: um elemento (cabeça) seguido dos elementos de outra lista (cauda).
- Listas são **definidas com colchetes** `[]` e elementos **separados por vírgulas**.
    - Ex.: `[maria, vincente, julio, iolanda]`, `[]` (lista vazia).
- Listas **podem conter outras listas e relações** como elementos.
    - Ex.: `[maria, [vincente, julio], [bruno, aluno(iolanda)]]`.

## Estrutura da Lista: Cabeça e Cauda
*   Qualquer lista **não vazia** consiste em duas partes: a **cabeça** e a **cauda**.
*   A **cabeça** é o **primeiro item** da lista.
*   A **cauda** é a **lista** que resta após a remoção do primeiro elemento. Note que a cauda é *sempre* uma lista.
    *   **Ex.:** `[maria, vincente, julio, iolanda]` tem `maria` como cabeça e lista `[vincente, julio, iolanda]` como cauda.
    *   **Ex.:** A lista `[maria]` tem `maria` como cabeça e a lista vazia `[]` como cauda.
*   A **lista vazia** (`[]`) é especial: **não tem cabeça nem cauda**.
    - Este é o caso base para a recursão em listas.

## Decomposição de Listas com o Operador `|`

*   Prolog possui o **operador  `|` para decompor uma lista em cabeça e cauda**.
*   O uso mais comum do `|` é **extrair informações de listas através da unificação**.
    * **Ex.:** A unificação `[Cabeca | Cauda] = [maria, vincente, julio, iolanda]` resulta em `Cabeca = maria` e `Cauda = [vincente, julio, iolanda]`.
*   É possível **unificar múltiplos elementos iniciais** com variáveis à esquerda do `|`.
    - Ex.: `[X, Y | W] = [maria, vincente, julio, iolanda]` resulta em `X = maria`, `Y = vincente` e `W = [julio, iolanda]`.
*   O operador `|` **não pode ser usado para decompor a lista vazia** (`[]`). Uma tentativa de unificação como `[X|Y] = []` **resultará em falha** (`false`).
*   Pode usar **variável anônima** `_` para ignorar partes da lista que não são relevantes.
    - **Ex.:** `[_, X | _] = [maria, vincente, julio, iolanda]` resulta em `X = vincente`, ignorando os outros elementos.
* Funciona também para **listas aninhadas**: `[_, [_ | X] | _] = [maria, [vincente, julio, iolanda], jose]` resulta em `X = [julio, iolanda]`.

## Predicado `member` (disponível por padrão)

*   `member(X, L)` verifica se o objeto `X` é um elemento da lista `L`.
*   É definido recursivamente como:
    ```prolog
    member(X,[X|_]).
    member(X,[_|T]) :- member(X,T).
    ```

## Exemplos de predicados recursivos com listas

### Predicado `a2b`

*   `a2b(L1, L2)` é verdadeiro se **`L1` tem apenas `a` e `L2` tem apenas `b`**, e ambas tiverem o **mesmo comprimento**.
*   `a2b` **com variáveis** atua como um **tradutor** entre listas de `a`s e listas de `b`s, e vice-versa.
    ```prolog
    ?- a2b([a,a,a,a],X).
    X = [b,b,b,b]. % Traduz lista de 'a's para lista de 'b's.

    ?- a2b(X,[b,b,b,b]).
    X = [a,a,a,a] % Traduz lista de 'b's para lista de 'a's.

    ?- a2b(X,Y).
    X = Y, Y = [] ; % Encontra a solução base (listas vazias).
    X = [a], Y = [b] ; % Encontra solução com um elemento.
    X = [a, a], Y = [b, b] . % Encontra solução com dois elementos, e assim por diante.
    ```

* **Implementação:**
    ```prolog
    a2b([],[]). % caso base
    a2b([a|Ta],[b|Tb]) :- a2b(Ta,Tb). % regra recursiva
    ```
