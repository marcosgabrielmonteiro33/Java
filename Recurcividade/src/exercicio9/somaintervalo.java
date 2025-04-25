package exercicio9;

public class somaintervalo {

   
    public static int somaIntervalo(int n, int m) {
       
        if (n > m) {
            return 0;
        }
        
        return n + somaIntervalo(n + 1, m);
    }

    public static void main(String[] args) {
        int n = 1; 
        int m = 4;

        int resultado = somaIntervalo(n, m); 
        System.out.println( resultado);
    }
}
