package Task_Week3;

public class Person implements Comparable<Person> { // this Comparable(interface) is inbuilt in system
    private String name; // variables or attributes of Teacher, Seniorstudent and Juniorstudent
    private int level;
    private int age;


    // Constructor
    public Person(String name, int level, int age) {
        this.name = name;
        this.level = level;
        this.age = age;
       // this.designation = designation;
    }
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {  // Method overriden from Comparable inbuilt
        return Integer.compare(age,level);  // inbuilt comparable to class Person
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", age=" + age +
                '}';
    }
    //    public StatusType getDesignation() {
//        return designation;
   // }
}

/*                      Book Selection - Person requesting for Book
* 1) Person requesting for Book
* i. Create a Person class: We intend to create a Priority Queue for Teacher, Senior Students and Junior Students
* ii. Person implements Comparable<Person>: // this Comparable(interface) is inbuilt in system: We intend to compare
*     Teacher, Senior Student and Junior Students on a (first come first serve - Priority Queue)
*      basis in an (inbuilt Comparable)
* */
