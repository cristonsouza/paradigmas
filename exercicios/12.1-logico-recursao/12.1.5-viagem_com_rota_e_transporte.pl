
/***********************************************************************************************************************
 ** EXERCÍCIO **
Usando os fatos abaixo, você pode descobrir todas as possíveis rotas entre duas cidades, ou seja, a sequência de cidades
que deve passar para ir da origem até o destino, bem como o meio de transporte (carro, trem ou avião) usado em cada etapa.

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
- go(M, X, Y) significa que é possível viajar diretamente de X para Y usando o meio de transporte M (car, train ou plane),
- go(M, X, Y, R) significa que é possível viajar diretamente de X para Y usando o meio de transporte M, e R é uma rota 
  de Y até C2 (destino final da viagem).

Por exemplo, a consulta `travel(valmont, raglan, R)` deve retornar rotas que levam de valmont a raglan, como:
R = go(car, valmont, saarbruecken, go(train, saarbruecken, frankfurt, go(plane, frankfurt, bangkok, 
       go(plane, bangkok, auckland, go(car, auckland, hamilton, go(car, hamilton, raglan)))))).
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
        go(car,valmont,metz,go(train,metz,frankfurt,go(plane,frankfurt,bangkok,go(plane,bangkok,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan)))))),
        go(car,valmont,metz,go(train,metz,frankfurt,go(plane,frankfurt,singapore,go(plane,singapore,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan)))))),
        go(car,valmont,metz,go(train,metz,paris,go(plane,paris,losAngeles,go(plane,losAngeles,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan)))))),
        go(car,valmont,saarbruecken,go(train,saarbruecken,frankfurt,go(plane,frankfurt,bangkok,go(plane,bangkok,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan)))))),
        go(car,valmont,saarbruecken,go(train,saarbruecken,frankfurt,go(plane,frankfurt,singapore,go(plane,singapore,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan)))))),
        go(car,valmont,saarbruecken,go(train,saarbruecken,paris,go(plane,paris,losAngeles,go(plane,losAngeles,auckland,go(car,auckland,hamilton,go(car,hamilton,raglan))))))
    ])) :- travel(valmont,raglan,R).
test('travel(raglan, valmont, _)', [fail]) :- travel(raglan, valmont, _).

:- end_tests(exercicio).
