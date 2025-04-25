package exercicio1;

public class carro extends veiculo {
    private int numeroPortas;

    
    public carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

@Override
public void exibirDados() {
	super.exibirDados();
	System.out.println("numero de portas: " +numeroPortas);
}

}
