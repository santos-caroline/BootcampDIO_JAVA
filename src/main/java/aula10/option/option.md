# Optional Java

Optional é uma classe que foi implementada no Java 8, que tem o objetivo de simplificar os códigos, facilitando a vida 
dos desenvolvedores.
O Optional nos ajuda a evitar os erros NullPointerException, tirar a necessidade da verificação (if x != null) e 
também a escrever um código com menos linhas e mais bonito.

Vamos ver alguns exemplos de uso:

## empty
Retorna uma instância de Optional vazia.

````
Optional<Pessoa> pessoaEmpty = Optional.empty();
System.out.println(pessoaEmpty);
````

## of
Retorna um Optional com o valor pedido pelo método. O retorno não pode ser nulo.

````
Optional<Integer> pessoaOf = Optional.of(pessoaStream.mapToInt(p-> p.getIdade()).min().getAsInt());
System.out.println(pessoaOf);
````

## ofNullable
Retorna um Optional com o valor pedido pelo método. O valor pode ser nulo ou não. Esse método é o mais usado.

````
Optional<Integer> pessoaOfNullable = Optional.ofNullable(pessoaStream.mapToInt(p-> p.getIdade()).min().getAsInt());
System.out.println(pessoaOfNullable);
````

## ifPresent
O ifPresent faz um teste para saber se uma situação está ou não presente. Por exemplo, para saber se determinado 
funcionário está ou não cadastrado.

````
Optional<String> buscaMatricula = Optional.ofNullable(buscaPorMatricula(""));
if (buscaMatricula.isPresent())
    System.out.println("Funcionário encontrado");
else
    System.out.println("Funcionário não encontrado");

System.out.println(buscaMatricula);
`````

## Reduce
Se quisermos somar as idades das pessoas com idade acima de 30 anos, podemos usar o sum, como vemos no trecho de 
código abaixo:

````
int result = streamPessoa.filter(p-> p.idade > 30).mapToInt(p-> p.idade).sum();
System.out.println(result);
`````

Como temos duas pessoas com mais de 30 anos de idade (Daiane, 34 e Daniel, 35) obtivemos uma saída, que é a soma das 
duas idades: 69


Mas se, dessa forma, tentarmos somar as idades de das pessoas acima de 40 anos:

````
int result = streamPessoa.filter(p-> p.idade > 40).mapToInt(p-> p.idade).sum();
System.out.println(result);
`````
Como não temos nenhuma pessoa, a saída será um número inteiro: 0.

Mas, nesse caso, como não temos pessoas com a idade acima de 40 anos, não seria mais coerente um resultado vazio? 
Por isso, vamos usar o Optional reduce, como no exemplo abaixo:

````
OptionalInt result = streamPessoa.filter(p -> p.idade > 40).mapToInt(p-> p.idade).reduce((a, b) -> a + b);
if (result.isPresent()) {
    System.out.println(result.getAsInt());
`````
