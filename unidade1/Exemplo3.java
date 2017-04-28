import javax.swing.*;

public class Exemplo3 {
	public static void main(String args[]) {
		int i;
		String nomes[] = new String[20];

		//populando as informacoes
		nomes[0] = "Unisul";
		nomes[1] = "Aluno";
		nomes[2] = "Sistema";

		//varredura
		for(i = 0; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "O nome na posição " + i + " e " + nomes[i]);
		}
	}
}

