package controllers.servicos.frete;

public class Frete {
    private int codigo;

    private String empresa;
    private int prazo;
    private double valorMinimo;

    // cosntrutor
    public Frete(int codigo, String empresa, int prazo, double valorMinimo) {
        this.codigo = codigo;
        if (prazo <= 0.0)
            throw new IllegalArgumentException("Prazo must be > 0.0");

        this.prazo = prazo;

        if (valorMinimo <= 0.0)
            throw new IllegalArgumentException("Valor must be > 0.0");

        this.valorMinimo = valorMinimo;
        this.empresa = empresa;
    }
    //construtor vazio
    public Frete(){

    }

    // gets e sets
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // formatação
    @Override
    public String toString() {
        return String.format("%s:%s / %s:%s / %s: %s minutos / %s: R$%,.2f", "Código", getCodigo(), "empresa",
                getEmpresa(), "prazo", getPrazo(), "valor minimo", getValorMinimo());
    }

}
