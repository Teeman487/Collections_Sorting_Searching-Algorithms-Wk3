package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Declare ArrayList
        //ArrayList <Integer> al = new ArrayList<Integer>();// stores homogeneous data
        //ArrayList <String> al = new ArrayList<String>(); // stores homogeneous data
        //List al = new ArrayList(); // can store different types of data; heterogeneous data
        ArrayList al = new ArrayList(); // can store different types of data; heterogeneous data

        //Add new elements to the arrayList
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al); //[100, welcome, 15.5, A, true]

        //size() ; Number of elements
        System.out.println("Number of elements in array list: " + al.size()); //5

        //remove
        al.remove(1); //here 1 is index
        //al.remove("welcome");// here welcome is element
        System.out.println("After removing element from array list: " + al); // [100, 15.5, A, true]

        //insert a new element
        // add(index, object)
        al.add(2, "Python");
        System.out.println("After insertion:" + al); // [100, 15.5, Python, A, true]

        //retreive specific element
        System.out.println(al.get(2)); // Python, here 2 is index of element/object

        //change element/replace
        al.set(2,"C#");
        System.out.println("After replacing element:" + al); // [100, 15.5, C#, A, true]

        //search - contains() - RETURNS TRUE/FALSE
        System.out.println(al.contains("C#")); // true
        System.out.println(al.contains(15.5));// true
        System.out.println(al.contains("C++"));// false

        //isEmpty() - RETURNS TRUE/FALSE
        System.out.println(al.isEmpty()); // false

        // 1) for loop
        System.out.println("Reading elements using for loop.....");

        // i=0; 0<5[Condtion meant(4)]; i+=2[100,C#,true] 0r i++ similar to i+=1
        for(int i=0;i<al.size(); i++)
        {
            System.out.println(al.get(i)); // 100,15.5,C#,A, true
        }

        // 2) for..each loop
        System.out.println("Reading elements using for ..,each loop.....");
        for(Object e:al){
            System.out.println(e); //100,15.5,C#,A,true
        }

        //3) iterator()
        System.out.println("Reading elements using iterator method");
        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()); //100,15.5,C#,A,true

        }



    }
}
