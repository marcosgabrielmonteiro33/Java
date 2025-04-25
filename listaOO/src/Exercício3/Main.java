package Exercício3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner scanner = new Scanner(System.in);

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n1. Cadastrar novo aluno");
            System.out.println("2. Consultar aluno");
            System.out.println("3. Adicionar disciplina ao aluno");
            System.out.println("4. Adicionar nota à disciplina");
            System.out.println("5. Listar todos os alunos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome completo: ");
                    String nome = scanner.next();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.next();
                    escola.cadastrarAluno(new Aluno(nome, matricula));
                }
                case 2 -> {
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.next();
                    Aluno aluno = escola.consultarAluno(matricula);
                    System.out.println(aluno != null ? aluno : "Aluno não encontrado.");
                }
                case 3 -> {
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.next();
                    Aluno aluno = escola.consultarAluno(matricula);
                    if (aluno != null) {
                        System.out.print("Nome da disciplina: ");
                        String disciplina = scanner.next();
                        aluno.adicionarDisciplina(disciplina);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.print("Matrícula do aluno: ");
                    String matricula = scanner.next();
                    Aluno aluno = escola.consultarAluno(matricula);
                    if (aluno != null) {
                        System.out.print("Nome da disciplina: ");
                        String disciplina = scanner.next();
                        System.out.print("Nota: ");
                        double nota = scanner.nextDouble();
                        aluno.adicionarNota(disciplina, nota);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                }
                case 5 -> escola.listarAlunos();
                case 6 -> rodando = false;
                default -> System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}

