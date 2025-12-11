package aula2;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args){

        System.out.println("Qual o seu nome? ");
        Scanner sc = new Scanner(System.in);
        var nome = sc.next();
        System.out.println("Qual a sua idade? ");
        var idade = sc.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = sc.next().equalsIgnoreCase("s");

        var canDrive = (idade >= 18) || (idade >= 16 && isEmancipated);
        var mensagem = canDrive ? //ele vai verificar a expressão boolean se for true (1 caso), caso false (2 caso)
                nome + ", você pode dirigir \n" :       //1 caso
                nome + ", você não pode dirigir \n" ;  //2 caso

        /*
        O operador ternário (?) é um atalho para estruturas condicionais if/else, usado para avaliar uma condição
        e retornar um de dois valores ou executar um bloco de código numa única linha, com a sintaxe

            >>> condição ? valor_se_verdadeiro : valor_se_falso

        É uma forma concisa de atribuir um valor a uma variável ou fazer uma escolha simples, sendo útil para
        um código mais limpo, mas deve-se evitar o uso excessivo para não prejudicar a legibilidade.
        */
        System.out.println(mensagem);



    }
}
