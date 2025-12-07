/*
Desafio de Código Java: Calculadora de IMC (Índice de Massa Corporal)
Seu desafio é criar um programa Java que realize o cálculo do Índice de Massa Corporal (IMC) de
um usuário e exiba o resultado, aplicando os conceitos da sua primeira semana de estudos.

Requisitos
 1. Declaração de Variáveis e Tipos de Dados:
   * Crie uma variável para armazenar o nome do usuário (use String).
   * Crie variáveis para armazenar a altura (em metros) e o peso (em quilogramas) do usuário. Use
   um tipo de dado que suporte decimais, como double ou float.

 2. Operação Matemática:
   * Calcule o IMC utilizando a fórmula:

   IMC = (peso/altura^2)

   * Lembre-se de que a potência Altura^2 pode ser calculada como altura * altura.
 3. Conversão de Tipos (Casting):
   * Após calcular o IMC (que será um double/float), crie uma nova variável do tipo int.
   * Atribua a essa variável o valor do IMC, realizando a conversão explícita (casting) para int,
   o que irá truncar (remover) as casas decimais.

 4. Strings e Métodos:
   * Utilize um método da classe String, como o toUpperCase(), para formatar o nome do usuário,
   garantindo que ele seja exibido em letras maiúsculas na saída.

 5. Saída (Output) e Sintaxe Básica:
   * O programa deve imprimir uma única mensagem formatada na tela, contendo:
     * O nome do usuário em letras maiúsculas.
     * O valor do IMC com casas decimais (o valor original do cálculo).
     * O valor do IMC convertido para int (a parte inteira).


   > Exemplo de Saída:
   >
   > O IMC calculado para JOÃO é de 26.3265306122449. O valor truncado é 26.
   >
   >

Dicas para a Implementação
 * Valores de Teste: Defina valores fixos no início do seu código para testar, por exemplo:
   * String nome = "João";
   * double altura = 1.75;
   * double peso = 80.5;
 * Sintaxe: Certifique-se de que todo o seu código esteja corretamente estruturado dentro de uma
 classe e do método main.
*/