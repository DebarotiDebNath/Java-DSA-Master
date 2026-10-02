package CSE207ATIQ.LabWork.Lab2.Easy;

import java.util.Scanner;

public class LinearSearch {
    /**
     * Question 3 — Linear Search
     * Write a program that searches for a given value in an array using linear search. If the value is found,
     * print its 0-based index; otherwise, print Not Found.
     * Sample Input
     * 6
     * 12 25 8 41 19 30
     * Sample Output
     * 19
     * Found at index 4
     */
    public static int linearSearch (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();

        // Required to be input
        int target = scanner.nextInt();

        // Output
        int result = linearSearch(arr, target);
        if (result == -1)System.out.println("Not Found");
        else System.out.println("Found at index " + result);
    }
}