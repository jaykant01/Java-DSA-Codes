package sigma.hashing;

import java.util.*;


public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China", 150);
        hm.put("USA", 40);
        hm.put("Japan", 40);
        hm.put("India", 40);
        hm.put("Germany", 40);
        hm.put("France", 40);
        hm.put("United Kingdom", 40);
        hm.put("Germany", 40);

        System.out.println(hm);

        // Interation

        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key= "+k+ ",value= "+hm.get(k));
        }

    }
}
