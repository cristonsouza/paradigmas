
/***********************************************************************************************************************
 ** EXERCÍCIO **
Você conhece essas bonecas russas de madeira (bonecas Matryoshka) onde as menores ficam dentro das maiores?

Suponha que irina está dentro de natasha, natasha está dentro de olga, e olga está dentro de katarina.

Primeiro, descreva os fatos acima usando o predicado `directIn(B1,B2)`. Este predicado indica que a boneca B1 está 
dentro da boneca B2, e não existe nenhuma boneca entre B1 e B2.

Em seguida, defina o predicado recursivo `in(B1,B2)`, que indica que a boneca B1 está dentre da boneca B2, podendo ou 
não haver bonecas entre as duas. Por exemplo, `in(irina, katarina)` é verdadeiro, mesmo tendo `directIn(irina, natasha)`
falso.
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('directIn(X, Y)', set(X-Y == [irina-natasha,natasha-olga,olga-katarina])) :- directIn(X, Y).
test('in(X, Y)', set(X-Y == [irina-natasha,natasha-olga,olga-katarina,irina-olga,irina-katarina,natasha-katarina])) :- in(X, Y).

boneca(irina).
boneca(natasha).
boneca(olga).
boneca(katarina).
test('not in(X, Y)', set(X-Y == [irina-irina,katarina-irina,katarina-katarina,katarina-natasha,katarina-olga,natasha-irina,natasha-natasha,olga-irina,olga-natasha,olga-olga])) :- 
    boneca(X), boneca(Y), \+ in(X, Y). % Necessário instanciar as variáveis antes de testar a negação.

:- end_tests(exercicio).
