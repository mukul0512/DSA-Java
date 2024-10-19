package Searching;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == num) {
                return mid + 1; // Position (1-based index)
            } else if (arr[mid] < num) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 11, 13, 13, 15 }; // Sorted array
        System.out.print("Enter the element to search : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Element to search for
        int position = binarySearch(arr, num);
        if (position != -1) {
            System.out.println("Element " + num + " is found at position " + position);
        } else {
            System.out.println("Element " + num + " is not found in the array.");
        }
    }
}
