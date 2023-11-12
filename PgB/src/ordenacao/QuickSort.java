package ordenacao;

import entidades.Corretora;

public class QuickSort {
    public static void sortQuick(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void sort(Corretora[] corretoras) {
        quickSort(corretoras, 0, corretoras.length - 1);
    }

    private static void quickSort(Corretora[] corretoras, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(corretoras, left, right);
            quickSort(corretoras, left, pivotIndex - 1);
            quickSort(corretoras, pivotIndex + 1, right);
        }
    }

    private static int partition(Corretora[] corretoras, int left, int right) {
        int pivotSize = corretoras[right].getSizeInvestidores();
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (corretoras[j].getSizeInvestidores() < pivotSize) {
                i++;
                Corretora temp = corretoras[i];
                corretoras[i] = corretoras[j];
                corretoras[j] = temp;
            }
        }
        Corretora temp = corretoras[i + 1];
        corretoras[i + 1] = corretoras[right];
        corretoras[right] = temp;
        return i + 1;
    }
}
