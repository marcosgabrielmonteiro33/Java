package exercicio1;

public class moto extends veiculo{
	private boolean temPartidaEletrica;
	
	public moto(String marca, String modelo, int ano, boolean temPadidaEletrica) {
		super(marca,modelo,ano);
		this.temPartidaEletrica = temPadidaEletrica;
	}
	public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

   @Override
   public void exibirDados() {
	  super.exibirDados();
	  System.out.println("possui partida eletrica: " +(temPartidaEletrica ? "sim ": "nao"));
   }
}
