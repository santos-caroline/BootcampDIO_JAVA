package aula5HerancaPolimorfismo;

public sealed abstract class Employee permits Manager, Salesman{
    // abstract -- classe abstrata NÃO PODE SER INSTÂNCIADA
    // sealed - permits -- limita a extensão para algumas classes específicas (precisam ser final ou non-sealed)
    //protected --  o acesso é por pacote e por herança.
    protected String code;
    protected String name;
    protected String address;
    protected int age;
    protected double salary;

    public Employee(String code, String name, String address, int age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    protected Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }
    public abstract double getFullSalary(); //método abstrato -- NÃO tem corpo
}
