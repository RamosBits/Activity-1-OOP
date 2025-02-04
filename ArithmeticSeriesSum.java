/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author nicko
 */
public class ArithmeticSeriesSum {
    private int n;

    public ArithmeticSeriesSum(int n) {
        this.n = n;
    }

    public int calculateSum() {
        return (n * (n + 1)) / 2; // Sum of first n natural numbers
    }

    public void displayResult() {
        System.out.println("Sum of first " + n + " natural numbers is: " + calculateSum());
    }
}

