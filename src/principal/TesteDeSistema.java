package principal;

import java.util.ArrayList;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import controllers.servicos.Refeicao;
import controllers.servicos.frete.Frete;
import controllers.usuarios.Usuario;
import database.servicos.DBPlanoDeRefeicao;
import database.servicos.DBProdutoMercado;
import database.servicos.DBRefeicao;
import database.servicos.frete.DBFrete;
import database.usuario.DBUsuario;

public class TesteDeSistema {

    // Instância de DBUsuario
    static DBUsuario modelUsuario = new DBUsuario();
    // Instância de DBProdutoMercado
    static DBProdutoMercado modelProdutoMercado = new DBProdutoMercado();
    // Instância de DBRefeicao
    static DBRefeicao modelRefeicao = new DBRefeicao();
    // Instância de DBPlanoDeRefeicao
    static DBPlanoDeRefeicao modelPlanoDeRefeicao = new DBPlanoDeRefeicao();
    // Instância de DBFrete
    static DBFrete modelFrete = new DBFrete();

    static ArrayList<Usuario> usuario = modelUsuario.returnUsuario();
    // Array de objectos do tipo ProdutoMercado
    static ArrayList<ProdutoMercado> produtoMercadoList = modelProdutoMercado.returnProdutoMercado();
    // Array de objetos do tipo Refeicao
    static ArrayList<Refeicao> refeicaoList = modelRefeicao.returnRefeicao();
    // Array de objectos do tipo PlanoDeRefeicao
    static ArrayList<PlanoDeRefeicao> planoDeRefeicaoList = modelPlanoDeRefeicao.returnPlanoDeRefeicao();
    // Array de objetos do tipo Frete
    static ArrayList<Frete> freteList = modelFrete.returnFretes();

    public static void main(String[] args) {
        // Caso autenticar-se
        // autenticar(false);

        // Caso cadastrar-se
        // Usuario usuario = new Usuario("claudio", "rubens", "55555555", "rio",
        // "claddin@mail.com", "martelo");
        // cadastrarUsuario(usuario);

        // Caso cadastrar anuncio
        // ProdutoMercado produtoMercado = new ProdutoMercado("3435", "Carne Alcatra",
        // 42.90, 40);
        // Refeicao refeicao = new Refeicao("24345", "Churrasco magro", "Suco de Couve",
        // "Salada", 2.0);
        // PlanoDeRefeicao planoDeRefeicao = new PlanoDeRefeicao("364", "Deluxe", 30, 5,
        // 1.0);
        // cadastrarProdutoMercado(produtoMercado);
        // cadastrarRefeicao(refeicao);
        // cadastrarPlanoDeRefeicao(planoDeRefeicao);

        // Caso Listar anuncio
        // listarProdutos();
        // listarRefeicoes();
        // listarPlanosDeRefeicao();

        // Caso Detalhar anuncio
        // detalharProduto("1");
        // detalharRefeicao("14");
        // detalharPlanoDeRefeicao("25");

        // Caso de remover anuncio
        // removerProduto("1");
        // removerRefeicao("14");
        // removerPlanoDeRefeicao("25");
    }

    /**
     * Analisa os dados de login do usuario e conferem com os dados cadastrados no
     * sistem
     * 
     * @param verificacao
     */
    public static void autenticar(boolean verificacao) {
        System.out.println("\n----------Teste autenticar--------");
        if (verificacao) {
            System.out.println("\nUsuário autenticado! Tem acesso ao sistema.");
        } else {
            System.out.println("\nUsuário não autenticado! Dados não conferem.");
        }
    }

    /**
     * adiciona o usuario a lista de usuarios cadastrados
     * 
     * @param user
     */
    public static void cadastrarUsuario(Usuario user) {
        System.out.println("cadastrando usuario...");
        usuario.add(user);
        System.out.println("usuario cadastrado");

    }

    /**
     * cadastra serviços. ProdutoMercado
     * 
     * @param produtoMercado
     */
    public static void cadastrarProdutoMercado(ProdutoMercado produtoMercado) {
        produtoMercadoList.add(produtoMercado);
        System.out.println("Produto cadastrado com sucesso");

    }

    /**
     * cadastra serviços. Refeicao
     * 
     * @param refeicao
     */
    public static void cadastrarRefeicao(Refeicao refeicao) {
        refeicaoList.add(refeicao);
        System.out.println("Refeicao cadastrada com sucesso");

    }

    /**
     * cadastra serviços. PlanoDeRefeicao
     * 
     * @param planoDeRefeicao
     */
    public static void cadastrarPlanoDeRefeicao(PlanoDeRefeicao planoDeRefeicao) {
        planoDeRefeicaoList.add(planoDeRefeicao);
        System.out.println("Plano De Refeicao cadastrado com sucesso");

    }

    /**
     * Cadastrar frete
     * 
     * @param frete
     */
    public static void cadastrarFrete(Frete frete) {
        freteList.add(frete);
        System.out.println("Frete cadastrado com sucesso!");
    }

    /**
     * Lista todos os produtos cadastrados
     */
    public static void listarProdutos() {
        for (ProdutoMercado element : produtoMercadoList) {
            System.out.println(element.toString());
            ;
        }
    }

    /**
     * Lista todos os refeicoes cadastrados
     */
    public static void listarRefeicoes() {
        for (Refeicao element : refeicaoList) {
            System.out.println(element.toString());
        }
    }

    /**
     * Lista todos os refeicoes cadastrados
     */
    public static void listarPlanosDeRefeicao() {
        for (PlanoDeRefeicao element : planoDeRefeicaoList) {
            element.toString();
        }
    }

    /**
     * Recebe o codigo de um produto e exibe todas as suas informaçoes
     * 
     * @param codigo
     */
    public static void detalharProduto(String codigo) {
        for (ProdutoMercado element : produtoMercadoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println(element.toString());
            }
        }
    }

    /**
     * Recebe o codigo de uma refeicao e exibe todas as suas informaçoes
     * 
     * @param codigo
     */
    public static void detalharRefeicao(String codigo) {
        for (Refeicao element : refeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println(element.toString());
            }
        }
    }

    /**
     * Recebe o codigo de um plano de refeicao e exibe todas as suas informaçoes
     * 
     * @param codigo
     */
    public static void detalharPlanoDeRefeicao(String codigo) {
        for (PlanoDeRefeicao element : planoDeRefeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println(element.toString());
            }
        }
    }

    /**
     * Recebe o codigo de um produto e o remove da lista de produtos cadastrados
     * 
     * @param codigo
     */
    public static void removerProduto(String codigo) {
        for (ProdutoMercado element : produtoMercadoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println(" Produto removido: " + element.getNome());
                produtoMercadoList.remove(element);
                break;
            }
        }
    }

    /**
     * Recebe o codigo de uma refeicao e o remove da lista de produtos cadastrados
     * 
     * @param codigo
     */
    public static void removerRefeicao(String codigo) {
        for (Refeicao element : refeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println("Refeição removida: " + element.getNome());
                refeicaoList.remove(element);
                break;
            }
        }
    }

    /**
     * Recebe o codigo de umplano de refeicao e o remove da lista de produtos
     * cadastrados
     * 
     * @param codigo
     */
    public static void removerPlanoDeRefeicao(String codigo) {
        for (PlanoDeRefeicao element : planoDeRefeicaoList) {
            if (element.getCodigo().equals(codigo)) {
                System.out.println("Plano de Refeição Removido: " + element.getNome());
                planoDeRefeicaoList.remove(element);
                break;
            }
        }
    }

}
