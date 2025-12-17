package aula2;

import java.util.Scanner;

public class aula2Exercicio2 {
    /*
    2. Escreva um código onde o usuário entra com a sua altura e peso, seja feito o cálculo do seu
    IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem conforme o resultado:
        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura em metros (Ex: 1.75): ");
        String alturaEntrada = sc.next().replace(",", "."); //aceita vírgula ou ponto como separador decimal
        System.out.println("Digite seu peso em kg. (Ex: 72.4): ");
        double altura = Double.parseDouble(alturaEntrada);

        String pesoEntrada = sc.next().replace(",", ".");
        double peso = Double.parseDouble(pesoEntrada);

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de %.2f ", imc); //arrendonda para 2 casas decimais

        if (imc <= 18.5) System.out.println("Abaixo do peso");
        else if (imc <= 24.9) System.out.println("Peso ideal");
        else if (imc <= 29.9) System.out.println("Levemente acima do peso");
        else if (imc <= 34.9) System.out.println("Obesidade Grau I");
        else if (imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");
    }

}



