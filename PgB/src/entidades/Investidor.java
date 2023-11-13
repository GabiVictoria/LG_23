package entidades;
import text.regraFormat;
import estruturasDados.Lista;

public class Investidor {
    private String nome;
    private String senha;
    private String cpf;
    private String telefone;
    private double saldo;

    private Carteira carteira;


    public Investidor(String nome, String senha, String cpf, String telefone, double saldo, Carteira carteira) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = regraFormat.formatCPF(cpf);
        this.telefone = regraFormat.FormatTelefone(telefone);
        this.carteira =carteira;
        this.saldo=saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCarteiras(Carteira carteira) {
        this.carteira = carteira;
    }



    public void addAtivonaCarteira(Ativos a) {
        carteira.addAtivo(a);
    }


    @Override
    public String toString() {
        String exibir;
        exibir = "\n\nInvestidor: " +
                "Nome: " + nome +
                "\nCódigo de acesso: "+ senha +
                "\nCPF: "+ cpf +
                "\nTelefone: "+ telefone+ "\nCarteira: " +carteira;

        return exibir+"\n";
    }
    public void enviaOrdemCompra(Corretora corretora, Ativos ativo, int quantidade){
        corretora.processaOrdemCompra(this,ativo,quantidade);
    }
    public void enviaOrdemVenda(Corretora corretora, Ativos ativo){
        corretora.processaOrdemVenda(this,ativo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}