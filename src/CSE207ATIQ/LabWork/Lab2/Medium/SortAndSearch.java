package CSE207ATIQ.LabWork.Lab2.Medium;

import java.util.Scanner;

public class SortAndSearch {
    /**
     * Question 5 — Sort and Search
     * Write a program that takes an unsorted array, sorts it in ascending order, and then searches for a
     * given value using binary search. Print the sorted array and the position of the searched value.
     * Sample Input
     * 7
     * 45 12 78 23 9 56 34
     * 56
     * Sample Output
     * Sorted: 9 12 23 34 45 56 78
     * 56 found at index 5
     */
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
        int target = scanner.nextInt();
        // Output
        bubbleSort(arr);
        for (int num : arr) System.out.printf("%d ", num);

        System.out.println();
        int result = binarySearch(arr, target);
        if (result == -1) System.out.println("Not Found");
        else System.out.println(target + " found at index " + result);
    }
}