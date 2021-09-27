
package controllers.servicos;

public class PlanoDeRefeicao extends Servico {

    private int duracao;
    private int marmitex;

    // construtor
    public PlanoDeRefeicao(String codigo, String nome, int duracao, int marmitex, double valor, String responsavel) {

        super(codigo, nome, valor, responsavel);

        if (valor <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        if (duracao <= 0.0)
            throw new IllegalArgumentException("duracao must be > 0.0");

        this.duracao = duracao;
        this.marmitex = marmitex;
    }

    // gets e sets
    public int getduracao() {
        return duracao;
    }

    public void setduracao(int duracao) {
        this.duracao = duracao;
    }

    public int getMarmitex() {
        return marmitex;
    }

    public void setMarmitex(int marmitex) {
        this.marmitex = marmitex;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String detalharPlano() {
        return super.toString() + " | Duração: " + getduracao() + " Meses " + "| Mamitex: " + getMarmitex();
    }

}
