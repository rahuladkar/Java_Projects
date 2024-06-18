package Multilevel_Inheritance;

public class Student extends Person{
    private int stud_id;

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    Student(int stud_id , String name , int weight){
        super(name,weight);
        this.stud_id = stud_id;
    }
}
