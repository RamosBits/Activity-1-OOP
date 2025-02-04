/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author nicko
 */
public class FibonacciGenerator {
    private int terms;

    public FibonacciGenerator(int terms) {
        this.terms = terms;
    }

    // New method to return Fibonacci sequence as a string
    public String getSequence() {
        StringBuilder sequence = new StringBuilder();
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            sequence.append(a).append(" ");
            int next = a + b;
            a = b;
            b = next;
        }
        return sequence.toString();
    }
}
