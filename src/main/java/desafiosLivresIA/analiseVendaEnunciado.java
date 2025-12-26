/*
🚀 O Desafio: Analisador de Vendedores
Você deve criar um programa que receba o nome de 5 vendedores e o total de vendas de cada um no mês.
O programa deve calcular a média de vendas e classificar cada vendedor com base em uma meta pré-estabelecida.

Requisitos:
    Arrays: Use um array de String para os nomes e um array de double para as vendas.
    Operações Matemáticas: Calcule a média aritmética de todas as vendas.
    Condicionais:
        Se a venda for acima da média: "Acima da Média".
        Se for abaixo: "Abaixo da Média".
    Strings: Se o nome do vendedor for "Admin", ele deve ser ignorado no relatório final (simulando um filtro).

Entrada Esperada (Exemplo):
    Imagine que o usuário digite os seguintes dados:
        Vendedores: Ana, Bruno, Admin, Carla, David, AdMIn,ADMIN
        Vendas: 2000, 1500, 5000, 3000, 1200, 5000, 7000

Saída Esperada:

    --- Relatório de Vendas ---
    Média do Mês: 2540.0
    --- Relatório de Performance ---
    Ana: 2000.0 (Abaixo da Média)
    Bruno: 1500.0 (Abaixo da Média)
    Carla: 3000.0 (Acima da Média)in
    David: 1200.0 (Abaixo da Média)
    --------------------------------

(Note que o "Admin" não apareceu no relatório)
*/