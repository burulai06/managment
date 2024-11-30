package com.example.employeemanagment;

public class Contract extends Employee {
    private double hourlyRate;
    private int maxHours;

    private int hoursWorked;

    public Contract(String name, double hourlyRate, int maxHours,int hoursWorked) {
        super(name, "Contractor", 0);
        this.hourlyRate = hourlyRate;
        this.maxHours = maxHours;
        this.hoursWorked=hoursWorked;
    }

    public int getWorkedHours() {
        return hoursWorked;
    }

    public void setWorkedHours(int workedHours) {
        this.hoursWorked = workedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        } else {
            throw new IllegalArgumentException("Hourly rate must be positive.");
        }
    }




    public int getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(int maxHours) {
        if (maxHours > 0) {
            this.maxHours = maxHours;
        } else {
            throw new IllegalArgumentException("Max hours must be positive.");
        }
    }

    @Override
    double calculateSalary() {
        int effectiveHours = Math.min(hoursWorked, maxHours);
        double calculatedSalary = hourlyRate * effectiveHours;
        setSalary(calculatedSalary);
        return calculatedSalary;
    }
}