package aula9;

import java.util.HashMap;
import java.util.Map;

public class StringExemplo {

    public static void main(String[] args){

        var value = "java;java;java;java";

        value = value.replaceFirst("j","J");
        System.out.println("------------ replaceFirst ----------------\n");
        System.out.println(value);

        value = value.replace("j","J");
        System.out.println("\n------------ replace ----------------");
        System.out.println(value);

        value.equalsIgnoreCase("java"); //compara SOMENTE O TEXTO ignorando upper e lower

        System.out.println("\n------------ split ----------------");
        var values = value.split(";", 2); //regex -- críterio de fatiamento e limite -- até aonde ir
        for (var v : values){
            System.out.println(v);

        }

        System.out.println("\n------------ indexOf ----------------");
        System.out.println(value.indexOf("j",1,3));
            //objeto de procura -- str ; começo da procura -- beginIndice; final da procura -- 1 antes de endIndex
            // -1 -- significa que não encontrou

        System.out.println("\n------------ isBlank / isEmpty  ----------------");
        var value2 = " ";
        System.out.println(value2.isBlank()); //verificação ignorando o espaço -- true
        System.out.println(value2.isEmpty()); //considera o espaço             -- false

        System.out.println("\n------------ remover espaço  ----------------");
        var value3 = " j a  v     a";
        System.out.println(value3.trim()); // trim -- remove os espaços do início e fim da string
        System.out.println(value3.replace(" ", "")); // replace -- remove espaços
        System.out.println(value3.replaceAll("\\s+", "")); // replaceAll --remove qualquer espaço
            // s+ → remove: espaços normais; tabs (\t); quebras de linha (\n); múltiplos espaços juntos

        System.out.println("\n------------ Map<String, String>  ----------------");

        var value4 = """
                { "name":"jão", "age":18}
                """;

        Map<String, String> map = new HashMap<>();
        value4.replace("{","").replace("}","").replace("\"","");
        var valueArr = value4.split(",");
        for (var v : valueArr){
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);
        }
        System.out.println(map);

        System.out.println("\n------------ repeat  ----------------");
        var value5 = "*";
        System.out.println(value5.repeat(1000));



    }

}
