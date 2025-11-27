package leetcode;

import java.util.ArrayList;

public class Permutations46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<Integer> result = (permute(nums));
        System.out.println(result);
    }
    static ArrayList<Integer> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        String up = "";
        for (int n : nums) {
            up += n;
        }
        return permutations("", up);
    }
    static ArrayList<Integer> permutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(p));
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
