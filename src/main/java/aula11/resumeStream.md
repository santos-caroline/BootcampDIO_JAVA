# O que é Stream?
- Uma Stream é uma abstração introduzida no Java 8 para processar sequências de dados de forma funcional.
- Ela não armazena dados; apenas fornece uma forma de operar sobre coleções (como listas, conjuntos, arrays) de maneira fluente e expressiva.

## Principais características
- Imutabilidade: a Stream não altera a coleção original, apenas gera resultados.
- Operações declarativas: você descreve o que quer fazer, não como fazer (sem loops explícitos).
- Pipeline de operações: você encadeia métodos como filter, map, sorted, collect.
- Possibilidade de paralelismo: com .parallelStream(), é possível dividir o processamento em múltiplos núcleos.

## Tipos de operações
### Intermediárias (retornam uma nova Stream):
- ``filter()`` → filtra elementos.
- ``map()`` → transforma elementos.
- ``sorted()`` → ordena.
- ``distinct()`` → remove duplicados.

### Terminais (produzem resultado final):
- ``collect()`` → coleta em lista, conjunto ou mapa.
- ``forEach()`` → percorre e executa ação.
- ``reduce()`` → reduz a um único valor.
- ``count()`` → conta elementos.

### Exemplo:

````
List<String> nomes = List.of("Ana", "Carlos", "Maria", "João");

List<String> resultado = nomes.stream()
    .filter(n -> n.startsWith("A"))
    .map(String::toUpperCase)
    .sorted()
    .toList();

System.out.println(resultado); // [ANA]
````



