package Banking_Managaement_Sytem;

import java.util.Scanner;

public class BankDriver {

    public static void main(String[] args) {

        String name;
        long mobNumber;
        String DOB;
        long adharNumber;
        String address;

        Scanner ip = new Scanner(System.in);

        System.out.println("\n********************************* Welcome To MyBank *********************************");
        System.out.println("\n\tFirst Create the Account\n");

        System.out.print("\tEnter Your Name : ");
        name = ip.nextLine();

        System.out.print("\tEnter Your Mobile Number : ");
        mobNumber = ip.nextLong();
        while (true){
            if(!Validation.validateMob(mobNumber)){
                System.out.println("\tYou are entering wrong number ");
                System.out.print("\tEnter Your Mobile Number : ");
                mobNumber = ip.nextLong();
            }
            else {
                break;
            }
        }

        System.out.print("\tEnter Your Adhar Number : ");
        adharNumber = ip.nextLong();
        while (true){
            if(!Validation.validateAdhar(adharNumber)){
                System.out.println("\tYou are entering wrong Adhar Number ");
                System.out.print("\tEnter Your Adhar Number : ");
                adharNumber = ip.nextLong();
            }
            else {
                break;
            }
        }

        System.out.print("\tEnter Your Date of Birth (dd/mm/yyyy): ");
        DOB = ip.next();

        ip.nextLine();

        System.out.print("\tEnter Your Address : ");
        address = ip.nextLine();

        // object creation of the MyBank class
        MyBank customer1 = new MyBank(name,mobNumber,adharNumber,DOB,address);

        // Account creation done and calling createAccount()
        customer1.createAccount();

        while (true){

            System.out.println("\n\n\tWelcome "+ name +"...!");
            System.out.println("\t1. Deposit Money ");
            System.out.println("\t2. Withdraw Money ");
            System.out.println("\t3. Check Balance ");
            System.out.println("\t0. exit ");
            System.out.print("\n\tEnter option : ");
            int choice = ip.nextInt();

            switch(choice){

                case 1:{
                    System.out.print("\n\tEnter amount : ");
                    customer1.deposit(ip.nextDouble());
                    System.out.println("\tMoney was Deposit Successfully...!");
                }break;

                case 2:{
                    System.out.print("\n\tEnter amount : ");
                    customer1.withdraw(ip.nextDouble());
                    System.out.println("\tMoney was Withdrawn Successfully...!");
                }break;

                case 3:{
                    customer1.checkBalance();
                }break;

                case 0:{
                    System.out.println("\n\tThank you...!");
                    System.out.println("\n\tClosing...!");
                    System.exit(1);
                    ip.close();
                }break;

                default:
                    System.out.println("\tWrong Input...!");
            }

        }

    }


}
