import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);

		char option;

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
				System.out.println("O valor da linha " + i + " coluna " + j + ": " + matriz[i][j]);
			}
		}
	}
}

		do {

			//menu de opcoes
			System.out.print();
			System.out.print("-----MENU-----");
			option = sc.next().charAt(0);
			switch (option.toUpperCase()) {
				case "A":
					break;

				case "B":
					break;

				case "C":
					break;

				case "D":
					break;

				case "E":
					break;

				case "F":
					break;

				case "G":
					break;

				case "H":
					break;

				case "I":
					break;

				case "J":
					break;

				case "K":
					break;

				case "L":
					break;

				case "M":
					break;

				case "N":
					break;

				case "O":
					break;

				case "P":
					break;

				default:

			} while (option != "X")
		}
	}

}
