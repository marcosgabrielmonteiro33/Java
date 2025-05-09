import java.util.Scanner;

public class Exercicioo10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		double[][] transposta = new double[3][3];

		System.out.println("Digite 9 números reais para preencher a matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextDouble();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}

		System.out.println("\nMatriz original:");
		exibirMatriz(matriz);

		System.out.println("\nMatriz transposta:");
		exibirMatriz(transposta);

		scanner.close();
	}

	public static void exibirMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
