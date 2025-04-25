package Exercico6;

public class Main {
	public static void main(String[]args) {
		ContaBancaria c1 = new ContaBancaria(12121,"marcos");
		ContaBancaria c2 = new ContaBancaria(22323,"guilherme","poupança");
		ContaBancaria c3 = new ContaBancaria(65652,"rebeca","corrente", 1000.00);
		
		System.out.println("conta 1");
		System.out.println(c1.DetalhesConta());
		
		System.out.println("conta 2");
		System.out.println(c2.DetalhesConta());
		
		System.out.println("conta 3");
		System.out.println(c3.DetalhesConta());
		
		c1.depositar(500.00);
        c2.depositar(200.00, "Depósito para poupança");
        c3.sacar(100.00);
        c2.sacar(100.00, 10.00);
	}

}
