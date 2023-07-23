package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {

       // Hashtable t = new Hashtable(); // capacity is 11, load factor 0.75
      //  Hashtable t = new(initial capacity); // create hashtable object with some capacity
       // Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);
        Hashtable<Integer, String> t = new Hashtable<Integer, String>();

        t.put(101,"John");
        t.put(102,"David");
       // t.put(103, "Smith");
       // t.put(null, "X"); // NullPointerEception
        //t.put(104,null); //NullPointerException

        System.out.println(t); //{103=Smith, 102=David, 101=John}

        System.out.println(t.containsKey(102)); //true
        System.out.println(t.containsKey(105)); //false

        System.out.println(t.containsValue("David")); // true
        System.out.println(t.containsValue("Y")); //false

        System.out.println(t.isEmpty()); //false
        System.out.println(t.keySet()); // [102, 101]
        System.out.println(t.values()); //[David, John]

        for(int k:t.keySet())
        {
            System.out.println(k+"   "+t.get(k));   //102  101           David  John

        }
        //Entry specific methods...
        for(Map.Entry entry:t.entrySet())  //(key, value)
        {
            System.out.println((entry.getKey()+"   " + entry.getValue()));

        }
        //Iterator

        Set s = t.entrySet();
        Iterator itr = s.iterator();

        while(itr.hasNext())
        {
            Map.Entry entry =(Map.Entry) itr.next();    //(101,x)
            System.out.println(entry.getKey()+ "    " + entry.getValue());

        }

    }
}
