package exercicio4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Monitor("TechStore", 2000.00, "LG", 50, "Bivolt", 24, "HDMI",
                                 27, "4K", 144));
        carrinho.add(new Teclado("GameShop", 350.00, "Razer", "Plástico", "PC",
                                 700, true, "ABNT2", true, true));

        double totalCompra = 0;

        for (Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
            totalCompra += produto.getPreco();
        }

        System.out.println("Preço total da compra: R$" + totalCompra);
    }
}
