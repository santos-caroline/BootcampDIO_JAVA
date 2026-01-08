package aula5HerancaPolimorfismo;

public non-sealed class Manager extends Employee {    // final não permite extensões
    private String login;
    private String password;
    private double commission;

    public Manager(String code, String name, String address, int age, double salary) {
        super(code, name, address, age, salary);

    }

    @Override //sobrescrever comportamento
    public String getCode(){
        String baseCode = super.getCode(); //mantém dados da implementação antiga
        return "MN"+ baseCode;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.commission;
    }

    public double getFullSalary(double extra){ //sobrecarga de método
        return this.getFullSalary() + extra;
    }

    public Manager() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
