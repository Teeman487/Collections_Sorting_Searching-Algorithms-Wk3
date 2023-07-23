package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {
    public static void main(String[] args) {
        LinkedList q=new LinkedList();

        //Adding elements add() offer

        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(100); // allowed in queue (heteregeneous data allowed)
        q.offer("C");
        System.out.println(q); // [A, B, C, 100] // Insertion order preserved & duplicates allowed

        //get  head element  element()  peak()
        System.out.println(q.element()); //A Returns Head element, if empty returns NoSuchElementException
        System.out.println(q.peek()); //A Returns Head element, if empty returns nulll

        //RETURN & REMOVE element from queue  remove()  poll()
        //System.out.println(q.remove());//A
        //System.out.println(q); // [B, C, C]   //[] IF q is empty it returns Exception

        // System.out.println(q.poll());//A
        //System.out.println(q); // [B, C, C] // null IF q is empty

       Iterator itr =q.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next()); // A B C C
        }

        //for(Object ele:q);
        //{
         //   System.out.println(ele);
       // }




    }
}
