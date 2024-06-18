package Aggregation_Has_A_RelationShip;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        while (true){

            System.out.println("\n================ PERSON DETAILS ================\n");
            System.out.print("Enter your Name : ");
            String name = ip.nextLine();

            System.out.print("Enter your age : ");
            int age = ip.nextInt();
            ip.nextLine();

            System.out.println("You need to enter your full address so");

            System.out.print("Enter your city : ");
            String city = ip.nextLine();

            System.out.print("Enter your state : ");
            String state = ip.nextLine();

            System.out.print("Enter your country : ");
            String country = ip.nextLine();

            System.out.print("Enter your pincode : ");
            int pincode = ip.nextInt();

            Person person1 = new Person(name,age);
            person1.addAddress(city,state,country,pincode);

            // printing the Person Details
            System.out.println("\nThe Details of a person is as follow\n" + person1);

            System.out.print("\n Do you want to enter anothor record (Y/N) :");
            char  choice = ip.next().charAt(0);
            if (choice == 'Y' || choice == 'y'){
                System.out.println("\n===================================\n");
            }
            else if (choice == 'N' || choice == 'n') {
                ip.close();
                System.out.println("Good bye...!");
                System.exit(1);
            }
        }
    }
}
