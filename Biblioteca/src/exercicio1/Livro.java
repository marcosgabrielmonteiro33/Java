package exercicio1;

public class Livro {
	
	private String codigo ; 
	private String titulo; 
	private String autor ;
	
	public Livro (String codigo, String titulo, String autor) {
		this.codigo = codigo ; 
		this.titulo = titulo;
		this.autor = autor ; 
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo () {
		return this.codigo ; 
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo ; 
	}
}