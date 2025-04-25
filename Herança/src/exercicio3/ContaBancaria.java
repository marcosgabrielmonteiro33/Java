package exercicio3;

public class ContaBancaria {
	private String nome;
	private String numConta;
	private double saldo;
	
	
	public ContaBancaria(String nome, String numConta, double saldoInicial) {
		this.nome = nome;
		this.saldo = saldoInicial;
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public void depositar(double valor) {
		if(valor>0) {
			saldo+=valor;
		}
	}
	 public boolean sacar(double valor) {
	        if (valor > 0 && saldo >= valor) {
	            saldo -= valor;
	            return true;
	        }
	        return false;
	    }


	public void exibirDados() {
	    System.out.println("nome do titular: " + nome);
	    System.out.println("numero da conta: " + numConta);
	    System.out.println("saldo: " + saldo);
	}


}
