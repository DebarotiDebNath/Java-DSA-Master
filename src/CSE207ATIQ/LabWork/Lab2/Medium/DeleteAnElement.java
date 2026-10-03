package CSE207ATIQ.LabWork.Lab2.Medium;

import java.util.Scanner;

public class DeleteAnElement {
    /**
     * Question 4 — Delete an Element from an Array
     * Write a program that deletes the first occurrence of a given value from an array. If the value does not
     * exist, print Not Found.
     * Sample Input
     * 7
     * 10 25 30 25 40 50 60
     * 25
     * Sample Output
     * 10 30 25 40 50 60
     */

    // Find the first occurrence of val
    public static int firstOccurrence(int[] nums, int n, int val) {
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) return i; // return first occurrence
        }
        return -1; // for not found

    }

    // Delete first occurrence and return new size
    public static int deleteAnElement(int[] nums, int n, int val) {
        int pos = firstOccurrence(nums, n, val);
        if (pos == -1) return n; // unchanged for not found

        for (int i = pos; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        return n - 1; // new size

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();
        // Required to be input
        int val = scanner.nextInt();

        // Output
        int newSize = deleteAnElement(arr, n, val);
        if (newSize == n) System.out.println("Not Found");
        else {
            for (int i = 0; i < newSize; i++) System.out.printf("%d ", arr[i]);
        }
    }
}