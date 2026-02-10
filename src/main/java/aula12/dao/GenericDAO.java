package aula12.dao;

import aula12.domain.GenericDomain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/*
DAO - Data Access Object
    É um padrão de projeto usado para separar a lógica de acesso a dados da lógica de negócio.
    Ele encapsula todas as operações de persistência (consultas, inserções, atualizações, exclusões) em um objeto
    dedicado.
    Assim, o código que usa os dados não precisa saber como eles são armazenados (em banco de dados, arquivo,
    API, etc.), apenas chama os métodos do DAO.

    Um DAO costuma ter:
        Interface → define os métodos (ex.: findById, save, delete).
        Implementação → contém o código que realmente acessa o banco de dados (SQL, JDBC, JPA).
        Entidade/Modelo → representa os dados (ex.: classe, User).
 */
public abstract class GenericDAO<ID, T extends GenericDomain<ID>> {

    //T é o tipo das entidades que o DAO manipula.
    //GenericDAO<T> define regras sobre o tipo manipulável, não sobre a classe DAO.

    private final List<T> db = new ArrayList<>();

    private T save(T domain){ //recebe objeto domain do tipo genérico T
        db.add(domain);
        return domain;
    }

    public boolean save(T... domains){ //var args
        return db.addAll(Arrays.stream(domains).toList()); //cria um array de usuários
    }


    public T update(ID id, T domain){
        var stored = find(d -> d.getId().equals(id)).orElseThrow(); //procurar id no db ou jogar exceção
        db.remove(stored); //Remove o objeto encontrado (stored) da coleção db
        return save(domain);
    }

    public boolean delete(T domain){
            return db.remove(domain);
    }

    public Optional<T> find(Predicate<T> filterCallBack){
        //Recebe um Predicate<T> (uma função que testa um elemento do tipo T).
        return db.stream().filter(filterCallBack).findFirst();
    }

    public List<T> findAll(){
        return db;
    }

    public int count(){
        return db.size();
    }
}
