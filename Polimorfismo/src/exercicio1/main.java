package exercicio1;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		ArrayList<veiculo> listaVeiculos = new ArrayList<>();
		
		listaVeiculos.add(new carro("toyota","Corolla",2021,4));
		listaVeiculos.add( new moto("Honda", "CB500", 2021, true));
		listaVeiculos.add(new caminhao("Volvo", "FH540", 2020, 25.0));
        
        for (veiculo veiculo:listaVeiculos) {
        	System.out.println("tipo de veiculo:"+veiculo.tipoVeiculo());
        	veiculo.exibirDados();   	
        }
	}
}
