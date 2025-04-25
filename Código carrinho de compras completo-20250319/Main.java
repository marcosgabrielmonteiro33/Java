package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(); 
		
		while (true) {
		
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adicionar Produto");
			System.out.println("2 - Visualizar Produto");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			
			int opcao = Integer.parseInt(entrada.nextLine());
			
			switch (opcao) {
			case 1: {
			
				System.out.println("Nome do produto:");
				String nomeProduto = entrada.nextLine();
				System.out.println("Preço do produto:");
				float precoProduto = Float.parseFloat(entrada.nextLine());
				Produto p = new Produto(); 
				p.nome = nomeProduto ; 
				p.preco = precoProduto ;
				carrinho.adicionar(p);
				break; 

			}
			
			case 2: {
				carrinho.visualizar();
				break; 
			}
			
			case 3 : {
				
				carrinho.visualizar();
				System.out.println("Qual indice do produto ? ");
				int i = Integer.parseInt(entrada.nextLine());
				carrinho.remover(i);
				break;
			}
			
			case 4 : {
				return ;
			}
			
			default:
				System.out.println("Opção Inválida!!");
			}
		}
	}
}