package entidades;
import text.regraFormat;
import estruturasDados.Lista;

public class Investidor {
    private String nome;
    private String senha;
    private String cpf;
    private String telefone;

    private Lista<Carteira> carteiras = new Lista<>();


    public Investidor(String nome, String senha, String cpf, String telefone) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = regraFormat.formatCPF(cpf);
        this.telefone = regraFormat.FormatTelefone(telefone);
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

    public void setCarteiras(Lista<Carteira> carteiras) {
        this.carteiras = carteiras;
    }

    public void enviarOrdemCompra(Corretora corretora, String codigoAtivo, int quantidade, double precoMaximo) {
        corretora.processaOrdemCompra(this, codigoAtivo, quantidade, precoMaximo);
    }

    public Lista<Carteira> getCarteiras() {
        return carteiras;
    }

    public void addAtivonaCarteira(Ativos a, String codigo) {
        for (int i = 0; i < carteiras.getTam(); i++) {
            Carteira c = carteiras.returnValor(i);
            if (c.getCodigo().equals(codigo)) {
                c.addAtivo(a);
            }
        }
    }

    public void addCarteira(Carteira c) {
        carteiras.add(c);
    }

    @Override
    public String toString() {
        String exibir;
        exibir = "\n\nInvestidor: " +
                "Nome: " + nome +
                "\nCódigo de acesso: "+ senha +
                "\nCPF: "+ cpf +
                "\nTelefone: "+ telefone+ "\nCarteiras: ";
        for (int i = 0; i < carteiras.getTam(); i++) {
            Carteira c = carteiras.returnValor(i);
            exibir += c.toString();
        }
        exibir += "\n";
        return exibir+"\n";
    }
}