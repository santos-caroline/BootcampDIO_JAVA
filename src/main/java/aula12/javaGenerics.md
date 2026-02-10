# Java Generics
##### Tradução w3Schools 


- Genéricos permitem escrever classes, interfaces e métodos que funcionam com diferentes tipos de dados, sem ter que 
especificar o tipo exato com antecedência. Isso torna seu código mais flexível, reutilizável e seguro de tipo.

## Por que usar Generics?
- **Reusabilidade de código**: Escreva uma classe ou método que funcione com diferentes tipos de dados.
- **Segurança do tipo**: detecte erros de tipo em tempo de compilação em vez de tempo de execução.
- **Código mais limpo**: Não há necessidade de fundição ao recuperar objetos.

### Exemplo de Classe Generics: 
#### Você pode criar uma classe que funciona com diferentes tipos de dados usando genéricos:

````java
class Box<T> {
  T value; // T is a placeholder for any data type

  void set(T value) {
    this.value = value;
  }

  T get() {
    return value;
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a Box to hold a String
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println("Value: " + stringBox.get());

    // Create a Box to hold an Integer
    Box<Integer> intBox = new Box<>();
    intBox.set(50);
    System.out.println("Value: " + intBox.get());
  }
}
````
- T é um parâmetro de tipo genérico. É como um espaço reservado para um tipo de dados.
  - Quando você cria um Box<String>, T tornando-se String.
  - Quando você cria um Box<Integer>, T tornando-se Integer.
- Dessa forma, a mesma classe pode ser reutilizada com diferentes tipos de dados sem reescrever o código.

#### Você também pode criar métodos que funcionam com qualquer tipo de dados usando genéricos:

````java
public class Main {
  // Generic method: works with any type T
  public static <T> void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    // Array of Strings
    String[] names = {"Jenny", "Liam"};

    // Array of Integers
    Integer[] numbers = {1, 2, 3};

    // Call the generic method with both arrays
    printArray(names);
    printArray(numbers);
  }
}
````
- <T> é um parâmetro de tipo genérico - significa que o método pode funcionar com qualquer tipo: String, Integer, Double, etc.
- O método printArray() leva uma matriz de tipo T e imprime todos os elementos.
- Quando você chama o método, o Java descobre o que T deve ser baseado no argumento que você passa.
- Isso é útil quando você deseja escrever um método que funciona com vários tipos, em vez de repetir código para 
cada um.

#### Você pode usar o ``extends`` para limitar os tipos que uma classe ou método genérico pode aceitar.

````java
class Stats<T extends Number> {
  T[] nums;

  // Constructor
  Stats(T[] nums) {
    this.nums = nums;
  }

  // Calculate average
  double average() {
    double sum = 0;
    for (T num : nums) {
      sum += num.doubleValue();
    }
    return sum / nums.length;
  }
}

public class Main {
  public static void main(String[] args) {
    // Use with Integer
    Integer[] intNums = {10, 20, 30, 40};
    Stats<Integer> intStats = new Stats<>(intNums);
    System.out.println("Integer average: " + intStats.average());

    // Use with Double
    Double[] doubleNums = {1.5, 2.5, 3.5};
    Stats<Double> doubleStats = new Stats<>(doubleNums);
    System.out.println("Double average: " + doubleStats.average());
  }
}
````
- Mesmo que int valores são utilizados no primeiro caso, o ``.doubleValue()`` método converte-os para double, 
assim o resultado é mostrado com um ponto decimal.

    - ```<T extends Number>```: Restrições T para trabalhar apenas com tipos numéricos como Integer, Double, ou Float.
    - ```.doubleValue()```: Converte qualquer número para a double para cálculo.
    - Funciona para qualquer variedade de números, desde que os elementos sejam subclasses de Number.

### Resumo
- Genéricos tornam seu código flexível e seguro para tipos.
- Uso Tou outra carta para definir um espaço reservado de tipo.
- Genéricos podem ser aplicados a classes, métodos e interfaces.
- Use limites para limitar quais tipos são permitidos.


