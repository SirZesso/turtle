package ch.hftm.algds.search;

class BinaryRekursion {

    int binarySearch(int arr[], int leftInt, int rightInt, int search) {

        if (rightInt >= leftInt && leftInt <= arr.length - 1) {

            int mid = leftInt + (rightInt - leftInt) / 2;

            if (arr[mid] == search)
                return mid;

            if (arr[mid] > search)
                return binarySearch(arr, leftInt, mid - 1, search);

            return binarySearch(arr, mid + 1, rightInt, search);
        }

        return -1;
    }

    public static void main(String args[]) {

        BinaryRekursion ob = new BinaryRekursion();

        int arr[] = { -15, -2, 0, 3, 7, 9, 10, 17, 21, 29 };

        int rightInt = arr.length - 1;
        int leftInt = 0;

        int search = 10;

        int result = ob.binarySearch(arr, leftInt, rightInt, search);

        if (result == -1)
            System.out.println("Element not present");

        else
            System.out.println("Element found at index "
                    + result);
    }
}