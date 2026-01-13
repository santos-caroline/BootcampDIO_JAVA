package aula7;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListArray {

    public static void main(String[] args) {

        int[] code = {123, 321};

        System.out.println(code[0]);
        System.out.println(code[1]);
        System.out.println("tamanho :"+code.length);

        System.out.println("----------------------");

//        List<Integer> code2 = new ArrayList<>();//não pode passar code direto pq é int e ArrayList trabalha com <integer>

        List<Integer> code2 = new LinkedList<>(); //para add e remoções constantes

//        List<Integer> code3 = new Vector<>(); //quando precisa rodar em multitread (sincronizado)

        code2.add(code[0]); //conversão automatica de tipos
        code2.add(code[1]);
        code2.forEach(System.out::println);
        code2.add(1234); //add no fim

        System.out.println("----------------------");

        List<User> users = new ArrayList<>();

        var user = new User(1, "jão");
        users.add(user);
        users.add(new User(2, "leo"));
        users.add(new User(3, "may"));

        System.out.println("size: " + users.size());
        System.out.println("empty? " + users.isEmpty());
        System.out.println(users.getFirst()); // java 21+ --antes--> System.out.println(users.get.size()-1));
        System.out.println(users.getLast());

        System.out.println("contais? " + users.contains(user)); //contém usuario
        System.out.println("contais user especifico? " + users.contains(new User(1,"Jão")));
            //pq compara end de memoria e não o obj >>>new User aloca outro end de memória
            // instanciar significa alocar endereço de memória

        //depois de criar métod equals:
        System.out.println("equals? " + (new User(1,"Jão").equals(new User(1,"Jão"))));

        System.out.println("----------------------");

        System.out.println(users);
        System.out.println(users.remove(new User(8, "leo")));
        System.out.println(users.removeFirst()); // java 21+
        System.out.println(users);
        users.clear(); //limpa a lista
        System.out.println(users);

        System.out.println("----------------------");

        var arrayStart = OffsetDateTime.now(); //hora que começou o array
        List<Integer> arrayList = new ArrayList<>();
        for( int i=0; i < 100_00_00; i++){
            arrayList.add(i);
        }
        System.out.println("arrayList: "+Duration.between(arrayStart, OffsetDateTime.now()).toMillis());

        var vectorStart = OffsetDateTime.now(); //hora que começou a o vetor
        List<Integer> vector = new Vector<>();
        for( int i=0; i < 100_00_00; i++){
            arrayList.add(i);
        }
        System.out.println("vector: "+Duration.between(vectorStart, OffsetDateTime.now()).toMillis());

        var linkedStart = OffsetDateTime.now(); //hora que começou a a linkedList começou
        List<Integer> linkedList = new LinkedList<>();
        for( int i=0; i < 100_00_00; i++){
            linkedList.add(i);
        }
        System.out.println("linkedList: "+Duration.between(linkedStart, OffsetDateTime.now()).toMillis());


    }
}

