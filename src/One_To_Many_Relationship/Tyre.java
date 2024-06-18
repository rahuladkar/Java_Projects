package One_To_Many_Relationship;

public class Tyre {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // constructor
    Tyre(){}

    // constructor to initialize the brand
    Tyre(String brand){
        setBrand(brand);
    }
}
