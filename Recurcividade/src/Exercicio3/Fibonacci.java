package Exercicio3;

public class Fibonacci {
	public static long fibonacci(int n) {
		if(n<2)
			return n;
	
		else 
		return fibonacci (n - 2) + fibonacci(n - 1);
		
	}

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }

}
