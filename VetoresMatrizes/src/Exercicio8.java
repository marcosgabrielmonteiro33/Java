import java.util.Scanner;

public class Exercicio8 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] matriz1 = new int[4][4];
	        int[][] matriz2 = new int[4][4];
	        int[][] matrizSoma = new int[4][4];

	        System.out.println("Digite 16 números inteiros para a primeira matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz1[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("\nDigite 16 números inteiros para a segunda matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz2[i][j] = sc.nextInt();
	            }
	        }

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	        System.out.println("\nMatriz soma (resultado da soma das duas matrizes):");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matrizSoma[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}
