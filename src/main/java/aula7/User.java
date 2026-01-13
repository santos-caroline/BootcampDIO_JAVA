package aula7;

import java.util.Objects;

public class User {

    private int code;
    private String name;

    public int getCode() {

        return code;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    //construtor
    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public User() {
    }

    //quando não usamos .equals, o java faz a comparação  do endereço de memória do objeto >>> se for == true
    @Override
    public boolean equals(final Object obj){ //precisamos criar verificação do objeto
        var isEqual = false;
        if(obj instanceof User user){
            if(this == user) isEqual = true; //já que é o msm endereço de memória
            if(this.code == user.code && Objects.equals(this.name, user.name)) isEqual = true; //verificando se é o msm code e nome
        }
        return isEqual;


    }
    @Override
    public String toString(){
        return String.format("{ 'code': %s, 'name': %s}", this.code, this.name);
    }

        }
