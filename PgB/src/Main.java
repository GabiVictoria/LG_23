import text.SalvarEmArquivo;
import entidades.Acoes;
import entidades.Ativos;
import entidades.Carteira;
import entidades.Investidor;
import estruturasDados.Lista;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        MenuInvestidor();
    }

    public static void MenuInvestidor() throws IOException {
        int i = 0;
        Lista<Object> investLista= new Lista<>();

            System.out.println("Bem vindo a bolsa de valores!");
            System.out.printf("Cadastro investidor: \nNome: ");
            String nomeInvestidor = scan.nextLine();
            System.out.printf("\nCPF: ");
            String CPFdoInvestidor = scan.nextLine();
            System.out.printf("\nSenha: ");
            String senha = scan.nextLine();
            System.out.printf("\nTelefone: ");
            String TelefoneDoInvestidor = scan.nextLine();

            Investidor invest = new Investidor(nomeInvestidor,senha,CPFdoInvestidor,TelefoneDoInvestidor);
            MenuNegociacao(invest);
            investLista.add(invest);
            SalvarEmArquivo.Salvar(1,investLista);
    }

    public static void MenuNegociacao(Investidor investidor) throws IOException {
        Lista<Object> ativos= new Lista<>();

        Ativos a1 = new Acoes("BBDC4", 15.00, "Banco Bradesco SA Preference Shares",80);
        Ativos a2 = new Acoes("PETR3",150.00,"Petrobrás",18);
        Ativos a3 = new Acoes("AAGR", 300, "ASSET BANK AGRONEGÓCIOS FIAGRO IMOBILIARIO", 45);
        Ativos a4 = new Acoes(" BBAS3",50.00,"Banco Do Brasil",23);
        ativos.add(a1);
        ativos.add(a2);
        ativos.add(a3);
        ativos.add(a4);
        SalvarEmArquivo.Salvar(2,ativos);

        System.out.println("Tabela de ativos:\n");

        for (int i = 0; i < ativos.getTam(); i++) {
            System.out.println( (i+1)+" - "+ ativos.returnValor(i));
        }

        System.out.println("Selecione a opção de ativo para a compra:");
        int op = scan.nextInt();

        switch (op){
            case 1:{
                investidor.addCarteira(new Carteira("set"));
                investidor.addAtivonaCarteira(a1,"set");
                break;
            }
            case 2:{
                investidor.addCarteira(new Carteira("gegr"));
                investidor.addAtivonaCarteira(a2,"gegr");
                break;
            }
            case 3:{
                investidor.addCarteira(new Carteira("asd"));
                investidor.addAtivonaCarteira(a3,"asd");
                break;
            }
            case 4:{
                investidor.addCarteira(new Carteira("wetr"));
                investidor.addAtivonaCarteira(a4,"wetr");
                break;
            }

        }

        
    }

}