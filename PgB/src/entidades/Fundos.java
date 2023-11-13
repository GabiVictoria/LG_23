package entidades;

public class Fundos extends Ativos {
    private double participacao;

    public Fundos(String codigo, double precoAtual, String empresa,Investidor investidor, int quantidade ,double participacao) {
        super(codigo, precoAtual, empresa, investidor,quantidade);
        this.participacao = participacao;
    }

    public double getParticipacao() {
        return participacao;
    }

    public void setParticipacao(double participacao) {
        this.participacao = participacao;
    }

    @Override
    public String toString() {
        return "\n"+"Fundo: " +super.toString() +
                "Participação: " + participacao +
                '\n';
    }
}
