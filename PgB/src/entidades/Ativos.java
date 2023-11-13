package entidades;

public class Ativos {
    private String codigo;
    private double precoAtual;
    private String empresa;
    private Investidor investidor;
    private int quantidade;

    public Ativos(String codigo, double precoAtual, String empresa,Investidor investidor, int quantidade) {
        this.codigo = codigo;
        this.precoAtual = precoAtual;
        this.empresa = empresa;
        this.investidor=investidor;
        this.quantidade=quantidade;
    }

    public String getCodigo() {
        return codigo;
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

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        String ativo ="\n"+ "Código: " + codigo + ", Preço Atual:"  + precoAtual+ ", Empresa: " + empresa + " ";
        return ativo;
    }
}

