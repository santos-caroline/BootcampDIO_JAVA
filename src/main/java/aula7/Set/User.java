package aula7.Set;

import java.util.Objects;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class User implements Comparable<User> {

    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{ id: %s, name: %s}", id, name);
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((isNull(obj)) || (!(obj instanceof User user))) return false;
        return this.id == user.getId() && Objects.equals(user.getName(), this.name);
    }

    @Override
    public int hashCode(){ //gera um hash a partir dos atributos
        return hash(this.id, this.name);
    }

    @Override
    public int compareTo(User that) {
        //organiza os elementos da TreeSet
        //usando as regras do método -- segundo a documentação java
        var compareResult =0;
        if(this.id < that.id) compareResult --;
        if(this.id > that.id) compareResult ++;
        return compareResult;
    }
}
