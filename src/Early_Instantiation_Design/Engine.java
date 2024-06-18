package Early_Instantiation_Design;

public class Engine {

    private double hp;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    // constructor
    Engine(){}

    // Constructor to initialise the hp
    Engine(double hp){
        setHp(hp);
    }
}
