package exercicio1;

public class veiculo {
 private String  marca;
 private String modelo;
 private int ano;
 private int velocidadeAtual;
 
public veiculo(String marca, String modelo, int ano) {
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	this.velocidadeAtual = 0;
}
public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public int getVelocidadeAtual() {
    return velocidadeAtual;
}

public void acelerar(int velocidade) {
	this.velocidadeAtual += velocidade;
	 
}
   public void frear(int velocidade) {
	    this.velocidadeAtual=Math.max(this.velocidadeAtual - velocidade, 0);
   }
   public void exibirDados() {
       System.out.println("Marca: " + marca);
       System.out.println("Modelo: " + modelo);
       System.out.println("Ano: " + ano);
       System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
   }
}
