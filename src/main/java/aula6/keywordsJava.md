#Algumas keywords em java:

## 1. Método default (em interfaces)

- Desde o Java 8, interfaces podem ter métodos com implementação usando default.
- Para quê serve?
- Antes se você adicionasse um novo método a uma interface, todas as classes que a implementam quebrariam.

````
interface Pagamento {
    void pagar();
    void cancelar(); // java vai reclamar
}
````
- Com default:
````
interface Pagamento {
    void pagar();

    default void cancelar() { //As classes podem usar o comportamento padrão ou sobrescrever. 
        System.out.println("Pagamento cancelado");
    }
}
````
## Método Abstrato vs Método Default (Interface Java)

| Característica            | Método Abstrato           | Método Default                     |
|---------------------------|---------------------------|------------------------------------|
| Possui corpo              | ❌ Não tem corpo           | ✅ Tem implementação                |
| Obrigatoriedade           | ✅ Obriga a implementar    | ❌ Implementação opcional           |
| Papel principal           | Define um contrato        | Define um comportamento padrão     |
| Palavra-chave             | `abstract` (implícita)    | `default`                           |
| Onde pode existir         | Interface ou classe abstrata | Apenas em interfaces             |
| Sobrescrita pela classe   | Obrigatória               | Opcional                            |


- Se uma classe implementar duas interfaces com o mesmo método default, ocorre conflito.

````
interface A {
    default void executar() {
        System.out.println("A");
    }
}

interface B {
    default void executar() {
        System.out.println("B");
    }
}

class Teste implements A, B {
    // ERRO se não sobrescrever
}
````

- Solução:
````
class Teste implements A, B {
    @Override
    public void executar() {
        A.super.executar(); // ou B.super.executar()
    }
}
````


## 2. Modificadores de acesso: protected e private

### 🔒 private
- Acessível somente dentro da **própria classe**
- Usado para encapsulamento -- impede acesso direto aos atributos
- Onde usar? atributos, métodos, construtores e classes internas (nested)
- **private NÃO é herdado**

````
class Pessoa {
    private String nome;

    private void validar() {
        // só acessível aqui
    }
}

````
### 🛡️ protected
- Acessível:

- Na mesma classe
- No mesmo pacote
- Em subclasses (classe filha), mesmo em pacotes diferentes

````
package animais;

public class Animal {
    protected void emitirSom() {
        System.out.println("Som do animal");
    }
}

````

````
package pets;

import animais.Animal;

public class Cachorro extends Animal {
    void latir() {
        emitirSom(); // permitido por herança
    }
}

````

- protected NÃO é “quase public”
  - Fora do pacote: Só é acessível por herança e ***Não por referência direta***

## 3. private em método e classe
- ❌ Classe private -- Classes de topo (top-level) não podem ser private
    - Só é permitido em classes internas (nested classes).
  

- Método private
  - Usado para lógica interna
  - Não pode ser sobrescrito


## 4. Static e Final
### Static
- static --  **pertence à classe**
- non-static -- **pertence ao objeto** (instância)
- Existe uma ***única cópia na memória***, compartilhada por todos os objetos da classe.


1.  variável static -- Compartilhada por todos os objetos. (Uso comum: contadores, constantes globais, configurações.)
- Devem ser **acessadas pelo nome da classe**, não pelo objeto


- 🧩 static + final (**constantes**)
- **final em propriedades e atributos**
  - final em variável -- Não pode ser alterada após a atribuição
  - final em atributo -- Deve ser inicializado (na declaração ou no construtor)  ````final String email;````
  ````this.email = email;````
 

````
class Contador {
    static int total = 0;

    Contador() {
        total++;
    }
}

-------------
new Contador();
new Contador();
System.out.println(Contador.total); // 2

````


2. Método static -- Pode ser **chamado sem criar objeto** e Não acessa membros de instância diretamente
- ❌ Não usam this
- ❌ Não acessam atributos não estáticos diretamente


## 5. Classe Nested (Classe Aninhada)
- Uma classe nested é uma classe declarada dentro de outra classe.
- 1️⃣ Inner Class (classe interna não estática)
  - Não é estática
  - Precisa de uma instância da classe externa
  - Pode acessar todos os atributos e métodos, inclusive private

````
class Externa {
    private int valor = 10;

    class Interna {
        void mostrar() {
            System.out.println(valor);
        }
    }
}

---------- instânciando--------
Externa externa = new Externa();
Externa.Interna interna = externa.new Interna();

````

- 2️⃣ Static Nested Class (classe aninhada estática)
- Declarada com static
- Não precisa de instância da classe externa
- Só acessa membros estáticos da classe externa

````
class Externa {
    static int numero = 5;

    static class InternaEstatica {
        void mostrar() {
            System.out.println(numero); //acessa somento o obj estático
        }
    }
}

---------- instânciando--------
Externa.InternaEstatica obj = new Externa.InternaEstatica();

````
- 3️⃣ Local Class (classe local) -- a classe só é útil dentro de um método específico. 
- - ❌ Não é muito usada
- Declarada dentro de um método
- Só existe naquele método
- Pode acessar variáveis final ou efetivamente final

````
class Externa {
    void metodo() {
        class ClasseLocal {
            void msg() {
                System.out.println("Classe local");
            }
        }
        ClasseLocal obj = new ClasseLocal();
        obj.msg();
    }
}
````

- 4️⃣ Anonymous Class (classe anônima) -- normalmente substituída por **lambda**
- Não tem nome
- Criada e usada na hora
- Muito usada com **interfaces e classes abstratas**

## 6. Interface Funcional (Java)
- É uma interface que possui **apenas um método abstrato**, sendo a base para o uso de expressões lambda.
- Ela **define um único comportamento a ser implementado**.
  - em 1 único método abstrato
  - Pode ter métodos default e static
  - Geralmente anotada com ```@FunctionalInterface```
  - Muito usada em programação funcional (Streams, lambdas)

````
@FunctionalInterface
interface Calculo {
    int calcular(int a, int b);
}

````
