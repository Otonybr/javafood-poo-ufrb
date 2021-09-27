package views.menus;

import java.util.Scanner;

public class MenuMain {

    public MenuMain() {
    };

    Scanner input = new Scanner(System.in);

    /**
     * Menu inicial do sistema. Exibe formulario para seleção de cadastro ou login
     * 
     * @return int opcao
     */
    public int exibirMenuInicial() {
        int opcao;

        System.out.println("------------------------------- JavaFood ----------------------------------");
        System.out.println("\n0 - Sair\n");
        System.out.println("\n1 - Login\n");
        System.out.println("\n2 - Cadastrar-se\n");
        opcao = input.nextInt();

        return opcao;
    }

    /**
     * Retorna a opção do menu digitada pelo usuario
     * 
     * @return int opcao
     */
    public int exibirMenuPrincipal() {

        System.out.print("\n-------------------------------MENU------------------------------");
        System.out.println("\n\n[0] Logout");
        System.out.println("\n[1] Ver lista de produtos");
        System.out.println("\n[2] Detalhes do produto");
        System.out.println("\n[3] Cadastrar frete");
        System.out.println("\n[4] Lista de fretes");
        System.out.println("\n[5] Editar frete");
        System.out.println("\n[6] Excluir frete");
        System.out.println("\n[7] Cadastrar Serviço");
        System.out.println("\n[8] Editar Serviço");
        System.out.println("\n[9] Excluir Serviço");
        System.out.println("\n[10] Comprar");

        int opcao = input.nextInt();

        return opcao;
    }
}
