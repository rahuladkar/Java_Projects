package Employee_Management_System;

import java.util.List;

public class Company {

    private String name;
    private String address;



    // getter()
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    // setter()
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // constructor
    Company(){

    }

    // constructor to load the data
    Company(String name , String address){
        this.name = name;
        this.address = address;
    }

    // methods of the Company class

    public void addDepartment(Department department){

    }
    public void removeDepartment(Department department){

    }
    public List<Department> listDepartment(){
        return listDepartment();
    }

}
