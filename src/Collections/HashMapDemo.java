package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
       // HashMap m = new HashMap();
        HashMap <Integer, Integer> m = new HashMap<Integer, Integer>();

//        m.put(101, 1);
//        m.put(102, 2);
//        m.put(103, 3);
//        m.put(104, 4);
//        m.put(105, 5);
//        m.put(103, 6);
//        m.put(106, 7);
        m.put(101,1);
       // System.out.println(m.put(101,1));
        System.out.println(m.put(101, m.get(101)+3));
//        System.out.println(m); //{101=John, 102=David, 103=X, 104=Mary, 105=Tye, 106=David}
//        System.out.println(m.get(105)); // Tye
//
//        m.remove(106); // remove pair from hashmap
//        System.out.println(m);
//
//        System.out.println(m.containsKey(101));//true
//        System.out.println(m.containsKey(106)); //false
//
//        System.out.println(m.containsValue("Mary"));//true
//        System.out.println(m.containsValue("Y"));//false
//
//        System.out.println(m.isEmpty());//false
//        System.out.println(m.keySet()); //returns all the keys as Set// [101, 102, 103, 104, 105]
//
//        for(Object i:m.keySet())
//        {
//            System.out.println(i); // 101 ... 105
//        }
//
//       // System.out.println(m.values()); // returns all the values as Collection // [John, David, X, Mary, Tye]
//
//        for(Object i:m.values())
//        {
//            System.out.println(i); // John ... Tye
//        }
//
//        for(Object i:m.keySet())
//        {
//            System.out.println(i+"    "+m.get(i));
//
//        }
//        //System.out.println(m.entrySet()); // Returns all the entries as Set // [101=John, 102=David, 103=X, 104=Mary, 105=Tye]
//
//        // Entry methods
//        //*********
//       /* for(Map.Entry entry:m.entrySet()) // 101 x
//        {
//            System.out.println(entry.getKey()+"     "+entry.getValue());
//        }*/
//
//        //Iterator
//
//        Set s =m.entrySet();
//       Iterator itr = s.iterator();
//
//       while(itr.hasNext())
//       {
//          Map.Entry  entry=(Map.Entry) itr.next();  // 101 X entry
//           System.out.println(entry.getKey()+"    "+ entry.getValue());
//
//
//
//       }
    }
}
