/* 
 * Programa/Script:
 *     ExercicioH
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

public class ExercicioH {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

        int menor = 1000;
		String posicao = "";

		// populando a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Informe o valor da linha " + i + " coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// calculando o menor elemento
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (menor > matriz[i][j]) {
					menor = matriz[i][j];
					posicao = "linha " + i + " coluna " + j;
				}
			}
		}

		// exibindo o menor e mostrando sua posicao
		System.out.printf("O menor numero e o %d, e enconta-se na %s\n", menor, posicao);
	}
}
