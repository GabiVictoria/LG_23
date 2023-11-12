package entidades;

import estruturasDados.Lista;

public class Carteira {
    private String codigo;
    private Lista<Ativos> ativos = new Lista<>();

    public Carteira(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Lista<Ativos> getAtivos() {
        return ativos;
    }

    public void addAtivo(Ativos a) {
        ativos.add(a);
    }


    @Override
    public String toString() {
        String exibir;
        exibir = "\n"+"Carteira \n" +
                "Codigo: " + codigo+ "\nAtivos: ";
        for (int i = 0; i < ativos.getTam(); i++) {
            Ativos a = ativos.returnValor(i);
            exibir+= a.toString();
        }
        exibir+='\n';
        return exibir+'\n';
    }
}
