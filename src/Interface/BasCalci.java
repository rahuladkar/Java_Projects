package Interface;

public class BasCalci implements  AbsBasicCalci{

    @Override
    public int add(int a ,int b) {
        return Math.addExact(a,b);
    }

    @Override
    public int sub(int a, int b) {
        return Math.subtractExact(a,b);
    }
}
