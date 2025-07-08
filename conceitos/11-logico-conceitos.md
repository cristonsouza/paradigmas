# Introdução ao Prolog

- **Prolog** significa "programação com lógica".
- **Declarativa**: como na programação funcional, descreve o que é, não como fazer.
    - Nos paradigmas imperativo e orientado a objetos, detalhamos como obter a solução.
- **Computação ocorre quando fazemos perguntas**: fornecemos fatos e regras para dedução lógica de novos fatos, e fazemos perguntas sobre eles.
- **Aplicação ideal**: na representação de conhecimento.
    - **Áreas de aplicação**: linguística computacional/PNL, IA, sistemas especialistas, biologia molecular, web semântica.
- **História Concisa:** Originou-se em Marselha, França (Alain Colmerauer e Philippe Roussel, 1972). Robert Kowalski consolidou a ideia de programação lógica. A implementação de David Warren em Edimburgo (1977) a tornou uma linguagem séria e eficiente. Ganhou popularidade na Europa e no Japão.

- **Material detalhado:** https://lpn.swi-prolog.org
- **Playground online:** https://swish.swi-prolog.org
    - Clique no botão "Program".
    - Coloque os fatos e regras no lado esquerdo.
    - Faça consultas no frame inferior direito.
- **Instalação:** https://www.swi-prolog.org/build
    - Ubuntu (snap): `snap install swi-prolog`
- **Execução local:**
    - Interface gráfica: `swi-prolog.swipl-win`
    - **Terminal**: 
        - Coloque os fatos e regras em um arquivo `.pl` (e.g., `exemplo.pl`).
        - Execute no terminal: `swi-prolog.swipl exemplo.pl`
            - Isto vai carregar os fatos e regras do arquivo `exemplo.pl`.
            - Você verá o prompt do Prolog (`?-`), indicando que está pronto para receber consultas.

# Fatos, regras e consultas

- **Prompt do Prolog** (`?-`): indica que o Prolog está pronto para receber uma consulta.
- **Entradas devem terminar com ponto (`.`)**: Isso indica o fim de uma consulta ou definição de fato/regra.
- **Construções básicas:**
    *   **Fatos:** Declaram algo incondicionalmente verdadeiro. Devem iniciar com letra minúscula.
        - Um identificador isolado indica que ele é verdadeiro. Ex.: `festa.`
        - Um identificar `x` seguido por outros identificadores entre parênteses `(y1,..., yn)` indica que a relação `x` existe entre os átomos `y1,..., yn`. Ex.: `tocaViolao(joana).`
        - **Mundo fechado:** o que não é explicitamente declarado como verdadeiro é considerado falso.
        - Ex.: 

            Fatos e regras (em `exemplo.pl`):
            ```prolog
            mulher(maria).
            tocaViolao(joana).
            festa.
            ```
            Consultas e respostas:
            ```prolog
            ?- mulher(maria).
            true.

            ?- tocaViolao(joana).
            true.

            ?- tocaViolao(maria).
            false.

            ?- loira(maria).
            "ERROR: Unknown procedure: loira/1 (DWIM could not correct goal)"

            ?- festa.
            true.

            ?- showRock.
            "ERROR: Unknown procedure: showRock/0 (DWIM could not correct goal)"
            ```
    *   **Regras:** Indicam informação condicionalmente verdadeira. A estrutura é `cabeça :- corpo`. O operador `:-` significa "se" ou "decorre de". Se o corpo for verdadeiro, a cabeça é verdadeira. Permite uso de variáveis (começando com maiúsculas). Devem ser incluídas no arquivo.
        - Ex.: (fatos e regras, em `exemplo.pl`)
            ```prolog
            mulher(maria).
            tocaViolao(joana).
            festa.

            gostaDeMusica(X) :- tocaViolao(X).
            ```
        - Ex.: (consultas e respostas)
            ```prolog
            ?- gostaDeMusica(maria).
            false.

            ?- gostaDeMusica(joana).
            true.
            ```
- **Operadores relacionais** (para expressões aritméticas):
    - `=:=`: igualdade numérica (ex.: `X =:= 5`).
    - `=\=`: desigualdade numérica (ex.: `X =\= 5`).
    - `<`: menor que (ex.: `X < 5`).
    - `=<`: menor ou igual a (ex.: `X =< 5`).
    - `>`: maior que (ex.: `X > 5`).
    - `>=`: maior ou igual a (ex.: `X >= 5`).
