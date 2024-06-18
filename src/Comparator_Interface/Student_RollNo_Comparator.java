package Comparator_Interface;

import java.util.Comparator;

public class Student_RollNo_Comparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Student student1 = (Student)o1;
        Student student2 = (Student)o2;

        if (student1.getRollNo() == student2.getRollNo()){
            return 0;
        }

        if (student1.getRollNo() > student2.getRollNo()){
            return 1;
        }
        return -1;
    }
}
