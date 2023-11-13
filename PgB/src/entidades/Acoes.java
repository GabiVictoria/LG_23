package entidades;

public class Acoes extends Ativos {
    private int quant;

    public Acoes(String codigo, double precoAtual,String empresa,Investidor investidor, int quantidade) {
        super(codigo, precoAtual, empresa, investidor, quantidade);
    }


    @Override
    public String toString() {
        String acao ="\n"+ "Ação: "+super.toString() +"\n";
        return acao;
    }
}
