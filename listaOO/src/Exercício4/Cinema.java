package Exercício4;

import java.util.ArrayList;

public class Cinema {
    public ArrayList<Filme> filmes;
    private ArrayList<SalaDeCinema> salas;
    private ArrayList<Cliente> clientes;

    public Cinema() {
        this.filmes = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    public void criarSala(int fileiras, int colunas, Filme filme) {
        salas.add(new SalaDeCinema(fileiras, colunas, filme));
        System.out.println("Sala criada e associada ao filme: " + filme.getTitulo());
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarFilmes() {
        System.out.println("Filmes cadastrados:");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de vendas:");
        for (SalaDeCinema sala : salas) {
            System.out.println("Filme: " + sala.getFilmeEmExibicao().getTitulo() +
                " - Ingressos vendidos: " + sala.getIngressosVendidos());
        }
    }
}
