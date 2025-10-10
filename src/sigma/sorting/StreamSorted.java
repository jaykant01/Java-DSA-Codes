package sigma.sorting;

import java.util.ArrayList;

public class StreamSorted {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-9);
        list.add(-18);
        list.add(0);
        list.add(25);
        list.add(4);

        System.out.println(list);

        // Sort using stream api

        list.stream().sorted().forEach(System.out:: print);

    }

}
