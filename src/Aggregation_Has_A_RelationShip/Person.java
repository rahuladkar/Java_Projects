package Aggregation_Has_A_RelationShip;

import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private ArrayList<Address> address;

    // constructor to load the data
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    // adding the address to the Person class
    public void addAddress(String city,String state ,String country , int pincode){
        address = new ArrayList<Address>();
        address.add(new Address(city,state,country,pincode));
    }

    // overridden toString() to print the Person details
    @Override
    public String toString() {
        return "Name : " + name +
                "\nAge : " + age +
                "\nThe Address of " + name + " is :-" +
                "\ncity : " + address.getFirst().getCity() +
                "\nstate : " + address.getFirst().getState() +
                "\ncountry : " + address.getFirst().getCountry() +
                "\npincode : " + address.getFirst().getPincode();
    }
}
