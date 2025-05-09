import java.util.Scanner;

public class Exercicioo11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrizA = new int[2][3];
		int[][] matrizB = new int[3][2];
		int[][] matrizResultado = new int[2][2];

		System.out.println("Digite 6 números inteiros para a matriz A (2x3):");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matrizA[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\nDigite 6 números inteiros para a matriz B (3x2):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matrizB[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrizResultado[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		System.out.println("\nMatriz resultante (produto das matrizes A e B):");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizResultado[i][j] + "\t");
			}
			System.out.println();
		}

		scanner.close();
	}
}