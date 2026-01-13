# Interfaces X Classes Abstratas

| Característica                 | Interface                                                                 | Classe Abstrata                                                                 |
|--------------------------------|---------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| Herança múltipla               | Uma classe pode implementar várias interfaces                             | Uma classe pode herdar apenas uma classe                                        |
| Implementação padrão           | Não possui implementação tradicional; pode ter métodos `default` e `static` (Java 8+) | Pode conter código completo, código padrão ou métodos abstratos                |
| Construtores                   | Não possui construtores                                                   | Pode possuir construtores                                                       |
| Atributos                     | Apenas `public static final` (constantes)                                 | Pode possuir atributos de instância e estáticos                                 |
| Constantes                     | Somente constantes estáticas                                              | Pode conter constantes estáticas e de instância                                 |
| Modificadores de acesso        | Métodos são `public` por padrão                                           | Pode usar `public`, `protected` e `private`                                     |
| Componentes de terceiros       | Pode ser implementada por qualquer classe                                 | Classe de terceiros precisa ser reescrita para estender a classe abstrata       |
| Estado (dados)                 | Não mantém estado                                                         | Pode manter estado                                                              |
| Homogeneidade                  | Ideal quando várias implementações compartilham apenas a assinatura       | Ideal quando compartilham comportamento e estado comum                          |
| Manutenção                     | Facilita troca de implementações (ex.: Factory)                           | Idêntico                                                                        |
| Velocidade                     | Levemente mais lenta                                                      | Levemente mais rápida                                                           |
| Clareza                        | Constantes são implicitamente públicas, estáticas e finais                | Permite código compartilhado e lógica de inicialização                          |
| Funcionalidades adicionais     | Novo método exige ajuste nas implementações (exceto `default`)            | Novo método pode ter implementação padrão                                       |
| Uso recomendado                | Definir contratos e comportamento comum                                   | Compartilhar código e estado entre classes relacionadas                         |

