package searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        Arrays.sort(array); // [10, 20, 30, 40, 50]

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while(firstIndex <= lastIndex) {
            int middle = (firstIndex + lastIndex) / 2;
            if(array[middle] == target) {
                return middle;
            } else if(target > array[middle]) {
                firstIndex = middle + 1;
            } else {
                lastIndex = middle - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] array = {40, 30, 10, 20, 50};
        int target = 20;
        int result = binarySearch(array, target);
        if(result == -1) {
            System.out.println("Item is not available");
        } else {
            System.out.println("Item is available at index: " + result);
        }
    }
}
