package aula5HerancaPolimorfismo;

public non-sealed class Salesman extends Employee {   // final não permite extensões

    private double percentPerSold;
    private double soldAmount;

    public Salesman(String code, String name, String address, int age, double salary, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        String baseCode = super.getCode(); //mantém dados da implementação antiga
        return "MN"+ baseCode;
    }

    @Override
    public double getFullSalary(){
        return this.salary + ((soldAmount * percentPerSold)/100);
    }
    public Salesman() {

    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
