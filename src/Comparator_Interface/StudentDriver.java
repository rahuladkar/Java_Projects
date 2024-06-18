package Comparator_Interface;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDriver {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("\n======================== Sorting the Students =======================\n");

        System.out.print("First Enter how much Student do you want to add : ");
        int count = ip.nextInt() , i=0;

        Student[] students = new Student[count];

        while(i++<count){

            System.out.println("\nEnter " + i + " Student details :\n");

            System.out.print("Enter Roll Number : ");
            int rollNo = ip.nextInt();
            ip.nextLine();
            System.out.print("Enter Student Name : ");
            String name = ip.nextLine();

            students[i-1] = new Student(rollNo,name);

        }

        System.out.println("\n\nThe Sorted Student details based on there name : \n");

        Arrays.sort(students, new Student_Name_Comparator());

        for (Student student : students) {
            System.out.println(student);
            System.out.println("=========================================\n");
        }


        System.out.println("\n\nThe Sorted Student details based on there Roll Number : \n");

        Arrays.sort(students, new Student_RollNo_Comparator());

        for (Student student : students) {
            System.out.println(student);
            System.out.println("=========================================\n");
        }
    }
}
