package Exercício3;

import java.util.ArrayList;

public class Escola {
    private ArrayList<Aluno> alunos;

    public Escola() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public Aluno consultarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void listarAlunos() {
        System.out.println("\nLista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

