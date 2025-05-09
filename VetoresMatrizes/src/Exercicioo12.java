import java.util.Scanner;

public class Exercicioo12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		char jogadorAtual = 'X';
		boolean jogoAtivo = true;
		int jogadas = 0;

		while (jogoAtivo) {
			exibirTabuleiro(tabuleiro);
			System.out.println("\nJogador " + jogadorAtual + ", escolha linha e coluna (0-2):");

			int linha, coluna;
			while (true) {
				System.out.print("Linha: ");
				linha = scanner.nextInt();
				System.out.print("Coluna: ");
				coluna = scanner.nextInt();

				if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
					break;
				}
				System.out.println("Posição inválida ou já ocupada, tente novamente.");
			}

			tabuleiro[linha][coluna] = jogadorAtual;
			jogadas++;

			if (verificarVencedor(tabuleiro, jogadorAtual)) {
				exibirTabuleiro(tabuleiro);
				System.out.println("\nJogador " + jogadorAtual + " venceu!");
				jogoAtivo = false;
			} else if (jogadas == 9) {
				exibirTabuleiro(tabuleiro);
				System.out.println("\nO jogo terminou em velha (empate)!");
				jogoAtivo = false;
			} else {
				jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
			}
		}
		scanner.close();
	}

	public static void exibirTabuleiro(char[][] tabuleiro) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j]);
				if (j < 2)
					System.out.print(" | ");
			}
			System.out.println();
			if (i < 2)
				System.out.println("---------");
		}
	}

	public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
		for (int i = 0; i < 3; i++) {
			if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador)
					|| (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
				return true;
			}
		}
		if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador)
				|| (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
			return true;
		}
		return false;
	}
}
