package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        //Declare Linked List
        //LinkedList <Integer> l = new LinkedList<Integer>(); //Homogeneous data
        //LinkedList<String> l = new LinkedList<String>(); //Homogeneous data
        LinkedList l =  new LinkedList();

        //Add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l); //[100, welcome, 15.5, A, true, null]
        System.out.println(l.size());//6

        //remove
       // System.out.println(l.remove(3)); // Elemets A removed
        l.remove(3); // index
        System.out.println("After removing, new list: " + l); //[100, welcome, 15.5, true, null]

        //Insert/adding element in the middle of linked list
       l.add(3, "Java");
        System.out.println("After inserting element: " + l); // [100, welcome, 15.5, Java, true, null]

        //retriving value/object
        l.get(3);
        System.out.println(l.get(3)); // Java

        //change the value
        l.set(5,"X");
        System.out.println("After changing the value:" + l); // [100, welcome, 15.5, Java, true, X]

        //contains()
        System.out.println(l.contains("Java")); // true
        System.out.println(l.contains("Python")); // false

        //isEmpty()
        System.out.println(l.isEmpty()); //false

        //Reading elements from ll using for loop
        for(int i=0; i<l.size();i++)
        {
            System.out.println(l.get(i)); // 100 welcome 15.5 Java true X
        }
        //Reading elements from LL using for ..each loop

        for(Object e:l)
        {
            System.out.println(e); // 100 welcome 15.5 Java true X
        }

        // iterator() method
        Iterator it =l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());  //
            // 100 welcome 15.5 Java true X
        }




    }
}
