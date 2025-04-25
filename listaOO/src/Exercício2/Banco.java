package Exercício2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public ContaBancaria consultarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    public void exibirContas() {
        System.out.println("\nLista de Contas Bancárias:");
        for (ContaBancaria conta : contas) {
            System.out.println(conta);
        }
    }
}