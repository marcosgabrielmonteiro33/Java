package Exercício4;

public class Filme {
    private String titulo;
    private int classificacaoIndicativa;

    public Filme(String titulo, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Classificação: " + classificacaoIndicativa + "+ anos";
    }
}
