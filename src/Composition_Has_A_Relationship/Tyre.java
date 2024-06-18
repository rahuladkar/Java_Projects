package Composition_Has_A_Relationship;

public class Tyre {

    private String make;
    private int size;

    // getter()
    public String getMake() {
        return make;
    }
    public int getSize() {
        return size;
    }

    // setter()
    public void setMake(String make) {
        this.make = make;
    }
    public void setSize(int size) {
        this.size = size;
    }

    // constructor to load the data
    Tyre(String make , int size){
        setMake(make);
        setSize(size);
    }
}
