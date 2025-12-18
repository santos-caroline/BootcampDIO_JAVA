package aula3.desafioCodigo2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();


        switch (codigo){
            case "EC2" -> System.out.println("EC2");
            case "S3" -> System.out.println("S3");
            case "Lambda" -> System.out.println("Lambda");
            default -> System.out.println("Codigo invalido");
        }

    }
}