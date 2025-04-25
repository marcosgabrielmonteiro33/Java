package exercicio4;

public abstract class Eletronico extends Produto {
    protected int consumoEnergia;
    protected String voltagem;
    protected int garantia;
    protected String conectividade;

    public Eletronico(String nomeLoja, double preco, String marca, int consumoEnergia,
                      String voltagem, int garantia, String conectividade) {
        super(nomeLoja, preco, marca);
        this.consumoEnergia = consumoEnergia;
        this.voltagem = voltagem;
        this.garantia = garantia;
        this.conectividade = conectividade;
    }

    @Override
    public String getDescricao() {
        return "Eletrônico da marca " + marca + ", voltagem: " + voltagem +
               ", garantia de " + garantia + " meses, conectividade: " + conectividade + ".";
    }
}