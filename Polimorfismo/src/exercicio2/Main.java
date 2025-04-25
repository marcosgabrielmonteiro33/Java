package exercicio2;

import java.util.ArrayList;

import exercicio1.veiculo;

public class Main {
	public static void main(String[] args) {
		ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(new Gerente("marcos","123232332",3,2000));
		listaFuncionario.add(new Desenvolvedor("marcos","123232332",3000,"java",1000));
		listaFuncionario.add(new Estagiario("marcos","123232332",0,50,25));
		
		for(Funcionario Funcionario:listaFuncionario) {
			System.out.println("o salario final é "+Funcionario.calcularSalario());
			Funcionario.exibirDados();
			
		}
		
	}

}
