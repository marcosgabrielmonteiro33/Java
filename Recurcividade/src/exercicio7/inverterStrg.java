package exercicio7;

public class inverterStrg {
	
	    public static String inverterString(String str) {
	        if (str.length() <= 1) {
	            return str;
	        }
	       
	        return inverterString(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {
	        String palavra = "arara"; 
	        String resultado = inverterString(palavra);

	        System.out.println("String invertida: " + resultado);
	    }
	}

