package entidades;

public class Acoes extends Ativos {
    private int quant;

    public Acoes(String codigo, double precoAtual,String empresa, int quant) {
        super(codigo, precoAtual, empresa);
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        String acao ="\n"+ "Ação: "+super.toString()+ "Quantidade: " + quant +"\n";
        return acao;
    }
}
