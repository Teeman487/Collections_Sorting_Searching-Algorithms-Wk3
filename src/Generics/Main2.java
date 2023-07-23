package Generics;

public class Main2 {
    public static void main(String[] args) {

        MYGenericClass<Integer, Integer> myInt = new MYGenericClass<>(1, 9);
        MYGenericClass<Double, Integer> myDouble = new MYGenericClass<>(1.0, 9);
        MYGenericClass<Character, Integer> myChar = new MYGenericClass<>('!', 9);
        MYGenericClass<String, Character> myString = new MYGenericClass<>("Hello", '$');


        System.out.println( myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());




    }
}
