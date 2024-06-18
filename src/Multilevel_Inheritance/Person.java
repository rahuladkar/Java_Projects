package Multilevel_Inheritance;

public class Person extends Animal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(String name , int weight){
        super(weight);
        this.name = name;
    }

}
