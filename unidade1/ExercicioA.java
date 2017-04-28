/* 
 * Programa/Script:
 *     ExercicioA
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

public class ExercicioA {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

        int somaColuna = 0;

		// populando a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Informe o valor da linha " + i + " coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// exibindo a matriz
		for (i = 0; i < 3; i++) {
			System.out.println();
			for (j = 0; j < 3; j++) {
				if (j == 0) {
					somaColuna += matriz[i][j];
				}
			}
		}

		// mostra a soma da coluna
		System.out.println("A soma da primeira coluna e: " + somaColuna);
	}
}
