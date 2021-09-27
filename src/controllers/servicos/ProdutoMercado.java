
package controllers.servicos;

public class ProdutoMercado extends Servico {

	private int estoque;

	// Construtor de 4 argumentos
	public ProdutoMercado(String codigo, String nome, double valor, int estoque, String responsavel) {

		super(codigo, nome, valor, responsavel);

		if (valor <= 0.0)
			throw new IllegalArgumentException("Valor must be > 0.0");

		if (estoque < 0.0)
			throw new IllegalArgumentException("Estoque must be >= 0.0");

		this.estoque = estoque;

	}

	// Construtor de 3 argumentos
	public ProdutoMercado(String codigo, String nome, double valor, String responsavel) {
		super(codigo, nome, valor, responsavel);
	}

	// gets e sets
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {

		return super.toString();
	}

	public String detalharProduto() {
		return super.toString() + " | Estoque: " + getEstoque();
	}

}