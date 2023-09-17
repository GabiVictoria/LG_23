package entidades;

public class Ativos {
    private String codigoNegociacao;
    private double precoAtual;
    private String empresa;

    public Ativos(String codigoNegociacao, double precoAtual, String empresa) {
        this.codigoNegociacao = codigoNegociacao;
        this.precoAtual = precoAtual;
        this.empresa = empresa;
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setPrecoAtual(double precoAtual) {
        this.precoAtual = precoAtual;
    }

    @Override
    public String toString() {
        return
                "Codigo: " + codigoNegociacao +
                ", Preço Atual:"  + precoAtual+ ", Empresa: " + empresa;
    }
}
