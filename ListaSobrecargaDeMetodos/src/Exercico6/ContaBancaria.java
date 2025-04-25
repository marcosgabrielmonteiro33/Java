package Exercico6;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private String tipoConta;
	private double saldo;
	
    
	public ContaBancaria (int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.tipoConta = "corrente";
		this.saldo = 0.0;
	}
	
	public ContaBancaria (int numeroConta, String titular, String tipoConta) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.tipoConta = tipoConta;
		this.saldo = 0.0;
	}
	public ContaBancaria (int numeroConta, String titular, String tipoConta, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}
	public void depositar (double valor) {
		saldo += valor;
	System.out.println("deposito de R$" + valor + "realizado, novo saldo" +saldo );		
	}
	 public void depositar(double valor, String descricao) {
	        saldo += valor;
	        System.out.println("Depósito de R$" + valor + " realizado (" + descricao + "). Novo saldo: R$" + saldo);
	    }

	public void sacar (double valor) {
		double taxa;
		if(tipoConta.equals("poupança")) {
			taxa = valor * 0.005;
		}
		else {
			taxa = 0.0;
		}
	double valorComTaxa = valor + taxa;
	if(valorComTaxa <= saldo) {
		saldo -= valorComTaxa;
		System.out.println("Saque de R$" + valor + "realizado taxa R$"+ taxa + "novo saldo R$" +saldo);
	}
	else {
		System.out.println("saldo insuficiente para realizar saque");
	 }
	}
	public void sacar(double valor, double taxa) {
		double valorComTaxa = valor + taxa;
		if (valorComTaxa <= saldo) {
			saldo -= valorComTaxa;
			System.out.println("Saque de R$" + valor + " realizado. Taxa adicional: R$" + taxa + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
	public String DetalhesConta(){
		return "numero da conta:" +numeroConta+ 
				"titular" + titular +
				"saldo: R$"+ saldo +
				"tipo de conta" +tipoConta;
	}
}
