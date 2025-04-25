package exercicio5;

public class regressiva {

	public static int regressiva(int n) {
		if(n<0)
			return n;
	
		else 
			System.out.println(n);
		return regressiva (n - 1);
		
	}

    public static void main(String[] args) {
         int n = 10;
            System.out.println("inicio da contagem");
            regressiva(n);
        }
    }


