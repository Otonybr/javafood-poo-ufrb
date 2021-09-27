package controllers.servicos.sistemaDeCompra;

import controllers.servicos.frete.Frete;
import database.servicos.carrinhoDeCompra.CarrinhoDeCompras;

public class Compras {
    

    private String codigo, nomeProduto;
    private double valor;
    private Frete frete;

    // Construtor
    public Compras(String codigo, String nomeProduto, double valor, Frete frete) {
        setCodigo(codigo);
        setNomeProduto(nomeProduto);
        setValor(valor);
        setFrete(frete);
    }

    //Instancia de CarrinhoDeCompras
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    
    //Adciona o produto ao carrinho de compras
    public void adicionarAoCarrinho(Compras produtoComprado ) {
        carrinho.addCompra(produtoComprado);
    }

    // Método de compras
    public double comprar(Frete freteSelecionado, Compras produtoComprado) {
        double totalDaCompra = freteSelecionado.getValorMinimo() + produtoComprado.getValor();

        return totalDaCompra;
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
    @Override
    public String toString() {
        return "\nCompra:  codigo=" + codigo + ", frete=" + frete + ", nome do Produto="
                + nomeProduto + ", valor=" + valor + "]";
    }
}