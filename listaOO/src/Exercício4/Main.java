package Exercício4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;
        while (rodando) {
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Criar sala de cinema");
            System.out.println("3. Cadastrar cliente");
            System.out.println("4. Listar filmes");
            System.out.println("5. Gerar relatório de vendas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título do filme: ");
                    String titulo = scanner.next();
                    System.out.print("Classificação indicativa: ");
                    int classificacao = scanner.nextInt();
                    cinema.cadastrarFilme(new Filme(titulo, classificacao));
                }
                case 2 -> {
                    System.out.print("Número de fileiras: ");
                    int fileiras = scanner.nextInt();
                    System.out.print("Número de poltronas por fileira: ");
                    int poltronas = scanner.nextInt();
                    System.out.print("Índice do filme (da lista cadastrada): ");
                    int indiceFilme = scanner.nextInt();
                    if (indiceFilme >= 0 && indiceFilme < cinema.filmes.size()) {
                        cinema.criarSala(fileiras, poltronas, cinema.filmes.get(indiceFilme));
                    } else {
                        System.out.println("Filme inválido.");
                    }
                }
                case 3 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.next();
                    System.out.print("Ano de nascimento: ");
                    int ano = scanner.nextInt();
                    System.out.print("Mês de nascimento: ");
                    int mes = scanner.nextInt();
                    System.out.print("Dia de nascimento: ");
                    int dia = scanner.nextInt();
                    cinema.cadastrarCliente(new Cliente(nome, LocalDate.of(ano, mes, dia)));
                }
                case 4 -> cinema.listarFilmes();
                case 5 -> cinema.gerarRelatorio();
                case 6 -> rodando = false;
                default -> System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

