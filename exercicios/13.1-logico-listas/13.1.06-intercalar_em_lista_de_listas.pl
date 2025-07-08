
/***********************************************************************************************************************
 ** EXERCÍCIO **
Escreva o predicado `intercala2(L1,L2,R)` que é verdadeiro quando as listas L1 e L2 possuem o mesmo tamanho e a lista R
é formada intercalando os elementos das listas L1 e L2 em várias listas de 2 elementos.
   
Exemplos:
   ?-  intercala2([a,b,c], [1,2,3], X).  
   X  =  [[a,1], [b,2], [c,3]]  
     
   ?-  intercala2([f,b,yip,yup], [glu,gla,gli,glo], R).  
   R  =  [[f,glu], [b,gla], [yip,gli], [yup,glo]]
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('intercala2([a,4,buggle],[1,2,3],X)', all(X == [[[a,1],[4,2],[buggle,3]]])) :- intercala2([a,4,buggle],[1,2,3],X).
test('intercala2([1,2,1,1],[4,5,6,7],X)', all(X == [[[1,4],[2,5],[1,6],[1,7]]])) :- intercala2([1,2,1,1],[4,5,6,7],X).
test('intercala2([],[],X)', all(X == [[]])) :- intercala2([],[],X).
test('intercala2([a],[],X)', all(X == [])) :- intercala2([a],[],X).
test('intercala2([1,2],[],X)', all(X == [])) :- intercala2([1,2],[],X).
test('intercala2([a,b,c],[],X)', all(X == [])) :- intercala2([a,b,c],[],X).
test('intercala2([1,2,3],[],X)', all(X == [])) :- intercala2([1,2,3],[],X).
test('intercala2([a,b,c],[1,2,3],X)', all(X == [[[a,1],[b,2],[c,3]]])) :- intercala2([a,b,c],[1,2,3],X).
test('intercala2([f,b,yip,yup],[glu,gla,gli,glo],Result)', all(Result == [[[f,glu],[b,gla],[yip,gli],[yup,glo]]])) :- intercala2([f,b,yip,yup],[glu,gla,gli,glo],Result).
test('intercala2([1,2,3],[1,2,3],X)', all(X == [[[1,1],[2,2],[3,3]]])) :- intercala2([1,2,3],[1,2,3],X).

:- end_tests(exercicio).
