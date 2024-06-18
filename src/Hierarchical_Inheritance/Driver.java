package Hierarchical_Inheritance;

public class Driver {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(20,10);
        triangle1.computeArea();

        Square square1 = new Square(8);
        square1.computeArea();

        Circle circle1 = new Circle(5);
        circle1.computeArea();
    }
}
