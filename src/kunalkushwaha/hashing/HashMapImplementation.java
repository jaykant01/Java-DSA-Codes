package kunalkushwaha.hashing;

import java.util.*;
public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        // insert
        hm.put("China", 150);
        hm.put("USA", 40);
        hm.put("Germany", 50);
        hm.put("United States", 70);
        hm.put("France", 80);
        hm.put("India", 100);

        System.out.println(hm);

        // Get
        int population = hm.get("China");
        System.out.println(population);

        // Contains

        System.out.println(hm.containsKey("USA")); // true
        System.out.println(hm.containsKey("Russia"));  // false

        // Remove

        hm.remove("China");
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // IsEmpty

        System.out.println(hm.isEmpty());  //return false

        // Clear

        hm.clear();
        System.out.println(hm);
    }

}
