package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Filme {
    String titulo;
    int classificacao;
    
    Filme(String titulo, int classificacao) {
        this.titulo = titulo;
        this.classificacao = classificacao;
    }
}

class Sala {
    int numero;
    Filme filme;
    boolean[][] poltronas;
    
    Sala(int numero, int fileiras, int colunas, Filme filme) {
        this.numero = numero;
        this.filme = filme;
        this.poltronas = new boolean[fileiras][colunas];
    }
}

class Cliente {
    String nome;
    int idade;
    
    Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Exercicio4 {
    static List<Filme> filmes = new ArrayList<>();
    static List<Sala> salas = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Cadastrar Filme | 2. Criar Sala | 3. Cadastrar Cliente | 4. Sair");
            int opcao = scanner.nextInt(); scanner.nextLine();
            if (opcao == 4) break;
            switch (opcao) {
                case 1 -> cadastrarFilme();
                case 2 -> criarSala();
                case 3 -> cadastrarCliente();
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
    static void cadastrarFilme() {
        System.out.print("Título do Filme: ");
        String titulo = scanner.nextLine();
        System.out.print("Classificação Indicativa: ");
        int classificacao = scanner.nextInt(); scanner.nextLine();
        filmes.add(new Filme(titulo, classificacao));
        System.out.println("Filme cadastrado!");
    }
    
    static void criarSala() {
        if (filmes.isEmpty()) {
            System.out.println("Cadastre pelo menos um filme antes de criar uma sala!");
            return;
        }
        System.out.print("Número da Sala: ");
        int numero = scanner.nextInt(); scanner.nextLine();
        System.out.print("Quantidade de Fileiras: ");
        int fileiras = scanner.nextInt();
        System.out.print("Quantidade de Poltronas por Fileira: ");
        int colunas = scanner.nextInt(); scanner.nextLine();
        System.out.println("Escolha um filme pelo número:");
        listarFilmes();
        int filmeIndex = scanner.nextInt() - 1; scanner.nextLine();
        salas.add(new Sala(numero, fileiras, colunas, filmes.get(filmeIndex)));
        System.out.println("Sala criada!");
    }
    
    static void cadastrarCliente() {
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt(); scanner.nextLine();
        clientes.add(new Cliente(nome, idade));
        System.out.println("Cliente cadastrado!");
    }
    
    static void listarFilmes() {
        for (int i = 0; i < filmes.size(); i++)
            System.out.println((i + 1) + ". " + filmes.get(i).titulo);
    }
}