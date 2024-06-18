package Early_Instantiation_Design;

public class CarTest1 {

    public static void main(String[] args) {

        Car c1 = new Car("Tata");

        System.out.println("model : " + c1.getModel());
        System.out.println("hp : " + c1.getE().getHp());
    }
}