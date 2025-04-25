package exercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<ContaBancaria> listaConta = new ArrayList<>();
		listaConta.add(new ContaCorrente("marcos", "12345",50000,00));
		listaConta.add( new ContaPoupanca("marcos", "12345",3000,0.8));
		listaConta.add(new ContaSalario("marcos", "12345",0,"senai"));
		
	for(ContaBancaria conta :listaConta) {
		System.out.println(conta.tipoConta());
		conta.depositar(500);
		conta.exibirDados();
	
	    }
	}
}
