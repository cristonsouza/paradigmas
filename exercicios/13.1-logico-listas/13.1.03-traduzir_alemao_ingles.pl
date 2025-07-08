
/***********************************************************************************************************************
 ** EXERCÍCIO **
Suponha que recebemos uma base de conhecimento com os seguintes fatos:

   tran(eins,one).  
   tran(zwei,two).  
   tran(drei,three).  
   tran(vier,four).  
   tran(fuenf,five).  
   tran(sechs,six).  
   tran(sieben,seven).  
   tran(acht,eight).  
   tran(neun,nine).

Escreva um predicado `listtran(G,E)` que traduz uma lista de palavras em alemão para a lista correspondente de palavras 
em inglês. 

Exemplo:
   listtran([eins,neun,zwei],X).
   X  =  [one,nine,two].

Seu programa também deve funcionar na outra direção (do inglês para o alemão).

Exemplo:
   listtran(X,[one,seven,six,two]).
   X  =  [eins,sieben,sechs,zwei].

Dica: Caso base: traduzir a lista vazia.
      Passo recursivo: traduzir a cabeça da lista e depois traduzir recursivamente a cauda da lista.
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('listtran([eins,neun,zwei],X)', all(X == [[one,nine,two]])) :- listtran([eins,neun,zwei],X).
test('listtran(X,[one,seven,six,two])', all(X == [[eins,sieben,sechs,zwei]])) :- listtran(X,[one,seven,six,two]).
test('listtran([eins,neun,zwei],[one,nine,two])') :- listtran([eins,neun,zwei],[one,nine,two]).
test('listtran([one,seven,six,two],[eins,sieben,sechs,zwei])') :- listtran([eins,sieben,sechs,zwei],[one,seven,six,two]).
test('listtran([],X)', all(X == [[]])) :- listtran([],X).

:- end_tests(exercicio).
