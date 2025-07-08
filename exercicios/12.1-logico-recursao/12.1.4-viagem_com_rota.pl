
/***********************************************************************************************************************
 ** EXERCÍCIO **
Usando os fatos abaixo, você pode descobrir todas as possíveis rotas entre duas cidades, ou seja, a sequência de cidades
que deve passar para ir da origem até o destino.

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

Escreva o predicado `travel(C1, C2, R)`, que é verdadeiro quando R é uma rota da cidade C1 até a cidade C2.
Uma rota é descrita recursivamente com o predicado `go` da seguinte maneira:
- go(X, Y) significa que é possível viajar diretamente de X para Y,
- go(X, Y, R) significa que é possível viajar diretamente de X para Y, e R é uma rota de Y até C2 (destino final da viagem).

Por exemplo, a consulta `travel(valmont, raglan, R)` deve retornar rotas que levam de valmont a raglan, como:
R = go(valmont, metz, go(metz, frankfurt, go(frankfurt, bangkok, go(bangkok, auckland, go(auckland, hamilton, go(hamilton, raglan)))))).
***********************************************************************************************************************/

% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('travel(valmont, raglan, R)', set(R == [
        go(valmont,metz,go(metz,frankfurt,go(frankfurt,bangkok,go(bangkok,auckland,go(auckland,hamilton,go(hamilton,raglan)))))),
        go(valmont,metz,go(metz,frankfurt,go(frankfurt,singapore,go(singapore,auckland,go(auckland,hamilton,go(hamilton,raglan)))))),
        go(valmont,metz,go(metz,paris,go(paris,losAngeles,go(losAngeles,auckland,go(auckland,hamilton,go(hamilton,raglan)))))),
        go(valmont,saarbruecken,go(saarbruecken,frankfurt,go(frankfurt,bangkok,go(bangkok,auckland,go(auckland,hamilton,go(hamilton,raglan)))))),
        go(valmont,saarbruecken,go(saarbruecken,frankfurt,go(frankfurt,singapore,go(singapore,auckland,go(auckland,hamilton,go(hamilton,raglan)))))),
        go(valmont,saarbruecken,go(saarbruecken,paris,go(paris,losAngeles,go(losAngeles,auckland,go(auckland,hamilton,go(hamilton,raglan))))))
    ])) :- travel(valmont, raglan, R).
test('travel(raglan, valmont,_)', [fail]) :- travel(raglan, valmont, _).

:- end_tests(exercicio).
