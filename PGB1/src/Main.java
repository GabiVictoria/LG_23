import entidades.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
            public static void main(String[] args) {
                Investidor investidor1 = new Investidor("Emanuel",1000);
                Investidor investidor2 = new Investidor("Alison",10000);
                Ativos ativo1 = new Fundos("AIEC11",68.82, "Autonomy Edificios Corporativos Fundo DE Investimento Imobiliario",250);
                Ativos ativo2 = new Fundos("BBDC4", 15.00, "Banco Bradesco SA Preference Shares", 300);
                Ativos ativo3 = new Acoes("DISB34",27.12, "Disney", 50);
                Ativos ativo4= new Acoes("AAGR", 300, "ASSET BANK AGRONEGÓCIOS FIAGRO IMOBILIARIO", 80);
                Carteira carteira = new Carteira("CA2204");
                carteira.addAtivo(ativo1);
                carteira.addAtivo(ativo2);
                carteira.addAtivo(ativo3);
                carteira.addAtivo(ativo4);
                investidor1.addCarteira(carteira);
                Bolsa bolsa = new Bolsa("B3");
                Corretora corretora = new Corretora(bolsa);

                try {

                    RandomAccessFile investidores = new RandomAccessFile("investidores.txt", "rw");
                    investidores.seek(0);
                    investidores.writeUTF(investidor1.toString());

                    RandomAccessFile bolsas = new RandomAccessFile("bolsa.txt", "rw");
                    bolsas.seek(0);
                    bolsas.writeUTF(bolsa.toString());

                    RandomAccessFile ativos = new RandomAccessFile("ativos.txt", "rw");
                    ativos.seek(0);
                    ativos.writeUTF(ativo1.toString());
                    ativos.writeUTF(ativo2.toString());
                    ativos.writeUTF(ativo3.toString());
                    ativos.writeUTF(ativo4.toString());

                    RandomAccessFile carteiras = new RandomAccessFile("carteiras.txt", "rw");
                    carteiras.seek(0);
                    carteiras.writeUTF(carteira.toString());

                } catch (IOException e){
                    e.printStackTrace();
                }

                //testando métodos de remoção

                //removendo algo na primeira posição
                carteira.getAtivos().removerPrimeiraP();
                //removendo da última posição
                carteira.getAtivos().removerUltimaP();
                //removendo algo em qualque posição
                carteira.getAtivos().removeAtIndex(1);

                carteira.getAtivos().exibir();

            }
        }
