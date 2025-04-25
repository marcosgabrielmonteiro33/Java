package listaOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LojaConveniencia loja = new LojaConveniencia();
        Scanner scanner = new Scanner(System.in);

        loja.adicionarProduto(new Produto("Bala", 1.5, 100));
        loja.adicionarProduto(new Produto("Refrigerante", 5.0, 50));
        loja.adicionarProduto(new Produto("Chocolate", 3.0, 30));

        boolean rodando = true;
        while (rodando) {
            System.out.println("1. Consultar produto");
            System.out.println("2. Vender produto");
            System.out.println("3. Alterar preço do produto");
            System.out.println("4. Exibir relatório");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o código do produto: ");
                    int codigo = scanner.nextInt();
                    Produto produto = loja.consultarProduto(codigo);
                    System.out.println(produto != null ? produto : "Produto não encontrado.");
                }
                case 2 -> {
                    System.out.print("Informe o código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Quantidade a vender: ");
                    int quantidadeVendida = scanner.nextInt();
                    if (loja.venderProduto(codigo, quantidadeVendida)) {
                        System.out.println("Venda realizada com sucesso!");
                    } else {
                        System.out.println("Estoque insuficiente ou produto não encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Informe o código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();
                    if (loja.alterarPreco(codigo, novoPreco)) {
                        System.out.println("Preço atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.println("Relatório de produtos:");
                    for (int i = 0; i < loja.obterRelatorio().size(); i++) {
                        System.out.println("Código: " + i + " - " + loja.obterRelatorio().get(i));
                    }
                }
                case 5 -> rodando = false;
                default -> System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}