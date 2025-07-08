
/***********************************************************************************************************************
 ** EXERCÍCIO **
Usando os fatos abaixo, você pode descobrir todas as possíveis rotas entre duas cidades, ou seja, a sequência de cidades
que deve passar para ir da origem até o destino. Nesta versão, a rota é uma lista de cidades.

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

Escreva o predicado `travel(C1, C2, R)`, que é verdadeiro quando R é uma lista de cidades de C1 até C2.

Por exemplo, a consulta `travel(valmont, raglan, R)` deve retornar rotas que levam de valmont a raglan, como:
R = [valmont, metz, frankfurt, bangkok, auckland, hamilton, raglan].
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
        [valmont,metz,frankfurt,bangkok,auckland,hamilton,raglan],
        [valmont,metz,frankfurt,singapore,auckland,hamilton,raglan],
        [valmont,metz,paris,losAngeles,auckland,hamilton,raglan],
        [valmont,saarbruecken,frankfurt,bangkok,auckland,hamilton,raglan],
        [valmont,saarbruecken,frankfurt,singapore,auckland,hamilton,raglan],
        [valmont,saarbruecken,paris,losAngeles,auckland,hamilton,raglan]
    ])) :- travel(valmont, raglan, R).
test('travel(raglan, valmont, R)', [fail]) :- travel(raglan, valmont, _).

:- end_tests(exercicio).
