package database.servicos;

import java.util.ArrayList;

import controllers.servicos.PlanoDeRefeicao;

public class DBPlanoDeRefeicao extends DBServico {
    // Dados de pré cadastro
    PlanoDeRefeicao plano = new PlanoDeRefeicao("17", "gordo", 12, 300, 1000);
    PlanoDeRefeicao plano1 = new PlanoDeRefeicao("18", "magro", 12, 150, 500);
    PlanoDeRefeicao plano2 = new PlanoDeRefeicao("19", "medio", 12, 170, 600);
    PlanoDeRefeicao plano3 = new PlanoDeRefeicao("20", "gordin", 12, 200, 700);
    PlanoDeRefeicao plano4 = new PlanoDeRefeicao("21", "hulk", 12, 450, 1500);
    PlanoDeRefeicao plano5 = new PlanoDeRefeicao("22", "Premium", 12, 450, 1900);
    PlanoDeRefeicao plano6 = new PlanoDeRefeicao("23", "Deluxe", 12, 450, 3000);
    PlanoDeRefeicao plano7 = new PlanoDeRefeicao("24", "Deluxe", 12, 450, 3200);
    PlanoDeRefeicao plano8 = new PlanoDeRefeicao("25", "Deluxe", 12, 450, 3100);
    PlanoDeRefeicao plano9 = new PlanoDeRefeicao("26", "Deluxe", 12, 450, 3000);

    // ArrayList armazena todos os PlanoDeRefeicao cadastrados
    private ArrayList<PlanoDeRefeicao> planoDeRefeicaoList = new ArrayList<PlanoDeRefeicao>();

    // Construtor sem argumentos, apenas para criação de objetos
    public DBPlanoDeRefeicao() {
        adicionarPlanoDeRefeicao(plano);
        adicionarPlanoDeRefeicao(plano1);
        adicionarPlanoDeRefeicao(plano2);
        adicionarPlanoDeRefeicao(plano3);
        adicionarPlanoDeRefeicao(plano4);
        adicionarPlanoDeRefeicao(plano5);
        adicionarPlanoDeRefeicao(plano6);
        adicionarPlanoDeRefeicao(plano7);
        adicionarPlanoDeRefeicao(plano8);
        adicionarPlanoDeRefeicao(plano9);
    }

    // Construtor de 1 argumento
    public DBPlanoDeRefeicao(PlanoDeRefeicao planoDeRefeicao) {
      
    }

    // Recebe um objeto do tipo PlanoDeRefeicao e adiciona à lista de
    // planoDeRefeicaos
    public void adicionarPlanoDeRefeicao(PlanoDeRefeicao planoDeRefeicao) {
        planoDeRefeicaoList.add(planoDeRefeicao);
    }

    // Retorna todos os planoDeRefeicaos cadastrados no array de planoDeRefeicaos
    public ArrayList<PlanoDeRefeicao> returnPlanoDeRefeicao() {
        return planoDeRefeicaoList;
    }
}
