package aula9;


import java.time.Duration;
import java.time.OffsetDateTime;

public class StringBuilderExemplo {

    public static void main(String[] args){
        /*
        String é imutável -- Depois que uma String é criada, o conteúdo dela não pode ser alterado. Qualquer
        “modificação” gera um novo objeto na memória.
         */
        System.out.println("-----------------------------------------");
        String s = "Java";
        s.concat(" Rocks");

        System.out.println(s); // Java

        String m = "Java";
        m = m.concat(" Rocks");

        System.out.println(s); // Java Rocks -- novo objeto

        System.out.println("-----------------------------------------");

        var stringStart = OffsetDateTime.now();
        String stringConcat = "";
        for (int i = 0; i < 5_000; i++){
            stringConcat += i;   //problemas de alocação excessiva da memória
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String: %s \n", getInterval(stringStart, stringEnd));

        var builderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder(); //nãu usado em multithread
        for (int i = 0; i < 500_000; i++){
            builderConcat.append(i);
        }
        var builderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (single thread): %s \n", getInterval(builderStart, builderEnd));


        var bufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < 500_000; i++){
            bufferConcat.append(i);
        }
        var bufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (multi thread): %s \n", getInterval(bufferStart, bufferEnd));

        var builder = new StringBuilder("1234567890");
        System.out.println("------------------ builder.delete -----------------------");
        System.out.println(builder.delete(0,5));
        System.out.println("------------------ deleteCharAt -----------------------");
        System.out.println(builder.deleteCharAt(2));
        System.out.println("------------------ reverse -----------------------");
        System.out.println(builder.reverse());
        System.out.println("------------------ insert -----------------------");
        System.out.println(builder.insert(2,"*")); //offset -- posição que vai acontecer a inserção
        builder.setLength(1); //modifica o tamanho
        System.out.println(builder);


    }

    private static long getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
        return Duration.between(stringStart, stringEnd).toMillis();
    }

}
