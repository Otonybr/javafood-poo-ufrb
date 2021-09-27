package controllers.servicos;

public class Refeicao extends Servico {

    private String bebida;
    private String acompanhamento;

    // construtor
    public Refeicao(String codigo, String nome, String bebida, String acompanhamento, double valor,
            String responsavel) {

        super(codigo, nome, valor, responsavel);

        if (valor <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        this.bebida = bebida;
        this.acompanhamento = acompanhamento;
    }

    // gets e sets
    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String detalharRefeicao() {
        return super.toString() + " | Bebida: " + getBebida() + " | Acompanhamento: " + getAcompanhamento();
    }

}
