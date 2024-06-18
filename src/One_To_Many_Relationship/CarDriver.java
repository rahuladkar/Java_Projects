package One_To_Many_Relationship;

public class CarDriver {

    public static void main(String[] args) {

        Car c1 = new Car("Tata Nexon");

        System.out.println("Car Name : " + c1.getCarName());

        System.out.print("Tyres : ");
        for (int i = 0; i < c1.tyres.length; i++) {
            System.out.print(c1.tyres[i].getBrand());
            if (i < c1.tyres.length-1) {
                System.out.print(", ");
            }
        }

    }
}
