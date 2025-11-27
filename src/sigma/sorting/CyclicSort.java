package sigma.sorting;

import java.util.Arrays;
// Very Important for Amazon & Google Interview, but it should be in Range 1 to N also continuous.
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
    }
}
