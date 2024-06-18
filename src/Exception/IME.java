package Exception;

// InputMismatchException

import java.util.InputMismatchException;
import java.util.Scanner;

public class IME {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        try {
            System.out.print("Enter any number : ");
            int num = ip.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
