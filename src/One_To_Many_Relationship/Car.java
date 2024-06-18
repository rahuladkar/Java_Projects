package One_To_Many_Relationship;

public class Car {
    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    // constructor
    Car(){}

    // constructor to initialize carName
    Car(String carName){
        setCarName(carName);
    }

    // object creation of Tyre class
    Tyre[] tyres = {
            new Tyre("MRF"),
            new Tyre("Apollo"),
            new Tyre("CEAT"),
            new Tyre("MRF")
    };

}
