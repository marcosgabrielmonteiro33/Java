package exercicio1;

public class LivroFisico extends Livro {

	private int numPaginas ;
	private int numEstante ;
	
	
	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public int getNumEstante() {
		return numEstante;
	}


	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}


	public LivroFisico(String codigo, String titulo, String autor, int numPaginas, int numEstante) {
		super(codigo, titulo, autor);
		this.numPaginas = numPaginas;
		this.numEstante = numEstante;
	} 
}
