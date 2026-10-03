package CSE207ATIQ.LabWork.Lab2.Difficult;

import java.util.Scanner;

public class SortDeleteSearch {
    /**
     * Question 10 — Sort, Delete, and Search
     * Write a program that performs the following operations on an array:
     * 1. Sort the array in ascending order.
     * 2. Delete all occurrences of a given value.
     * 3. Search for another value using binary search.
     * 4. Print the final array and the search result.
     * Sample Input
     * 10
     * 40 15 25 40 10 35 25 50 20 30
     * Delete = 25
     * Search = 35
     * Sample Output
     * Sorted: 10 15 20 25 25 30 35 40 40 50
     * After Deletion: 10 15 20 30 35 40 40 50
     * 35 found at index 4
     */

    // Sort in ascending order
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    // Delete all occurrences of a given val
    public static int deleteAllOccurrences(int[] nums, int n, int val) {
        int k = 0; // new size index

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) { // keep only the non-deleted values
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // new size after deletion
    }

    // Search for another val by binary search
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();

        // Required to be input
        System.out.print("Delete = ");
        int delete = scanner.nextInt();

        System.out.print("Search = ");
        int search = scanner.nextInt();

        // Output
        bubbleSort(arr);
        System.out.print("Sorted: ");
        for (int num : arr) System.out.print(num + " ");

        System.out.println();

        int newSize = deleteAllOccurrences(arr, n, delete);
        System.out.print("After Deletion: ");
        for (int i = 0; i < newSize; i++) System.out.print(arr[i] + " ");

        System.out.println();

        int result = binarySearch(arr, search);
        if (result == -1) System.out.println("Not Found");
        else System.out.println(search + " found at index " + result);

    }
}