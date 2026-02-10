package aula2;

import java.awt.*;
import java.util.Scanner;

public class condicionalSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        var option = sc.nextInt();



        switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                System.out.printf("Hoje é %s, fim de semana!! ", day);

                /*
                | Situação                       | switch statement     | switch expression           |
                | ------------------------------ | ----------------    | ---------------------------- |
                | Retorna valor?                 | ❌ Não             | ✔ Sim                        |
                | Precisa `yield`?               | ❌ Não             | ✔ Sim, quando usa bloco `{}` |
                | Usa apenas `->` com uma linha? | ✔                  |✔                            |
                */
            }

            case 2, 3,4, 5,6 -> System.out.println("Dias da semana ... ");
            default -> System.out.println("opção inválida");
        }

    }
}
