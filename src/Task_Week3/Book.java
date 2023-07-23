package Task_Week3;

public class Book {
    // Attributes or Variables
    private String Author;
    private String Title;
    private int year;
    private int quantity;

    // Constructor
    public Book(String author, String title, int year, int quantity) {
        Author = author;
        Title = title;
        this.year = year;
        this.quantity = quantity;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }
}
/*                      Book Selection
 * 1) Book selection and replacement in Library:
 * i. Create a Book class with properties and behaviors
 * ii. The library should return ‘book taken: Create Array list of Books to be added or stored in Library
 * iii. They can be multiple copies of the same book in the library: after storage, Librarian uses Comparator features
 *      to Order the books multiple times in the library .
 *
 */
