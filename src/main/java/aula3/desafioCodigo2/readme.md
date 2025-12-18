# 🏆 Desafio DIO
## Identificação De Serviços AWS Por Código Em Java

Você foi contratado como **consultor de TI** por uma startup que está migrando seus sistemas para a nuvem utilizando **Java** e **AWS**. Durante essa transição, a equipe precisa de uma ferramenta simples para identificar rapidamente o **serviço AWS** a partir de um **código de operação** enviado por outros times.

Cada código de operação é uma **string** que pode indicar um serviço como **EC2**, **S3** ou **Lambda**, mas também pode conter erros de digitação. Sua tarefa é criar um programa que, ao receber o código de operação, identifique corretamente o serviço AWS correspondente ou informe que o código é inválido.

O sucesso da migração depende da precisão dessa identificação, pois comandos incorretos podem causar **atrasos** e **custos extras**. Utilize apenas **estruturas de controle básicas** para garantir que somente códigos corretos sejam aceitos, ajudando a equipe a manter a **eficiência** e a **segurança** durante a consultoria.

---

### Requisitos

Implemente um programa que:

- Leia uma **string** representando o código de operação.
- Imprima o nome do serviço AWS correspondente:
  - `"EC2"`
  - `"S3"`
  - `"Lambda"`
- Caso o código não corresponda **exatamente** a nenhum dos valores acima, imprima:
  - `"Codigo invalido"`

### Restrições

- Utilize **apenas** estruturas de controle básicas:
  - `if`
  - `else if`
  - `else`
- **Não** utilize bibliotecas externas.

---

### Entrada

Uma única string representando o código de operação enviado pela equipe.

---

### Saída

Uma única string:

- `"EC2"`
- `"S3"`
- `"Lambda"`
- `"Codigo invalido"`

De acordo com o código de operação informado.

---

### Exemplos

| Entrada  | Saída            |
|--------|------------------|
| EC2    | EC2              |
| S3     | S3               |
| Lambda | Lambda           |
| ec2    | Codigo invalido  |
