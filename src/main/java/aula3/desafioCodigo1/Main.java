package desafiocodigo.desafioCodigo1;
import java.util.Scanner;

public class Main {
    // resolução sem os códigos teste

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();

        String texto = solicitacao.toLowerCase();

        if(solicitacao.contains("servidor para rodar")) System.out.println("EC2");
        else if (solicitacao.contains("armazenar")) System.out.println("S3");
        else if (solicitacao.contains("banco de dados")) System.out.println("RDS");
        else if (solicitacao.contains("sem servidor")) System.out.println("Lambda");
        else System.out.println("Servico desconhecido");
    }
}