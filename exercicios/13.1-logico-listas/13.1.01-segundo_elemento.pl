
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva um predicado `second(X,L)` que verifica se `X` é o segundo elemento da lista `L`.

Exemplos:
?- second(2,[1,2,3,4]).
true.

?- second(3,[1,2,3,4]).
false.

?- second(3,[1]).
false.

?- second(3,[]).
false.
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('second(2,[1,2,3,4])') :- second(2,[1,2,3,4]).
test('second(3,[1,2,3,4])', [fail]) :- second(3,[1,2,3,4]).
test('second(3,[1])', [fail]) :- second(3,[1]).
test('second(3,[])', [fail]) :- second(3,[]).

:- end_tests(exercicio).
