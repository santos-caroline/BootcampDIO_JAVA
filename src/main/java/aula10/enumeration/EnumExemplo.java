package aula10.enumeration;

import java.util.Scanner;

public class EnumExemplo {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var option = -1;
        while (option != 5) {
            System.out.println("""
                    Escolha uma opção:
                    1- Soma
                    2- Subtração
                    3- Multiplicação
                    4- Divisão
                    5- Sair
                    
                    """);
            option = sc.nextInt();

            if (option > 5 || option < 1) {
                System.out.println("Selecione uma opção válida!! ");

            }
            if (option == 5) break;

            var selectedOption = OperationEnum.values()[option - 1]; //segue a sequência do enum

            //var selectedOption = OperationEnum.valueOf("SUM");    //tem que ser exatamente igual
            // option - 1 pq o índice começa com zero no enum

            System.out.println("Informe o primeiro valor: ");
            var value1 = sc.nextInt();
            System.out.println("Informe o segundo valor: ");
            var value2 = sc.nextInt();

            var result = selectedOption.getCalculate().apply(value1, value2);
            System.out.printf(" %s %s %s = %s ", value1, selectedOption.getSymbol(), value2, result);
        }
    }

}

