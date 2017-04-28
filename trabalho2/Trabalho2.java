import javax.swing.*;


class Conta {
    int id;
    String descricao;
    String data;
    double valor;
    String observacao;

    static int proximaConta = 1;


    // metodo que cria uma a nova conta
    void adicionar() {
        id = proximaConta++;

        descricao = JOptionPane.showInputDialog("Descrição: ");
        data = JOptionPane.showInputDialog("Data: ");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        observacao = JOptionPane.showInputDialog("Observação: ");
    }

    // metodo que mostra uma conta cadastrada
     String mostrar() {
        String mostra = "\nIdentificação: " + id +
                        "\nDescrição: " + descricao +
                        "\nData: " + data +
                        "\nValor: " + valor +
                        "\nObservação: " + observacao;
         return mostra;
    }
}


class CarteiraDeContas {
    String dono;
    Conta[] contas;
    
    int posicaoLivre = 0;
    static final int NUMERO_CONTAS = 10;


    // metodo que cria uma carteira
    void adicionaCarteira() {
        dono = JOptionPane.showInputDialog("Nova Carteira\n\nDono da carteira: ");
        contas = new Conta[NUMERO_CONTAS];
        return 
    }

    // metodo que adiciona uma conta a carteira
    void adicionarConta() {
        if (posicaoLivre < NUMERO_CONTAS) {
            contas[posicaoLivre] = new Conta();

            contas[posicaoLivre].adicionar();
            posicaoLivre++;
        } else {
            JOptionPane.showMessageDialog(null, dono + " você chegou ao limite de cadastros.");
        }
    }

    // metodo que exclui uma conta da carteira
    boolean excluirConta(int id) {
        for (int i = 0; i < posicaoLivre; i++) {
            if (contas[i].id == id) {
                contas[i] = null;

                return true;
            }
        }

        return false;
    }

    // metodo que procura uma conta na carteira
    Conta procurarConta(int id) {
        for (int i = 0; i < posicaoLivre; i++) {
            if (contas[i].id == id) {
                return contas[i];
            }
        }

        return null;
    }

    // metodo que devolve uma lista de contas da carteira
    String listarContas() {
        String lista = "Lista de contas cadastradas.";

        for (int i = 0; i < posicaoLivre; i++) {
            if (contas[i] != null) {
                lista += "\n" + contas[i].mostrar();
            }
        }

        return lista;
    }

    // metodo que soma o valor total das contas da carteira
    double somarContas() {
        double soma = 0;

        for (int i = 0; i < posicaoLivre; i++) {
            if (contas[i] != null) {
                soma += contas[i].valor;
            }
        }

        return soma;
    }
}


public class Trabalho2 {

    public static void main(String[] args) {
        CarteiraDeContas carteira = new CarteiraDeContas();

        carteira.adicionaCarteira();
        String menu = "Menu do Sistema\n\n" +
                      "0 - Sair do programa\n" +
                      "1 - Incluir conta\n" +
                      "2 - Excluir conta\n" +
                      "3 - Pesquisar conta\n" +
                      "4 - Listar Contas\n" +
                      "5 - Somar debitos";

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // interacao com o menu do sistema
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, carteira.dono + " informe os dados da nova conta.");
                    carteira.adicionarConta();
                    break;

                case 2:
                    boolean excluiu = carteira.excluirConta(Integer.parseInt(JOptionPane.showInputDialog(carteira.dono + " informe o indice a ser excluido: ")));

                    if (excluiu) {
                        JOptionPane.showMessageDialog(null, "Conta excluida com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta nao encontrada.");
                    }
                    break;

                case 3:
                    Conta contaPesquisada = carteira.procurarConta(Integer.parseInt(JOptionPane.showInputDialog(carteira.dono + " informe o indice a ser pesquisado: ")));

                    if (contaPesquisada != null) {
                        JOptionPane.showMessageDialog(null, contaPesquisada.mostrar());
                    } else {
                        JOptionPane.showMessageDialog(null, "Conta nao encontrada!");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, carteira.listarContas());
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Olá " + carteira.dono + ", Voce deve um total de R$" + carteira.somarContas());
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo " + carteira.dono);
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida!");
                    break;
            }

        } while (true);
    }
}
