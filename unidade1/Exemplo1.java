/*
*
*
*
*/

import javax.swing.*;

public class Exemplo1 {
	public static void main(String args[]) {
		int i;
		String nomes[] = new String[3];

		//varredura
		for(i = 0; i < 3; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome: ");
		}
	}
}

