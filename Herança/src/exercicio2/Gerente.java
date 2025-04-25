package exercicio2;

public class Gerente extends Funcionario {
	private double bonus;

	public Gerente(String nome, String cpf, double salarioBase, double bonus) {
		super(nome, cpf, salarioBase);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

    @Override
	public double calcularSalario() {
    	return super.calcularSalario()+bonus;		
	}
    @Override
    public void exibirDados(){
    	super.exibirDados();
    	System.out.println("bonus:" +bonus);
    	
    }

}
