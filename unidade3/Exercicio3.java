 /*
 * Programa/Script:
 *     Exercicio3
 *
 * Descricao:
 *     Exercicio proposto no material do curso de sistemas de informacao.
 *
 * Obs.:
 *     Deve ser rodado no terminal.
 *
 * Versão 1.0:
 *     Exercicio implementado como pedido do exercicio.
 *
 * Autor:
 *     Rodrigo - rodrigomv.dev@gmail.com
 *
 * Data:
 *     Outubro de 2016.
 */
import java.util.Scanner;

public class Exercicio3 {
	static Scanner sc = new Scanner(System.in);
	static int[][] elementos = new int[2][4];

	// procedimento que popula a matriz de elementos
	public static void pegarElementos() {
		System.out.println("Informe os valores dos elementos.");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++ ) {
				elementos[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
	}


	// procedimento que mostrar os elemntos da matriz
	public static void mostrarElementos() {
		System.out.println("Esses são os elementos da matriz.");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++ ) {
				System.out.println(elementos[i][j]);
			}
		}
	}

	// metodo main da classe
	public static void main(String[] args) {
		pegarElementos();
		mostrarElementos();
	}
}
