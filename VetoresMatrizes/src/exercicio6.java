import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int contadorNegativo = 0;

		System.out.println("digite 25 numeros inteiros");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					contadorNegativo++;
				}
			}
		}
      System.out.println("os numeros negativos da matriz sao" + contadorNegativo);
      sc.close();
	}

}
