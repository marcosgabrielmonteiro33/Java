package exercicio1;

public class AudioBook extends Livro {

	private double duracao ;
	private String narrador ;
	
	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getNarrador() {
		return narrador;
	}

	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}

	public AudioBook(String codigo, String titulo, String autor, double duracao, String narrador) {
		super(codigo, titulo, autor);
		this.duracao = duracao;
		this.narrador = narrador;
	} 
}
