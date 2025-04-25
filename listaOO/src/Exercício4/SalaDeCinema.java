package Exercício4;

public class SalaDeCinema {
    private int[][] poltronas;
    private Filme filmeEmExibicao;
    private int ingressosVendidos;

    public SalaDeCinema(int fileiras, int colunas, Filme filmeEmExibicao) {
        this.poltronas = new int[fileiras][colunas];
        this.filmeEmExibicao = filmeEmExibicao;
        this.ingressosVendidos = 0;
    }

    public Filme getFilmeEmExibicao() {
        return filmeEmExibicao;
    }

    public void alterarFilme(Filme novoFilme) {
        this.filmeEmExibicao = novoFilme;
    }

    public boolean verificarDisponibilidade(int fileira, int poltrona) {
        return poltronas[fileira][poltrona] == 0;
    }

    public boolean venderIngresso(int fileira, int poltrona) {
        if (verificarDisponibilidade(fileira, poltrona)) {
            poltronas[fileira][poltrona] = 1; 
            ingressosVendidos++;
            return true;
        }
        return false;
    }

    public void cancelarIngresso(int fileira, int poltrona) {
        if (poltronas[fileira][poltrona] == 1) {
            poltronas[fileira][poltrona] = 0;
            ingressosVendidos--;
        }
    }

    public void exibirMapa() {
        System.out.println("Mapa da sala:");
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                System.out.print(poltronas[i][j] == 0 ? "[L]" : "[X]");
            }
            System.out.println();
        }
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
}
