
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva o predicado `intercala3(L1,L2,R)` que é verdadeiro quando as listas L1 e L2 possuem o mesmo tamanho e a lista R
é formada intercalando os elementos das listas L1 e L2 em predicados 'j' com 2 elementos.

Exemplos:
   ?-  intercala3([a,b,c], [1,2,3], X).  
   X  =  [j(a,1), j(b,2), j(c,3)]  
     
   ?-  intercala3([f,b,yip,yup], [glu,gla,gli,glo], R).  
   R  =  [j(f,glu), j(b,gla), j(yip,gli), j(yup,glo)]
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('intercala3([a,4,buggle],[1,2,3],X)', all(X == [[j(a,1), j(4,2), j(buggle,3)]])) :- intercala3([a,4,buggle],[1,2,3],X).
test('intercala3([1,2,1,1],[4,5,6,7],X)', all(X == [[j(1,4), j(2,5), j(1,6), j(1,7)]])) :- intercala3([1,2,1,1],[4,5,6,7],X).
test('intercala3([],[],X)', all(X == [[]])) :- intercala3([],[],X).
test('intercala3([a],[],X)', all(X == [])) :- intercala3([a],[],X).
test('intercala3([1,2],[],X)', all(X == [])) :- intercala3([1,2],[],X).
test('intercala3([a,b,c],[],X)', all(X == [])) :- intercala3([a,b,c],[],X).
test('intercala3([1,2,3],[],X)', all(X == [])) :- intercala3([1,2,3],[],X).
test('intercala3([a,b,c],[1,2,3],X)', all(X == [[j(a,1), j(b,2), j(c,3)]])) :- intercala3([a,b,c],[1,2,3],X).
test('intercala3([f,b,yip,yup],[glu,gla,gli,glo],Result)', all(Result == [[j(f,glu), j(b,gla), j(yip,gli), j(yup,glo)]])) :- intercala3([f,b,yip,yup],[glu,gla,gli,glo],Result).
test('intercala3([1,2,3],[1,2,3],X)', all(X == [[j(1,1), j(2,2), j(3,3)]])) :- intercala3([1,2,3],[1,2,3],X).

:- end_tests(exercicio).
