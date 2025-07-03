
/***********************************************************************************************************************
 ** EXERCÍCIO **

Aqui estão seis palavras italianas:
    astante , astoria , baratto , cobalto , pistola , statale .

Elas devem ser organizadas como palavras cruzadas, na seguinte grade:

         V1      V2      V3
        +---+   +---+   +---+
        | X |   | X |   | X |
    +---+---+---+---+---+---+---+
H1  | X | X | X | X | X | X | X |
    +---+---+---+---+---+---+---+
        | X |   | X |   | X |  
    +---+---+---+---+---+---+---+
H2  | X | X | X | X | X | X | X |
    +---+---+---+---+---+---+---+
        | X |   | X |   | X |
    +---+---+---+---+---+---+---+
H3  | X | X | X | X | X | X | X |
    +---+---+---+---+---+---+---+
        | X |   | X |   | X |
        +---+   +---+   +---+

A base de conhecimento abaixo separa as letras de cada palavra.
Escreva o predicado 'palavras_cruzadas(H1,H2,H3,V1,V2,V3)' que nos diga como preencher a grade. 
Os três primeiros argumentos devem ser as palavras horizontais de cima para baixo, e os três últimos argumentos as 
palavras verticais da esquerda para a direita.

Cada palavra ocorre exatamente uma vez na grade.
Portanto, será necessário acrescentar uma restrição para cada um dos 15 pares de palavras, indicando que elas não podem 
ser iguais. Ex.: H1 \= H2.
**IMPORTANTE**: Estas condições devem ser adicionadas no final do predicado 'palavras_cruzadas': o operador '\=' retorna 
verdadeiro quando os operandos não são unificáveis, mas variáveis livres são sempre unificáveis, portanto o correto é 
gerar os valores das variáveis antes de testar que elas não unificam.
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

test('todas as solucoes possiveis', [
    set([H1,H2,H3,V1,V2,V3] == [[astante,cobalto,pistola,astoria,baratto,statale],
                                [astoria,baratto,statale,astante,cobalto,pistola]])
]) :- palavras_cruzadas(H1,H2,H3,V1,V2,V3).

:- end_tests(exercicio).
