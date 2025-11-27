package leetcode;

public class LeetCodeNo1095 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(arr, target));
    }
    static int findInMountainArray(int[] arr,int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length-1;

        while(st < end){
            int mid = st + (end - st)/2;

            if(arr[mid] < arr[mid+1]){
                st = mid+1;
            }else{
                end = mid;
            }
        }
        return st;
    }

    static int orderAgnosticBS(int[] arr, int target, int st, int end){
        boolean isAsc = arr[st] < arr[end];

        while(st <= end){
            int mid = st + (end - st)/2;
            if(target > arr[mid]){
                st = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                if(isAsc){
                    if(target < arr[mid]){
                        end = mid - 1;
                    }else{
                        st = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
