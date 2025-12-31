/*
🧩 Desafio Java POO – Produto com Record (Nível Intermediário)
🎯 Objetivo

Aplicar:
    encapsulamento real
    regras de negócio
    record como DTO

validações no construtor:
    separação entre domínio e representação de dados

📦 Parte 1 – Classe de Domínio Produto
    Atributos (privados)
        nome (String)
        preco (double)
        quantidade (int)

    Construtor - Crie um construtor público que:
        Receba nome e preco
    Valide:
        nome não pode ser nulo ou vazio
        preco deve ser maior que zero

Inicialize quantidade com 0

📌 Caso a validação falhe, lance IllegalArgumentException.

    Getters e Setters
        Getters para todos os atributos
        Setter somente para nome

Deve repetir a validação do construtor

🚫 Não permitir setters para preco e quantidade.

Métodos de Negócio
    Implemente:
        adicionarEstoque(int quantidade)
        quantidade > 0
        removerEstoque(int quantidade)
        quantidade > 0
        quantidade ≤ estoque atual

📌 Se inválido, lance exceção.

Método de Conversão
    Crie o método:
        public ProdutoDTO toDTO()

    Ele deve:
        Retornar um ProdutoDTO
        Expor apenas o estado atual do produto

🧾 Parte 2 – Record ProdutoDTO

Crie um record imutável:
    public record ProdutoDTO(String nome, double preco, int quantidade) {
}
    Validações no Record (Intermediário)
        Use o construtor compacto para validar:
        nome não pode ser nulo ou vazio
        preco > 0
        quantidade ≥ 0

📌 Caso inválido, lance IllegalArgumentException.

🧠 Parte 3 – Classe Main (Simulação)

No método main:
    Crie um Produto
    Adicione estoque
    Remova estoque
    Converta para ProdutoDTO
    Exiba os dados usando apenas o record

Exemplo esperado:

    Produto: Mouse
    Preço: 120.00
    Quantidade: 5

🧱 Organização Sugerida (Intermediário)
src
└── main
    └── java
        ├── domain
        │   └── Produto.java
        ├── dto
        │   └── ProdutoDTO.java
        └── Main.java



✅ Conceitos Trabalhados

✔ Encapsulamento forte
✔ Validações centralizadas
✔ Exceções
✔ Classe de domínio
✔ Record como DTO
✔ Imutabilidade
✔ Organização em camadas simples

⭐ Desafio Extra

Crie um método aplicarDesconto(double percentual)
    O desconto não pode deixar o preço negativo
    O preço não deve ter setter público
 */