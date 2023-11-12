package ordenacao;
import entidades.Investidor;
public class ShellSort {
    public static void sortShell(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }
    public static void sortInvestidoresPorNome(Investidor[] investidores) {
        int n = investidores.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Investidor temp = investidores[i];
                int j = i;
                while (j >= gap && investidores[j - gap].getNome().compareTo(temp.getNome()) > 0) {
                    investidores[j] = investidores[j - gap];
                    j -= gap;
                }
                investidores[j] = temp;
            }
            gap /= 2;
        }
    }
}
