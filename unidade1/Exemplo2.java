import javax.swing.*;

public class Exemplo2 {
	public static void main(String args[]) {
		int i;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
		int vetor[] = new int[n]; // declarando o vetor

		//varredura
		for(i = 0; i< n; i++ ) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		}
	}
}

