package aula4POO.exercicio3;

public class Pet {
    private final String nome;

    private boolean clean;

    public Pet(String nome) {
        this.nome = nome;
        this.clean = false;

    }
    //não tem setNome pq o atibuto é privado
    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
