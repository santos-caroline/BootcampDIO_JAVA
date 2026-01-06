package aula5HerancaPolimorfismo;

public sealed abstract class Employee permits Manager, Salesman{
    // abstract -- classe abstrata NÃO PODE SER INSTÂNCIADA
    // sealed - permits -- limita a extensão para algumas classes específicas (precisam ser final ou non-sealed)

    private String code;
    private String name;
    private String address;
    private int age;
    private double salary;


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
}
