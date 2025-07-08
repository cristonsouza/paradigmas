
/***********************************************************************************************************************
 ** EXERCÍCIO **
Recebemos a seguinte base de conhecimento de informações de viagem:

byCar(auckland,hamilton).  
byCar(hamilton,raglan).  
byCar(valmont,saarbruecken).  
byCar(valmont,metz).  
 
byTrain(metz,frankfurt).  
byTrain(saarbruecken,frankfurt).  
byTrain(metz,paris).  
byTrain(saarbruecken,paris).  
 
byPlane(frankfurt,bangkok).  
byPlane(frankfurt,singapore).  
byPlane(paris,losAngeles).  
byPlane(bangkok,auckland).  
byPlane(singapore,auckland).  
byPlane(losAngeles,auckland).

Cada fato indica que é possível viajar de uma cidade para outra usando um meio de transporte específico: carro (`byCar`), 
trem (`byTrain`) ou avião (`byPlane`) em um único sentido (sem retorno).

Escreva um predicado `travel(C1,C2)` que determine se é possível viajar da cidade C1 até a cidade C2 encadeando viagens 
de carro (`byCar`), trem (`byTrain`) e avião (`byPlane`). 

Por exemplo, seu programa deve responder `true` à consulta `travel(valmont,raglan)`, pois é possível viajar de
valmont até raglan da seguinte forma: valmont -> metz (carro), metz -> frankfurt (trem), frankfurt -> bangkok (avião), 
bangkok -> auckland (avião), auckland -> hamilton (carro), hamilton -> raglan (carro).
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('travel(X, Y)', set(X-Y == [auckland-hamilton,auckland-raglan,bangkok-auckland,bangkok-hamilton,bangkok-raglan,frankfurt-auckland,frankfurt-bangkok,frankfurt-hamilton,frankfurt-raglan,frankfurt-singapore,hamilton-raglan,losAngeles-auckland,losAngeles-hamilton,losAngeles-raglan,metz-auckland,metz-bangkok,metz-frankfurt,metz-hamilton,metz-losAngeles,metz-paris,metz-raglan,metz-singapore,paris-auckland,paris-hamilton,paris-losAngeles,paris-raglan,saarbruecken-auckland,saarbruecken-bangkok,saarbruecken-frankfurt,saarbruecken-hamilton,saarbruecken-losAngeles,saarbruecken-paris,saarbruecken-raglan,saarbruecken-singapore,singapore-auckland,singapore-hamilton,singapore-raglan,valmont-auckland,valmont-bangkok,valmont-frankfurt,valmont-hamilton,valmont-losAngeles,valmont-metz,valmont-paris,valmont-raglan,valmont-saarbruecken,valmont-singapore])) :- travel(X, Y).

:- end_tests(exercicio).
