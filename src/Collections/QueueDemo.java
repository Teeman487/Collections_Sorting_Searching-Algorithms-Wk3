package Collections;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();

        //Adding elements add() offer

       q.add("A");
        q.add("B");
        q.add("C");
      q.offer("C");
      //q.offer(100); // not allowed in queue (heteregeneous data)

        System.out.println(q); // [A, B, C, C] // Insertion order preserved & duplicates allowed

        //get  head element  element()  peak()
       //System.out.println(q.element()); //A Returns Head element, if empty returns NoSuchElementException
        //System.out.println(q.peek()); //A Returns Head element, if empty returns nulll

        //RETURN & REMOVE element from queue  remove()  poll()
       System.out.println(q.poll());//A
        System.out.println(q); // [B, C, C]   //[] IF q is empty ... what is left

      // System.out.println(q.poll());//A
        //System.out.println(q); // [B, C, C] // null IF q is empty

       /* Iterator itr =q.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next()); // A B C C
        }*/
            
          /*  for(Object e:q);
            {
                System.out.println(e);
            }

           */




    }
}
