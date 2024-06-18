package Hierarchical_Inheritance;

public class Circle extends Shape{

    private double radius;
    final double pi = 22d/7d;

    // getter()
    public double getRadius() {
        return radius;
    }

    // setter()
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // constructor to initialize the radius
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void computeArea() {
        area = pi * radius * radius;
        System.out.println("The Area of a Circle is : " + area);
    }
}
