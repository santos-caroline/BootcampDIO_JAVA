package aula5HerancaPolimorfismo;

public class Main {
    static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        // pegar o nome da classe (+ package) == classe..getClass().getCanonicalName());
        // somente o nome da classe == classe.getClass().getSimpleName()
        System.out.printf("------------------------------------------ %s -------------------------------------" +
                "------------\n", employee.getClass().getSimpleName());

        /*
         instanceof -- verifica ser employee é uma isntância do tipo passado ou de uma superclasse
         cria a variável manager para uso local ao invés do cast inline

        if (employee instanceof Manager manager) {

        }
        */

        switch (employee) {
            case Manager manager -> {
                employee.setCode("001");
                employee.setName("Maria Flor");
                employee.setSalary(7300.15);
                manager.setLogin("florzinha ");
                manager.setPassword("12345 ");



                System.out.printf("Maneger informações: ID: %s  --- nome: %s --- salário: %s" +
                                " login: %s ---  senha padrão: %s\n" +
                                "salário total: %s",
                        employee.getCode(),
                        employee.getName(),
                        employee.getSalary(),
                        manager.getLogin(),
                        manager.getPassword(),
                        manager.getFullSalary(500));
            }
            case Salesman salesman -> {
                salesman.setCode("002");
                salesman.setName("Margarido");
                salesman.setSalary(2500.15);
                salesman.setPercentPerSold(15);
                salesman.setSoldAmount(1000.63);


            } //nesse caso não precisa de default pq temos uma classe selada que permite apenas manager e salesman
        }
        System.out.println(" salary: "+ employee.getFullSalary());


    }

}
