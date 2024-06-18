package Student_Management_System;

public class StudentDriver {

    public static void main(String[] args) {

        String name = "Rahul";
        String _class = "BE";
        int[] marks = {90,85,75,80,87};

        Student s1 = new Student(name,_class,marks);
        Students.total_marks(s1);
        Students.average_marks(s1);
        Students.max_marks(s1);
        Students.min_marks(s1);

    }
}
