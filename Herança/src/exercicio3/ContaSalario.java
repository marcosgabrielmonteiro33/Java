package exercicio3;

public class ContaSalario extends ContaBancaria {
	private String empresa;

	public ContaSalario(String nome, String numConta, double saldoInicial,String empresa) {
		super(nome, numConta, saldoInicial);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void receberSalario(double valor) {
		depositar(valor);	
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("empresa:" +empresa);
	}
	

}
