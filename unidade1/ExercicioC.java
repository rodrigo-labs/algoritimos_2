/* 
 * Programa/Script:
 *     ExercicioD
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

public class ExercicioC {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

        int somaLinha= 0;
		String linha = "";

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
				if (i == 0) {
					somaLinha += matriz[i][j];
					if (j == 0) {
						linha += matriz[i][j];
					} else {
						linha += " - " + matriz[i][j];
					}
				}
			}
		}

		// mostra o resultado 
		System.out.println("Os elementos da primeira linha sao: " + linha);
		System.out.println("A soma dos elementos da primeira linha e: " + somaLinha);
	}
}
