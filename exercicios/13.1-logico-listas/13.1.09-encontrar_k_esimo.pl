
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva o predicado `kesimo(K,L,X)` que é verdadeiro quando X é o K-ésimo elemento da lista L.
Os índices começam em 1, ou seja, o primeiro elemento da lista é o 1º elemento.

Exemplos:
   ?- kesimo(2,[a,b,c,d],X).
   X  =  b.
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('kesimo(1,[a,b,c,d],X)', all(X == [a])) :- kesimo(1,[a,b,c,d],X).
test('kesimo(2,[a,b,c,d],X)', all(X == [b])) :- kesimo(2,[a,b,c,d],X).
test('kesimo(3,[a,b,c,d],X)', all(X == [c])) :- kesimo(3,[a,b,c,d],X).
test('kesimo(4,[a,b,c,d],X)', all(X == [d])) :- kesimo(4,[a,b,c,d],X).
test('kesimo(5,[a,b,c,d],X)', all(X == [])) :- kesimo(5,[a,b,c,d],X).
test('kesimo(1,[],X)', all(X == [])) :- kesimo(1,[],X).

:- end_tests(exercicio).
