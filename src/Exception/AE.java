package Exception;

// ArithmeticException

import java.util.Scanner;

public class AE {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        try {
            System.out.print("\nEnter First Number : ");
            int num1 = ip.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = ip.nextInt();
            System.out.println("Result : " + num1/num2);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Main ends");
    }
}
