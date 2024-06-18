package Multilevel_Inheritance;

public class Driver {

    public static void main(String[] args) {

        Student student1 = new Student(4201 , "Rahul" , 82);

        System.out.println("The student id is : " + student1.getStud_id());
        System.out.println("The name is : " + student1.getName());
        System.out.println("The weight id is : " + student1.getWeight());
    }
}
