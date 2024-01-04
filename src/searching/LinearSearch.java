package searching;

public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {40, 30, 10, 20, 50};
        int target = 30;
        int result = linearSearch(array, target);
        if(result == -1) {
            System.out.println("Item is not in the array");
        } else {
            System.out.println("Item is available at index: " + result);
        }
    }
}
