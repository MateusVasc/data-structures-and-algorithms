package algorithms.insertion_sort;

public class InsertionSort {

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                int temp = arr[j];
                arr[j] = curr;
                arr[i] = temp;
                j--;
                i--;
            }
        }

        return arr;
    }
}
