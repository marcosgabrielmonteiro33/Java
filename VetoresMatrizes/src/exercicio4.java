import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[15];

		System.out.println("digite 15 numeros inteiros");
		for (int i = 0; i < 15; i++) {
			numeros[i] = sc.nextInt();
		}
		Set<Integer> numerosUnicos = new LinkedHashSet<>();
		for(int num : numeros) {
			numerosUnicos.add(num);
		}
		System.out.println("vetor sem valores duplicados");
		System.out.println(numerosUnicos);
		sc.close();
	}
}
