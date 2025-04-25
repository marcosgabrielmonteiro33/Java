package exercicio1;

public class caminhao extends veiculo {
    public double capacidadeCarga;

    // Construtor
    public caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }


    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
    @Override
    public String tipoVeiculo() {
   	   return "caminhao de carga";
    }
}
