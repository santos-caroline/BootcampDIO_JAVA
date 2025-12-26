package desafiosLivresIA;

import java.util.*;

public class analiseVenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> vendedores;
        List<Double> totalVendas = new ArrayList<>();

        System.out.println("Digite o nome dos vendedores separado por vírgula: ");
        String nomeVendedor = sc.nextLine();

        vendedores = new ArrayList<>(Arrays.asList(nomeVendedor
                .strip()
                .split("[,\\s]+"))); //separando por vírgula e/ou espaço

        /*
        .split() retorna um Array fixo (String[])
         Arrays.asList() cria uma "ponte" de leitura, mas ainda com tamanho fixo.
        'new ArrayList<>()' cria uma cópia real e DINÂMICA na memória
        .removeIf() remove elementos da lista que satisfaçam a condição dada
        .equalsIgnoreCase() compara Strings ignorando maiúsculas/minúsculas
        */

        System.out.println("Digite o valor total de vendas para cada vendedor, seguindo a ordem inicial dos nomes: ");
        String inputVendas = sc.nextLine();
        String[] vendasRealizadas = inputVendas.strip()
                .split("[,\\s]+");

        for (String venda : vendasRealizadas) {
            totalVendas.add(Double.parseDouble(venda)); //convertendo String para Double
        }

        Map<String, Double> vendedorEVenda = new HashMap<>();
        for (int i = 0; i < vendedores.size(); i++) {
            String nome = vendedores.get(i);
            Double venda = totalVendas.get(i);
            vendedorEVenda.put(nome.toLowerCase(), venda);
        }
        vendedorEVenda.remove("admin");

        Double somaVendas = vendedorEVenda.values().stream().mapToDouble(j -> j).sum();
        Double mediaVendas = somaVendas / vendedorEVenda.size();

        System.out.printf("************* Relatório de Vendas *************\n" +
                "Média do Mês: %.2f %n" +
                "*********** Relatório de Performance ***********\n", mediaVendas);

        for (Map.Entry<String, Double> venda : vendedorEVenda.entrySet()) {
            String status;
            double valor = venda.getValue();

            if (valor > mediaVendas) {
                status = "Acima da Média";
            } else if (valor < mediaVendas) {
                status = "Abaixo da Média";
            } else {
                status = "Na Média";
            }

            /*
            substring(início, fim) extrai uma parte da String.
            substring(0,1) → primeira letra
            toUpperCase() → letra maiúscula
             */

            String nomeFormatado = venda.getKey().substring(0, 1).toUpperCase() + venda.getKey().substring(1);
            System.out.printf("%s: %.2f (%s)%n", nomeFormatado, valor, status);
        }
    }
}

