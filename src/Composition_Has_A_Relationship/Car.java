package Composition_Has_A_Relationship;

import java.util.ArrayList;

public class Car {
    private String name;
    private ArrayList<Engine> engineset;
    private ArrayList<Tyre> tyreSet;

    // getter()
    public String getName() {
        return name;
    }
    public ArrayList<Engine> getEngineset() {
        return engineset;
    }
    public ArrayList<Tyre> getTyreSet() {
        return tyreSet;
    }

    // setter()
    public void setName(String name) {
        this.name = name;
    }

    // Constructor to load the data
    Car(String name){
        setName(name);
    }

    // add engine to car
    public void addEngine(int hp , String type){
        engineset = new ArrayList<Engine>();
        engineset.add(new Engine(hp,type));

    }

    // add tyre to car
    public void addTyre(String make , int size){
        tyreSet = new ArrayList<Tyre>();
        tyreSet.add(new Tyre(make,size));
    }

    @Override
    public String toString() {
        return "Car Name : " + name + "\nEngine : { HP : " +
                engineset.getFirst().getHp() +
                " , Type : " + engineset.getFirst().getType()
                +  "}\nTyre : { Make : " + tyreSet.getFirst().getMake()
                + " , Size : " + tyreSet.getFirst().getSize() + "}";
    }
}
