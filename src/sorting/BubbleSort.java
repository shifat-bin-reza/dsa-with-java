package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {30,40, 10, 50, 20};
        bubbleSort(array);
    }
}
