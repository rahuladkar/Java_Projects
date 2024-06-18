package Abstraction;

public class BasicCalsi extends AbstractBasicCalci{

    @Override
    int add(int a ,int b) {
        return Math.addExact(a,b);
    }

    @Override
    int sub(int a, int b) {
        return Math.subtractExact(a,b);
    }
}
