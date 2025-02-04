/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosoop;

/**
 *
 * @author nicko
 */
import javax.swing.*;
import java.util.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class EmployeeUI {
    private static ArrayList<Employee> employees = new ArrayList<>();
    
    public static void main(String[] args) {
        // Sample employees
        employees.add(new Employee("Clyd Megatron Ramos", 1121333, "Medical Technologist", 15500.0));
        employees.add(new Employee("Nick Manuel Manalo", 1122929, "Security Guard", 9000.0));
        employees.add(new Employee("Leigh Mars Emphasis", 1123616, "Marketing", 12000.0));
        
        while (true) {
            String menu = "1. View Employees\n2. Add Employee\n3. Exit";
            String choice = JOptionPane.showInputDialog(menu);
            
            if (choice == null || choice.equals("3")) break;
            
            switch (choice) {
                case "1":
                    viewEmployees();
                    break;
                case "2":
                    addEmployee();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Try again.");
            }
        }
    }

    private static void viewEmployees() {
        StringBuilder info = new StringBuilder("Employee List:\n\n");
        for (Employee emp : employees) {
            info.append(emp.getName()).append(" - ")
                .append(emp.getEmployeeId()).append(" - ")
                .append(emp.getDepartment()).append(" - Monthly: P")
                .append(emp.getMonthlySalary()).append(" - Annual: P")
                .append(emp.calculateAnnualSalary()).append("\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    private static void addEmployee() {
        String name = JOptionPane.showInputDialog("Enter Name:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID:"));
        String dept = JOptionPane.showInputDialog("Enter Department:");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Salary:"));
        
        employees.add(new Employee(name, id, dept, salary));
        JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
    }
}