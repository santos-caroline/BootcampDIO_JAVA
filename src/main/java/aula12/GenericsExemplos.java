package aula12;

import aula12.dao.ClientDAO;
import aula12.dao.GenericDAO;
import aula12.dao.UserDAO;
import aula12.domain.ClientDomain;
import aula12.domain.UserDomain;

public class GenericsExemplos {
    /*
    vc está declarando uma variável com o contrato genérico GenericDAO para UserDomain, mas instanciando uma
    implementação concreta UserDAO, usando polimorfismo
     */

    private static final GenericDAO<Integer, UserDomain> userDAO = new UserDAO(); //tipo GenericDAO<UserDomain>
    private static final GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();

    public static void main(String[] args){

        System.out.println("============ UserDAO ===========");
        System.out.println(userDAO.count());
        System.out.println(userDAO.save(
                new UserDomain(1,"Camila", 32),
                new UserDomain(2,"Consuelo", 20),
                new UserDomain(3,"Matilda", 56),
                new UserDomain(4,"Teresa", 80)));
        System.out.println(userDAO.count());
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.find(d -> d.getId().equals(1)));
        System.out.println(userDAO.find(d -> d.getId().equals(0)));
        System.out.println(userDAO.delete(new UserDomain(0, "", -1)));
        System.out.println(userDAO.delete(new UserDomain(1, "Camila", 32)));
        System.out.println(userDAO.count());
        System.out.println(userDAO.findAll());

        System.out.println("============ ClientDAO ===========");
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(new ClientDomain("a","Joana", " dev backend ")));
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.find(d -> d.getId().equals("a")));
        System.out.println(clientDAO.find(d -> d.getId().isEmpty()));
        System.out.println(clientDAO.delete(new ClientDomain("", "", "")));
        System.out.println(clientDAO.find(d -> d.getId().isEmpty()));
        System.out.println(clientDAO.delete(new ClientDomain("b","Marcela", " dev frontend ")));
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.findAll());
    }
}
