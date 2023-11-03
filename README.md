# Construtor de Sanduíches

Este é um projeto Java simples que demonstra o padrão de design do construtor através de um construtor de sanduíches.

## Classes

O projeto consiste em três classes principais:

1. `Sanduiche`: Esta classe representa um sanduíche, com campos para o tipo de pão, recheio, molhos e extras. Também inclui métodos para definir esses campos e um método `toString` para exibir os detalhes do sanduíche.

2. `SanduicheBuilder`: Esta classe segue o padrão de design do construtor para criar um objeto `Sanduiche`. Ele fornece métodos para definir cada campo do `Sanduiche` e um método `build` para retornar o objeto `Sanduiche` final.

3. `Main`: Esta classe contém o método principal onde um objeto `Sanduiche` é criado usando o `SanduicheBuilder`.

## Uso

Para usar este projeto, basta clonar o repositório e executar a classe `Main`. Isso criará um novo objeto `Sanduiche` usando o `SanduicheBuilder` e imprimirá os detalhes do sanduíche.
