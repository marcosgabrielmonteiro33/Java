import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[20];

		System.out.println("digite 20 numeors inteiros");

		for (int i = 0; i < 20; i++) {
			numeros[i] = sc.nextInt();
		}
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		for (int num : numeros) {
			if (num > maior)
				maior = num;
			if (num < menor)
				menor = num;
		}
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		double media = (double) soma / numeros.length;
		Map<Integer, Integer> frequencia = new HashMap<>();
		for (int num : numeros) {
			frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
		}
		int moda = numeros[0], maxFreq = 0;
		for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
			if (entry.getValue() > maxFreq) {
				moda = entry.getKey();
				maxFreq = entry.getValue();
			}
		}
		double somaQuadrados = 0;
		for (int num : numeros) {
			somaQuadrados += Math.pow(num - media, 2);
		}
		double desvioPadrao = Math.sqrt(somaQuadrados / numeros.length);
		int pares = 0, impares = 0;
		for (int num : numeros) {
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);
        System.out.println("Moda: " + moda + " (aparece " + maxFreq + " vezes)");
        System.out.printf("Desvio padrão: %.2f%n", desvioPadrao);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}
	
