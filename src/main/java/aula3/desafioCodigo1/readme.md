# 🏆 Desafio DIO


## AWS Service Matcher: Identifique O Serviço Ideal Para Cada Demanda

Você foi contratado como **consultor júnior** em uma empresa de TI que está migrando seus sistemas para a nuvem usando **Java e AWS**.

Seu primeiro desafio é ajudar a equipe a identificar rapidamente qual **serviço AWS** deve ser utilizado para cada tipo de demanda recebida pelo suporte.

Para isso, você deve criar um programa que, ao receber uma **solicitação em texto simples**, indique qual serviço AWS é o mais adequado, conforme as regras abaixo:

- **EC2** → demandas de servidores virtuais  
- **S3** → armazenamento de arquivos  
- **RDS** → bancos de dados relacionais  
- **Lambda** → execuções de código sob demanda  

Caso a solicitação não se encaixe em nenhuma dessas categorias, o programa deve responder:

- **Servico desconhecido**

Sua solução será usada como base para **automatizar o atendimento inicial do suporte**, tornando o processo mais ágil e eficiente.

---

### Requisitos

- Ler uma **string** representando a solicitação do cliente  
- Imprimir o **nome do serviço AWS correspondente**  
- Utilizar apenas **estruturas básicas de controle**  
- Não utilizar **bibliotecas externas**

---

### Entrada

Uma única string representando a solicitação do cliente.

---

### Saída

Uma única string indicando o serviço AWS correspondente:

- `EC2`
- `S3`
- `RDS`
- `Lambda`
- `Servico desconhecido`

---

### Exemplos

| Entrada                                         | Saída                |
|-----------------------------------------------|----------------------|
| Preciso de um servidor para rodar aplicacoes  | EC2                  |
| Quero armazenar imagens e videos              | S3                   |
| Necessito de um banco de dados relacional     | RDS                  |
| Preciso executar funcoes sem servidor         | Lambda               |
| Solicito um servico de inteligencia artificial| Servico desconhecido |
