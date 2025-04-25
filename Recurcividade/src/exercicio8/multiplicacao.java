package exercicio8;

public class multiplicacao {

   
    public static int multiplicar(int a, int b) {
        
        if (b == 0) {
            return 0;
        }
        
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 8; 
        int b = 7; 
        int resultado = multiplicar(a, b);

        System.out.println(resultado);
    }
}