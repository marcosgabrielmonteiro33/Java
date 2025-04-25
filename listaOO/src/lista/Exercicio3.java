package lista;

import java.util.*;

class Disciplina {
    String nome;
    List<Double> notas = new ArrayList<>();

    Disciplina(String nome) {
        this.nome = nome;
    }

    void adicionarNota(double nota) {
        if (notas.size() < 4) notas.add(nota);
        else System.out.println("Já foram cadastradas 4 notas para esta disciplina!");
    }

    double calcularMedia() {
        return notas.stream().mapToDouble(n -> n).average().orElse(0.0);
    }

    boolean aprovado() {
        return calcularMedia() >= 7.0;
    }

    public String toString() {
        return nome + " - Notas: " + notas + " | Média: " + calcularMedia() + " | " + (aprovado() ? "Aprovado" : "Reprovado");
    }
}

class Aluno {
    String nome;
    int matricula;
    List<Disciplina> disciplinas = new ArrayList<>();

    Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    void adicionarDisciplina(String nomeDisciplina) {
        if (disciplinas.size() < 4) disciplinas.add(new Disciplina(nomeDisciplina));
        else System.out.println("O aluno já está matriculado em 4 disciplinas!");
    }

    Disciplina buscarDisciplina(String nome) {
        return disciplinas.stream().filter(d -> d.nome.equalsIgnoreCase(nome)).findFirst().orElse(null);
    }

    public String toString() {
        return "Aluno: " + nome + " | Matrícula: " + matricula + "\n" + disciplinas;
    }
}

public class Exercicio3 {
    static List<Aluno> alunos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Cadastrar Aluno | 2. Adicionar Disciplina | 3. Adicionar Nota | 4. Consultar Aluno | 5. Relatório | 6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 6) break;
            switch (opcao) {
                case 1 -> cadastrarAluno();
                case 2 -> adicionarDisciplina();
                case 3 -> adicionarNota();
                case 4 -> consultarAluno();
                case 5 -> gerarRelatorio();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    static void cadastrarAluno() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        alunos.add(new Aluno(nome, matricula));
        System.out.println("Aluno cadastrado com sucesso!");
    }

    static void adicionarDisciplina() {
        Aluno aluno = buscarAluno();
        if (aluno != null) {
            System.out.print("Nome da Disciplina: ");
            String nomeDisciplina = scanner.nextLine();
            aluno.adicionarDisciplina(nomeDisciplina);
            System.out.println("Disciplina adicionada!");
        }
    }

    static void adicionarNota() {
        Aluno aluno = buscarAluno();
        if (aluno != null) {
            System.out.print("Nome da Disciplina: ");
            String nomeDisciplina = scanner.nextLine();
            Disciplina disciplina = aluno.buscarDisciplina(nomeDisciplina);
            if (disciplina != null) {
                System.out.print("Nota: ");
                double nota = scanner.nextDouble();
                disciplina.adicionarNota(nota);
                System.out.println("Nota adicionada!");
            } else System.out.println("Disciplina não encontrada!");
        }
    }

    static void consultarAluno() {
        Aluno aluno = buscarAluno();
        System.out.println(aluno != null ? aluno : "Aluno não encontrado!");
    }

    static void gerarRelatorio() {
        alunos.forEach(System.out::println);
    }

    static Aluno buscarAluno() {
        System.out.print("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        return alunos.stream().filter(a -> a.matricula == matricula).findFirst().orElse(null);
    }
}