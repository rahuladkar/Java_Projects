package Downcasting;

public class Test1 {

    public static void main(String[] args) {

        Person person1 = new Student("Rahul",4201); // upcasting

        Student student1 = (Student) person1; // down casting

        System.out.println(((Student)person1).getSid()); // single line down casting

        System.out.println(student1.getName());
        System.out.println(student1.getSid());
    }
}
