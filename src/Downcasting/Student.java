package Downcasting;

public class Student extends Person{

    private int sid;

    //getter()
    public int getSid() {
        return sid;
    }

    // setter()
    public void setSid(int sid) {
        this.sid = sid;
    }

    // constructor to initialize the sid
    Student(String name,int sid){
        super(name);
        this.sid = sid;
    }
}
