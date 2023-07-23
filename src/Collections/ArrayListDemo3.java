package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        String arr[]= {"Dog","Cat","Elephant"};

        for(String value: arr)
        {
            System.out.println(value);// Dog Cat Elephant

        }


        //Convert  [ String arr[]= {"Dog","Cat","Elephant"};] to arrayList
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println("Convert String arr[] to newArray List==== " + al); // [Dog, Cat, Elephant]
    }
}


// ArrayList al=new ArrayList();
//for(Object e:al){
//      System.out.println(e); //100,15.5,C#,A,true