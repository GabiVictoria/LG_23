package entidades;

import estruturasDados.Arvore;

public class Corretora {
    private Bolsa bolsa;
    private Arvore investidores;

    public Corretora(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public void processaOrdemCompra(Investidor investidor, String codigoAtivo, int quantidade, double precoM) {
        bolsa.processaOrdemCompra(investidor, codigoAtivo, quantidade, precoM);
    }

    @Override
    public String toString() {
        return "Corretora: " +
                "Bolsa: " + bolsa.toString() +
                "\nÁrvore de investidores: "+ investidores.toString() +
                '\n';
    }

    public Arvore getInvestidores() {
        return investidores;
    }

    public void setInvestidores(Arvore investidores) {
        this.investidores = investidores;
    }

    public int getSizeInvestidores(){
        return investidores.getTam();
    }
}

