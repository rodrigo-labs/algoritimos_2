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
 *     Setembro de 2016.
 */

import java.util.Scanner;

public class Exercicio1 {
    static final int TAMANHO = 3;

    static class Pessoa {
        String nome;
        double altura;
        int idade;
        String profissao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[TAMANHO];

        // populando o array pessoas
        for (int i = 0; i < TAMANHO; i++) {
            pessoas[i] = new Pessoa();

            System.out.print("Informe o nome: ");
            pessoas[i].nome = sc.nextLine();
            System.out.print("Informe a altura: ");
            pessoas[i].altura = Double.parseDouble(sc.nextLine());
            System.out.print("Informe a idade: ");
            pessoas[i].idade = Integer.parseInt(sc.nextLine());
            System.out.print("Informe a profissao: ");
            pessoas[i].profissao = sc.nextLine();
            System.out.println();
        }

        // Mostrando as pessoas cadastradas
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println();
            System.out.println(pessoas[i].nome);
            System.out.println(pessoas[i].altura);
            System.out.println(pessoas[i].idade);
            System.out.println(pessoas[i].profissao);
        }
    }
}
