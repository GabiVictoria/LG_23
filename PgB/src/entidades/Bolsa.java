package entidades;

import estruturasDados.Lista;

public class Bolsa {
    private String nome;
    private Lista<Ativos> ativos;

    public Bolsa(String nome) {
        this.nome = nome;
        this.ativos = new Lista();
    }

    public void adicionarAtivo(Ativos ativo) {
        ativos.add(ativo);
    }


    public void processaOrdemCompra(Investidor investidor, String codigoAtivo, int quantidade, double precoM) {
        for (int i = 0; i<ativos.getTam(); i++) {
            Ativos ativo = ativos.returnValor(i);
            if (ativo.getCodigo().equals(codigoAtivo) && ativo.getPrecoAtual() <= precoM) {
                if (ativo instanceof Acoes) {
                    Acoes acao = (Acoes) ativo;
                    if (acao.getQuant() >= quantidade) {
                        acao.setQuant(acao.getQuant() - quantidade);
                        investidor.addAtivonaCarteira(new Acoes(codigoAtivo, ativo.getPrecoAtual(), ativo.getEmpresa(), quantidade),"1254");
                        System.out.println(investidor.getNome() + " comprou " + quantidade + " ações de " + codigoAtivo);
                    } else {
                        System.out.println("Quantidade de ações disponíveis insuficiente pra compra.");
                    }
                } else if (ativo instanceof Fundos) {
                    Fundos fundo = (Fundos) ativo;
                    double valorCompra = quantidade * ativo.getPrecoAtual();
                    if (fundo.getParticipacao() >= valorCompra) {
                        fundo.setParticipacao(fundo.getParticipacao() - valorCompra);
                        investidor.addAtivonaCarteira(new Fundos(codigoAtivo, ativo.getPrecoAtual(),ativo.getEmpresa(), valorCompra),"1234");
                        System.out.println(investidor.getNome() + " comprou " + quantidade + " cotas do fundo " + codigoAtivo);
                    } else {
                        System.out.println("Saldo insuficiente para compra do fundo.");
                    }
                }
            }
        }
    }



    @Override
    public String toString() {
        String exibi;
        exibi ="\n"+ "Bolsa: " + "Nome: "+nome+ ", Ativos: ";
        for (int i = 0; i < ativos.getTam(); i++) {
            Ativos a = ativos.returnValor(i);
            exibi+= a.toString();
        }

        return exibi;
    }
}
