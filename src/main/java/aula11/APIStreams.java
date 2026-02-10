package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class APIStreams {

    public static void main(String[] args){

        var value1 = Stream.generate(() -> new Random() //.generate(...) -- Cria um Stream infinito de num aleatórios
                        .nextInt())
                        .limit(10)     //limita o num de elementos
                        .toArray(Integer[]::new);
        /*
        “quando for criar o array, crie um Integer[]”
        equivalente a : .toArray(size -> new Integer[size]) >> “quando precisar criar o array,
        cria um Integer[] com o tamanho certo”

        pode usar o .toList e gerar direto uma lista de inteiros
        .List<Integer> list = stream.toList(); // Java 16+

        O Stream calcula quantos elementos tem. Passa esse tamanho para o construtor e Cria new Integer[tamanho]
        */

        for(var i: value1){
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------");

        var value2 = IntStream.generate(() -> new Random().nextInt())
                        .limit(10)
                        .toArray();

        for(var i: value2){
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");

        List<String> debugValue = new ArrayList<>();
        var value3 = Stream.of("Maria", "Joelma", "Clotilde", "Matilda") //aceita tipos variados
                .peek(debugValue::add)
                .filter(name -> name.endsWith("a") )
                .toList();

                /*
                operações intermediarias -- "ficam no meio do código" vão retornar o próprio Stream ex: .peek, .filter
                operações terminal--  "final do código" retornam outra coisa ex: .toList (retorna um List)
                */

        System.out.println(value3);
        System.out.println(debugValue);

        System.out.println("-----------------------------------------------------");

        var value4 = Stream.of("Maria", "Joelma", "Clotilde", "Matilda")
                .filter(n -> n.endsWith("e"))
                .anyMatch(n -> n.contains("C")); //sensitive case


        System.out.println(value4);

        System.out.println("-----------------------------------------------------");

        var value5 = Stream.of("Maria", "Joelma", "Clotilde", "Matilda")
                .parallel() //Transforma o stream sequencial em um stream paralelo >> divide trabalho entre threads
                .filter(n -> n.endsWith("a"))
                .findAny();

        System.out.println(value5);


        System.out.println("-----------------------------------------------------");

        var value6 = Stream.of("Maria", "Joelma", "Clotilde", "Matilda")
                .reduce("",(a,b) -> a +";"+b)//.reduce >> reduzir vários elementos a um único valor
                .replaceFirst(";",""); //tira o primeiro ;

        System.out.println(value6);

        //modo elegante de fazer:
        var value7 = String.join(";", "Maria", "Joelma", "Clotilde", "Matilda");

        System.out.println(value7);

        System.out.println("-----------------------------------------------------");

        var value8 = Stream.of(1,2,3,4,5,6,7,8,9)
                .reduce(0,Integer::sum); // 0 == ponto de partida da redução.
                            // para soma >> 0 é o valor identidade da operação (não altera o resultado final)

        /*
        | Operação      | Identity correto     |
        | ------------- | -------------------- |
        | Soma          | `0`                  |
        | Multiplicação | `1`                  |
        | Concatenação  | `""`                 |
        | AND lógico    | `true`               |
        | OR lógico     | `false`              |
        | Máximo        | menor valor possível |
        | Mínimo        | maior valor possível |
         */

        System.out.println(value8);

        var value9 = IntStream.of(1,2,3,4,5,6,7,8,9,9,9,9)
                    .average(); //retorna a média em double
        System.out.println(value9);

        var value10 = Stream.of(1,2,3,4,5,6,7,8,9,9,9,9)
                .distinct().toList(); //retira os num iguais
        System.out.println(value10);
    }
}
