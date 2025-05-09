import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Digite 9 números inteiros para preencher a matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatriz preenchida:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();

			sc.close();
		}
	}
}