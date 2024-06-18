package Aggregation_Has_A_RelationShip;

public class Address {

    private String  city;
    private String  state;
    private String  country;
    private int pincode;

    // getter()
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getCountry() {
        return country;
    }
    public int getPincode() {
        return pincode;
    }

    // constructor to load the data
    Address(String city,String state , String country , int pincode){
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
