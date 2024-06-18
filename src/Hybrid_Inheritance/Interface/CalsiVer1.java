package Interface;

public class CalsiVer1 extends BasicCalsi implements AbstractCalciVer1{

    @Override
    public double power(double a, double b) {
        return Math.pow(a,b);
    }
}
