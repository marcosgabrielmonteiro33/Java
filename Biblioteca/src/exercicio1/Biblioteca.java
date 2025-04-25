package exercicio1;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro> livros ;
	
	public Biblioteca () {
		this.livros = new ArrayList<Livro>();
	}
	
	public void cadastrarLivro (Livro l) {
		this.livros.add(l); 
	}
	
	public Livro removerLivro (String codigo) {
		for(int i = 0 ; i < this.livros.size(); i++) {
			Livro l = this.livros.get(i);
			
			if(l.getCodigo().equals(codigo)) {
				return this.livros.remove(i);
			}
		}
		return null ;
	}
}
