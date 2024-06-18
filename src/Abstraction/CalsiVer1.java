package Abstraction;

public class CalsiVer1 extends AbstractCalciVer1{

    @Override
    int add(int a ,int b) {
        return Math.addExact(a,b);
    }

    @Override
    int sub(int a, int b) {
        return Math.subtractExact(a,b);
    }

    @Override
    double power(double a, double b) {
        return Math.pow(a,b);
    }
}
