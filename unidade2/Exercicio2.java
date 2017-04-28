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
 *     Setembro de 2016.
 *
 * TODO:
 *     Usar o tipo FiguraGeometrica no lugar do indice.
 */

import java.util.Scanner;

public class Exercicio2 {

    static class FiguraGeometrica{
        double area;
        String cor;
        int tipo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de figuras: ");
		int tamanho = Integer.parseInt(sc.nextLine());

		FiguraGeometrica[] figuras = new FiguraGeometrica[tamanho];


		// populando o array figuras
        for (int i = 0; i < tamanho; i++) {
            figuras[i] = new FiguraGeometrica();

            System.out.println();

            System.out.print("Informe a area: ");
            figuras[i].area = Double.parseDouble(sc.nextLine());
            System.out.print("Informe a cor: ");
            figuras[i].cor = sc.nextLine();
            System.out.print("Informe o tipo ");
			System.out.print("| 1 - Triangulo | 2 - Circulo | 3 - Quadrado: ");
           	figuras[i].tipo = Integer.parseInt(sc.nextLine());
            System.out.println();
        }


		// a) total da area das figuras geometicas
		double areaTotal = 0;

		for (int i = 0; i < tamanho; i++) {
			areaTotal += figuras[i].area;
		}

		System.out.printf("A area total das figuras e %.2f %n", areaTotal);


		// b) o tipo da maior figura geometrica
		FiguraGeometrica maiorFigura = new FiguraGeometrica();

		for (int i = 0; i < tamanho; i++) {
			if (figuras[i].area > maiorFigura.area) {
				maiorFigura = figuras[i];
			}
		}

		if (figuras[maiorIndice].tipo == 1) {
			System.out.println("A maior figura e um Triangulo");
		} else if (figuras[maiorIndice].tipo == 2) {
			System.out.println("A maior figura e um Circulo");
		} else {
			System.out.println("A maior figura e um Quadrado");
		}


		// c) a quantidade de circulos
		int totalCirculos = 0;

		for (int i = 0; i < tamanho; i++) {
			if (figuras[i].tipo == 2) {
				totalCirculos++;
			}
		}

		System.out.printf("Total de %d circulos.%n", totalCirculos);


        // d) o percentual de quadrados em relacao ao total
        int totalQuadrados = 0;
		double porcentagem = 0;

		for (int i = 0; i < tamanho; i++) {
			if (figuras[i].tipo == 3) {
				totalQuadrados++;
			}
        }

		porcentagem = (totalQuadrados * 100) / tamanho;

		System.out.print(porcentagem + "% sao Quadrados.");
    }
}
