package Task_Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator { // Created Comparator
    public static void main(String[] args) {

        Book maths = new Book("Mr Warith","GeneralMaths",2023,1);
        Book english = new Book("Mr Kozeem","Active English",2022,0);
        Book physics = new Book("Mr Tunde","New Physics",2018,3);
        Book agric = new Book("Mr Alaba","agric Farm Tool",1989,4);
        Book chemistry = new Book("Mr Jide","Organic Chemistry",2023,5);

    // The library should return ‘book taken: Create Array list of Books to be added or stored in Library.
        List<Book> books = new ArrayList<>();
        books.add(maths);
        books.add(english);
        books.add(physics);
        books.add(agric);
        books.add(chemistry);

    // They can be multiple copies of the same book in the library: after storage, Librarian uses Comparator features to
    // sort or Order the books multiple times in the library.
        Collections.sort(books, new java.util.Comparator<Book>() {

            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getQuantity(), book2.getQuantity()); // ascending oder based on Quantity...

            }
        }
        );
        for (Book book : books) {
            System.out.println("There are " + book.getQuantity() + " pieces of " + book.getTitle()+" returned");
        }
        /*
        *  There are 0 pieces of Active English
           There are 1 pieces of GeneralMaths
           There are 3 pieces of New Physics
           There are 4 pieces of agric Farm Tool
           There are 5 pieces of Organic Chemistry*/





    }
}
