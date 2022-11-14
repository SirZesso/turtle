package ch.hftm.algds.search;

import java.util.Arrays;

public class BinarySearchTester {

    public static void main(String[] args) {
        // int[] arr = { 5, -2, 23, 567, 87, -42, 509 };
        int[] arr = { 234, 657, 212, 1245, 235, 345, 879, 768, 45, 123 };

        Arrays.sort(arr);

        binarySearch(567, arr);
    }

    public static int binarySearch(int target, int[] data) {
        int low = 0;
        int high = data.length - 1;

        System.out.println("**** START ****");
        while (high >= low) {
            int middle = (low + high) / 2; // Middle index
            System.out.println("Checked N° " + middle + " (Value = " + data[middle] + ")");
            if (data[middle] == target) {
                System.out.println("****  END  **** --> Target " + target + " found at Index " + middle);
                return middle; // Target value was found
            }
            if (data[middle] < target) {
                low = middle + 1;
            }
            if (data[middle] > target) {
                high = middle - 1;
            }
        }

        System.out.println("****  END  **** --> Target " + target + " NOT FOUND :/ ");
        return -1; // The value was not found

    }
}
