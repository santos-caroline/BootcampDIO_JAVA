package Bootcamp_DIO_Santander.aula1;

import java.util.Scanner;

public class aula1Exercicios {

    /*
    Exercícios
    1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a
    seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

    2. Escreva um código que receba o tamanho do lado de um quadrado, calcule a sua área e exiba na tela:
        fórmula: área=lado X lado

    3. Escreva um código que receba a base e a altura de um retângulo, calcule a sua área e exiba na tela
        fórmula: área=base X altura

    4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
     */


    public static void main(String[] args) {

        /* EX1:
        IO.println("Olá, qual o seu nome? ");
        try (Scanner sc = new Scanner(System.in)) {
            String nome = sc.next();
            IO.println("Em que ano você nasceu? ");
            int anoNasc = sc.nextInt();
            int ano = OffsetDateTime.now().getYear(); //considera o ano atual do sistema com fuso horário
            int idade = ano - anoNasc;

            System.out.printf("Olá %s, você tem %s anos", nome, idade);
        */

        /* EX2:
        IO.println("Olá, vamos calcular a área de um quadrado? " +
                "\nDigite o tamanho de um lado cm: ");

        try (Scanner sc = new Scanner(System.in)) {
            int lado = sc.nextInt();

            double area = Math.sqrt(lado);

            System.out.printf("O seu quadrado tem area %.2f cm quadrados ", area);
        }
        */

        /* EX3:
        IO.println("Olá, vamos calcular a área de um retângulo? " +
                "\nDigite o tamanho da base em cm: ");
        try (Scanner sc = new Scanner(System.in)) {
            int base = sc.nextInt();
            IO.println("Ótimo! Agora forneça a altura em cm: ");
            int altura = sc.nextInt();

            int area = base * altura;

            System.out.printf("O seu retângulo tem area de: %s cm quadrados! ", area);
        }
        */

        IO.println("Vamos calcular a diferença de idade de quantas pessoas? ");

        try (Scanner sc = new Scanner(System.in)) {
            int numPessoas = sc.nextInt();
            int idadeAnterior = 0;

            for (int i = 1; i <= numPessoas; i++) {
                IO.println("Qual a idade da pessoa " + i + " ? ");
                int idadeAtual = sc.nextInt();

                if (i > 1) {
                    int diferenca = Math.abs(idadeAnterior - idadeAtual);
                    System.out.printf("A diferença de idade entre %s e %s é de %s anos.  ", idadeAnterior, idadeAtual, diferenca);

                    idadeAnterior = idadeAtual; //atualiza idade1 para próxima iteração
                }


            }


        }

    }


}


