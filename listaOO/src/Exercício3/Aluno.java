package Exercício3;

import java.util.HashMap;
import java.util.ArrayList;

public class Aluno {
    private String nomeCompleto;
    private String matricula;
    private HashMap<String, ArrayList<Double>> disciplinasNotas;

    public Aluno(String nomeCompleto, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.disciplinasNotas = new HashMap<>();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void adicionarDisciplina(String disciplina) {
        if (!disciplinasNotas.containsKey(disciplina)) {
            disciplinasNotas.put(disciplina, new ArrayList<>());
        } else {
            System.out.println("Disciplina já cadastrada.");
        }
    }

    public void adicionarNota(String disciplina, double nota) {
        if (disciplinasNotas.containsKey(disciplina)) {
            disciplinasNotas.get(disciplina).add(nota);
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    }

    public double calcularMedia(String disciplina) {
        if (disciplinasNotas.containsKey(disciplina)) {
            ArrayList<Double> notas = disciplinasNotas.get(disciplina);
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return notas.size() > 0 ? soma / notas.size() : 0.0;
        }
        return 0.0;
    }

    public boolean estaAprovado(String disciplina) {
        return calcularMedia(disciplina) >= 7.0;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Aluno: " + nomeCompleto + ", Matrícula: " + matricula + "\n");
        for (String disciplina : disciplinasNotas.keySet()) {
            double media = calcularMedia(disciplina);
            info.append("Disciplina: ").append(disciplina).append(", Média: ").append(media)
                .append(media >= 7 ? " (Aprovado)" : " (Reprovado)").append("\n");
        }
        return info.toString();
    }
}

