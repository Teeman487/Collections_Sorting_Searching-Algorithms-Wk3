package Collections;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        //LinkedHashSet <Integer>lset=new LinkedHashSet<Integer>();
        //HashSet lset = new HashSet();
        LinkedHashSet lset = new LinkedHashSet();

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);
        System.out.println(lset); // HashSet[400, 100, 500, 200, 300] // LinkedHashSet [100, 200, 300, 400, 500]
    }
}
