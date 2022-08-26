
public class Main{

    public static void main(String[] args) {
       
        Sort sort = new Sort();

        int[] array = {5, 4, 3, 2, 1};

        sort.bubbleSort(array);
        for (int i: array) {
            System.out.printf("%d ",i);
        }
            
        System.out.printf("\n");
        sort.selectionSort(array);

        for (int i: array) {
            System.out.printf("%d ",i);
        }
        System.out.printf("\n");
        sort.insertionSort(array);

        for (int i: array) {
            System.out.printf("%d ",i);
        }



    }
}