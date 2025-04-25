package Exercicio2;

public class ProdutoEletronico {
private String nome;
private double preco;
private String marca;
private int garantiaMeses;

 public ProdutoEletronico(String nome,double preco, String marca) {
	 this.nome = nome;
	 this.preco = preco;
	 this.marca = marca;
	 this.garantiaMeses = 0;
 }
 public ProdutoEletronico(String nome,double preco, String marca, int garantiaMeses) {
	 this.nome = nome;
	 this.preco = preco;
	 this.marca = marca;
	 this.garantiaMeses = garantiaMeses;
 }
 public void exibirDetalhes() {
	 System.out.println("nome:" + nome);
	 System.out.println("preço:" + preco);
	 System.out.println("marca:" + marca);
	 
 }
 public void exibirDetalhes(boolean incluirGarantia) {
	 exibirDetalhes();
	 if(incluirGarantia) {
		 System.out.println("garantia: " + garantiaMeses +" meses");
	 }
   }
 public static void main(String[]args) {
	 ProdutoEletronico produto1 = new ProdutoEletronico ("notebook",2500.00,"positivo");
	 ProdutoEletronico produto2 = new ProdutoEletronico("celular",3000.00,"Apple",12); 
 
	System.out.println("Detalhes do produto 1:");
	produto1.exibirDetalhes();
	System.out.println("Detalhes do produto 2:");
	produto2.exibirDetalhes(true);
	
 }
}
