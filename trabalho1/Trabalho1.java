/* 
 * Programa/Script:
 *     Trabalho1
 *
 * Descricao:
 *     Primeiro trabalho da disciplina algoritimos 2.
 *
 * Obs.:
 *     Deve ser rodado no terminal, utiliza-se de caixas de dialogo.
 *     nota do trabalho: 10
 *
 * Versão 1.0:
 *     Trabalho implementado exatamente como foi pedido pelo professor.
 *
 * Autor:
 *     Rodrigo - rodrigomv.dev@gmail.com
 *
 * Data:
 *     Agosto de 2016.
 */

import javax.swing.*;

public class Trabalho1 {
    static final int LINHA = 3;
    static final int COLUNA = 4;

    public static void main(String[] args) {
        String[][] apt = new String[LINHA][COLUNA];
        String[][] dono = new String[LINHA][COLUNA];
        double[][] consumo = new double[LINHA][COLUNA];


        apt[0][0] = "101";
        apt[0][1] = "102";
        apt[0][2] = "103";
        apt[0][3] = "104";

        apt[1][0] = "201";
        apt[1][1] = "202";
        apt[1][2] = "203";
        apt[1][3] = "204";

        apt[2][0] = "301";
        apt[2][1] = "302";
        apt[2][2] = "303";
        apt[2][3] = "304";

        dono[0][0] = "Ricardo";
        dono[0][1] = "João";
        dono[0][2] = "Maria";
        dono[0][3] = "José";

        dono[1][0] = "Julia";
        dono[1][1] = "Marcos";
        dono[1][2] = "Paulo";
        dono[1][3] = "Pedro";

        dono[2][0] = "Bruno";
        dono[2][1] = "Isabela";
        dono[2][2] = "Rafaela";
        dono[2][3] = "Gabriel";


        // 1) Solicite ao usuário a leitura de eletricidade de cada apartamento, a mensagem que aparece para o usuário deve seguir o seguinte modelo: 
        //    "Olá (nome do dono do apartamento), insira a leitura do seu apartamento (número do apartamento): "
        //    Os campos entre parênteses devem ser substituídos pelos respectivos nomes e números.
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                consumo[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Olá " + dono[i][j] + ", insira a leitura do apartamento " + apt[i][j] + ":"));
            }
        }


        // 2) Mostre o gasto total do prédio em energia elétrica.
        double consumoTotal = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                consumoTotal += consumo[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "O consumo total de energia no prédio é de: " + consumoTotal);


        // 3) Média do consumo de energia elétrica do prédio.
        double mediaConsumo = 0;

        mediaConsumo = consumoTotal / (LINHA * COLUNA);

        JOptionPane.showMessageDialog(null, "O consumo médio de energia no prédio é de: " + mediaConsumo);


        // 4) Mostre o nome do morador que mais gasta e a leitura de energia do apartamento dele.
        double maiorConsumo = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (consumo[i][j] > maiorConsumo) {
                    maiorConsumo = consumo[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, dono[linhaMaior][colunaMaior] + " é o morador que mais gasta energia, com " + consumo[linhaMaior][colunaMaior] + " mensais.");


        // 5) Mostre o número do apartamento que menos gasta e a leitura de energia deste apartamento.
        double menorConsumo = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
            
                //usando o ou (||) para forcar o a inicializacao com o primeiro numero da matriz ou array
                if (consumo[i][j] < menorConsumo || menorConsumo == 0) {
                    menorConsumo = consumo[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, apt[linhaMenor][colunaMenor] + " é o apartamento que menos gasta energia, com " + consumo[linhaMenor][colunaMenor] + " mensais.");


        // 6) Solicite que o usuário informe o número de 1 dos apartamento, mostre o nome do dono deste apartamento.
        boolean flag = false;
        String elementoPesquisado = JOptionPane.showInputDialog("Informe o número do apartamento a ser pesquisado:");

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (apt[i][j].equalsIgnoreCase(elementoPesquisado)) {
                    JOptionPane.showMessageDialog(null, "O apartamento pesquisado pertence a " + dono[i][j]);
                    i = LINHA;
                    j = COLUNA;
                    flag = true;
                }
            }
        }

        if (!flag) {
            JOptionPane.showMessageDialog(null, "O apartamento não foi encontrado.");
        }


        // 7) Mostre todas as leituras de energia elétrica ordenadas. Para isso coloque todas as leituras em um novo vetor e ordene com o BubbleSort.
        double[] elementoOrdenado = new double[LINHA * COLUNA];
        double aux = 0;
        boolean troca = true;
        int fim = (LINHA * COLUNA) - 1;
        int contador = 0;
        String resposta = "";

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                elementoOrdenado[contador] = consumo[i][j];
                contador++;
            }
        }

        while (troca) {
            troca = false;
            for (int i = 0; i < fim; i++) {
                if (elementoOrdenado[i] > elementoOrdenado[i + 1]) {
                    aux = elementoOrdenado[i];
                    elementoOrdenado[i] = elementoOrdenado[i + 1];
                    elementoOrdenado[i + 1] = aux;
                    troca = true;
                }
            }
            fim--;
        }

        for (int i = 0; i < (LINHA * COLUNA); i++) {
            if (i == (LINHA * COLUNA - 1)) {
                resposta += " | " + elementoOrdenado[i] + " | ";
            } else {
                resposta += " | " + elementoOrdenado[i];
            }
        }

        JOptionPane.showMessageDialog(null, resposta);


        // 8) Mostre a porcentagem do número de apartamento em relação ao total, que gastam mais energia elétrica que a média do prédio.
        int acimaMedia = 0;
        double porcentagem = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (consumo[i][j] > mediaConsumo) {
                    acimaMedia++;
                }
            }
        }

        porcentagem = (acimaMedia * 100) / (LINHA * COLUNA);

        JOptionPane.showMessageDialog(null, porcentagem + "% dos moradores estao gastando acima da média de consumo do prédio");


        // 9) Mostre o nome do morador que mais gasta no segundo andar e a leitura de energia elétrica
        maiorConsumo = 0;
        linhaMaior = 0;
        colunaMaior = 0;

        for (int i = 1; i == 1; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (consumo[i][j] > maiorConsumo) {
                    maiorConsumo = consumo[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, dono[linhaMaior][colunaMaior] + " é o morador que mais gasta energia no segundo andar, com " + consumo[linhaMaior][colunaMaior] + " mensais.");


        // 10) Considerando os apartamento com final 3 (103,203,303), mostre o nome do dono do apartamento mais econômico e a leitura respectiva.
        menorConsumo = 0;
        linhaMenor = 0;
        colunaMenor = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 2; j == 2; j++) {
            
                //usando o ou (||) para forcar o a inicializacao com o primeiro numero da matriz ou array
                if (consumo[i][j] < menorConsumo || menorConsumo == 0) {
                    menorConsumo = consumo[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        JOptionPane.showMessageDialog(null, dono[linhaMenor][colunaMenor] + " é o morador que menos gasta energia nos apartamentos com final 3, com " + consumo[linhaMenor][colunaMenor] + " mensais.");
    }
}
