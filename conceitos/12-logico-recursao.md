# Recursão em Prolog

*   **Definições Recursivas:** Um predicado é recursivamente definido se uma ou mais **regras** em sua definição **se referem a si mesmas**. É crucial que haja **caso base**.

*   **Significados de um programa Prolog:**
    *   **Declarativo:** significado lógico da base de conhecimento.
    *   **Procedural:** como o Prolog executa as consultas, incluindo a ordem de pesquisa (cima para baixo, esquerda para a direita) e backtracking.
    *   Os significados **podem divergir**.
        - Ex.: ordem das soluções depende da ordem dos fatos.
        - Ex.: `p :- p.` é declarativamente sensato (se `p` é verdadeiro, então `p` é verdadeiro), mas proceduralmente problemático (tenta provar `p` indefinidamente).


*   **Exemplo 1: `digerindo`**
    ```prolog
    acabou_de_comer(mosquito, sangue(joao)).
    acabou_de_comer(sapo, mosquito).
    acabou_de_comer(cegonha, sapo).

    digerindo(X,Y)  :-  acabou_de_comer(X,Y).
    digerindo(X,Y)  :-  acabou_de_comer(X,Z),
                        digerindo(Z,Y).
    ```
    - **Significado procedural** da consulta `digerindo(cegonha, sangue(joao))`:
        *   Primeiro, verifica a cláusula base `acabou_de_comer(cegonha, sangue(joao))`, que falha.
        *   Em seguida, tenta a cláusula recursiva: `acabou_de_comer(cegonha, Z)` e `digerindo(Z, sangue(joao))`.
        *   Encontra `Z = sapo` (pois `acabou_de_comer(cegonha, sapo)` é verdadeiro).
        *   Agora precisa provar `digerindo(sapo, sangue(joao))`.
            - Tenta o caso base `acabou_de_comer(sapo, sangue(joao))`, que falha.
            - Tenta então a cláusula recursiva `acabou_de_comer(sapo, Z)` e `digerindo(Z, sangue(joao))`.
            *   Encontra `Z = mosquito` (pois `acabou_de_comer(sapo, mosquito)` é verdadeiro).
            - Agora precisa provar `digerindo(mosquito, sangue(joao))`.
                - Tenta o caso base `acabou_de_comer(mosquito, sangue(joao))`, que é verdadeiro.
                - Assim, `digerindo(mosquito, sangue(joao))` é verdadeiro.
        *   Portanto, `digerindo(sapo, sangue(joao))` é verdadeiro.
        *   Finalmente, `digerindo(cegonha, sangue(joao))` é verdadeiro.

    - **Significado procedural** da consulta `digerindo(mosquito, sapo)`:
        *   Primeiro, verifica a cláusula base `acabou_de_comer(mosquito, sapo)`, que falha.
        *   Em seguida, tenta a cláusula recursiva: `acabou_de_comer(mosquito, Z)` e `digerindo(Z, sapo)`.
        *   Encontra `Z = sangue(joao)` (pois `acabou_de_comer(mosquito, sangue(joao))` é verdadeiro).
        *   Agora precisa provar `digerindo(sangue(joao), sapo)`.
            - Tenta o caso base `acabou_de_comer(sangue(joao), sapo)`, que falha.
            - Tenta então a cláusula recursiva `acabou_de_comer(sangue(joao), Z)` e `digerindo(Z, sapo)`, mas não encontra valor para `Z` que satisfaça `acabou_de_comer(sangue(joao), Z)`.
            *   Portanto, não há caminho para provar `digerindo(sangue(joao), sapo)`.
        - O Prolog volta atrás para a cláusula `acabou_de_comer(mosquito, Z)` e tenta outro valor para `Z`, mas não há mais valores possíveis.
        - Assim, `digerindo(mosquito, sapo)` falha.
