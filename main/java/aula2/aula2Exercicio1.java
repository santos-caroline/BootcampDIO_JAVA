package aula2;

import java.util.Scanner;

public class aula2Exercicio1 {

    // 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado e farei a tabuada de 1 a 10: ");
        var num = sc.nextInt();
        System.out.printf("Tabuada do %s: \n", num);

        for(int i=1; i<= 10; i++){
            var result = num * i;
            System.out.printf("%s x %s = %s \n",num, i, result);
        }
    }

}
