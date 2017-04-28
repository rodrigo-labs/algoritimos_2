import java.util.Scanner;

//BubbleSort
public class Exemplo5Resposta {
	public static void main(String args[]) {
		int tamanho, troca, fim, i, aux;
		int vetorOrdenar[];
		String mostraVetor = "";
		Scanner sc = new Scanner(System.in);

		//Pegando o tamanho do vetor
		System.out.print("Informe o tamanho do vetor: ");
		tamanho = sc.nextInt();
		vetorOrdenar = new int[tamanho];

		//Populando vetor
		for(i = 0; i < tamanho; i++) {
			System.out.printf("%d° valor: ", (i + 1));
			vetorOrdenar[i] = sc.nextInt();
		}

		//Iniciando a varredura
		troca = 1;
		fim = tamanho - 1;
		while(troca == 1) {
			troca = 0;
			for(i = 0; i < fim; i++) {
				if (vetorOrdenar[i] > vetorOrdenar[i + 1]) {
					aux = vetorOrdenar[i];
					vetorOrdenar[i] = vetorOrdenar[i + 1];
					vetorOrdenar[i + 1] = aux;
					troca = 1;
				}
			}
			fim = fim - 1;
		}

		//Mostrando vetor ordenado
		for(i = 0; i < tamanho; i++) {
			if(i == 0) {
				mostraVetor += vetorOrdenar[i];
			} else {
				mostraVetor += " - " + vetorOrdenar[i];
			}
		}
		System.out.println("Vetor Ordenado: " + mostraVetor);
	}
}

