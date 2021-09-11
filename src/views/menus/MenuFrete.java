package views.menus;

import java.util.Scanner;

import controllers.servicos.frete.Frete;

public class MenuFrete {

    public MenuFrete() {
    };

    Scanner input = new Scanner(System.in);

    /**
     * Método de cadastro de fretes. Retorna todas as informações de cadastros
     * informadas pelo usuario
     * 
     * @return Object<Frete>
     */
    public Frete cadastrarFrete() {
        String empresa;
        int prazo;
        double valorMinimo;

        System.out.println("-------------------Cadastrar Frete-------------------------");
        System.out.println("\n\nNome da Empresa: ");
        empresa = input.nextLine();
        System.out.println("\nPrazo: ");
        prazo = input.nextInt();
        System.out.println("\nvalor: ");
        valorMinimo = input.nextDouble();

        Frete data = new Frete(empresa, prazo, valorMinimo);

        return data;
    }
}
