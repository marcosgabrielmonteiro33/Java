package exercicio2;

public class Desenvolvedor extends Funcionario{
	private String linguagem;
    private double bonusProjeto;
	public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagem, double bonusProjeto) {
		super(nome, cpf, salarioBase);
		this.linguagem = linguagem;
		this.bonusProjeto = bonusProjeto;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	@Override
	public double calcularSalario() {
		return super.calcularSalario()+bonusProjeto;
	}
	@Override
	public void exibirDados() {
	  super.exibirDados();
	  System.out.println("liguagem de programação:"+linguagem);
	}
	

}
