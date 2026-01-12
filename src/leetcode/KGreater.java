package leetcode;

import java.util.Arrays;

public class KGreater {
    public static void main(String[] args) {
        int[] nums = {5,5,5};
        int k = 2;
        System.out.println(countG(nums, k));
    }
    static int countG(int[] nums, int k){
        Arrays.sort(nums);
        int n = nums.length;
        if( k == 0) return n;

        int greater = nums[n - k];
        int count = 0;
        for (int num : nums) {
            if (num < greater) {
                count++;
            }
        }
        return count;
    }
}
