package listaOO;

import java.util.ArrayList;

public class LojaConveniencia {
    private ArrayList<Produto> produtos;

    public LojaConveniencia() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto consultarProduto(int codigo) {
        if (codigo >= 0 && codigo < produtos.size()) {
            return produtos.get(codigo);
        }
        return null;
    }

    public boolean venderProduto(int codigo, int quantidadeVendida) {
        Produto produto = consultarProduto(codigo);
        if (produto != null && produto.getQuantidade() >= quantidadeVendida) {
            produto.diminuirQuantidade(quantidadeVendida);
            return true;
        }
        return false;
    }

    public boolean alterarPreco(int codigo, double novoPreco) {
        Produto produto = consultarProduto(codigo);
        if (produto != null) {
            produto.setPreco(novoPreco);
            return true;
        }
        return false;
    }

    public ArrayList<Produto> obterRelatorio() {
        return produtos;
    }
}

