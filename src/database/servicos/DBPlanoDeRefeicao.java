package database.servicos;

import java.util.ArrayList;

import controllers.servicos.PlanoDeRefeicao;

public class DBPlanoDeRefeicao extends DBServico {
    // Dados de pré cadastro
    PlanoDeRefeicao plano = new PlanoDeRefeicao("17", "gordo", 12, 300, 1000, "11111111111");
    PlanoDeRefeicao plano1 = new PlanoDeRefeicao("18", "magro", 12, 150, 500, "22222222222");
    PlanoDeRefeicao plano2 = new PlanoDeRefeicao("19", "medio", 12, 170, 600, "22222222222");
    PlanoDeRefeicao plano3 = new PlanoDeRefeicao("20", "gordin", 12, 200, 700, "11111111111");
    PlanoDeRefeicao plano4 = new PlanoDeRefeicao("21", "hulk", 12, 450, 1500, "44444444444");
    PlanoDeRefeicao plano5 = new PlanoDeRefeicao("22", "Premium", 12, 450, 1900, "44444444444");
    PlanoDeRefeicao plano6 = new PlanoDeRefeicao("23", "Deluxe", 12, 450, 3000, "44444444444");
    PlanoDeRefeicao plano7 = new PlanoDeRefeicao("24", "Deluxe", 12, 450, 3200, "44444444444");
    PlanoDeRefeicao plano8 = new PlanoDeRefeicao("25", "Deluxe", 12, 450, 3100, "44444444444");
    PlanoDeRefeicao plano9 = new PlanoDeRefeicao("26", "Deluxe", 12, 450, 3000, "44444444444");

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

<<<<<<< HEAD
    // Construtor de 1 argumento
    public DBPlanoDeRefeicao(PlanoDeRefeicao planoDeRefeicao) {
      
    }

    // Recebe um objeto do tipo PlanoDeRefeicao e adiciona à lista de
    // planoDeRefeicaos
=======
    /**
     * Recebe um objecto do tipo PlanoDeRefeicao e o adiciona na lista de refeicoes
     * do sistemas
     * 
     * @param planoDeRefeicao
     */
>>>>>>> 92d4c5c5f5147d889b4996e37f38a11b03b796ab
    public void adicionarPlanoDeRefeicao(PlanoDeRefeicao planoDeRefeicao) {
        planoDeRefeicaoList.add(planoDeRefeicao);
    }

    /**
     * Recebe um object do tipo PlanoDeRefeicao e o remove da lista de planos de
     * refeicao do sistema
     * 
     * @param pRemovido
     */
    public void removerPlanoDeRefeicao(PlanoDeRefeicao pRemovido) {
        planoDeRefeicaoList.remove(pRemovido);
    }

    /**
     * Recebe o código de um plano de refeicao e retorna a plano de refeicao
     * correspondente
     * 
     * @param codigo
     * @return Object<PlanoDeRefeicao>
     */
    public PlanoDeRefeicao detalharPlanoDeRefeicao(String codigo) {
        PlanoDeRefeicao planoDeRefeicaoEncontrado = null;

        for (PlanoDeRefeicao element : planoDeRefeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                planoDeRefeicaoEncontrado = element;
            }
        }

        return planoDeRefeicaoEncontrado;
    }

    /**
     * Retorna a lista de planos de refeicao cadastradas no sistema
     * 
     * @return ArrayList<PlanoDeRefeicao>
     */
    public ArrayList<PlanoDeRefeicao> returnPlanoDeRefeicao() {
        return planoDeRefeicaoList;
    }
}
