package Exercício4;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;

    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}
