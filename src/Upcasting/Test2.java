package Upcasting;

public class Test2 {

    public static void main(String[] args) {

        EngineeringStudent engineeringStudent = new EngineeringStudent("Rahul",4201,"Computer");

        Student student1 = engineeringStudent;
        Person person1 = student1;
        Object object1 = person1;

        System.out.println(student1 instanceof Person);
    }
}
