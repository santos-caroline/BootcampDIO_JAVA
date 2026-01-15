package aula8;

import java.util.HashMap;
import java.util.Map;


public class MapExemplo {
    public static void main(String[] args){

        Map<String, User> users = new HashMap<>();
        users.put("jao@teste.com",new User("João",20));
        users.put("pedro@teste.com",new User("Pedro", 21));
        users.put("marcos@teste.com",new User("Marcos", 23));
        users.put("cintia@teste.com",new User("Cintia", 24));
        users.put("suelen@teste.com",new User("Suelen", 25));

        System.out.println(users);
        System.out.println("---------- keySet ---------------");
        users.keySet().forEach(System.out::println);
        System.out.println("----------- values --------------");
        users.values().forEach(System.out::println);

        System.out.println(users.containsKey("pedro@teste.co")); //false pq não é exato
        System.out.println(users.containsValue(new User("Marcos", 23))); //true

        System.out.println("-------------------------");
        users.forEach((k,v) -> System.out.printf("key: %s, value: %s\n",k,v));
        users.replace(("jao@teste.com"), new User("João",27)); //mudando o value
        System.out.println("-------------------------");
        users.forEach((k,v) -> System.out.printf("key: %s, value: %s\n",k,v));

        System.out.println(users.getOrDefault(" ", new User("",-1)));
        System.out.println(users.getOrDefault("cintia@teste.com", new User("",-1)));
            //retorna com 1 argumento

        System.out.println("--------- merge ----------------");
        users.merge("jao@teste.com", new User("", -1),((user, user2) -> {
            System.out.println(user);
            System.out.println(user2);
            return user2;
        }));
        System.out.println(users);
        /*
        O método cria uma entrada com uma chave e valor especificados ou, se uma entrada com a chave especificada já
        existir, calcula um novo valor para a entrada. merge()
         */

        System.out.println("--------- putIfAbsent ----------------");
        users.putIfAbsent("", new User("", -1)); //se não tiver o value ele acrescenta
        System.out.println(users);

        //TreeMap -- mantém as chaves em ordem natural ou definida por um comparador?




    }
}
