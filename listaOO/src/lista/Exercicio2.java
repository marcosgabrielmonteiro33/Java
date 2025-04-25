package lista;

import java.util.*;

class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    void depositar(double valor) {
        if (valor > 0) saldo += valor;
        else System.out.println("Valor inválido para depósito!");
    }

    boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido!");
        return false;
    }

    public String toString() {
        return "Titular: " + titular + " | Conta: " + numeroConta + " | Saldo: R$ " + saldo;
    }
}

public class Exercicio2 {
    static List<ContaBancaria> contas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Criar Conta | 2. Consultar Conta | 3. Depositar | 4. Sacar | 5. Listar Contas | 6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 6) break;
            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> consultarConta();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> listarContas();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    static void criarConta() {
        System.out.print("Nome do Titular: ");
        String titular = scanner.nextLine();
        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        contas.add(new ContaBancaria(titular, numeroConta));
        System.out.println("Conta criada com sucesso!");
    }

    static void consultarConta() {
        ContaBancaria conta = buscarConta();
        System.out.println(conta != null ? conta : "Conta não encontrada!");
    }

    static void depositar() {
        ContaBancaria conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do Depósito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado!");
        }
    }

    static void sacar() {
        ContaBancaria conta = buscarConta();
        if (conta != null) {
            System.out.print("Valor do Saque: ");
            double valor = scanner.nextDouble();
            if (conta.sacar(valor)) System.out.println("Saque realizado!");
        }
    }

    static void listarContas() {
        contas.forEach(System.out::println);
    }

    static ContaBancaria buscarConta() {
        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        return contas.stream().filter(c -> c.numeroConta == numeroConta).findFirst().orElse(null);
    }
}
