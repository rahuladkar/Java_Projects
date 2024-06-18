package Comparator_Interface;

public class Student {

    private int rollNo;
    private String name;

    // getter()
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }

    // setter()
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }

    // overridden toString() to print data
    @Override
    public String toString() {
        return "Students { " +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                " }";
    }

    // constructor to initialize the name and rollNo
    public Student(int rollNo , String name) {
        this.name = name;
        this.rollNo = rollNo;
    }


}
