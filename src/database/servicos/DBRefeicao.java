package database.servicos;

import java.util.ArrayList;

import controllers.servicos.Refeicao;

public class DBRefeicao extends DBServico {
    // Dados de pré cadastro
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

    // Recebe um objeto do tipo Refeicao e adiciona à lista de refeicaos
    public void adicionarRefeicao(Refeicao refeicao) {
        refeicaoList.add(refeicao);
    }

    // Retorna todos os refeicaos cadastrados no array de refeicaos
    public ArrayList<Refeicao> returnRefeicao() {
        return refeicaoList;
    }
}
