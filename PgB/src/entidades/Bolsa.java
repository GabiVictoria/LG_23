package entidades;

import estruturasDados.Lista;

public class Bolsa {
    private String nome;
    private Lista<Ativos> ativoVenda;

    public Bolsa(String nome) {
        this.nome = nome;
        this.ativoVenda = new Lista();
    }



    public void processaOrdemCompra(Investidor investidorComp, Ativos ativo, int quantidade) {
        Investidor ic = investidorComp;
        for (int i = 0; i<ativoVenda.getTam(); i++) {
            Ativos a = ativoVenda.returnValor(i);
            if (a.getCodigo()== ativo.getCodigo()) {
                if (ativo.getQuantidade()>=quantidade){
                a.setQuantidade(a.getQuantidade()-quantidade);
                a.getInvestidor().setSaldo(a.getInvestidor().getSaldo()+ativo.getPrecoAtual());
                    System.out.println("Investidor"+ic.getNome()+" vendeu ativo "+a.getCodigo());
                    investidorComp.setSaldo(investidorComp.getSaldo()-ativo.getPrecoAtual());
                    Acoes tst = new Acoes(a.getCodigo(),a.getPrecoAtual(),a.getEmpresa(),ic,quantidade);
                    investidorComp.addAtivonaCarteira(tst);
                    System.out.println("Investidor"+ic.getNome()+" comprou ativo "+a.getCodigo());
                }
            }
        }
    }



   public void processaOrdemVenda(Investidor investidor, Ativos ativo){
        if (ativo.getInvestidor().getSenha()!=""){ ativoVenda.add(ativo);}
   }

    @Override
    public String toString() {
        return "Bolsa:" +
                "nome:'" + nome + "\n";
    }
}
