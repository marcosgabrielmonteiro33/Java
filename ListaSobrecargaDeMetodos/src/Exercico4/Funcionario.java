package Exercico4;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1300.0; 
    }
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }
    public void aumentarSalarioValorFixo(double valorFixo) {
        this.salario += valorFixo;
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }


    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("João", "Analista");
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 5000.00);

        System.out.println("Detalhes do Funcionário 1:");
        funcionario1.exibirDetalhes();
        System.out.println("Detalhes do Funcionário 2:");
        funcionario2.exibirDetalhes();
        funcionario1.aumentarSalario(10);
        funcionario2.aumentarSalarioValorFixo(1000); 
        System.out.println("Após aumento:");
        System.out.println("Detalhes do Funcionário 1:");
        funcionario1.exibirDetalhes();

        System.out.println("Detalhes do Funcionário 2:");
        funcionario2.exibirDetalhes();
    }
}