package views.menus;

import java.util.Scanner;

import database.servicos.frete.DBFrete;

public class MenuSelecionarFrete {
    public MenuSelecionarFrete() {

    }

    Scanner input = new Scanner(System.in);

    //Instância de DBFrete
    DBFrete fretesDisponiveis = new DBFrete();

    // Método retorna o codigo da Frete desejada
    public int selecionarFrete() {
        System.err.println("------------------Selecionar Frete------------------");
        System.out.println("\nInforme o código Frete desejado: \n");
        fretesDisponiveis.returnFretes();
        int opcao = input.nextInt();

        return opcao;
    }
}
