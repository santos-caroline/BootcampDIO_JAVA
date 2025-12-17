package aula2;

import java.util.Scanner;

public class aula2Exercicio4 {
    /*
    4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N
    números, a execução do código irá continuar até que o número informado dividido pelo primeiro número
    tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numInicial;
        do {
            System.out.println("Informe um número inicial: (Deve ser diferente de zero)");
            numInicial = sc.nextInt();
        } while (numInicial == 0); //garante que o número inicial seja diferente de zero


        while (true) {
            System.out.println("Informe outro número maior ou igual ao número inicial: ");
            int numN = sc.nextInt();

            if (numN < numInicial) {
                continue;
            }

            int resto = numN % numInicial;
            if (resto != 0) {
                System.out.printf("a divisão de %s por %s tem resto %s (diferente de zero)." +
                        "Encerrando o programa.", numN, numInicial, resto);
                break;


            }

        }
    }
}

