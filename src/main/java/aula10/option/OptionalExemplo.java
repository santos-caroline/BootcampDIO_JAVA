package aula10.option;


import java.util.Optional;

public class OptionalExemplo {
    public static void main(String[] args) {

        //optional NÃO pode ser nulo !
        //Optional<User> optional = Optional.of(null); Error: Objects.requireNonNull

        //       Optional<User> optional = Optional.ofNullable(null);
        Optional<User> optional = Optional.of(new User("Yuri", 32, SexEnum.NOBINARY));


        optional.ifPresentOrElse(
                user -> System.out.printf("Usuário: %s \n",user),
                () -> System.out.println("Não encontramos um usuário válido! ")
        );


        System.out.println(optional.orElseThrow(RuntimeException::new)); //em caso de null roda a exceção

        System.out.println(optional.orElse(defaultUser())); //passa o default por método direto
            //geralmente usado quando temos um retorno padrão
        System.out.println(optional.orElseGet(OptionalExemplo::defaultUser)); //passa o default por lambda


        var newUser = optional.map(user -> new UserV2(user.name(), user.age(), user.sex())).orElseThrow();
        System.out.println(newUser);

        /*
        .map() transforma o valor que está dentro do Optional, se ele existir

        map ≠ ifPresent
        map → transforma e retorna
        ifPresent → executa ação e não retorna

        >>> map vs flatMap
        A função retorna Optional?      → flatMap
        A função retorna valor normal?  → map
         */
    }

    public static User defaultUser(){
        return new User("Usuário", 1,SexEnum.NOBINARY);
    }

}
