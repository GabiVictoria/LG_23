package entidades;

public class Fundos extends Ativos {
    private double cotasF;

    public Fundos(String codigo, double precoAtual, String empresa, double cotasF) {
        super(codigo, precoAtual, empresa);
        this.cotasF = cotasF;
    }

    public double getCotasF() {
        return cotasF;
    }

    public void setCotasF(double cotasF) {
        this.cotasF = cotasF;
    }

    @Override
    public String toString() {
        return "Fundo: " +super.toString() +
                "Cotas: " + cotasF +
                '\n';
    }
}
