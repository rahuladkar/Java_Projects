package Project_OLA;

public class Bike extends Vehicle{

    final static double price = 15.0d;

    @Override
    public double cost(double distance){

        return distance * price;
    }

}
