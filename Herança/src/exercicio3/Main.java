package exercicio3;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente("marcos", "12345",50000,00);
		ContaPoupanca contaPoupanca = new ContaPoupanca("marcos", "12345",3000,0.8);
		ContaSalario contaSalario = new ContaSalario("marcos", "12345",0,"senai");
		
		contaCorrente.depositar(500);
		contaCorrente.descontarTaxa();
		contaCorrente.exibirDados();
		
		contaPoupanca.aplicarRendimento();
		contaPoupanca.exibirDados();
		
		contaSalario.receberSalario(3000);
		contaSalario.exibirDados();
	}
}
