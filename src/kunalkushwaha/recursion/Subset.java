package kunalkushwaha.recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        subset("", "abc");
        System.out.println(subsetList("", "abc"));
        subsetAscii("", "abc");
    }
    // Simple Approach
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //Add it
        subset(p+ch, up.substring(1));
        // Ignore it
        subset(p, up.substring(1));
    }

    // Adding all the subset in Arraylist now
    static ArrayList<String> subsetList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // Add it
        ArrayList<String> left = subsetList(p+ch, up.substring(1));
        // Ignore it
        ArrayList<String> right = subsetList(p, up.substring(1));
        // Add both list elements in one list
        left.addAll(right);
        return left;
    }

    // Subset with ASCII value
    static void subsetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //Add it
        subsetAscii(p+ch, up.substring(1));
        // Ignore it
        subsetAscii(p, up.substring(1));
        // Ascii value
        subsetAscii(p+ (ch+0), up.substring(1));
    }
}
