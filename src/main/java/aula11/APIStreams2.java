package aula11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static aula11.ContactType.EMAIL;
import static aula11.ContactType.PHONE;
import static aula11.Sex.MALE;
import static aula11.Sex.FEMALE;

public class APIStreams2 {

    public static void main(String[] args){

        List<User> users = new ArrayList<>(generateUser());

        users.sort(Comparator.comparing(User::age, //organiza por idade
                   Comparator.reverseOrder())); //organiza por ordem decrescente

        users.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        var values = users.stream()
//                .filter(u -> u.contacts().size() >= 2) //pegar somente contatos menores que 2
               .filter(u -> u.contacts() == null || u.contacts().isEmpty()) //pegar contato vazio
               .toList(); // coloca em uma lista
        values.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        var values2 = users.stream()
                .filter(u -> u.contacts().stream().anyMatch(c -> c.type() == EMAIL)); //pegar só com email
        values2.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        var values3 = users.stream()
                .flatMap(u -> u.contacts().stream())
                .filter(c -> c.type() == EMAIL)
                .sorted(Comparator.comparing(Contact::description)) //organiza por contatos
                .toList();

        values3.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        var values4 = users.stream()
                .flatMap(u -> u.contacts().stream())
                .sorted(Comparator.comparing(Contact::description))
                .map(c -> String.format("\n    'description': '%s', \n    'type': '%s'\n}",
                        c.description(), c.type())) //imprimi em JSON
                .toList();

        values4.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        var values5 = users.stream()
                .filter(u -> u.sex() == FEMALE)
                .collect(Collectors.toMap(User::name, user -> user)); //transforma o stream filtrado em um Map
        /*
        Chave: User::name → o nome do usuário será usado como chave no mapa.
        Valor: user -> user → o próprio objeto User será o valor associado àquela chave.
        */

        values5.forEach((key, value) -> System.out.printf("key: %s | value: %s \n",key, value));



    }

    private static List<User> generateUser(){
        var contacts1 = List.of(
                new Contact("(11) 11111111", PHONE),
                new Contact("jão@email.com", EMAIL)
                );

        var contacts2 = List.of(

                new Contact("maria@email.com", EMAIL)
                );

        var contacts3 = List.of(
                new Contact("lulu_gatinho@email.com", EMAIL),
                new Contact("lucas@email.com", EMAIL)

                );

        var contacts4 = List.of(
                new Contact("(33) 333333333", PHONE),
                new Contact("(44) 444444444", PHONE)
                );



    /*
    Como List.of() gera uma lista imutável, para podermos manipulá-la depois instanciamos um ArrayList<>
    a partir dos objetos.
    */

    var user1 = new User("Jão",33,MALE, new ArrayList<>(contacts1));
    var user2 = new User("Maria",23,FEMALE, new ArrayList<>(contacts2));
    var user3 = new User("Lucas",19,MALE, new ArrayList<>(contacts3));
    var user4 = new User("Tamires",15,FEMALE, new ArrayList<>(contacts4));
    var user5 = new User("Nazare",30,FEMALE, new ArrayList<>());


        return List.of(user1, user2, user3, user4, user5);
    }
}
