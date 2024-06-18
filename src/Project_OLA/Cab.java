package Project_OLA;

public class Cab extends Vehicle{

    final static double price = 25.0d;

    @Override
    public double cost(double distance){

        return distance * price;
    }

}
