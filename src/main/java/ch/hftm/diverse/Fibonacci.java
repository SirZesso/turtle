package ch.hftm.diverse;

public class Fibonacci {

    public static void main(String[] args) {
        // loopiiiiing
        for (int i = 0; i <= 20; i++) {
            System.out.println("fibonacci(" + i + ") --> " + fibonacci(i));
        }
    }

    /**
     * Folgeglied berechnen
     * 
     * @param a Parameter input
     * 
     * @return Folgeglied
     */
    public static int fibonacci(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return fibonacci(a - 2) + fibonacci(a - 1);
    }
}
