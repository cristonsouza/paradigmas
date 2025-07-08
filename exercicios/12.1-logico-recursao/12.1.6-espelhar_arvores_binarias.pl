
/***********************************************************************************************************************
 ** EXERCÍCIO **
Árvores binárias são árvores onde todos os nós internos têm exatamente dois filhos. 
As menores árvores binárias consistem em apenas um nó folha. 
Representaremos os nós folha como `leaf(Label)`. Por exemplo, `leaf(3)` e `leaf(7)` são nós folha e, portanto, pequenas 
árvores binárias. 

Dadas duas árvores binárias `B1` e `B2`, podemos combiná-las em uma árvore binária usando o predicado `tree(B1,B2)`. 
Portanto, a partir das folhas `leaf(1)` e `leaf(2)` podemos construir a árvore binária `tree(leaf(1),leaf(2))`. 
E das árvores binárias `tree(leaf(1),leaf(2))` e `leaf(4)` podemos construir a árvore binária 
`tree(tree(leaf(1),leaf(2)), leaf(4))`.

Agora, defina um predicado `swap(T1,T2)` que produz a imagem espelhada da árvore binária que é seu primeiro argumento.
Ou seja, para cada nó interno, o filho esquerdo deve se tornar o filho direito e vice-versa.
Por exemplo:
?-  swap(tree(tree(leaf(1), leaf(2)), leaf(4)),T).  
T  =  tree(leaf(4), tree(leaf(2), leaf(1))).  
true
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('swap(leaf(1), T)', set(T == [
        leaf(1)
    ])) :- swap(leaf(1), T).
test('swap(tree(leaf(1), leaf(2)), T)', set(T == [
        tree(leaf(2), leaf(1))
    ])) :- swap(tree(leaf(1), leaf(2)), T).     
test('swap(tree(tree(leaf(1), leaf(2)), leaf(4)), T)', set(T == [
        tree(leaf(4), tree(leaf(2), leaf(1)))
    ])) :- swap(tree(tree(leaf(1), leaf(2)), leaf(4)), T).
test('swap(tree(tree(leaf(1), leaf(2)), tree(leaf(4), leaf(5))), T)', set(T == [
        tree(tree(leaf(5), leaf(4)), tree(leaf(2), leaf(1)))
    ])) :- swap(tree(tree(leaf(1), leaf(2)), tree(leaf(4), leaf(5))), T).
test('swap(tree(tree(tree(tree(leaf(1), leaf(2)), leaf(3)), leaf(4)), leaf(5)), T)', set(T == [
        tree(leaf(5),tree(leaf(4),tree(leaf(3),tree(leaf(2),leaf(1)))))
    ])) :- swap(tree(tree(tree(tree(leaf(1), leaf(2)), leaf(3)), leaf(4)), leaf(5)), T).

:- end_tests(exercicio).
