package Interface;

public class CalsiVer2 extends BasicCalsi implements   AbstractCalciVer2{

    @Override
    public double square(double a) {
        return a*a;
    }

    @Override
    public double cube(double a) {
        return Math.pow(a,3);
    }
}
