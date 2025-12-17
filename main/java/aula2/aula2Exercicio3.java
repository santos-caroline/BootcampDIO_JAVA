package aula2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class aula2Exercicio3 {
    /*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro
     e escolhe entre a opção par e ímpar, com isso o código deve informar todos os números pares ou ímpares
     (conforme a seleção inicial) no intervalo de números informados, incluindo os números informados
     e em ordem decrescente;
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //interface (List) - pode trocar a implementação depois sem quebrar o código.
        List<Integer> listaNum = new ArrayList<>();
        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();

        System.out.println("Quantos números você deseja inserir? ");
        int quantidadeNum = sc.nextInt();

        for (int i = 1; i <= quantidadeNum; i++) { //add num do usuário

            System.out.printf("Digite o %s° número: ", i);
            int numUsuario = sc.nextInt();
            listaNum.add(numUsuario);
        }

        for (int i : listaNum) { //separando pares e ímpares
            if (i % 2 == 0) {
                listaPar.add(i);

            } else {
                listaImpar.add(i);
            }
        }

        System.out.println("Você deseja ver os números pares ou ímpares? \n");
        System.out.println("Digite 'pares' para ver os números pares ou 'ímpares' para ver os números ímpares: ");

        String escolhaUsuario = sc.next();
        if (escolhaUsuario.equals("pares")){
            listaPar.sort(Comparator.reverseOrder());
            /*
            .sort modifica a lista original e ordena in-place
            .sorted cria uma stream ordenada sem modificar a lista original (Precisa de operação terminal (toList,
                forEach, etc.)
            */
            System.out.println("Aqui estão os números pares da lista em ordem decrescente: \n" + listaPar);

        }else{
            listaImpar.sort(Comparator.reverseOrder());
            System.out.println("Aqui estão os números pares da lista em ordem decrescente: \n" + listaImpar);
        }

    }
}