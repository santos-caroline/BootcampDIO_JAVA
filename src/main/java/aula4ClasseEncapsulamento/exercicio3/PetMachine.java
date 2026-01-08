package aula4ClasseEncapsulamento.exercicio3;

public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;


    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho! ");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.printf("O pet %s limpo. ", pet.getNome());
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade de água no máximo. ");
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade de shampoo no máximo. ");
            return;
        }

        water += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("Máquina de pet suja, precisa limpara para o proximo banho! ");
            return;

        }
        if (hasPet()) {
            System.out.printf("O pet %s está na máquina nesse momento. ", this.pet.getNome());
            return;
        }

        this.pet = pet;
        System.out.printf("O pet %s foi colocado na máquina.%n", pet.getNome());
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.printf("O pet %s foi retirado da máquina. ", this.pet.getNome());
        this.pet = null;

    }
    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
