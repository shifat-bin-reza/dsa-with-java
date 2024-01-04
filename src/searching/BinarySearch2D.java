package searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySearch2D {

    public static void binarySearch2D(int[][] array, int target) {
        for(int i=0; i<array.length; i++) {
            int firstIndex = 0;
            int lastIndex = array[i].length - 1;
            while (firstIndex <= lastIndex) {
                int middle = (firstIndex + lastIndex) / 2;
                if(array[i][middle] == target) {
                    System.out.println("Index: [" + i + ", " + middle + "]" );
                    break;
                } else if(target > array[i][middle]) {
                    firstIndex = middle + 1;
                } else {
                    lastIndex = middle - 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int target = 50;
        binarySearch2D(array, target);
    }
}
