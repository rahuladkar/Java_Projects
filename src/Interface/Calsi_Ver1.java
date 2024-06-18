package Interface;

public class Calsi_Ver1 extends BasCalci implements AbsCalciVer1{

    @Override
    public double power(double a, double b) {
        return Math.pow(a,b);
    }
}
