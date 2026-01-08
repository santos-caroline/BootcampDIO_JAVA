package aula4ClasseEncapsulamento.exercicio1;

public class NovaConta {
    //atributos:
    private String nome;
    private String cpf;
    private Double saldo = 0.0;
    private Boolean statusChequeEspecial = false; //false == não usar o cheque especial
    private Double saldoChequeEspecial;

    //construtor:
    public NovaConta(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    //getters e setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public Boolean getStatusChequeEspecial() {
        return statusChequeEspecial;
    }

    public void setStatusChequeEspecial(Boolean statusChequeEspecial) {
        this.statusChequeEspecial = statusChequeEspecial;
    }

    public Double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(Double saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    @Override
    public String toString() {
        return ("""
                Usuário: %s %n
                CPF: %s %n
                %n
                Saldo atual: R$ %.2f %n
                Saldo do cheque especial:
                """).formatted(nome, cpf, saldo);

    }
}