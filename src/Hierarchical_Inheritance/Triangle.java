package Hierarchical_Inheritance;

public class Triangle extends Shape{

    private double base;
    private double height;

    // getter()
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    // setter()
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // constructor to initialize the base and height

    Triangle(double base ,double height){
        this.base = base;
        this.height = height;
    }

    @Override
    void computeArea() {
        area = 0.5 * base * height;
        System.out.println("The Area of a Triangle is : " + area);
    }
}
