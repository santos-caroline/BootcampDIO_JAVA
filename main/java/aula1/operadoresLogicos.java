package Bootcamp_DIO_Santander.aula1;
import java.util.Scanner;

public class operadoresLogicos {

    public static void main(String[] args){
        try (var scanner = new Scanner(System.in)){
        /*
        IO.println("Quanto é 10 + 1= ?"); //IO no java25 é == System.out... para println e print
        int resultado = scanner.nextInt();
        System.out.printf(" O resultado é 11, você acertou? (%s)", resultado == 11); //comparação usando boolean
        */
         
        IO.println("Quantos anos você tem? ");
        int idade = scanner.nextInt();
        IO.println("Você é emancipado? ");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = idade > 17 || (isEmancipated && idade >= 16); //operadores:|| ou     && e
        System.out.printf(" Você pode dirigir? (%s)\n", canDrive);
        }
    }

}
