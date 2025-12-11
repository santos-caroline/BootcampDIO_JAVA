package aula2;

import java.util.Scanner;

public class repeticaoWhileDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var name = "";



        for (int i = 0; i < args.length; i++) {  //ótimo quando se quer o índice dos elementos
            System.out.println("Argumento " + i + ": " + args[i]);
        }

        for (var arg : args) { //caso não precise do índice, só o valor
            System.out.println("Argumento: " + arg);
        }

        var i = 0;
        while (args.length > i){
            System.out.println(args[i]);
            i++;
        }

        i = 0; // Resetting the index
        do{
            System.out.println(args[i]);
            i++;
        } while (args.length > i);



        // Estrutura de repetição while ~ 1° verifica a condição, depois executa o bloco (não usamos com listas/arrays)
        while (true) {
            System.out.println("Informe seu nome ou 'exit' para sair: ");
            name = sc.next();

            if (name.equalsIgnoreCase("exit")) {
                break;
            } else System.out.printf("Olá, %s!!\n", name);

            //se não tiver o break no ignoreCase dá para usar o operador ternário também

            // Estrutura de repetição do-while ~ 1° executa o bloco, depois verifica a condição
            do {
                System.out.println("Informe seu nome ou 'exit' para sair: ");
                name = sc.next();

                if (!name.equalsIgnoreCase("exit")) {
                    System.out.printf("Olá, %s!!\n", name);
                }
            } while (!name.equalsIgnoreCase("exit"));
        }
    }
}