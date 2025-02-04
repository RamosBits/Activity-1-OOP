/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author nicko
 */
public class FactorialCalculator {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    public long calculateFactorial() {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void displayResult() {
        System.out.println("Factorial of " + number + " is " + calculateFactorial());
    }
}
