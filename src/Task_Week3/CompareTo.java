package Task_Week3;
public class CompareTo {
    public static void main(String[] args) {
        Person teacher = new Person("Teacher",10,30);
        Person seniorStudent= new Person("Senior Student",2,20);
        Person juniorStudent = new Person("JuniorStudent",1,15);

        //  Integer.compare(this.status, this.status);
        // status<age

        int result = teacher.compareTo(juniorStudent);
        System.out.println(result); // 1
        /*if(result<0) {
            System.out.println(teacher.getName() + " is younger than " + juniorStudent.getName());
        }
        else if(result >0) {
            System.out.println(teacher.getName() + " is older than " + juniorStudent.getName());

        }
        else {
            System.out.println(teacher.getName() + " age is equal to " + juniorStudent.getName());
        }*/
    }
}
