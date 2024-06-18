package Project_OLA;

import java.util.Objects;
import java.util.Scanner;

public class Ola_App {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        while(true){

            System.out.println("\n\t******************* WELCOME TO THE OLA APP *******************");
            System.out.println("\n\tPlease select which mode do you want");
            System.out.println("\n\t1. Bike");
            System.out.println("\t2. Auto");
            System.out.println("\t3. Cab");
            System.out.print("\n\tEnter the option : ");
            int choice = ip.nextInt();

            Vehicle vehicle = null;

            switch (choice){
                case 1 : {
                    vehicle = new Bike();
                } break;
                case 2 : {
                    vehicle = new Auto();
                }break;
                case 3 : {
                    vehicle = new Cab();
                }break;
                default:{
                    System.out.println("Please Enter Valid Option...!");
                }
            }// end of switch

            System.out.print("\n\tEnter Your Location : ");
            vehicle.startingLocation = ip.next(); // store the current location

            System.out.print("\tEnter Destination Location : ");
            vehicle.destinationLocation = ip.next(); // store the destination location

            System.out.print("\n\tPlease enter the distance : ");
            vehicle.distance = ip.nextDouble(); // store the distance

            // calculate the cost of the journey
            System.out.println("\n\tCost of Journey : " + vehicle.cost(vehicle.distance));

            System.out.print("\n\tDid you want to confirm (Y/N) : ");
            String confirmOption = ip.next();

            if (Objects.equals(confirmOption, "Y") || Objects.equals(confirmOption, "y")){

                System.out.println("\n\tYour Journey from " + vehicle.startingLocation + " to " + vehicle.destinationLocation + "..!");
                System.out.println("\tThe total cost of the journey is : " + vehicle.cost(vehicle.distance));
                System.out.println("\n\tYou have successfully book the Ola");
                System.out.println("\n\tThank you..!");
            }
            else if (Objects.equals(confirmOption, "N") || Objects.equals(confirmOption, "n")) {
                System.out.println("\n\tNo worries..!");
                System.out.println("\tThank You...!");
            }
            else {
                System.out.println("\n\tYou Enter wrong option");
                continue;
            }

            System.out.print("\n\tDo you want to book one more OLA (Y/N)");
            confirmOption = ip.next();

            if (Objects.equals(confirmOption, "Y") || Objects.equals(confirmOption, "y")){
                continue;
            }
            else if (Objects.equals(confirmOption, "N") || Objects.equals(confirmOption, "n")) {
                System.out.println("\tThank You so much ...!");
                System.out.println("\tSee you again...!");
                ip.close();
                System.exit(1);
            }
            else {
                System.out.println("\tYou entered wrong option");
                System.out.println("\tclosing the OLA...!");
                System.exit(1);
            }

        }// end of while

    }// end of main
}// end of class
