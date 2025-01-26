package com.tit.javaencapsulationpolymorphismabstraction.employeemanagementsystem;


// Creating a class FullTimeEmployee to represent full-time employees inheriting from Employee (Subclass)
class FullTimeEmployee extends Employee implements Department {
    private String departmentName;

    // Constructor to initialize FullTimeEmployee objects with provided values
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary); // Calling the superclass constructor
    }

    // Implementing the calculateSalary() method for full-time employees
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary for full-time employees
    }

    // Implementing the assignDepartment() method for full-time employees
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Implementing the getDepartmentDetails() method for full-time employees
    @Override
    public String getDepartmentDetails() {
        return "Full-Time Department: " + departmentName;
    }
}
