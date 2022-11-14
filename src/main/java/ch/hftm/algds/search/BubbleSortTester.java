package ch.hftm.algds.search;

import java.util.Arrays;

public class BubbleSortTester {

    public static void main(String[] args) {
        // int[] numbers = { 5, -2, 23, 567, 87, -42, 509 };
        int[] numbers = { 234, 657, 212, 1245, 235, 345, 879, 768, 45, 123 };

        System.out.println("**** START ****");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Step #" + j + " " + Arrays.toString(numbers));

            for (int i = 0; i < numbers.length - 1; i++) {
                // if the numbers are not in order
                if (numbers[i] > numbers[i + 1]) {
                    // swap the numbers
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }

            }
        }
        System.out.println("Output: " + Arrays.toString(numbers));
        System.out.println("****  END  ****");

    }

}
