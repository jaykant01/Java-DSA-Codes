package kunalkushwaha.sorting;
import java.util.Arrays;

public class SelectionSorting {
    public static void selectionSort(int[] arr){
        //Turns
        for(int i=0; i< arr.length-1; i++){
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
    }
}
