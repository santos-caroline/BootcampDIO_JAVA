package aula4POO.exercicio3;

import java.util.Scanner;
// possui erros de mensagem ao usuário;
//refinar lógica do abastecimento de água

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("""
                    Escolha uma das opções:
                    1 - Dar banho no pet
                    2 - Abastecer a máquina com água
                    3 - Abastecer a máquina com shampoo
                    4 - Verificar água da máquina
                    5 - Verificar shampoo da máquina
                    6 - Verificar se há pet no banho
                    7 - Colocar pet na máquina
                    8 - Retirar pet da máquina
                    9 - Limpar máquina
                    0 - Sair
                    """);

            option = sc.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina!");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina!");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        System.out.printf("A máquina tem %d litros de água.%n", petMachine.getWater());
    }

    private static void verifyShampoo() {
        System.out.printf("A máquina tem %d litros de shampoo.%n", petMachine.getShampoo());
    }

    private static boolean checkIfHasPetInMachine() {
        boolean hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
        return hasPet;
    }

    private static void setPetInMachine() {
        String nome = "";

        while (nome.isBlank()) {
            System.out.println("Informe o nome do pet:");
            nome = sc.nextLine();
        }

        Pet pet = new Pet(nome);
        petMachine.setPet(pet);

    }
}
