package kunalkushwaha.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 1, 3};
        insertSort(arr);
    }
}
