package exercicio3;

public class ContaPoupanca extends ContaBancaria {
	private double taxaRendimento;

	public ContaPoupanca(String nome, String numConta, double saldoInicial,double taxaRendimento) {
		super(nome, numConta, saldoInicial);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	public void aplicarRendimento() {
		double rendimento = getSaldo()*taxaRendimento/100;
		depositar(rendimento);
	}
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("a taxa de rendimento e de:"+taxaRendimento);
	}
	
	@Override
	public String tipoConta() {
		return "Cota Poupança";
	}

}
