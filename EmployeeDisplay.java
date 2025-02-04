/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramosoop;

/**
 *
 * @author RAMOS_CpE121
 */
public class EmployeeDisplay {
    public static void main(String[] args) {
  
        Employee emp1 = new Employee("Clyd Megatron Ramos", 1121333, "Medical Technologist", 15500.0);
        Employee emp2 = new Employee("Nick Manuel Manalo", 1122929, "Security Guard", 9000.0);
        Employee emp3 = new Employee("Leigh Mars Emphasis", 1123616, "Marketing", 12000.0);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();


    }
}