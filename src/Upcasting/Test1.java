package Upcasting;

public class Test1 {

    public static void main(String[] args) {

        Student student = new Student("Rahul",4201);
        System.out.println("name : " + student.getName() + " , age : " + student.getStud_id());

        // implicit typecasting
        Person person = student;
        System.out.println("name : " + person.getName()  /*" , age : " + person.getStud_id()*/);

        // implicit typecasting
        Person person1 = (Person) student;
        System.out.println("name : " + person1.getName()  /*" , age : " + person1.getStud_id()*/);
    }
}
