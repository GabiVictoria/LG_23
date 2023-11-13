package text;

import entidades.*;
import estruturasDados.Lista;

import java.io.IOException;
import java.io.RandomAccessFile;

public class SalvarEmArquivo {
    public static void Salvar(int op, Lista<Object> ob) throws IOException {
        switch (op){
            case 1: {
                RandomAccessFile investidores = new RandomAccessFile("investidores.txt", "rw");
                for (int i = 0; i <ob.getTam(); i++) {
                    Investidor investidor = (Investidor) ob.returnValor(i);
                    int c1 =(int)investidores.length();
                    investidores.seek(c1);
                    investidores.writeUTF(investidor.toString()+'\n');

                }
            }
            break;
            case 2:{
                for (int i = 0; i <ob.getTam(); i++) {
                    Ativos ativo = (Ativos) ob.returnValor(i);
                    RandomAccessFile ativos = new RandomAccessFile("ativos.txt", "rw");
                    int c2 =(int)ativos.length();
                    ativos.seek(c2);
                    ativos.writeUTF("\n\n"+ativo.toString());

                }
            }
            break;
            case 3:{
                for (int i = 0; i <ob.getTam(); i++) {
                    Bolsa bolsa = (Bolsa) ob.returnValor(i);
                    RandomAccessFile bolsas = new RandomAccessFile("bolsas.txt", "rw");
                    int c4 =(int)bolsas.length();
                    bolsas.seek(c4);
                    bolsas.writeUTF(bolsa.toString());

                }
            }
            break;
            case 4:{
                for (int i = 0; i <ob.getTam(); i++) {
                    Carteira carteira = (Carteira) ob.returnValor(i);
                    RandomAccessFile carteiras = new RandomAccessFile("carteiras.txt", "rw");
                    int c5 =(int)carteiras.length();
                    carteiras.seek(c5);
                    carteiras.writeUTF(carteira.toString());
                }
            }
            break;
            case 5:{
                for (int i = 0; i <ob.getTam(); i++) {
                    Corretora corretora = (Corretora) ob.returnValor(i);
                    RandomAccessFile corretoras = new RandomAccessFile("corretoras.txt", "rw");
                    int c6 =(int)corretoras.length();
                    corretoras.seek(c6);
                    corretoras.writeUTF(corretora.toString());
                }
            }
            break;
        }
    }

    public static void lerDadosDoArquivo(String nomeDoArquivo) throws IOException {
        try (RandomAccessFile arquivo = new RandomAccessFile(nomeDoArquivo, "rw")) {
            byte[] bytes = new byte[(int) arquivo.length()];
            arquivo.readFully(bytes);
            String teste = new String(bytes, "UTF-8");
            System.out.printf(teste);
        }
    }

}

