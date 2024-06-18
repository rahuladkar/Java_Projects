package Employee_Management_System;

import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;

    // getter()
    public String getName() {
        return name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    // setter()
    public void setName(String name) {
        this.name = name;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
