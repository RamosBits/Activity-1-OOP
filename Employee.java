/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosoop;

/**
 *
 * @author RAMOS_CpE121
 */
public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double monthlySalary;

    public Employee(String name, int employeeId, String department, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: P" + monthlySalary);
        System.out.println("Annual Salary: P" + calculateAnnualSalary());
        System.out.println("-----------------------------");
    }
}
