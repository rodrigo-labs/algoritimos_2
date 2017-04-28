/* 
 * Programa/Script:
 *     ExercicioE
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

public class ExercicioE {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

        double soma = 0;
		double media = 0;

		//populando a matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Informe o valor da linha " + i + " coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		//exibindo a matriz
		for (i = 0; i < 3; i++) {
			System.out.println();
			for (j = 0; j < 3; j++) {
				soma += matriz[i][j];
			}
		}

		// exibindo a media
		media = soma / 9;
		System.out.println("A media da soma da matriz e: " + media);
	}
}
