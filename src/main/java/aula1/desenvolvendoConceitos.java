package Bootcamp_DIO_Santander.aula1;
import java.util.Scanner;

    public class desenvolvendoConceitos {

    public static void main(String[] args){
        System.out.println("Informe seu nome: ");
        try (Scanner scanner = new Scanner(System.in)) { //variavel declarada e inicializada(new) e será fechada automaticamente
            //scanner scaneia valores recebidos pelo terminal
            String nome = scanner.next();
            System.out.println("Informe seu idade: ");
            int idade = scanner.nextInt();
            System.out.printf("Olá %s sua idade é %s anos? \n",nome, idade); //vai subs %s pelas variaveis
        }
    }

}
