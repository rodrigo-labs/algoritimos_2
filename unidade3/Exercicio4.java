 /*
 * Programa/Script:
 *     Exercicio4
 *
 * Descricao:
 *     Exercicio proposto no material do curso de sistemas de informacao.
 *
 * Obs.:
 *     Deve ser rodado no terminal,
 *     a quantidade de alunos deve ser passada por parametros na chamado do programa.
 *
 * Versão 1.0:
 *     Implementado como pedido no exercicio.
 *
 * Autor:
 *     Rodrigo - rodrigomv.dev@gmail.com
 *
 * Data:
 *     Outubro de 2016.
 */
import java.util.Scanner;



public class Exercicio4 {

	// class aluno
	public static class Aluno {
		String nome;
		int idade;
		String sexo;
	}

	static Scanner sc = new Scanner(System.in);
	static int tamanho = 0;
	static Aluno[] alunos;

	// procedimento que define o tamanho do vetor
	public static void pegarTamanho() {
		System.out.print("Informe a quantidade de alunos a serem cadastrados: ");

		tamanho = Integer.parseInt(sc.nextLine());
	}

	// procedimento que popula o vetor alunos
	public static void pegarAlunos() {
		System.out.println();

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Informe os dados do %d aluno:\n", (i + 1));

			System.out.print("Nome: ");
			alunos[i].nome = sc.nextLine();

			System.out.print("Idade: ");
			alunos[i].idade = Integer.parseInt(sc.nextLine());

			System.out.print("Sexo: ");
			alunos[i].sexo = sc.nextLine();

			System.out.println();
		}
	}

	// metodo para mostrar alunos
	public static void mostrarAlunos() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println();
			System.out.printf("Aluno %d\n", (i + 1));
			System.out.println("Nome: " + alunos[i].nome);
			System.out.println("Idade: " + alunos[i].idade);
			System.out.println("Sexo: " + alunos[i].sexo);
		}
	}

	// metodo que ordena pelo nome
	public static void ordenaNome() {
		
	}

	// metodo que ordena pela idade
	public static void ordenaIdade() {
		
	}

	// metodo que mostra percentual feminino
	public static void mostraPercentual() {
		
	}

	// metodo main da classe
	public static void main(String[] args) {
		pegarTamanho(); // tenho que chamar esse metodo aqui para o vetor nao ser instanciado com 0 elementos.

		alunos = new Aluno[tamanho];

		for (int i = 0; i < tamanho; i++) {
			alunos[i] = new Aluno();
		}

		pegarAlunos();
		mostrarAlunos();
	}
}
