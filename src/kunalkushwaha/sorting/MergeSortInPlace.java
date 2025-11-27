package kunalkushwaha.sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }
        int mid = s + (e - s)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] temp = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy left over elements
        while(i < mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            // this is advance of the above loop
            temp[k++] = arr[j++];
        }

        // way 1 to copy
//        for(k=0, i=s;  k< temp.length; k++, i++){
//            arr[i] = temp[k];
//        }

        // way 2 to copy ---- > use above one or this one
        for(k=0; k< temp.length; k++){
            arr[s + k] = temp[k];
        }

    }
}
