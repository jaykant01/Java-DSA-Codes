package problems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] num = reverse(arr);
        System.out.println(Arrays.toString(num));
        for (int i=0; i<n; i++) {

        }

    }
    static int[] reverse(int[] arr) {
        int st = 0;
        int end = arr.length-1;

        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return arr;
    }
}
