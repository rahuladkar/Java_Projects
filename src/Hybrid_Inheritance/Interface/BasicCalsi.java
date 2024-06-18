package Interface;

public class BasicCalsi implements AbstractBasicCalci{

    @Override
    public int add(int a ,int b) {
        return Math.addExact(a,b);
    }

    @Override
    public int sub(int a, int b) {
        return Math.subtractExact(a,b);
    }
}
