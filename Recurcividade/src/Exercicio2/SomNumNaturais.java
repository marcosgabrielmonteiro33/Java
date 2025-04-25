package Exercicio2;

public class SomNumNaturais {
	public static int natu (int n) {
		if (n == 0) {
			return 0;
		}
		else {
		return	n += natu(n-1);
	}
	}
	public static void main (String[]args) {
		int resultado = natu(9);
		System.out.println("as somas dos numeros naturais: " + resultado  );
	}
}
