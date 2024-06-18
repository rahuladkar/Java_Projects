package Interface;

public class Clasi_ver2 extends BasCalci implements  AbsCalciVer2{

    @Override
    public double square(double a) {
        return a*a;
    }

    @Override
    public double cube(double a) {
        return Math.pow(a,3);
    }
}
