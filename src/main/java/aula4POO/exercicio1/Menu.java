package aula4POO.exercicio1;
/*
    Todos os exercícios devem ter um menu de interativo para chamar as funções e ter uma opção de sair para
    finalizar a execução
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /*
    1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
        Consultar saldo
        consultar cheque especial
        Depositar dinheiro;
        Sacar dinheiro;
        Pagar um boleto.
        Verificar se a conta está a usar cheque especial.
        Siga as seguintes regras para implementar

    >>> A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
    >>> O valor do cheque especial é definido no momento da criação da conta, conforme o valor depositado na conta na
     sua criação;
    >>> Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
    >>> Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
    >>> Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor
     usado do cheque especial.
     */


    public static void main(String[] args) {

        NovaConta conta = null;
        /*
        NovaConta conta = null;, declara uma variável chamada conta do tipo NovaConta e a inicializa com o valor null.
        Isso significa que, no momento da declaração, a variável não está associada a nenhuma instância de um objeto
        NovaConta. Essa abordagem é útil em cenários onde a variável precisa ser acessível em um escopo mais amplo,
        como dentro de um método ou bloco de código, mas sua inicialização depende de condições ou ações subsequentes.
        Por exemplo, no código atual, a variável conta é declarada fora do bloco switch, permitindo que ela seja
        acessada e modificada em diferentes casos do switch.
         */
        boolean executando = true;
        while (executando) {
            System.out.println("""
                    ******** Seja bem vindo ao Banco Exercício 1 ********
                    ************************ Menu ************************
                    
                    1. Criar conta;
                    2. Consultar saldo;
                    3. Depositar dinheiro;
                    4. Sacar dinheiro;
                    5. Pagar um boleto.
                    6. Condições para Cheque Especial.
                    7. Extrato das operações;
                    0. Sair
                    *****************************************************
                    Escolha o número da operação desejada:
                    """);

            Scanner sc = new Scanner(System.in);
            int opcaoMenu = sc.nextInt();
            sc.nextLine(); // limpa o Enter deixado pelo nextInt()

            try {
                switch (opcaoMenu) {
                    case 1 -> {
                        conta = OperacaoConta.CriarConta(sc);
                    }
                    case 2 -> {
                        OperacaoConta.ConsultarSaldo(conta);
                    }
                    case 3 -> {
                        OperacaoConta.DepositarDinheiro(conta, sc);
                    }
                    case 4 -> {
                        OperacaoConta.SacarDinheiro(conta, sc);
                    }
                    case 5 -> {
                        OperacaoConta.PagamentoBoleto(conta, sc);

                    }
                    case 6 -> {
                        OperacaoConta.ChequeEspecial(conta);
                    }
                    case 7 -> {
                        OperacaoConta.GerarExtrato(conta);

                    }
                    case 0 -> { //implementar try-catch para evitar NullPointerException
                        executando = false;
                    }
                    default -> System.out.println("Opção inválida. Por favor, tente novamente.");

                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar APENAS números. ");
                System.out.printf("Error: %s", e);

            }
        }

    }
}
