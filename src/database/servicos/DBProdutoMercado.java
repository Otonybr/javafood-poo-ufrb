package database.servicos;

import java.util.ArrayList;

import controllers.servicos.ProdutoMercado;

public class DBProdutoMercado extends DBServico {

    // ArrayList armazena todos os ProdutoMercado cadastrados
    private ArrayList<ProdutoMercado> produtoList = new ArrayList<ProdutoMercado>();

    // Dados de pré cadastro
    ProdutoMercado produto = new ProdutoMercado("0", "paçoca", 2.70, 800, "11111111111");
    ProdutoMercado produto1 = new ProdutoMercado("1", "bolo", 5.00, 50, "11111111111");
    ProdutoMercado produto2 = new ProdutoMercado("2", "pizza brotinho", 2.50, 100, "22222222222");
    ProdutoMercado produto3 = new ProdutoMercado("3", "hamburguer", 20.00, 45, "22222222222");
    ProdutoMercado produto4 = new ProdutoMercado("4", "cerveja itaipava", 3.50, 400, "33333333333");
    ProdutoMercado produto5 = new ProdutoMercado("5", "cerveja devassa", 4.00, 200, "33333333333");
    ProdutoMercado produto6 = new ProdutoMercado("6", "guarana antartica", 5.70, 200, "44444444444");
    ProdutoMercado produto7 = new ProdutoMercado("7", "coca cola", 6.00, 300, "11111111111");
    ProdutoMercado produto8 = new ProdutoMercado("8", "fanta uva", 6.50, 300, "11111111111");
    ProdutoMercado produto9 = new ProdutoMercado("9", "fanta laranja", 6.50, 300, "33333333333");

    // Construtor sem argumentos, apenas para criação de objetos
    public DBProdutoMercado() {
        adicionarProduto(produto);
        adicionarProduto(produto1);
        adicionarProduto(produto2);
        adicionarProduto(produto3);
        adicionarProduto(produto4);
        adicionarProduto(produto5);
        adicionarProduto(produto6);
        adicionarProduto(produto7);
        adicionarProduto(produto8);
        adicionarProduto(produto9);
    }

<<<<<<< HEAD
    // Construtor de 1 argumento
    public DBProdutoMercado(ProdutoMercado produto) {
       
    }

   
    // Recebe um objeto do tipo ProdutoMercado e adiciona à lista de Produtos
=======
    /**
     * Recebe um objeto do tipo ProdutoMercado e adiciona à lista de Produtos
     * 
     * @param produto
     */
>>>>>>> 92d4c5c5f5147d889b4996e37f38a11b03b796ab
    public void adicionarProduto(ProdutoMercado produto) {
        produtoList.add(produto);
    }

    // Comentar aqui
    public void editarProduto(ProdutoMercado produto) {
        // for (ProdutoMercado element : produtoList) {

        // produto.getCodigo();
        // }
    }

    /**
     * Recebe um objeto do tipo Produto e o remove da lista de produtos do sistema
     * 
     * @param produtoR
     */
    public void removerProduto(ProdutoMercado produtoR) {
        produtoList.remove(produtoR);
    }

    /**
     * Recebe o código de um produto e retorna o produto correspondente
     * 
     * @param codigo
     * @return Object<ProdutoMercado>
     */
    public ProdutoMercado detalharProdutoMercado(String codigo) {
        ProdutoMercado produtoEncontrado = null;

        for (ProdutoMercado element : produtoList) {
            if (element.getCodigo().equals(codigo)) {
                produtoEncontrado = element;
            }
        }

        return produtoEncontrado;
    }

    /**
     * Retorna uma lista com todos os produtos do tipo ProdutoMercado cadastrados no
     * sistema
     * 
     * @return ArrayList<ProdutoMercado>
     */
    public ArrayList<ProdutoMercado> returnProdutoMercado() {
        return produtoList;
    }

    // /**
    //  * Retorna uma lsita de produtos com as principais informações do produto
    //  * 
    //  * @return ArrayList<ProdutoMercado>
    //  */
    // public ArrayList<ProdutoMercado> listProdutoMercado() {
    //     ArrayList<ProdutoMercado> listaDeProdutosFormatados = new ArrayList<ProdutoMercado>();
    //     for (ProdutoMercado element : produtoList) {
    //         ProdutoMercado produtoFormatado = new ProdutoMercado(element.getCodigo(), element.getNome(),
    //                 element.getValor());
    //         listaDeProdutosFormatados.add(produtoFormatado);
    //     }

    //     return listaDeProdutosFormatados;
    // }
}
