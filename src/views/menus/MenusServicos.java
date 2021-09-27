package views.menus;

import java.util.Scanner;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import controllers.servicos.Refeicao;

public class MenusServicos {
    // Consturtor
    public MenusServicos() {
    };

    Scanner input;

    /**
     * Retornar a opcao que o usuario deseja cadastrar/comprar
     * 
     * @return int opcao
     */
    public int selecionarCategoria() {
        int opcao = 0;
        input = new Scanner(System.in);

        System.out.println("---------------Selecionar Categoria -----------------");
        System.out.println("\n1 - Produto");
        System.out.println("\n2 - Refeição");
        System.out.println("\n3 - Plano de Refeição");

        opcao = input.nextInt();

        return opcao;

    }

    /**
     * Método de cadastro de produto. Retorna as informações de cadastro informadas
     * pelo usuario
     * 
     * @return Object<Produtos>
     */
    public ProdutoMercado cadastrarProduto() {
        String nome, codigo, responsavel = " ";
        double valor = 0.0;
        int estoque = 0;
        input = new Scanner(System.in);

        System.out.println("\nCodigo: ");
        codigo = input.nextLine();
        System.out.println("\nNome: ");
        nome = input.nextLine();
        System.out.println("\nValor: ");
        valor = input.nextDouble();
        System.out.println("\nQuantidade em Estoque: ");
        estoque = input.nextInt();
        System.out.println("CPF do Responsável: ");
        responsavel = input.nextLine();

        ProdutoMercado data = new ProdutoMercado(codigo, nome, valor, estoque, responsavel);

        return data;
    }

    /**
     * Método de cadastro de refeicoes. Retorna as informações de cadastro
     * informadas pelo usuario
     * 
     * @return Object<Refeicao>
     */
    public Refeicao cadastrarRefeicao() {

        String codigo, nome, bebida, acompanhamento, responsavel = " ";
        double valor = 0.0;
        input = new Scanner(System.in);

        System.out.println("\nCodigo: ");
        codigo = input.nextLine();
        System.out.println("\nNome: ");
        nome = input.nextLine();
        System.out.println("\nBebida: ");
        bebida = input.nextLine();
        System.out.println("\nAcompanhamento: ");
        acompanhamento = input.nextLine();
        System.out.println("/nValor: ");
        valor = input.nextDouble();
        System.out.println("CPF do Responsável: ");
        responsavel = input.nextLine();

        Refeicao data = new Refeicao(codigo, nome, bebida, acompanhamento, valor, responsavel);

        return data;

    }

    /**
     * Método de cadastro de planos de refeicao. Retorna todas as informações de
     * cadastro infomadas pelo usuario
     * 
     * @return Object<PlanoDeRefeicao>
     */
    public PlanoDeRefeicao cadastrarPlanoDeRefeicao() {
        String codigo, nome, responsavel = " ";
        int duracao, marmitex = 0;
        double valor = 0.0;
        input = new Scanner(System.in);

        System.out.println("\nCodigo: ");
        codigo = input.nextLine();
        System.out.println("\nNome: ");
        nome = input.nextLine();
        System.out.println("\nDuração (Semanas): ");
        duracao = input.nextInt();
        System.out.println("\nQuantidade de Marmitex: ");
        marmitex = input.nextInt();
        System.out.println("\nValor: ");
        valor = input.nextDouble();
        System.out.println("CPF do Responsável: ");
        responsavel = input.nextLine();

        PlanoDeRefeicao data = new PlanoDeRefeicao(codigo, nome, duracao, marmitex, valor, responsavel);

        return data;
    }

    /**
     * Retorna o codigo do produto/refeicao/plano de refeicao informado pelo usuario
     * 
     * @return String codigo
     */
    public String selecionarProduto() {
        String codigo = " ";
        input = new Scanner(System.in);

        System.out.println("\nInsira o código do produto: ");
        codigo = input.next();

        return codigo;
    }

}
