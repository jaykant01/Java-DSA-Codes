package sigma.searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 17, 22, 45, 98};
        int[] arr = {98, 45, 22, 17, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 16;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in Ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

