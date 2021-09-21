package database.servicos;

import java.util.ArrayList;

import controllers.servicos.ProdutoMercado;

public class DBProdutoMercado extends DBServico {
    
    // ArrayList armazena todos os ProdutoMercado cadastrados
    private ArrayList<ProdutoMercado> produtoList = new ArrayList<ProdutoMercado>();

    // Dados de pré cadastro
    ProdutoMercado produto = new ProdutoMercado("0", "paçoca", 2.70, 800);
    ProdutoMercado produto1 = new ProdutoMercado("1", "bolo", 5.00, 50);
    ProdutoMercado produto2 = new ProdutoMercado("2", "pizza brotinho", 2.50, 100);
    ProdutoMercado produto3 = new ProdutoMercado("3", "hamburguer", 20.00, 45);
    ProdutoMercado produto4 = new ProdutoMercado("4", "cerveja itaipava", 3.50, 400);
    ProdutoMercado produto5 = new ProdutoMercado("5", "cerveja devassa", 4.00, 200);
    ProdutoMercado produto6 = new ProdutoMercado("6", "guarana antartica", 5.70, 200);
    ProdutoMercado produto7 = new ProdutoMercado("7", "coca cola", 6.00, 300);
    ProdutoMercado produto8 = new ProdutoMercado("8", "fanta uva", 6.50, 300);
    ProdutoMercado produto9 = new ProdutoMercado("9", "fanta laranja", 6.50, 300);


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

    // Construtor de 1 argumento
    public DBProdutoMercado(ProdutoMercado produto) {
       
    }

   
    // Recebe um objeto do tipo ProdutoMercado e adiciona à lista de Produtos
    public void adicionarProduto(ProdutoMercado produto) {
        produtoList.add(produto);
    }

    // Retorna todos os produtos cadastrados no array de produtos
    public ArrayList<ProdutoMercado> returnProdutoMercado() {
        return produtoList;
    }
}
