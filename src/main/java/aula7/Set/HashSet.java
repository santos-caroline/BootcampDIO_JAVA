package aula7.Set;


import java.util.*;

public class HashSet {

    public static void main(String[] args) {

        /* Set não trabalha com valores repetidos
        Um HashSet é uma estrutura de dados que armazena elementos únicos (sem duplicatas) de forma não ordenada,
        usando uma tabela de hash para operações rápidas como adicionar, remover e verificar a existência de um item,
        oferecendo performance O(1) na maioria dos casos.
        É ideal para filtrar duplicatas e buscar rapidamente, sendo mais rápido que listas para verificar a presença
        de elementos, mas sem garantia de ordem.
        */

        Set<User> users = new java.util.HashSet<>();
        users.add(new User(1, "jão"));
        users.add(new User(2, "gabi"));
        users.add(new User(3, "mia"));
        users.add(new User(4, "celeste"));
        users.add(new User(5, "gu"));
        users.add(new User(1, "jão")); //não permite duplicidade

        System.out.println(new User(1, "jão").hashCode()); //retorna um valor númerico
        System.out.println(new User(12, "Claudinho").hashCode());
        System.out.println(new User(21, "pedro").hashCode());
        System.out.println(users.contains(new User(1, "jão")));

        users.forEach(System.out::println); //impressão em ordem aleatória -- não associado a índice

        for (User user : users) {
            System.out.println(user);
        }

        users.removeAll(List.of(new User(1, "Jão"), new User(33, "Pedro")));

        System.out.println(users);

        users.removeIf(user -> user.getId() > 2); //removeIf é uma interface funcional
        System.out.println(users);

        System.out.println("=========================LinkedHashSet=============================");

        Set<User> users2 = new LinkedHashSet<>();
        users2.add(new User(1, "jão"));
        users2.add(new User(2, "gabi"));
        users2.add(new User(1, "jão"));
        users2.add(new User(4, "celeste"));
        users2.add(new User(3, "mia"));
        users2.add(new User(5, "gu"));

        System.out.println(users2); //imprime na ordem da inserção -- valores duplicados são ignorados

        System.out.println("=======================TreeSet===============================");
        Set<User> users3 = new TreeSet<>(); //faz verificação e define a estrutura


        users3.add(new User(1, "jão"));
        users3.add(new User(2, "gabi"));
        users3.add(new User(1, "jão"));
        users3.add(new User(4, "celeste"));
        users3.add(new User(3, "mia"));
        users3.add(new User(5, "gu"));

        System.out.println(users3); //só rodou depois do método compareTo()
        System.out.println("=======================TreeSet 2 ===============================");

        Set<User> users4 = new TreeSet<>(Comparator.comparingInt(User::getId)); //outra forma de comparar
//        Set<User> users4 = new TreeSet<>(Comparator.comparingInt(User::getId).reversed()); //comparação reversa
        users4.add(new User(1, "jão"));
        users4.add(new User(2, "gabi"));
        users4.add(new User(1, "jão"));
        users4.add(new User(4, "celeste"));
        users4.add(new User(3, "mia"));
        users4.add(new User(5, "gu"));
    }
}

