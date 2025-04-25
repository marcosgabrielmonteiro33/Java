package exercicio4;

public class potencia {
	
	public static int potencia (int x, int y) {
		if(y == 0)
			return 1;
	
		else 
		return x * potencia(x, y-1) ;
		
	}

    public static void main(String[] args) {
      int resultado = potencia(3,3);
      System.out.println("o reseultado é " + resultado);
    }

}
