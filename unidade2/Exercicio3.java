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
 *     Setembro de 2016.
 *
 */

import java.util.Scanner;

public class Exercicio3 {
	static final int TAMANHO = 10;

    static class Aluno {
    	String nome;
		String semestre;
		String sala;
		String curso;
		double[] notas;
		Endereco endereco;
	}

	static class Endereco {
		String rua;
		int numero;
		String bairro;
		String cidade;
		String estado;
		String cep;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// 1) cadastro de um aluno
		Aluno aluno = new Aluno();

		System.out.print("Informe o nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Informe o Semestre: ");
		aluno.semestre = sc.nextLine();
		System.out.print("Informe a sala: ");
		aluno.sala = sc.nextLine();
		System.out.print("Informe o curso: ");
		aluno.curso = sc.nextLine();

		// populando as notas do aluno
		System.out.println("Informe as notas: ");
		aluno.notas = new double[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("    Nota " + (i + 1) + ": ");
			aluno.notas[i] = Double.parseDouble(sc.nextLine());
		}

		// populando o endereco do aluno
		aluno.endereco = new Endereco();

		System.out.println();
		System.out.print("Informe a rua: ");
		aluno.endereco.rua = sc.nextLine();
		System.out.print("Informe o numero: ");
		aluno.endereco.numero = Integer.parseInt(sc.nextLine());
		System.out.print("Informe o bairro: ");
		aluno.endereco.bairro = sc.nextLine();
		System.out.print("Informe a cidade: ");
		aluno.endereco.cidade = sc.nextLine();
		System.out.print("Informe o estado: ");
		aluno.endereco.estado = sc.nextLine();
		System.out.print("Informe o cep: ");
		aluno.endereco.cep = sc.nextLine();

		// mostrando o aluno cadastrado
		System.out.println();
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Semestre: " + aluno.semestre);
		System.out.println("Sala: " + aluno.sala);
		System.out.println("Curso: " + aluno.curso);

		for (int i = 0; i < 6; i++) {
			System.out.println("Nota " + (i + 1) + ": " + aluno.notas[i]);
		}

		System.out.println("Endereço:");
		System.out.println("    Rua: " + aluno.endereco.rua);
		System.out.println("    Numero: " + aluno.endereco.numero);
		System.out.println("    Bairro: " + aluno.endereco.bairro);
		System.out.println("    Cidade: " + aluno.endereco.cidade);
		System.out.println("    Estado: " + aluno.endereco.estado);
		System.out.println("    Cep: " + aluno.endereco.cep);


		// 2) Com 100 alunos
        // Populando o array alunos
        Aluno alunos[] = new Aluno[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
			alunos[i] = new Aluno();

			System.out.println("Informe o nome: ");
			alunos[i].nome = sc.nextLine();
			System.out.println("Informe o Semestre: ");
			alunos[i].semestre = sc.nextLine();
			System.out.println("Informe a sala: ");
			alunos[i].sala = sc.nextLine();
			System.out.println("Informe o curso: ");
			alunos[i].curso = sc.nextLine();

			// populando as notas
			System.out.println("Informe as notas: ");
			alunos[i].notas = new double[6];
			for (int j = 0; j < 6; j++) {
				System.out.println("Nota " + (j + 1) + ": ");
				alunos[i].notas[j] = Double.parseDouble(sc.nextLine());
			}

			// populando o endereco do aluno
			alunos[i].endereco = new Endereco();

			System.out.println("Informe a rua: ");
			alunos[i].endereco.rua = sc.nextLine();
			System.out.println("Informe o numero: ");
			alunos[i].endereco.numero = Integer.parseInt(sc.nextLine());
			System.out.println("Informe o bairro: ");
			alunos[i].endereco.bairro = sc.nextLine();
			System.out.println("Informe o estado: ");
			alunos[i].endereco.estado = sc.nextLine();
			System.out.println("Informe o cep: ");
			alunos[i].endereco.cep = sc.nextLine();
        }


		// 3) Quantos alunos pesquisar?
		System.out.println("Informe a quantidade de alunos a serem pesquisados: ");
		int quantidadePesquisa = Integer.parseInt(sc.nextLine());

		String[] elementoOrdenado = new String[quantidadePesquisa];
        String aux = "";
        boolean troca = true;
        int fim = (quantidadePesquisa) - 1;

        for (int i = 0; i < quantidadePesquisa; i++) {
                elementoOrdenado[i] = alunos[i].nome;
        }

        while (troca) {
            troca = false;
            for (int i = 0; i < fim; i++) {
                if (elementoOrdenado[i].charAt(0) > elementoOrdenado[i + 1].charAt(0)) {
                    aux = elementoOrdenado[i];
                    elementoOrdenado[i] = elementoOrdenado[i + 1];
                    elementoOrdenado[i + 1] = aux;
                    troca = true;
                } else if (elementoOrdenado[i].charAt(0) == elementoOrdenado[i + 1].charAt(0)) {
                	if (elementoOrdenado[i].charAt(1) > elementoOrdenado[i + 1].charAt(1)) {
						aux = elementoOrdenado[i];
                    	elementoOrdenado[i] = elementoOrdenado[i + 1];
                    	elementoOrdenado[i + 1] = aux;
                    	troca = true;
					}
                }
            }
            fim--;
        }

        // mostrar nome sem ordenacao
		System.out.println();
		System.out.println("Sem ordenação:");
        for (int i = 0; i < quantidadePesquisa; i++) {
            System.out.println(alunos[i].nome);
        }

        // mostrar nome ordenado
		System.out.println();
		System.out.println("Com ordenação:");
        for (int i = 0; i < quantidadePesquisa; i++) {
            System.out.println(elementoOrdenado[i]);
        }

    }
}
