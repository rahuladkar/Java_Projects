package Early_Instantiation_Design;

public class Car {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // constructor
    Car(){}

    // Constructor to initialize the model
    Car(String model){
        setModel(model);
    }

    // early instantiation of Engine class

    Engine e = new Engine(10);

    public Engine getE() {
        return e;
    }
}
