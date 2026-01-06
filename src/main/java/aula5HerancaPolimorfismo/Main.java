package aula5HerancaPolimorfismo;

public class Main {
    static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());

    }


    public static void printEmployee(Employee employee) {

        // pegar o nome da classe (+ package)
        System.out.printf("------- %s -------\n", employee.getClass().getCanonicalName());

        // verifica ser employee é uma isntância de Manager
        //cria a variável manager para uso local ao invés do cast inline
        if(employee instanceof Manager manager){
        employee.setName("Maria Flor");
        manager.setLogin("login florzinha ");
        manager.setPassword("password: senha ");

        System.out.printf("Maneger inf: %s  --- %s --- %s \n",
                employee.getName(),
                manager.getLogin(),
                manager.getPassword());
        }
    }
}

//11:12