import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetorFinal = new int[10];

		System.out.println("digite 5 numeros para o primeiro vetror");
		for (int i = 0; i < 5; i++) {
			vetor1[i] = sc.nextInt();
		}
		System.out.println("digite 5 numeros para o primeiro vetror");
		for (int i = 0; i < 5; i++) {
			vetor2[i] = sc.nextInt();
		}
		System.arraycopy(vetor1, 0, vetorFinal, 0, 5);
		System.arraycopy(vetor2, 0, vetorFinal, 5, 5);
		
		Arrays.sort(vetorFinal);
		
		System.out.println("o vetor final em ordem é");
		System.out.println(Arrays.toString(vetorFinal));
		
		sc.close();
	}
}
