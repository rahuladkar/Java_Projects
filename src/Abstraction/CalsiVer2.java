package Abstraction;

public class CalsiVer2 extends  AbstractCalciVer2{

    @Override
    int add(int a ,int b) {
        return Math.addExact(a,b);
    }

    @Override
    int sub(int a, int b) {
        return Math.subtractExact(a,b);
    }

    @Override
    double square(double a) {
        return a*a;
    }

    @Override
    double cube(double a) {
        return Math.pow(a,3);
    }
}
