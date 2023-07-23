package Generics;

public class Main {
    public static void main(String[] args) {


        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

//        displayArray(intArray);  // static methods can access only static stuff (directly-without creating an object)
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(stringArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));

    }

    public static <Thing> void displayArray(Thing[] array) { //
        for (Thing x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }  // This Generic method is easier and more efficient than the previous individual method

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }






    /*public static void displayArray(Double[] array) {
        for (double x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(Character[] array) {
        for (Character x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(String[] array) {
        for (String x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }*/

}


