package kunalkushwaha.arrayList;

import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        // Add Element O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get Element O(1)

        int Element = list.get(2);
        System.out.println(Element);

        // Remove Element O(n)

        list.remove(1);
        System.out.println(list);

        // Set element

        list.set(0, 6);
        System.out.println(list);

        // Contains   O(n)

        System.out.println(list.contains(6));
        System.out.println(list.contains(2));


        // size();

        for (int i = 0; i < list.size(); i++) {
            System.out.print((list.get(i))+ " ");
        }
        System.out.println();

    }
}
