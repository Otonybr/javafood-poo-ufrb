package database.servicos.carrinhoDeCompra;

import java.util.ArrayList;

import controllers.servicos.sistemaDeCompra.Compras;

public class CarrinhoDeCompras {

    ArrayList<Compras> listaDeCompras = new ArrayList<Compras>();

    //Construtor
    public CarrinhoDeCompras() {

    }

    //Método que adiciona uma nova compra ao carrinho
    public void addCompra(Compras produtoComprado) {
        listaDeCompras.add(produtoComprado);
    }

      //metodo para listar produtos vendidos pelo o usuario
      public ArrayList<Compras> listarVendidos(){
       
        return listaDeCompras;
    }
}
