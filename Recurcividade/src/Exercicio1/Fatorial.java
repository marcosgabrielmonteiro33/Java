package Exercicio1;

public class Fatorial {
		
	public static int fatorial (int n) {
		if (n == 0 ||n == 1) {
			return 1;
		}
		else {
		return	n * fatorial(n-1);
	}
	}
	public static void main (String[]args) {
		int resultado = fatorial(5);
		System.out.println("a soma do fatorial de 5 é: " + resultado  );
	}
}