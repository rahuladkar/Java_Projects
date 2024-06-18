package Upcasting;

public class Student extends  Person{

    private int stud_id;

    // getter()
    public int getStud_id() {
        return stud_id;
    }

    // setter()
    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    // constructor to initialize the stud_id
    Student(String name , int stud_id){
        super(name);
        this.stud_id = stud_id;
    }

}
