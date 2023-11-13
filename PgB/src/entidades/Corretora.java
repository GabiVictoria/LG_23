package entidades;


public class Corretora {
    private Bolsa bolsa;
    private String nome;

    public Corretora(Bolsa bolsa, String nome) {
        this.bolsa = bolsa;
        this.nome=nome;
    }

    public void processaOrdemCompra(Investidor investidor, Ativos ativo, int quantidade) {
        bolsa.processaOrdemCompra(investidor, ativo, quantidade);
    }
    public void processaOrdemVenda(Investidor investidor, Ativos ativo) {
        bolsa.processaOrdemVenda(investidor, ativo);
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Corretora:" +
                "\nbolsa:" + bolsa.toString() +
                ", nome='" + nome;
    }
}

