 /*
 * Programa/Script:
 *     Exercicio1
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

public class Exercicio1 {
	static Scanner sc = new Scanner(System.in);
	static int tamanho = 0;
	static int[] elementos;

	// procedimento que define o tamanho do vetor
	public static void pegaTamanho() {
		System.out.print("Informe o tamanho do vetor de elementos inteiro: ");

		tamanho = Integer.parseInt(sc.nextLine());
	}

	// procedimento que popula o vetor elementos
	public static void pegaElementos() {
		System.out.println();
		System.out.println("Informe os valores para o vetor de elementos.");

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Elemento numero %d: ", (i + 1));
			elementos[i] = Integer.parseInt(sc.nextLine());
		}
	}

	// procedimento que mostra os elementos do vetor no terminal
	public static void mostraElementos() {
		System.out.println();
		System.out.println("Esses são os elementos do vetor.");

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Elemento: %d\n", elementos[i]);
		}
	}

	// metodo main da classe
	public static void main(String[] args) {
		pegaTamanho(); // tenho que chamar esse metodo aqui para o vetor nao ser instanciado com 0 elementos.
		elementos = new int[tamanho];

		pegaElementos();
		mostraElementos();
	}
}
