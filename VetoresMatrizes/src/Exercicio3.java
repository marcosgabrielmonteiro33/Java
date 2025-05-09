import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("digite 10 numeors inteiros");
		for (int i = 0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
		System.out.println("os numeros primos sao:");
		for(int num : numeros) {
			if(num < 2 ) continue;
			
			boolean primo = true;
			for (int i = 2 ; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.println(num);
			}
		}
       sc.close();
	}

}
