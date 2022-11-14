package ch.hftm.algds.search;

import java.util.Arrays;

public class SelectionSortTester {
    public static void main(String[] args) {
        // Beispiel-Array
        int[] numbers = { 40, 7, 59, 4, 1 };
        int n = numbers.length;

        // Index der kleinsten Nummer
        int indexMin = 0;

        // Sortiere den Beispiel-Array!
        for (int i = 0; i < n - 1; i++) {
            // Kleinstes Element in unsortiertem Array finden
            indexMin = i;
            for (int j = i + 1; j < n; j++)
                if (numbers[j] < numbers[indexMin])
                    indexMin = j;

            // Kleinstes Element mit dem ersten Element tauschen
            int temp = numbers[indexMin];
            numbers[indexMin] = numbers[i];
            numbers[i] = temp;
        }
        // Ausgabe des sortierten Arrays
        System.out.println(Arrays.toString(numbers));
    }
}
