package Project_OLA;

public class Auto extends Vehicle{

    final static double price = 20.0d;

    @Override
    public double cost(double distance){

        return distance * price;
    }

}
