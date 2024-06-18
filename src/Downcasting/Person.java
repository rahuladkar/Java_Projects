package Downcasting;

public class Person {

    private String name;

    // getter()
    public String getName() {
        return name;
    }

    // setter()
    public void setName(String name) {
        this.name = name;
    }

    // constructor to initialize the name
    Person(String name){
        this.name = name;
    }
}
