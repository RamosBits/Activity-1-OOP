/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author nicko
 */
import javax.swing.JOptionPane;

public class MathPracticeTest {
    public static void main(String[] args) {
        // Get user input for factorial
        String factorialInput = JOptionPane.showInputDialog("Enter a number for factorial calculation:");
        int factorialNumber = Integer.parseInt(factorialInput);
        FactorialCalculator factorialCalc = new FactorialCalculator(factorialNumber);
        JOptionPane.showMessageDialog(null, "Factorial of " + factorialNumber + " is: " + factorialCalc.calculateFactorial());

        // Get user input for arithmetic series sum
        String seriesInput = JOptionPane.showInputDialog("Enter a number for arithmetic series sum calculation:");
        int seriesNumber = Integer.parseInt(seriesInput);
        ArithmeticSeriesSum seriesSum = new ArithmeticSeriesSum(seriesNumber);
        JOptionPane.showMessageDialog(null, "Sum of first " + seriesNumber + " natural numbers is: " + seriesSum.calculateSum());

        // Get user input for Fibonacci sequence
        String fibonacciInput = JOptionPane.showInputDialog("Enter the number of terms for Fibonacci sequence:");
        int fibonacciNumber = Integer.parseInt(fibonacciInput);
        FibonacciGenerator fibonacciGen = new FibonacciGenerator(fibonacciNumber);
        JOptionPane.showMessageDialog(null, "Fibonacci sequence (" + fibonacciNumber + " terms):\n" + fibonacciGen.getSequence());
    }
}

