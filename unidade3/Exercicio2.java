 /*
 * Programa/Script:
 *     Exercicio2
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

public class Exercicio2 {
	static Scanner sc = new Scanner(System.in);
	static int tamanho = 0;
	static double[] elementos;
	static double soma = 0;

	// procedimento que define o tamanho do vetor
	public static void pegarTamanho() {
		System.out.print("Informe o tamanho do vetor de elementos reais: ");

		tamanho = Integer.parseInt(sc.nextLine());
	}

	// procedimento que popula o vetor elementos
	public static void pegarElementos() {
		System.out.println();
		System.out.println("Informe os valores para o vetor de elementos.");

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Elemento numero %d: ", (i + 1));
			elementos[i] = Double.parseDouble(sc.nextLine());
		}
	}

	// procedimento que faz a soma dos elementos do vetor
	public static void somarElementos() {
		for (int i = 0; i < tamanho; i++) {
			soma += elementos[i];
		}
	}

	// procedimento que mostra os elementos do vetor no terminal
	public static void mostrarSoma() {
		System.out.println();
		System.out.printf("A soma dos elementos é: %.2f\n", soma);
	}

	// metodo main da classe
	public static void main(String[] args) {
		pegarTamanho(); // tenho que chamar esse metodo aqui para o vetor nao ser instanciado com 0 elementos.
		elementos = new double[tamanho];

		pegarElementos();
		somarElementos();
		mostrarSoma();
	}
}
