package aula6.interfacesfuncionais;
        /*
        O Consumer<T> é uma interface funcional do Java (pacote java.util.function) usada quando queremos receber um
        objeto e executar uma ação sobre ele, sem retornar valor. Ela possui apenas um método abstrato, o accept(T t),
        que define o que será feito com o objeto recebido. Além disso, a interface já fornece o método andThen, com
        implementação padrão, permitindo encadear ações — por isso, ele não deve ser sobrescrito. O Consumer é muito
        utilizado em operações com coleções, como o forEach, e pode ser implementado tanto por classes anônimas quanto,
        de forma mais simples e moderna, por expressões lambda, tornando o código mais legível e conciso.

        Interface funcional é a base para o uso de expressões lambda em Java.
            Interface funcional → 1 método abstrato (mas pode ter Métodos default e Métodos static)
            Lambda → implementa esse método
            Lambda não funciona sem interface funcional
            Facilita código mais limpo, legível e moderno
        */

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 31), new User("Eduardo", 40),
                new User("Camila", 25), new User("Joelma", 32));
        //List.of -- retorna uma coleção imutável de itens;

        printStringValue(User::name, users); //imprime só o nome
        printStringValue(user -> String.valueOf(user.age()),users); //imprime só a idade
        users.forEach(System.out::println);

//        var consumer = new Consumer<User>() {
//
//            @Override
//            public void accept(final User user) {
//                System.out.println(user);
//
//            }
//
//        };
//        users.forEach(consumer); // Estamos usando o Consumer<User> aqui porque o objetivo do código é executar uma
//                                // ação para cada elemento da lista, sem precisar retornar nenhum valor.
    }
    /*
    🔄 O que acontece na prática?
        1. forEach percorre a lista
        2. Para cada User, ele executa: ```` consumer.accept(user); ````
        3. Dentro do accept, você define a ação: ```` System.out.println(user); ````
     */

    public static void printStringValue(Function<User, String> callback, List<User> users){
    users.forEach(u -> System.out.println(callback.apply(u)));
    /*
    public static -- método público e estático (pode ser chamado sem criar objeto)
    Function<User, String> callback --  uma interface funcional do Java (java.util.function.Function).
         >>> recebe um User e retorna uma String
    List<User> users -- lista de usuários que será percorrida.

    1️⃣ u → cada User da lista
    2️⃣ callback.apply(u) → transforma User em String
    3️⃣ System.out.println(...) → imprime o resultado
    "“Para cada usuário, aplique a função e imprima o resultado”."
    */
    }
}
