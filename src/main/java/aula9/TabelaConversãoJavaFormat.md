# Tabela de Conversão – Java `String.format()` / `printf`

## Conversões Básicas

| Conversão | Tipo esperado                     | Descrição                                   | Exemplo |
|----------|-----------------------------------|---------------------------------------------|---------|
| `%s`     | `String` / `Object`               | Texto (`toString()`)                        | `"Olá %s"` |
| `%d`     | `int`, `long`, `short`, `byte`    | Inteiro decimal                             | `"%d"` |
| `%f`     | `float`, `double`                 | Número decimal                              | `"%.2f"` |
| `%c`     | `char`                            | Caractere                                   | `"%c"` |
| `%b`     | `boolean`                         | Boolean (`true/false`)                     | `"%b"` |
| `%n`     | —                                 | Quebra de linha portátil                    | `"%n"` |
| `%%`     | —                                 | Imprime `%` literal                         | `"%%"` |

---

## Formatação Numérica

| Conversão | Descrição                              | Entrada | Saída |
|----------|------------------------------------------|---------|-------|
| `%.2f`   | 2 casas decimais                         | `3.14159` | `3.14` |
| `%6.2f`  | Largura 6, 2 decimais                    | `3.1` | `  3.10` |
| `%06d`   | Inteiro com zeros à esquerda             | `42` | `000042` |
| `%-6d`   | Alinhado à esquerda                      | `42` | `42    ` |

---

## Inteiros em Outras Bases

| Conversão | Descrição                   | Exemplo |
|----------|-----------------------------|---------|
| `%o`     | Octal                       | `8 → 10` |
| `%x`     | Hexadecimal (minúsculo)     | `255 → ff` |
| `%X`     | Hexadecimal (maiúsculo)     | `255 → FF` |

---

## Data e Hora

| Conversão | Descrição        |
|----------|------------------|
| `%tH`    | Hora (00–23)     |
| `%tM`    | Minutos          |
| `%tS`    | Segundos         |
| `%td`    | Dia do mês       |
| `%tm`    | Mês              |
| `%tY`    | Ano (4 dígitos)  |

---

## Exemplo Completo

```java
String nome = "Caroline";
int idade = 22;
double nota = 8.75;

System.out.printf(
    "Nome: %s | Idade: %d | Nota: %.1f%n", nome, idade, nota);

