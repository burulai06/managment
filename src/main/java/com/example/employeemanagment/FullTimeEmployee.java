package com.example.employeemanagment;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name,"Full time", salary);
    }


    @Override
    double calculateSalary() {
        return getSalary();
    }
}
