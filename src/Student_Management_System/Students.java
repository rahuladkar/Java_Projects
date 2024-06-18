package Student_Management_System;

import java.util.Arrays;
public class Students {

    public static void total_marks(Student s){
        System.out.println("The total marks obtained is " + Arrays.stream(s.getMarks()).sum());
    }
    public static void average_marks(Student s){
        System.out.println("The average marks obtained is " + (Arrays.stream(s.getMarks()).sum())/(double)s.getMarks().length);
    }

    public static void max_marks(Student s){
        System.out.println("The minimum marks obtained is " + Arrays.stream(s.getMarks()).max().getAsInt());
    }

    public static void min_marks(Student s){
        System.out.println("The minimum marks obtained is " + Arrays.stream(s.getMarks()).min().getAsInt());
    }
}
