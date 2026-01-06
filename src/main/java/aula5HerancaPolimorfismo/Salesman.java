package aula5HerancaPolimorfismo;

public non-sealed class Salesman extends Employee{   // final não permite extensões

    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
