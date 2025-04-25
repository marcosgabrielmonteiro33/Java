package lista;
import java.util.*;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    boolean vender(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            return true;
        }
        return false;
    }

    public String toString() {
        return nome + " | R$ " + preco + " | Estoque: " + quantidade;
    }
}
public class Exercicio1 {
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar | 2. Consultar | 3. Vender | 4. Alterar Preço | 5. Relatório | 6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 6) break;
            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> consultarProduto();
                case 3 -> realizarVenda();
                case 4 -> alterarPreco();
                case 5 -> exibirRelatorio();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    static void adicionarProduto() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("Preço: "); double preco = scanner.nextDouble();
        System.out.print("Quantidade: "); int quantidade = scanner.nextInt();
        produtos.add(new Produto(nome, preco, quantidade));
    }

    static void consultarProduto() {
        System.out.print("Código: "); int codigo = scanner.nextInt();
        System.out.println(codigo >= 0 && codigo < produtos.size() ? produtos.get(codigo) : "Produto não encontrado!");
    }

    static void realizarVenda() {
        System.out.print("Código: "); int codigo = scanner.nextInt();
        if (codigo >= 0 && codigo < produtos.size()) {
            System.out.print("Quantidade: "); int qtd = scanner.nextInt();
            System.out.println(produtos.get(codigo).vender(qtd) ? "Venda realizada!" : "Estoque insuficiente!");
        } else System.out.println("Produto não encontrado!");
    }

    static void alterarPreco() {
        System.out.print("Código: "); int codigo = scanner.nextInt();
        if (codigo >= 0 && codigo < produtos.size()) {
            System.out.print("Novo preço: "); double novoPreco = scanner.nextDouble();
            produtos.get(codigo).alterarPreco(novoPreco);
            System.out.println("Preço atualizado!");
        } else System.out.println("Produto não encontrado!");
    }

    static void exibirRelatorio() {
        for (int i = 0; i < produtos.size(); i++)
            System.out.println("Código " + i + ": " + produtos.get(i));
    }
}
