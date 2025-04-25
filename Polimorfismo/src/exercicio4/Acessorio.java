package exercicio4;

public abstract class Acessorio extends Produto {
    protected String material;
    protected String compatibilidade;
    protected double peso;
    protected boolean portabilidade;

    public Acessorio(String nomeLoja, double preco, String marca, String material,
                     String compatibilidade, double peso, boolean portabilidade) {
        super(nomeLoja, preco, marca);
        this.material = material;
        this.compatibilidade = compatibilidade;
        this.peso = peso;
        this.portabilidade = portabilidade;
    }

    @Override
    public String getDescricao() {
        return "Acessório da marca " + marca + ", material: " + material +
               ", compatibilidade: " + compatibilidade + ".";
    }
}
