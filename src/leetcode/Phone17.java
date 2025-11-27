package leetcode;

import java.util.ArrayList;

public class Phone17 {
    public static void main(String[] args) {
        System.out.println(phone("", "23"));
    }
    static String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
    };
    static ArrayList<String> phone(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        String letters = mapping[digit];
        ArrayList<String> ans = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            ans.addAll(phone(p+ch, up.substring(1)));
        }
        return ans;
    }
}
