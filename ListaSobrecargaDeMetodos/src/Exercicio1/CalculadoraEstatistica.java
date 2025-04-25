package Exercicio1;

public class CalculadoraEstatistica {
	private double media;
	 
	public CalculadoraEstatistica (){
		this.media = 0.0;
   }
   public CalculadoraEstatistica(int[] numeros) {
	   this.media = calcularMedia(numeros);
   }
    public double calcularMedia(int a, int b) {
    	return  (a + b) / 2.0;
   }
    public double calcularMedia(int a, int b, int c) {
    	return (a + b + c) / 3.0;
    }
   public double calcularMedia (int[]numeros) {
	   int soma = 0;
	   for (int num : numeros) {
		   soma += num;
	   }
	   return (double) soma / numeros.length;
   }
public double getMedia() {
	return media;
}
public void setMedia(double media) {
	this.media = media;
}
   
   
    
}

