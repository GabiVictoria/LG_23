package entidades;

import EstruturaDados.Lista;

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


    public void processarOrdemCompra(Investidor investidor, String codigoAtivo, int quantidade, double saldo) {
        int tipo =1;//variavel vai ser lida em uma novaa versao do codigo
        if(tipo == 1){for (int i = 0; i<ativos.getTamanho(); i++) {
            Ativos ativo = ativos.retornarValor(i);
            if (ativo.getCodigoNegociacao().equals(codigoAtivo) && ativo.getPrecoAtual() <= saldo) {
                if (ativo instanceof Acoes) {
                    Acoes acao = (Acoes) ativo;
                    if (acao.getQuantidadeCotas() >= quantidade) {
                        acao.setQuantidadeCotas(acao.getQuantidadeCotas() - quantidade);
                        investidor.addAtivoCarteira(new Acoes(codigoAtivo, ativo.getPrecoAtual(), ativo.getEmpresa(), quantidade),"1254");
                        System.out.println(investidor.getNome() + " comprou " + quantidade + " ações de " + codigoAtivo);
                        double valorCompra = quantidade * ativo.getPrecoAtual();
                        investidor.setSaldo((investidor.getSaldo() - valorCompra));
                    } else {
                        System.out.println("Quantidade insuficiente de ações disponíveis para compra.");
                    }
                }
            }
        }}else{
            for (int i = 0; i<ativos.getTamanho(); i++) {
                Ativos ativo = ativos.retornarValor(i);
                if (ativo.getCodigoNegociacao().equals(codigoAtivo) && ativo.getPrecoAtual() <= saldo){
                    if (ativo instanceof Fundos) {
                        Fundos fundo = (Fundos) ativo;
                        if (fundo.getCotasF() >= quantidade) {
                            fundo.setCotasF(fundo.getCotasF() - quantidade);
                            investidor.addAtivoCarteira(new Fundos(codigoAtivo, ativo.getPrecoAtual(), ativo.getEmpresa(), quantidade),"1254");
                            System.out.println(investidor.getNome() + " comprou " + quantidade + " ações de " + codigoAtivo);
                            double valorCompra = quantidade * ativo.getPrecoAtual();
                            investidor.setSaldo((investidor.getSaldo() - valorCompra));
                        } else {
                            System.out.println("Quantidade insuficiente de ações disponíveis para compra.");
                        }
                    }
                }
            }}
    }



    @Override
    public String toString() {
        String exibir;
        exibir = "Bolsa: " + "Nome: "+nome+ ", Ativos: ";
        for (int i = 0; i < ativos.getTamanho(); i++) {
            Ativos a = ativos.retornarValor(i);
            exibir+= a.toString();
        }

        return exibir;
    }
}
