package ordenacao;

import entidades.Acoes;
import estruturasDados.Lista;

public class BubbleSort {
    public static void sortBubble(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 1; x < (n - i); x++) {
                if (arr[x - 1] > arr[x]) {
                    temp = arr[x - 1];
                    arr[x - 1] = arr[x];
                    arr[x] = temp;
                }
            }
        }
    }

    public static void sort10AcoesMaisVendidas(Lista<Acoes> acoes) {
        int n = acoes.getTam();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (acoes.returnValor(j).getQuantidade()<acoes.returnValor(j+1).getQuantidade()) {
                    Acoes temp =(Acoes) acoes.returnValor(j);
                    acoes.trocaValor(j,acoes.returnValor(j+1));
                    acoes.trocaValor(j+1,temp);
                }
            }
        }

        // Exibi as 10 ações mais vendidas
        System.out.println("Top 10 Ações Mais Vendidas:");
        for(int i = 0; i<10;i++){
            System.out.println(acoes.returnValor(i));
        }
        }
    }

