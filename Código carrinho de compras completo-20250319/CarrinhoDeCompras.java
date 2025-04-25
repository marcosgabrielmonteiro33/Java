package main;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	public ArrayList<Produto> listaProdutos = new ArrayList<Produto>(); 
	
	public void adicionar (Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto Adicionado!");
	}
	
	public void remover (int i) {
		Produto p = listaProdutos.remove(i); 
		System.out.println("O produto "+ p.nome + " foi removido!");
	}
	
	public void visualizar () {
		
		/*for (Produto produto : listaProdutos) {
			System.out.println("Nome: "+ produto.nome + " Preço" + produto.preco);
		}*/
		
		for (int i = 0 ; i < listaProdutos.size() ; i++) {
			Produto p = listaProdutos.get(i) ; 
			System.out.println("Indice = "+i+" Nome: "+ p.nome + " Preço" + p.preco);
		}
	}
}