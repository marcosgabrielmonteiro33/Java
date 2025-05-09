import java.util.Scanner;

public class Exercicio9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] matriz = new int[4][4];
	        
	        System.out.println("Digite 16 números inteiros para preencher a matriz 4x4:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Elemento [" + i + "][" + j + "]: ");
	                matriz[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("\nMatriz preenchida:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }

	  
	        System.out.println("\nElementos da diagonal principal:");
	        for (int i = 0; i < 4; i++) {
	            System.out.print(matriz[i][i] + " ");
	        }

	        sc.close();
	    }
	}
