package exercicio2;

public class Estagiario extends Funcionario{
	private int hrsTrabalhadas;
	double valorHora;
	public Estagiario(String nome, String cpf, double salarioBase, int hrsTrabalhadas,double valorHora) {
		super(nome, cpf, salarioBase);
		this.hrsTrabalhadas = hrsTrabalhadas;
		this.valorHora = valorHora;
	}
	public int getHrsTrabalhadas() {
		return hrsTrabalhadas;
	}
	public void setHrsTrabalhadas(int hrsTrabalhadas) {
		this.hrsTrabalhadas = hrsTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	@Override
	public double calcularSalario() {
		return super.calcularSalario()+hrsTrabalhadas*valorHora;
		
	}
	@Override
	public void exibirDados(){
		super.exibirDados();
		System.out.println("horas trabalhasd:"+hrsTrabalhadas);
		System.out.println(" o valor da hora é de: "+valorHora);
	}
	

}
