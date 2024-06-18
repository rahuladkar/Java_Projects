package Hybrid_Inheritance;

public class Son implements Father,Mother{

    @Override
    public void riding() {
        System.out.println("Son can ride...!");
    }

    @Override
    public void cooking() {
        System.out.println("Son can cook...!");
    }
}
