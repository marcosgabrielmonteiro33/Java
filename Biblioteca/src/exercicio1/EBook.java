package exercicio1;

public class EBook extends Livro {
	private int numPaginas ; 
	private String link ; 
	
	public EBook(String codigo, String titulo, String autor, int numPaginas, String link) {
		super(codigo, titulo, autor);
		this.numPaginas = numPaginas;
		this.link = link;
	}
}
