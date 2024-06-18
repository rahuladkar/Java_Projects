package Object_Class;

public class Box {

    String name;
    int price ;

    // constructor to initialize the price
    Box(String name , int price){
        this.name = name;
        this.price = price;
    }

    // overridden toString() to print data
    @Override
    public String toString() {
        return "Name : " + this.name + "\nPrice : " + this.price;
    }

    // overridden hashCode() to print random number


    @Override
    public int hashCode() {
        return price + 143;
    }

    // overridden equals(Object) to compare the price = price
    @Override
    public boolean equals(Object obj) {

        return (this.price == ((Box)obj).price);
    }


}
