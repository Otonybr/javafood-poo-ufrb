package views.menus;

import java.util.Scanner;

public class MenuSelecionarCategoria {
    public MenuSelecionarCategoria() {

    }

    Scanner input = new Scanner(System.in);

    // Método retorna o codigo da categoria desejada
    public int selecionarCategoria() {
        System.err.println("------------------Selecionar Categoria------------------");
        System.out.println("\nInforme a categoria do produto desejado: \n");
        System.out.println("1 - Produto de Mercado\n 2 - Refeição\n 3 - Plano de Refeição\n");
        int opcao = input.nextInt();

        return opcao;
    }
}
