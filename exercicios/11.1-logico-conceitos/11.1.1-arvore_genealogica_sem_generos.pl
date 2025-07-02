
/***********************************************************************************************************************
 * EXERCÍCIO
 * Considere a base de conhecimento fornecida abaixo. Seu desafio é expandir essa base de fatos, criando um conjunto de 
 * regras Prolog para definir outras relações de parentesco (ignorando o gênero).
 * 
 * Sua Tarefa:
 * Usando apenas o fato paiOuMae fornecido, implemente as seguintes relações de parentesco em Prolog:
 * - irmaoOuIrma(Irmao1, Irmao2): Verdadeiro se Irmao1 é irmão ou irmã de Irmao2.
 * - tioOuTia(TioOuTia, SobrinhoOuSobrinha): Verdadeiro se TioOuTia é tio ou tia de SobrinhoOuSobrinha.
 * - avoOuAvo(AvoOuAvo, NetoOuNeta): Verdadeiro se AvoOuAvo é avô ou avó de NetoOuNeta.
 * - primoOuPrima(Pessoa1, Pessoa2): Verdadeiro se Pessoa1 e Pessoa2 são primos ou primas (filhos de irmãos).
 * 
 * Dicas: Na implementação da regra de uma relação, você pode usar relações que criou anteriormente.
 **********************************************************************************************************************/

paiOuMae(manoel, joao).      % manoel é pai de joao
paiOuMae(manoel, silene).    % manoel é pai de silene
paiOuMae(joao, patricia).    % joao é pai de patricia
paiOuMae(joao, andreia).     % joao é pai de andreia

paiOuMae(maria, joao).       % maria é mãe de joao
paiOuMae(maria, silene).     % maria é mãe de silene
paiOuMae(silene, eric).      % silene é mãe de eric
paiOuMae(silene, cristiano). % silene é mãe de cristiano


% <FORNEÇA AQUI SUA SOLUÇÃO>


/***********************************************************************************************************************
 * CASOS DE TESTE (não modifique o restante do arquivo)
 * Para executar os testes, use o comando abaixo no terminal:
 *    $ swi-prolog.swipl -s <nome_do_arquivo.pl> -g "run_tests" -t halt
 **********************************************************************************************************************/

:- use_module(library(plunit)).
:- begin_tests(exercicio).

test('irmaoOuIrma(joao, silene)') :- once(irmaoOuIrma(joao, silene)).
test('irmaoOuIrma(manoel, joao)', [fail]) :- once(irmaoOuIrma(manoel, joao)).
test('irmaoOuIrma(silene, X)', all(X == [joao])) :- once(irmaoOuIrma(silene, X)).

test('irmaoOuIrma(X, Y)', set(X-Y == [silene-joao,eric-cristiano,patricia-andreia,cristiano-eric,joao-silene,andreia-patricia])) :- irmaoOuIrma(X, Y).
test('tioOuTia(X, Y)', set(X-Y == [silene-patricia,silene-andreia,joao-eric,joao-cristiano])) :- tioOuTia(X, Y).
test('avoOuAvo(X, Y)', set(X-Y == [manoel-eric,manoel-patricia,manoel-cristiano,manoel-andreia,maria-eric,maria-patricia,maria-cristiano,maria-andreia])) :- avoOuAvo(X, Y).
test('primoOuPrima(X, Y)', set(X-Y == [eric-patricia,eric-andreia,patricia-eric,patricia-cristiano,cristiano-patricia,cristiano-andreia,andreia-eric,andreia-cristiano])) :- primoOuPrima(X, Y).

:- end_tests(exercicio).
