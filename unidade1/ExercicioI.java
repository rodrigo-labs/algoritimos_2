/* 
 * Programa/Script:
 *     ExercicioI
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
 *     Agosto de 2016.
 */

import java.util.Scanner;

public class ExercicioI {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

		String diagonalPrincipal = "";

		// populando a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Informe o valor da diagonalPrincipal " + i + " coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// exibindo a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					if (j == 0) {
						diagonalPrincipal += matriz[i][j];
					} else {
						diagonalPrincipal += " - " + matriz[i][j];
					}
				}
			}
		}

		// mostrando os elementos da diagonal principal
		System.out.println("Os elementos da diagonal principal sao: " + diagonalPrincipal);
	}
}
