/*
🧩 Desafio Java POO – Cadastro de Produto
🎯 Objetivo
    Criar uma classe que represente um Produto, aplicando os conceitos básicos de Programação Orientada a Objetos (POO).

📋 Requisitos do Desafio
1️⃣ Classe Produto
    Crie uma classe chamada Produto com os seguintes atributos privados:
    nome (String)
    preco (double)
    quantidade (int)

👉 Todos devem ser private para garantir encapsulamento.

2️⃣ Construtor
    Crie um construtor público que receba:
    nome
    preco
    A quantidade deve iniciar com 0.

3️⃣ Getters e Setters
    Implemente:
        Getters para todos os atributos
        Setter apenas para o nome
.

4️⃣ Métodos de Negócio
    Implemente os métodos públicos:
        adicionarEstoque(int quantidade)
            Só adiciona se o valor for maior que zero

        removerEstoque(int quantidade)
            Só remove se a quantidade for maior que zero e menor ou igual ao estoque atual

5️⃣ Classe Main
    Crie uma classe Main que:
    Crie um produto
    Exiba seus dados
    Adicione itens ao estoque
    Remova itens do estoque
    Exiba o estado final do produto

🧠 Conceitos Trabalhados

✔ Classe
✔ Atributos privados
✔ Construtor
✔ Getter e Setter
✔ Controle de acesso
✔ Lógica simples de negócio

⭐ Desafio Extra (Opcional)
    Crie um método exibirProduto() que mostre algo como:

    Produto: Notebook
    Preço: R$ 3500.00
    Quantidade em estoque: 5
 */