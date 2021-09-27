package database.servicos;

import java.util.ArrayList;

import controllers.servicos.Refeicao;

public class DBRefeicao extends DBServico {
    // Dados de pré cadastro
<<<<<<< HEAD
    Refeicao refeicao = new Refeicao("10", "bife acebolado", "refrigerante", "farofa", 25.00);
    Refeicao refeicao1 = new Refeicao("11", "lasanha", "refrigerante", "ketchup", 20.00);
    Refeicao refeicao2 = new Refeicao("12", "frango a parmegiana", "cerveja", "farofa", 25.00);
    Refeicao refeicao3 = new Refeicao("13", "carne de sol", "cerveja", "batata frita", 20.00);
    Refeicao refeicao4 = new Refeicao("14", "frango grelhado", "refrigerante", "farofa", 15.00);
    Refeicao refeicao5 = new Refeicao("15", "peixe frito", "cerveja", "farofa", 15.00);
    Refeicao refeicao6 = new Refeicao("16", "porção de batata frita", "refrigerante", "ketchup", 10.00);
    Refeicao refeicao7 = new Refeicao("17", "porção de Beringela frita", "coca", "ketchup", 10.00);
    Refeicao refeicao8 = new Refeicao("18", "porção de cenoura frita", "vinho", "ketchup", 10.00);
    Refeicao refeicao9 = new Refeicao("19", "porção de beterraba cozida", "sprite", "ketchup", 10.00);

   

    // ArrayList armazena todos as Refeicao cadastrados
=======
    Refeicao refeicao = new Refeicao("10", "bife acebolado", "refrigerante", "farofa", 25.00, "33333333333");
    Refeicao refeicao1 = new Refeicao("11", "lasanha", "refrigerante", "ketchup", 20.00, "11111111111");
    Refeicao refeicao2 = new Refeicao("12", "frango a parmegiana", "cerveja", "farofa", 25.00, "33333333333");
    Refeicao refeicao3 = new Refeicao("13", "carne de sol", "cerveja", "batata frita", 20.00, "11111111111");
    Refeicao refeicao4 = new Refeicao("14", "frango grelhado", "refrigerante", "farofa", 15.00, "33333333333");
    Refeicao refeicao5 = new Refeicao("15", "peixe frito", "cerveja", "farofa", 15.00, "22222222222");
    Refeicao refeicao6 = new Refeicao("16", "porção de batata frita", "refrigerante", "ketchup", 10.00, "11111111111");
    Refeicao refeicao7 = new Refeicao("17", "porção de Beringela frita", "coca", "ketchup", 10.00, "33333333333");
    Refeicao refeicao8 = new Refeicao("18", "porção de cenoura frita", "vinho", "ketchup", 10.00, "22222222222");
    Refeicao refeicao9 = new Refeicao("19", "porção de beterraba cozida", "sprite", "ketchup", 10.00, "22222222222");

    // ArrayList armazena todos as Refeicoes cadastradas
>>>>>>> 92d4c5c5f5147d889b4996e37f38a11b03b796ab
    private ArrayList<Refeicao> refeicaoList = new ArrayList<Refeicao>();

    // Construtor sem argumentos, apenas para criação de objetos
    public DBRefeicao() {
        adicionarRefeicao(refeicao);
        adicionarRefeicao(refeicao1);
        adicionarRefeicao(refeicao2);
        adicionarRefeicao(refeicao3);
        adicionarRefeicao(refeicao4);
        adicionarRefeicao(refeicao5);
        adicionarRefeicao(refeicao6);
        adicionarRefeicao(refeicao7);
        adicionarRefeicao(refeicao8);
        adicionarRefeicao(refeicao9);
    
    }

    // Construtor de 1 argumento
    public DBRefeicao(Refeicao refeicao) {
     
    }

    /**
     * Recebe um objecto do tipo Refeicao e o adiciona na lista de refeiçoes
     * cadastrados no sistema
     * 
     * @param refeicao
     */
    public void adicionarRefeicao(Refeicao refeicao) {
        refeicaoList.add(refeicao);
    }

    /**
     * Recebe o código de um produto e o remove da lista de produtos do sistema
     * 
     * @param removido
     */
    public void removerRefeicao(Refeicao removido) {

        refeicaoList.remove(removido);
    }

    /**
     * Recebe o código de uma refeicao e retorna a refeicaocorrespondente
     * 
     * @param codigo
     * @return Object<Refeicao>
     */
    public Refeicao detalharRefeicao(String codigo) {
        Refeicao refeicaoEncontrada = null;

        for (Refeicao element : refeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                refeicaoEncontrada = element;
            }
        }

        return refeicaoEncontrada;
    }

    /**
     * Retorna a lista de todas as refeicoes cadastradas no sistema
     * 
     * @return ArrayList<Refeicao>
     */
    public ArrayList<Refeicao> returnRefeicao() {
        return refeicaoList;
    }
}
