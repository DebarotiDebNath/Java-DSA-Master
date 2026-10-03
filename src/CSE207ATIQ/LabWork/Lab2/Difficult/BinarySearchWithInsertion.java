package CSE207ATIQ.LabWork.Lab2.Difficult;

import java.util.Scanner;

public class BinarySearchWithInsertion {
    /**
     * Question 9 — Binary Search with Insertion
     * You are given a sorted array. Write a program that searches for a given value using binary search. If
     * the value exists, print its index. If it does not exist, insert it into the correct position so that the array
     * remains sorted. Print the resulting array.
     * Sample Input
     * 7
     * 10 20 30 40 50 60 70
     * 45
     * Sample Output
     * 45 not found
     * After Insertion: 10 20 30 40 45 50 60 70
     */
    public static int binarySearch(int[] nums, int n, int target) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void insertAnElement(int[] nums, int n, int pos, int val) {
        if (pos < 0 || pos > n) return;
        for (int i = n - 1; i >= pos; i--) {
            nums[i + 1] = nums[i]; // shift right
        }
        nums[pos] = val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n + 1]; // +1 for insertion

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = scanner.nextInt());

        System.out.println();
        // Required to be input
        int target = scanner.nextInt();

        // Output
        int result = binarySearch(arr, n, target);
        if (result == -1) {
            System.out.println(target + " not found");

            // Find the correct insertion position
            int pos = 0;
            while (pos < n && arr[pos] < target) pos++;

            insertAnElement(arr, n, pos, target);
            n++; // incr size after insertion

            System.out.println("After insertion: ");
            for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");

        } else System.out.println(target + " found at index " + result);
    }
}