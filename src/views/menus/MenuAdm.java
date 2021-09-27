package views.menus;

import java.util.Scanner;

public class MenuAdm {

    public MenuAdm() {

    }

    //instancia de Scanner
    Scanner input = new Scanner(System.in);

    /**
     * Retorna a opção do menu digitada pelo usuario
     * 
     * @return int opcao
     */
    public int exibirMenuAdmin() {

        System.out.print("\n-------------------------------MENU------------------------------");
        System.out.println("\n\n[0] Logout");
        System.out.println("\n[1] Ver produtos do sistema");
        System.out.println("\n[2] Detalhar produto");
        System.out.println("\n[3] Cadastrar frete");
        System.out.println("\n[4] Ver fretes do sistema");
        System.out.println("\n[5] Editar frete");
        System.out.println("\n[6] Excluir frete");
        System.out.println("\n[7] Cadastrar Serviço");
        System.out.println("\n[8] Editar Serviço");
        System.out.println("\n[9] Excluir Serviço");
        System.out.println("\n[10] Comprar");
        System.out.println("\n[11] Listar produtos de um usuário: ");

        int opcao = input.nextInt();

        return opcao;
    }
}
