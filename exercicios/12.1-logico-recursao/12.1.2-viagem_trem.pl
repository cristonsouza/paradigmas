
/***********************************************************************************************************************
 ** EXERCÍCIO **
Temos a seguinte base de conhecimento:

directTrain(fortaleza,horizonte).
directTrain(horizonte,quixada).  
directTrain(quixada,banabuiu).  
directTrain(banabuiu,solonopolis).  
directTrain(solonopolis,iguatu).  
directTrain(iguatu,varzea_alegre).  
directTrain(varzea_alegre,juazeiro).  

Ou seja, esta base de conhecimento contém fatos sobre cidades entre as quais é possível viajar pegando um trem direto 
(só da 1a cidade para a 2a, sem retorno). Mas é claro que podemos viajar mais longe encadeando viagens diretas de trem. 
Escreva um predicado recursivo `travelFromTo(C1,C2)` que nos diga quando podemos viajar de trem entre duas cidades C1 e C2.

Por exemplo, a consulta abaixo responde `true`.
travelFromTo(fortaleza, quixada).
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('directTrain(X, Y)', set(X-Y == [fortaleza-horizonte,horizonte-quixada,quixada-banabuiu,banabuiu-solonopolis,solonopolis-iguatu,iguatu-varzea_alegre,varzea_alegre-juazeiro])) :- directTrain(X, Y).
test('travelFromTo(X, Y)', set(X-Y == [fortaleza-horizonte,horizonte-quixada,quixada-banabuiu,banabuiu-solonopolis,solonopolis-iguatu,iguatu-varzea_alegre,varzea_alegre-juazeiro,fortaleza-quixada,fortaleza-banabuiu,fortaleza-solonopolis,fortaleza-iguatu,fortaleza-varzea_alegre,fortaleza-juazeiro,horizonte-banabuiu,horizonte-solonopolis,horizonte-iguatu,horizonte-varzea_alegre,horizonte-juazeiro,quixada-banabuiu,quixada-solonopolis,quixada-iguatu,quixada-varzea_alegre,quixada-juazeiro,banabuiu-solonopolis,banabuiu-iguatu,banabuiu-varzea_alegre,banabuiu-juazeiro,solonopolis-iguatu,solonopolis-varzea_alegre,solonopolis-juazeiro,iguatu-varzea_alegre,iguatu-juazeiro,varzea_alegre-juazeiro])) :- travelFromTo(X, Y).

:- end_tests(exercicio).
