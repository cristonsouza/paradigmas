
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva o predicado `twice(L1,L2)`, que é verdadeiro quando a lista L2 contém os elementos de L1 duplicados e na mesma ordem.

Exemplos:
   twice([a,4,buggle],X).
   X  =  [a,a,4,4,buggle,buggle]).

   twice([1,2,1,1],X).
   X  =  [1,1,2,2,1,1,1,1].
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('twice([a,4,buggle],X)', all(X == [[a,a,4,4,buggle,buggle]])) :- twice([a,4,buggle],X).
test('twice([1,2,1,1],X)', all(X == [[1,1,2,2,1,1,1,1]])) :- twice([1,2,1,1],X).
test('twice([],X)', all(X == [[]])) :- twice([],X).
test('twice([a],X)', all(X == [[a,a]])) :- twice([a],X).
test('twice([1,2],X)', all(X == [[1,1,2,2]])) :- twice([1,2],X).
test('twice([a,b,c],X)', all(X == [[a,a,b,b,c,c]])) :- twice([a,b,c],X).
test('twice([1,2,3],X)', all(X == [[1,1,2,2,3,3]])) :- twice([1,2,3],X).

:- end_tests(exercicio).
