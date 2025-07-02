
/***********************************************************************************************************************
 ** EXERCÍCIO **

Aqui estão seis palavras italianas:
    astante , astoria , baratto , cobalto , pistola , statale .

Elas devem ser organizadas como palavras cruzadas, na seguinte grade:

         V1      V2      V3
        +---+   +---+   +---+
        |   |   |   |   |   |
    +---+---+---+---+---+---+---+
H1  |   |   |   |   |   |   |   |
    +---+---+---+---+---+---+---+
        |   |   |   |   |   |  
    +---+---+---+---+---+---+---+
H2  |   |   |   |   |   |   |   |
    +---+---+---+---+---+---+---+
        |   |   |   |   |   |
    +---+---+---+---+---+---+---+
H3  |   |   |   |   |   |   |   |
    +---+---+---+---+---+---+---+
        |   |   |   |   |   |
        +---+   +---+   +---+

A base de conhecimento abaixo separa as letras de cada palavra.
Escreva o predicado 'palavras_cruzadas(H1,H2,H3,V1,V2,V3)' que nos diga como preencher a grade. 
Os três primeiros argumentos devem ser as palavras horizontais de cima para baixo, e os três últimos argumentos as 
palavras verticais da esquerda para a direita.
Obs.: Uma palavra pode ocorrer em mais de uma posição.
***********************************************************************************************************************/

palavra(astante,  a,s,t,a,n,t,e).  
palavra(astoria,  a,s,t,o,r,i,a).  
palavra(baratto,  b,a,r,a,t,t,o).  
palavra(cobalto,  c,o,b,a,l,t,o).  
palavra(pistola,  p,i,s,t,o,l,a).  
palavra(statale,  s,t,a,t,a,l,e).


% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('palavras_cruzadas(astante, baratto, statale, astante, baratto, statale)') :- 
    palavras_cruzadas(astante, baratto, statale, astante, baratto, statale).
test('palavras_cruzadas(astante, cobalto, pistola, astoria, baratto, statale)') :- 
    palavras_cruzadas(astante, cobalto, pistola, astoria, baratto, statale).
test('palavras_cruzadas(astoria, baratto, statale, astante, cobalto, pistola)') :- 
    palavras_cruzadas(astoria, baratto, statale, astante, cobalto, pistola).
test('palavras_cruzadas(astoria, cobalto, pistola, astoria, cobalto, pistola)') :- 
    palavras_cruzadas(astoria, cobalto, pistola, astoria, cobalto, pistola).
test('palavras_cruzadas(baratto, baratto, statale, baratto, baratto, statale)') :- 
    palavras_cruzadas(baratto, baratto, statale, baratto, baratto, statale).
test('palavras_cruzadas(cobalto, baratto, statale, cobalto, baratto, statale)') :- 
    palavras_cruzadas(cobalto, baratto, statale, cobalto, baratto, statale).

test('palavras_cruzadas(astante, pistola, statale, cobalto, astoria, baratto)', [fail]) :- 
    palavras_cruzadas(astante, pistola, statale, cobalto, astoria, baratto).
test('palavras_cruzadas(astoria, baratto, astante, pistola, cobalto, statale)', [fail]) :- 
    palavras_cruzadas(astoria, baratto, astante, pistola, cobalto, statale).
test('palavras_cruzadas(astante, astoria, pistola, baratto, cobalto, statale)', [fail]) :- 
    palavras_cruzadas(astante, astoria, pistola, baratto, cobalto, statale).
test('palavras_cruzadas(cobalto, statale, baratto, astante, astoria, pistola)', [fail]) :- 
    palavras_cruzadas(cobalto, statale, baratto, astante, astoria, pistola).
test('palavras_cruzadas(statale, pistola, astoria, astante, cobalto, baratto)', [fail]) :- 
    palavras_cruzadas(statale, pistola, astoria, astante, cobalto, baratto).
test('palavras_cruzadas(astante, baratto, cobalto, astoria, pistola, statale)', [fail]) :- 
    palavras_cruzadas(astante, baratto, cobalto, astoria, pistola, statale).

:- end_tests(exercicio).
