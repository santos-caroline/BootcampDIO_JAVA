package aula6.exercicio3;

import java.util.Scanner;

/*
    3 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um método que
    retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:
        Quadrado: possui o valor dos seus lados;
        Retângulo: possui os valores de base e altura;
        Circulo: possui o atributo raio.
 */

public class Main {


    //public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        while (true) {
            System.out.print("""
                    Escolha a forma geométrica:
                    1- Quadrado
                    2- Retângulo
                    3- Círculo
                    0- sair");
                    """);

            option = sc.nextInt();
            switch (option) {
                case 1 -> createSquare();
                case 2 -> createRectangle();
                case 3 -> createCircle();
                case 0 -> {
                    System.out.println("Encerrando...");
                    sc.close();
                }
                default -> System.out.println("Opção inválida!");
            }


        }
    }
        // corrigir lógica
        private static GeometricForm createRectangle () {
            System.out.println("Informe o tamanho da base: ");
            var base = sc.nextDouble();
            System.out.println("Informe o tamanho da altura: ");
            var height = sc.nextDouble();
            return new Rectangle(height, base);
        }

        private static GeometricForm createSquare () {
            System.out.println("Informe o tamanho do lado: ");
            var side = sc.nextDouble();
            return new Square(side);
        }

        private static GeometricForm createCircle () {
            System.out.println("Informe o tamanho do raio: ");
            var radius = sc.nextDouble();
            return new Circle(radius);
        }

    }

