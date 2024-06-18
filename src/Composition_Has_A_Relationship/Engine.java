package Composition_Has_A_Relationship;

public class Engine {

    private int hp;
    private String type;

    // getter()
    public int getHp() {
        return hp;
    }
    public String getType() {
        return type;
    }

    // setter()
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setType(String type) {
        this.type = type;
    }

    // constructor to load the data
    Engine(int hp,String type){
        setHp(hp);
        setType(type);
    }
}
