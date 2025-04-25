package exercicio3;

public class ContaCorrente extends ContaBancaria {
	private double taxaManutencao;

	public ContaCorrente(String nome, String numConta, double saldoInicial, double taxaManutencao) {
		super(nome, numConta, saldoInicial);
		this.taxaManutencao=taxaManutencao;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	public void descontarTaxa () {
		if(getSaldo() >=taxaManutencao) {
			setSaldo(getSaldo()- taxaManutencao);
		}
		
	}
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("taxa manutencao:" + taxaManutencao);
	}
	@Override
	public String tipoConta() {
		return "Conta Corrente";
	}

}
