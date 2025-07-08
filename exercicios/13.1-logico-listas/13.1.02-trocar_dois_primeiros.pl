
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva o predicado `swap12(L1,L2)` que verifica se a lista `L1` é idêntico a `L2`, exceto que os dois primeiros 
elementos estão trocados.

Exemplos:
?- swap12([1,2,3],[2,1,3]).
true.

?- swap12([1,2,3],[2,1,4]).
true.

?- swap12([1,2,3],[2,1]).
false.

?- swap12([1,2,3],[1,2,3]).
false.

?- swap12([1,2],[2,1]).
true.

?- swap12([1],[2]).
false.

?- swap12([],[]).
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

test('swap12([1,2,3],[2,1,3])') :- swap12([1,2,3],[2,1,3]).
test('swap12([1,2,3],[2,1,4])', [fail]) :- swap12([1,2,3],[2,1,4]).
test('swap12([1,2,3],[2,1])', [fail]) :- swap12([1,2,3],[2,1]).
test('swap12([1,2,3],[1,2,3])', [fail]) :- swap12([1,2,3],[1,2,3]).
test('swap12([1,2],[2,1])') :- swap12([1,2],[2,1]).
test('swap12([1],[2])', [fail]) :- swap12([1],[2]).
test('swap12([],[])', [fail]) :- swap12([],[]).

:- end_tests(exercicio).
