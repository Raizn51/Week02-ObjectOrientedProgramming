package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;

// Creating a class PartTimeEmployee to represent specific part-time employees inheriting from Employee (Subclass)
class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    // Constructor to initialize PartTimeEmployee objects with provided values
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary); // Calling the superclass constructor
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Implementing the calculateSalary() method for part-time employees
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    // Getter and setter methods for encapsulation
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
