
/***********************************************************************************************************************
 * EXERCÍCIO
 * Considere agora que você possui a base de conhecimento abaixo, diferenciando o gênero dos pais e informando os 
 * gêneros de todos os membros da família. Seu desafio é expandir essa base de fatos, criando um conjunto de regras 
 * Prolog para definir outras relações de parentesco que diferenciam o gênero.
 * 
 * Sua Tarefa:
 * Usando apenas os fatos pai, mae e genero fornecidos, implemente a relação paiOuMae(Progenitor, Filho), que é 
 * verdadeira se Projenitor é pai ou mãe de Filho. Usando esta nova relação, você pode aproveitar o código das relações 
 * pedidas na questão "Árvore genealógica (sem gêneros)", pois elas serão úteis aqui. Acrescente as novas relações 
 * listadas abaixo, que você deve implementar usando as relações já implementadas:
 * - irmao(Irmao, OutraPessoa)
 * - irma(Irma, OutraPessoa)
 * - tio(Tio, SobrinhoOuSobrinha)
 * - tia(Tia, SobrinhoOuSobrinha)
 * - avo_homem(Avoh, NetoOuNeta)
 * - avo_mulher(Avom, NetoOuNeta)
 * - primo(Primo, OutraPessoa)
 * - prima(Prima, OutraPessoa)
 **********************************************************************************************************************/

pai(manoel, joao).      
pai(manoel, silene).    
pai(joao, patricia).    
pai(joao, andreia).     

mae(maria, joao).       
mae(maria, silene).     
mae(silene, eric).      
mae(silene, cristiano). 

genero(cristiano, masculino).
genero(eric,      masculino).
genero(patricia,  feminino).
genero(andreia,   feminino).
genero(Pessoa, masculino) :- pai(Pessoa, _).
genero(Pessoa, feminino ) :- mae(Pessoa, _).


% <FORNEÇA AQUI SUA SOLUÇÃO>



/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('irmaoOuIrma(X, Y)', set(X-Y == [silene-joao,eric-cristiano,patricia-andreia,cristiano-eric,joao-silene,andreia-patricia])) :- irmaoOuIrma(X, Y).
test('tioOuTia(X, Y)', set(X-Y == [silene-patricia,silene-andreia,joao-eric,joao-cristiano])) :- tioOuTia(X, Y).
test('avoOuAvo(X, Y)', set(X-Y == [manoel-eric,manoel-patricia,manoel-cristiano,manoel-andreia,maria-eric,maria-patricia,maria-cristiano,maria-andreia])) :- avoOuAvo(X, Y).
test('primoOuPrima(X, Y)', set(X-Y == [eric-patricia,eric-andreia,patricia-eric,patricia-cristiano,cristiano-patricia,cristiano-andreia,andreia-eric,andreia-cristiano])) :- primoOuPrima(X, Y).

test('irmao(X, Y)', set(X-Y == [cristiano-eric,eric-cristiano,joao-silene])) :- irmao(X, Y).
test('irma(X, Y)', set(X-Y == [andreia-patricia,patricia-andreia,silene-joao])) :- irma(X, Y).
test('tio(X, Y)', set(X-Y == [joao-cristiano,joao-eric])) :- tio(X, Y).
test('tia(X, Y)', set(X-Y == [silene-andreia,silene-patricia])) :- tia(X, Y).
test('avo_homem(X, Y)', set(X-Y == [manoel-eric,manoel-patricia,manoel-cristiano,manoel-andreia])) :- avo_homem(X, Y).
test('avo_mulher(X, Y)', set(X-Y == [maria-eric,maria-patricia,maria-cristiano,maria-andreia])) :- avo_mulher(X, Y).
test('primo(X, Y)', set(X-Y == [cristiano-andreia,cristiano-patricia,eric-andreia,eric-patricia])) :- primo(X, Y).
test('prima(X, Y)', set(X-Y == [andreia-cristiano,andreia-eric,patricia-cristiano,patricia-eric])) :- prima(X, Y).

:- end_tests(exercicio).
