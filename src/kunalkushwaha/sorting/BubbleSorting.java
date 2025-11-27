package kunalkushwaha.sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int turn=0; turn < arr.length; turn++){
            for(int j=0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
    }
}
