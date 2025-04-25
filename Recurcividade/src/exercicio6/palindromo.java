package exercicio6;

public class palindromo {
	
    public static boolean palindromo(String str, int inicio, int fim) {
	        
	        if (inicio >= fim) {
	            return true;
	        }
	       
	        if (str.charAt(inicio) != str.charAt(fim)) {
	            return false;
	        }
	        
	        return palindromo(str, inicio + 1, fim - 1);
	    }

	    public static void main(String[] args) {
	        String palavra = "lugar";
	        boolean resultado = palindromo(palavra, 0, palavra.length() - 1);

	        if (resultado) {
	            System.out.println(" é um palíndromo!");
	        } else {
	            System.out.println(" não é um palíndromo.");
	        }
	    }
	}


