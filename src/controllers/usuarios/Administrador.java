package controllers.usuarios;

import java.util.ArrayList;

import controllers.servicos.PlanoDeRefeicao;
import controllers.servicos.ProdutoMercado;
import controllers.servicos.Refeicao;
import controllers.servicos.sistemaDeCompra.Compras;
import database.servicos.carrinhoDeCompra.CarrinhoDeCompras;

public class Administrador extends Usuario {

    private int id_administrador;
    private double valorTotal;

    // construtor de 6 argumentos
    public Administrador(String nome, String sobrenome, String cpf, String cidade, String email, String senha) {
        super(nome, sobrenome, cpf, cidade, email, senha);

        setId_administrador(id_administrador);
        setValorTotal(valorTotal);

    }

    // Construtor vazio
    public Administrador() {

    }

    public void listarProdutosDoUsuario(String cpf, ArrayList<Usuario> userList, ArrayList<ProdutoMercado> produtoList,
            ArrayList<Refeicao> refeicaoList, ArrayList<PlanoDeRefeicao> planoDeRefeicaoList) {
        System.out.println("----------------- Produtos do Usuario --------------------\n");
        // Busca o cpf do usuario na lista de usuarios e retorna o seu nome
        for (Usuario element : userList) {
            if (element.getCpf().equals(cpf)) {
                System.out.println("\nUsuario: " + element.getNome());
            }
        }
        System.out.println("\n---------------Produtos: ----------------");
        // Lista os servicos do usuarios em todas as categorias
        for (ProdutoMercado element : produtoList) {
            if (element.getResponsavel().equals(cpf)) {
                element.detalharProduto();
            }
        }
        for (Refeicao element : refeicaoList) {
            if (element.getResponsavel().equals(cpf)) {
                element.detalharRefeicao();
            }
        }
        for (PlanoDeRefeicao element : planoDeRefeicaoList) {
            if (element.getResponsavel().equals(cpf)) {
                element.detalharPlano();
            }
        }
    }

    /**
     * metodo para adicionar a taxa de 5% do sistema
     */
    public void adicionarTaxa() {
        double somaTaxa = 0;
        CarrinhoDeCompras produtosVendidos = new CarrinhoDeCompras();
        ArrayList<Compras> listaDeCompras = produtosVendidos.listarVendidos();

        for (Compras element : listaDeCompras) {
            somaTaxa += element.getValor() * 0.05;

        }
        setValorTotal(somaTaxa);

    }

    // Getters and Setters
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

}
