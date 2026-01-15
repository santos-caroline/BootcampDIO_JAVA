package aula8;

import aula7.ListArray.User;

import java.util.ArrayList;
import java.util.List;

public class WrappersTipoPrimitivo {
    /*
    Espaço na memória - tipo primitivo(item único):
        - tipos primitivos NÃO aceitam valores null
    boolean -      1 bit
    byte -         8 bits
    short, char -  16 bits
    int, float -   32 bits
    long, double - 64 bits

    Espaço na memória - Objeto (Wrappers):
        - As classes de wrapper são imutáveis (para que seu estado não possa mudar depois que o objeto for construído)
        e são finais (para não podermos herdar delas).
    Boolean –          128 bits
    Byte –             128 bits
    Short, Character – 128 bits
    Integer, Float –   128 bits
    Long, Double –     192 bits
     */

    public static void main(String[] args) {
        Integer i =1; // autoboxing -- processo de converter um tipo primitivo em um tipo Wrapper
        i++;

        int j = new Integer(1); // unboxing -- converter uma referência em um tipo primitivo (até java 5)

        // Collection<tem que ser um objeto>
        List<Integer> list = new ArrayList<>(); //Integer é um objeto
        int[] arr = new int[0]; //uso de tipo primitivo

        /*
        | Situação                   | O que é passado     | Afeta a variável original? |
        | -------------------------- | ------------------- | -------------------------- |
        | Primitivo                  | Cópia do valor      | ❌ Não                     |
        | Objeto (alterar atributos) | Cópia da referência | ✅ Sim                     |
        | Objeto (reatribuir)        | Cópia da referência | ❌ Não                     |

         */

        System.out.println("-----------------------------------------------------");

        var user = new User(1,"Jão");
        printValue(user);
        System.out.println("print do main: ");
        System.out.println(user);

    }

    private static void printValue(User user){
        user =new User(3,"maria"); //tiramos a referencia do main
        // para alterar a referencia usamos final e set... (ex: setName)
        System.out.println("print do método: ");
        System.out.println(user);
    }

}
