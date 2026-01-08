package aula4ClasseEncapsulamento.exercicio1;

import java.util.Scanner;

public class OperacaoConta {

    //método static para poder ser chamado no main sem precisar instanciar a classe
    public static NovaConta CriarConta(Scanner sc) {
        /*
        public → pode ser chamado pelo menu
        static → não precisa instanciar OperacaoConta
        NovaConta → o método devolve a conta criada (tipo de retorno "parecido com void")
        CriarConta → nome do método
        (Scanner sc) → recebe dados do usuário

        "Se um método cria algo que será usado depois → ele retorna esse algo."
        */

        System.out.println("Digite seu nome completo: ");
        String nome = sc.next();

        System.out.println("Digite seu o número do CPF (exemplo: 000.000.000-00) ");
        String cpf = sc.next();

        System.out.println("Deseja realizar um déposito inicial? (S/N) ");
        String depositoInicial = sc.next();

        NovaConta conta = new NovaConta(nome, cpf, 0.0);

        if (depositoInicial.equalsIgnoreCase("s")) {
            System.out.println("Qual o valor do déposito? ");
            conta.setSaldo(sc.nextDouble());
            conta.setStatusChequeEspecial(true);
        }
        if ((conta.getSaldo() <= 500.00) && (conta.getStatusChequeEspecial())) {
            conta.setSaldoChequeEspecial(50.00);
        } else {
            Double calcChequeEspecial = ((conta.getSaldo() * 5) / 10); //calc de 50% do valor depositado
            conta.setSaldoChequeEspecial(calcChequeEspecial);
        }

        return conta;
    }

    public static void ConsultarSaldo(NovaConta conta) {

        try {
            Double saldoTotal = (conta.getSaldo() + conta.getSaldoChequeEspecial());
            conta.getSaldo();
            System.out.printf("""
                    ********** Consulta do Saldo **********
                    Saldo da conta: R$ %.2f
                    Saldo do cheque especial: R$ %.2f
                    Saldo total disponível: R$ %.2f
                    ***************************************%n
                    """, conta.getSaldo(), conta.getSaldoChequeEspecial(), saldoTotal);
        } catch (NullPointerException e) {
            System.out.println("Por favor, crie uma conta primeiro.");
            System.out.println("Error :" + e.getMessage() + "\n");

        }

    }

    public static void DepositarDinheiro(NovaConta conta, Scanner sc) {

    }

    public static void SacarDinheiro(NovaConta conta, Scanner sc) {

    }

    public static void PagamentoBoleto(NovaConta conta, Scanner sc) {
        try {
            System.out.println("Insira o código do boleto: ");
            int codBoleto = Integer.parseInt(sc.nextLine()); //converte String em int
            System.out.println("Qual o valor do boleto? ");
            int valorBoleto = Integer.parseInt(sc.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Certifique-se de digitar APENAS números.");
            System.out.println("Error: " + e.getMessage() + "\n");
        }
    }

    public static void ChequeEspecial(NovaConta conta) {
        Double taxaChequeEsp = ((conta.getSaldoChequeEspecial()*2)/10); //calc de 20% do valor do cheque especial
        System.out.printf("""
                **** Limite de cheque especial liberado ****
                
                Saldo do cheque especial: R$ %.2f
                Taxa de adesão: valor único de %.2f
                
                Consulte o atendimento do banco para maiores informações.
                ***************************************%n
                """, conta.getSaldoChequeEspecial(), taxaChequeEsp);
    }

    public static void GerarExtrato(NovaConta conta) {

    }

}

