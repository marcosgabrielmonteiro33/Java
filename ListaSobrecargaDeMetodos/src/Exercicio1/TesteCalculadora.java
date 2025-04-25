package Exercicio1;

public class TesteCalculadora {
    public static void main(String[] args) {
        CalculadoraEstatistica calc1 = new CalculadoraEstatistica();
        System.out.println("media de 10 e 20: " + calc1.calcularMedia(10, 20));
        System.out.println("media de 10, 20 e 30: " + calc1.calcularMedia(10, 20, 30));

        int[] numeros = {10, 20, 30, 40};
        CalculadoraEstatistica calc2 = new CalculadoraEstatistica(numeros);
        System.out.println("media do array: " + calc2.getMedia());
    }
}

