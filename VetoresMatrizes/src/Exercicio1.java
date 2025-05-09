import java.util.*;

	public class Exercicio1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        
	        Set<Integer> numerosSorteados = new HashSet<>();
	        while (numerosSorteados.size() < 6) {
	            numerosSorteados.add(random.nextInt(60) + 1);
	        }

	        
	        Set<Integer> numerosUsuario = new HashSet<>();
	        System.out.println("Digite 6 números entre 1 e 60:");

	        while (numerosUsuario.size() < 6) {
	            try {
	                int num = scanner.nextInt();
	                if (num >= 1 && num <= 60 && !numerosUsuario.contains(num)) {
	                    numerosUsuario.add(num);
	                } else {
	                    System.out.println("Número inválido ou repetido! Tente novamente.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, digite um número válido.");
	                scanner.next(); 
	            }
	        }

	        
	        Set<Integer> acertos = new HashSet<>(numerosSorteados);
	        acertos.retainAll(numerosUsuario);

	        
	        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
	        System.out.println("Seus números: " + numerosUsuario);
	        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);

	        scanner.close();
	    }
	}