- **Operadores lógicos**:
    *   **Negação:** Representada por `\+` (não). É `true` apenas quando não é possível provar que a expressão é verdadeira.
        - Ex.: `\+ tocaViolao(maria).` significa "Maria **não** toca violão".
    *   **Conjunção (AND):** Representada por vírgula `,` no corpo de uma regra. 
        - Ex.: `gostaDeMusica(X) :- tocaViolao(X), festa.` significa "X gosta de música **SE** X toca violão **E** há festa".
    *   **Disjunção (OR):** Representada por ponto e vírgula `;` no corpo de uma regra. 
        - Ex.: `gostaDeMusica(X) :- tocaViolao(X); festa.` significa "X gosta de música **SE** X toca violão **OU** há festa".
    - **Ordem de precedência:** 
        - Negação `\+` tem a maior precedência.
        - Conjunção `,` tem precedência intermediária.
        - Disjunção `;` tem a menor precedência.
        - Use parênteses para agrupar expressões e controlar a ordem de avaliação.
    - Ex.: 
    
        - Fatos e regras (em `exemplo.pl`)
            ```prolog
            pessoa(joao, homem, 30).
            pessoa(maria, mulher, 25).
            pessoa(carlos, homem, 40).
            animal(cachorro, mamifero).
            animal(gato, mamifero).
            animal(cobra, reptil).
            gosta(joao, cachorro).
            gosta(maria, gato).
            gosta(carlos, cobra).

            eh_adulto(Nome) :- 
                pessoa(Nome, _, Idade),
                Idade >= 18.

            gosta_de_animal_de_estimacao(Nome) :-
                pessoa(Nome, _, _),
                (gosta(Nome, cachorro); gosta(Nome, gato)).

            % Foi necessário fixar TipoAnimal antes de testar que não é mamífero.
            % Caso contrário, quando TipoAnimal é livre, estamos pedindo para o 
            % Prolog provar que não é possível encontrar um animal que seja 
            % mamífero, o que é falso, pois existem animais mamíferos.
            nao_eh_mamifero(TipoAnimal) :-
                animal(TipoAnimal, _),
                \+ animal(TipoAnimal, mamifero).
            ```
        - Consultas e respostas:
            ```prolog
            ?- eh_adulto(joao).
            true.

            ?- gosta_de_animal_de_estimacao(joao).
            true ;
            false.

            ?- gosta_de_animal_de_estimacao(carlos).
            false.

            ?- nao_eh_mamifero(cobra).
            true.

            ?- nao_eh_mamifero(gato).
            false.

            ?- nao_eh_mamifero(joao).
            false.

            ?- gosta_de_animal_de_estimacao(X).
            X = joao ;
            X = maria ;
            false.
            ```        
        - Observações:
            - O caractere `_` é usado como **variável anônima**, indicando que não nos importamos com o valor.
            - Uma mesma **variável** pode ser usada em diferentes partes de uma regra, e o Prolog irá **unificá-la com o mesmo valor em todas as ocorrências**.
            - Quando existem múltiplas formas de satisfazer uma consulta, o Prolog **retorna a primeira solução encontrada**. Podemos pressionar `;` para **ver as soluções subsequentes** ou `.` para **finalizar** a consulta.
                - No exemplo, ao consultar `gosta_de_animal_de_estimacao(joao)`, o Prolog retorna `true` porque `joao` gosta de cachorro. Se pressionarmos `;`, ele tentará encontrar outras soluções, mas não haverá mais, pois `joao` não gosta de gato, e portanto retornará `false`.
            - Ao usar **variáveis em consultas**, o Prolog irá tentar encontrar todos os valores possíveis que satisfazem a consulta, como ocorreu em `gosta_de_animal_de_estimacao(X)`.
            - Algumas vezes o Prolog retorna **soluções repetidas**. Isto ocorre quando existem **vários valores para variáveis intermediárias** que não afetam o resultado final. Use `findall` e `sort` para **remover os repetidos**.
                - Ex.: `findall(X, tioOuTia(X,_), L), sort(L, S).`
            - Use o `%` para **comentar** o restante da linha, e `/* ... */` para comentar blocos de código.

# Unificação

- **Unificação**: é o processo de fazer duas expressões iguais, substituindo variáveis por valores.
    - Ex.: `gosta_de_animal_de_estimacao(X)` unifica `X` com `joao`, `maria`, etc.
- **Operador `=`**: usado para unificação explícita.
    - Ex.: `pessoa(joao, homem, Idade) = pessoa(joao, Genero, 30).`
        - Isso unifica `Idade` com `30` e `Genero` com `homem`, e retorna `true`.
    - Cuidado: sempre verifique se algumas variáveis deveriam estar fixadas pelas expressões anteriores, pois vale `true` sempre que as variáveis puderem ser unificadas.
    - Cuidado com expressões aritméticas na unificação, pois a unificação não calcula o resultado da expressão.
        - Ex.: `X = 5 + 3` não unifica `X` com `8`, mas sim com a expressão `5 + 3` (relação `+(5,3)`).
        - Use `is` (ao invés de `=`) para calcular o valor da expressão na unificação.
            - Ex.: `X is 5 + 3` unifica `X` com `8`.
- **Operador `\=`**: usado para verificar se duas expressões não são unificáveis.
    - Ex.: `animal(gato, X) \= animal(_, reptil).`
        - Retorna `true`, pois não é possível unificar `X` com `reptil`.
    - Cuidado: sempre verifique se algumas variáveis deveriam estar fixadas pelas expressões anteriores, pois vale `false` sempre que as variáveis puderem ser unificadas.
- **Operador `==`**: verifica se duas expressões já são idênticas (sem necessidade de unificação).
    - Ex.: `pessoa(joao, homem, 30) == pessoa(joao, homem, 30).`
        - Retorna `true`, pois as duas expressões são idênticas.
    - Ex.: `pessoa(joao, X, 30) == pessoa(joao, homem, 30).`
        - Retorna `false`, pois ainda é necessário unificar `X` com `homem`.
