package Exercício2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n1. Cadastrar nova conta");
            System.out.println("2. Consultar conta");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar saque");
            System.out.println("5. Listar todas as contas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do titular: ");
                    String titular = scanner.next();
                    System.out.print("Número da conta: ");
                    String numeroConta = scanner.next();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    banco.cadastrarConta(new ContaBancaria(titular, numeroConta, saldoInicial));
                }
                case 2 -> {
                    System.out.print("Número da conta: ");
                    String numeroConta = scanner.next();
                    ContaBancaria conta = banco.consultarConta(numeroConta);
                    System.out.println(conta != null ? conta : "Conta não encontrada.");
                }
                case 3 -> {
                    System.out.print("Número da conta: ");
                    String numeroConta = scanner.next();
                    ContaBancaria conta = banco.consultarConta(numeroConta);
                    if (conta != null) {
                        System.out.print("Valor do depósito: ");
                        double valor = scanner.nextDouble();
                        conta.depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
                case 4 -> {
                    System.out.print("Número da conta: ");
                    String numeroConta = scanner.next();
                    ContaBancaria conta = banco.consultarConta(numeroConta);
                    if (conta != null) {
                        System.out.print("Valor do saque: ");
                        double valor = scanner.nextDouble();
                        conta.sacar(valor);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
                case 5 -> banco.exibirContas();
                case 6 -> rodando = false;
                default -> System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}