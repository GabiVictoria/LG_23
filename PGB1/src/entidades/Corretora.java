package entidades;

public class Corretora {
    private Bolsa bolsa;

    public Corretora(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public void processarOrdemCompra(Investidor investidor, String codigoAtivo, int quantidade, double saldo) {
        bolsa.processarOrdemCompra(investidor, codigoAtivo, quantidade, saldo);
    }

    @Override
    public String toString() {
        return "Corretora: " +
                "Bolsa: " + bolsa.toString() +
                '\n';
    }
}
