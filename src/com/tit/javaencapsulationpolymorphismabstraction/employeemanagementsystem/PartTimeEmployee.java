package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;

// Creating a class PartTimeEmployee to represent part-time employees inheriting from Employee (Subclass)
class PartTimeEmployee extends Employee implements Department {
    private String departmentName;
    private int hoursWorked;
    private double hourlyRate;

    // Constructor to initialize PartTimeEmployee objects with provided values
    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // Base salary is not applicable for part-time employees
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing the calculateSalary() method for part-time employees
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Salary based on hours worked
    }

    // Implementing the assignDepartment() method for part-time employees
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Implementing the getDepartmentDetails() method for part-time employees
    @Override
    public String getDepartmentDetails() {
        return "Part-Time Department: " + departmentName;
    }
}
