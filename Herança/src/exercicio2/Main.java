package exercicio2;

public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("marcos","123232332",3000,2000);
		Funcionario desenvolvedor = new Desenvolvedor("marcos","123232332",3000,"java",1000);
		Funcionario estagiario = new Estagiario("marcos","123232332",0,50,25);
		
		gerente.exibirDados();
		System.out.println("salario final é de:"+gerente.calcularSalario());
		desenvolvedor.exibirDados();
		System.out.println("salario final é de:"+desenvolvedor.calcularSalario());
		estagiario.exibirDados();
		System.out.println("salario final é de:"+estagiario.calcularSalario());
	}

}
