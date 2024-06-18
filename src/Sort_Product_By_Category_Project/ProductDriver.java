package Sort_Product_By_Category_Project;

import java.util.Arrays;
import java.util.Scanner;

public class ProductDriver {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("\n================= Sorting Element Based on There Categories =================\n");

        System.out.print("Enter How many Product do you want to enter : ");
        int count =ip.nextInt() , i = 0;
        ip.nextLine();

        // Creating the array of the Producs
        Product[] products = new Product[count];


        while (i++ < count){
            System.out.println("\nEnter " + i + " Product Details : \n");

            System.out.print("Enter the Product ID : ");
            int pid = ip.nextInt();
            ip.nextLine();

            System.out.print("Enter the Product Name : ");
            String name = ip.nextLine();

            System.out.print("Enter the Product Price : ");
            double price = ip.nextDouble();

            System.out.print("Enter the Product Quantity : ");
            int quantity = ip.nextInt();

            products[i-1] = new Product(pid,name,price,quantity);
        }

        while(true){
            System.out.println("\nSort Based on : ");
            System.out.println("1. Product Id" + "\t2. Product Name");
            System.out.println("3. Product Price" + "\t4. Product Quantity");
            System.out.println("0. Exit");
            System.out.print("\nEnter Option : ");
            int choice = ip.nextInt();

            switch (choice){

                case 1:{
                    System.out.println("\nSorting Based on Product ID\n");
                    Arrays.sort(products,new Product_pid_Comparator());
                    System.out.println(Arrays.toString(products));
                    System.out.println("=============================================");

                }break;

                case 2:{
                    System.out.println("\nSorting Based on Product Name\n");
                    Arrays.sort(products,new Product_name_Comparator());
                    System.out.println(Arrays.toString(products));
                    System.out.println("=============================================");
                }break;

                case 3:{
                    System.out.println("\nSorting Based on Product Price\n");
                    Arrays.sort(products,new Product_price_Comparator());
                    System.out.println(Arrays.toString(products));
                    System.out.println("=============================================");
                }break;

                case 4:{
                    System.out.println("\nSorting Based on Product Quantity Available\n");
                    Arrays.sort(products,new Product_quantity_Comparator());
                    System.out.println(Arrays.toString(products));
                    System.out.println("=============================================");
                }break;

                case 0:{
                    System.out.println("Thank you...!");
                    System.exit(1);
                }break;
                default:{
                    System.out.println("\nWrong Input...!\n");
                }
            }


        }
    }
}
