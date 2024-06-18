package Hierarchical_Inheritance;

public class Square extends Shape{

    private double side;

    // getter()
    public double getSide() {
        return side;
    }

    // setter()
    public void setSide(double side) {
        this.side = side;
    }

    // constructor to initialize the side
    Square(double side){
        this.side = side;
    }

    @Override
    void computeArea() {
        area = side*side;
        System.out.println("The Area of a Square is : " + area);
    }
}
