package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for(int i=0; i<array.length; i++) {
            int last = array.length-i-1;
            int max = getMaxIndex(array, last);
            doSwap(array, max, last);
        }
    }

    static void doSwap(int[] array, int max, int last) {
        int temp = array[max];
        array[max] = array[last];
        array[last] = temp;
    }

    static int getMaxIndex(int[] array, int end) {
        int max = 0;
        for(int i = 0; i < end; i++) {
            if(array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {50, 30, 10, 40, 20};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
