package exercicio1;

public class main {
	public static void main(String[] args) {
        carro carro = new carro("Toyota", "Corolla", 2022, 4);
        moto moto = new moto("Honda", "CB500", 2021, true);
        caminhao caminhao = new caminhao("Volvo", "FH540", 2020, 25.0);

        System.out.println("Dados do Carro:");
        carro.acelerar(60);
        carro.frear(20);
        carro.exibirDados();

        System.out.println("\nDados da Moto:");
        moto.acelerar(80);
        moto.frear(30);
        moto.exibirDados();

        System.out.println("\nDados do Caminhão:");
        caminhao.acelerar(50);
        caminhao.frear(10);
        caminhao.exibirDados();
    }

}
