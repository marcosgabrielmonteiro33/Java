package exercicio10;

public class ordemcrescente {

    
    public static void ordemcrescente(int n) {
        
        if (n <= 0) {
            return;
        }
        
        ordemcrescente(n - 1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        int N = 5; 
        System.out.println("Os números em ondem crescente é");
        ordemcrescente(N);
    }
}