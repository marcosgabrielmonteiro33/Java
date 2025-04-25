package Lista1EstruturaDeDados;

public class ProdutoMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrizB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

       
        int[][] matrizResultado = new int[2][2];

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) { 
                matrizResultado[i][j] = 0;
                for (int k = 0; k < 3; k++) { 
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
