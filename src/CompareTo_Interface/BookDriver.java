package CompareTo_Interface;

import java.util.Arrays;
import java.util.Scanner;

public class BookDriver {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("\n=================== Library ===============\n");
        System.out.print("Enter how many books do you want to add : ");
        int count = ip.nextInt() , i=0;

        Book[] books = new Book[count];

        while(i<count){

            ip.nextLine();

            System.out.println("\nEnter " + (i+1) + " Book Details \n");

            System.out.print("Enter the Book name : ");
            String bookName = ip.nextLine();
            System.out.print("Enter the Author Name : ");
            String author = ip.nextLine();
            System.out.print("Enter the Price of Book : ");
            double price = ip.nextDouble();

            books[i] = new Book(bookName,author,price);

            i++;
        }

        System.out.println("\nYou have successfully added the book in Library...!\n");

        System.out.println("Select any one option : \n1. Ascending \t2. Descending \t0. Exit");
        System.out.print("Enter option : ");
        int order = ip.nextInt();
        System.out.println();

        Arrays.sort(books);

        if(order==1){

            for (Book book : books) {
                System.out.println(book);
                System.out.println("========================================================\n");
            }
        } else if (order==2) {

            for(int j= books.length-1 ; j>=0 ; j--){
                System.out.println(Arrays.toString(books));
                System.out.println("========================================================\n");
            }
        } else if (order==0) {
            ip.close();
            System.out.println("Thank You...!");
            System.exit(1);
        }
        else {
            System.out.println("Wrong Input...!");
        }
    }
}
