package Employee_Management_System;

public class Employee {

    private int id;
    private String name;
    private String address;
    private double salary;
    private Department department;

    // getter()
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    public Department getDepartment() {
        return department;
    }

    // setter()
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
