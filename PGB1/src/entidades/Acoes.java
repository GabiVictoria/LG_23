package entidades;

public class Acoes extends Ativos {
    private int quantidadeCotas;

    public Acoes(String codigo, double precoAtual,String empresa, int quantidadeCotas) {
        super(codigo, precoAtual, empresa);
        this.quantidadeCotas = quantidadeCotas;
    }

    public int getQuantidadeCotas() {
        return quantidadeCotas;
    }

    public void setQuantidadeCotas(int quantidadeCotas) {
        this.quantidadeCotas = quantidadeCotas;
    }

    @Override
    public String toString() {
        return "Ação: "+super.toString()+
                "Quantidade: " + quantidadeCotas +"\n";
    }
}
