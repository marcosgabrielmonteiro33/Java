package exercicio2;

public class Funcionario {
 
	 private String nome;
	 private String cpf;
	 private double salarioBase;
	 
	 public Funcionario (String nome, String cpf, double salarioBase) {
		 this.nome = nome;
		 this.cpf = cpf;
		 this.salarioBase = salarioBase;
	 }
	 
	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calcularSalario() {
		 return salarioBase;
	 }
	
	 public void exibirDados() {
	 System.out.println("nome:"+nome);
	 System.out.println("salario:"+salarioBase);
	 System.out.println("cpf:"+cpf);
	 }
	 
}
