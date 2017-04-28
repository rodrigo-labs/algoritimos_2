/* 
 * Programa/Script:
 *     ExercicioG
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

public class ExercicioG {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

        int maior = 0;
		String posicao = "";

		// populando a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Informe o valor da linha " + i + " coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// calculando o maior elemento
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (maior < matriz[i][j]) {
					maior = matriz[i][j];
					posicao = "linha " + i + " coluna " + j;
				}
			}
		}

		// exibindo o maior numero e sua posicao
		System.out.printf("O maior numero e o %d, e enconta-se na %s\n", maior, posicao);
	}
}
