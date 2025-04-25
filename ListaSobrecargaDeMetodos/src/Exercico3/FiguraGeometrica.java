package Exercico3;

public class FiguraGeometrica {
private String tipoFiguraGeo; 

 public FiguraGeometrica() {
	 this.tipoFiguraGeo = "nao definida";
 }
 public FiguraGeometrica(String tipoFiguraGeo) {
	 this.tipoFiguraGeo = tipoFiguraGeo;
 }
 public double calcularArea(double lado) {
	 return lado * lado;
 }
 public double calcularArea(double base, double altura) {
	 return base * altura;
 }
 public double calcularAreaCirculo(double raio) {
	 return Math.PI * raio * raio;
 }
 public double calcularPerimetro(double lado) {
	 return 4 * lado;
 }
 public double calcularPerimetro(double sabe, double altura) {
	 return 2 * (sabe+altura);
 } 
 public static void main(String[]args) {
 FiguraGeometrica quadrado = new FiguraGeometrica("quadrado");
 FiguraGeometrica retangulo = new FiguraGeometrica("retangulo");
 FiguraGeometrica circulo = new FiguraGeometrica("circulo");
 
 System.out.println("area do quadrado lado 4: " + quadrado.calcularArea(4));
 System.out.println("area do retangulo base 5 e altura 3: " + retangulo.calcularArea(5,3));
 System.out.println("area do circulo raio 6: " + quadrado.calcularArea(6));
 System.out.println("perimetro do quadrado lado 4: " + quadrado.calcularPerimetro(4));
 System.out.println("perimetro do retangulo base 5 altura 3: " + retangulo.calcularPerimetro(5,3));
 
 }
 
 
}
