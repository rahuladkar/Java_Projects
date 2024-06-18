package Interface;

import Abstraction.*;

public class Calci_Driver {

    public static void main(String[] args) {

            AbsBasicCalci calsiVer1 = new Calsi_Ver1();
            AbsBasicCalci calsiVer2 = new Clasi_ver2();
            AbsBasicCalci basicCalsi = new BasCalci();

            System.out.println("--------------------------------------");

            // calling the add() from AbstractBasicCalsi class
            System.out.println("Add : ");
            System.out.println("Addition of 10 , 20 is : "+ basicCalsi.add(10,20));
            System.out.println("Addition of 1 , 2 is : "+ calsiVer1.add(1,2));
            System.out.println("Addition of 2 , 3 is : "+ calsiVer2.add(2,3));

            System.out.println("--------------------------------------");

            // calling the sub() from AbstractBasicCalsi class
            System.out.println("Sub : ");
            System.out.println("Subtraction of 10 ,20 is : "+ basicCalsi.sub(10,20));
            System.out.println("Subtraction of 1 ,2 is : "+ calsiVer1.sub(1,2));
            System.out.println("Subtraction of 2 ,3 is : "+ calsiVer2.sub(2,3));

            System.out.println("--------------------------------------");

            // calling the power(double,double) of AbstractCalciVer1
            System.out.println("power : ");
            System.out.println("Power of 2^3 is : " + ((AbsCalciVer1)calsiVer1).power(2,3)); // down casting

            System.out.println("--------------------------------------");

            // calling the square(double) of AbstractCalciVer2
            System.out.println("square : ");
            System.out.println("Square of 9 is : " + ((AbsCalciVer2)calsiVer2).square(9));


            System.out.println("--------------------------------------");

            // calling the cube(double) of AbstractCalciVer2
            System.out.println("cube : ");
            System.out.println("Cube of 9 is : " + ((AbsCalciVer2)calsiVer2).cube(9));


        }

}
