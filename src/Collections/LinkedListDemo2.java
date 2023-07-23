package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList new_l= new LinkedList();
        new_l.addAll(l);
        System.out.println(new_l);//[X, Y, Z, A, B, C]

        new_l.removeAll(l);
        System.out.println(new_l); // []

        //sort() Collections.sort(collection)
        System.out.println("Before sorting:" + l); // [X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After sorting: " + l);// [A, B, C, X, Y, Z]

        //reverse order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse order: " + l); // [Z, Y, X, C, B, A]

        //shuffling
        Collections.shuffle(l);
        System.out.println("After shuffling: " + l); // [X, Z, B, A, C, Y]



    }
}
