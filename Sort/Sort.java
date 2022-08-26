public class Sort {
    
    //algoritimo com bubble sort
    public static void bubbleSort(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    //algoritimo com selection sort
    public static void selectionSort(int[] array) {
        int menor, aux;
        for (int i = 0; i < array.length - 1; i++) {
            menor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            aux = array[i];
        }
    }
    //algoritmo com insertion sort
    public static void insertionSort(int[] array) {
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }


}

