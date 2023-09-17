package entidades;

import EstruturaDados.Lista;

public class Investidor {
    private String nome;
    private Lista<Carteira> carteiras = new Lista<>();
    private double saldo;


    public Investidor(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void enviarOrdemCompra(Corretora corretora, String codigoAtivo, int quantidade) {

        corretora.processarOrdemCompra(this, codigoAtivo, quantidade, this.saldo);
    }

    public Lista<Carteira> getCarteiras() {
        return carteiras;
    }

    public void addAtivoCarteira(Ativos a, String codigo) {
        for (int i = 0; i < carteiras.getTamanho(); i++) {
                Carteira c = carteiras.retornarValor(i);
                if (c.getCodigo().equals(codigo)) {
                    c.addAtivo(a);
                }
            }
        }

    public void addCarteira(Carteira c){
        carteiras.add(c);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String exibir;
        exibir = "Investidor: " +
                "nome: " + nome+ " Carteiras: ";
        for (int i = 0; i < carteiras.getTamanho(); i++) {
            Carteira c = carteiras.retornarValor(i);
            exibir+= c.toString();
        }
        exibir += "\n";
        return exibir;
    }
    }
