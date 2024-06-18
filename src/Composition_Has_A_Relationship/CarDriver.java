package Composition_Has_A_Relationship;

import java.util.ArrayList;

public class CarDriver {

    public static void main(String[] args) {

        Car car1 = new Car("Tata");
        car1.addEngine(200 , "x201");
        car1.addTyre("MRF",20);

//        car1.setEngineset(e1);
//        car1.setTyreSet(t1);

        System.out.println(car1);
    }
}
