package CSE207ATIQ.ClassWork.Class2.Practice;

import java.util.Scanner;

public class BasicLinearSearch {
    /**
     * 1. Basic Linear Search
     * Problem: Given an array of integers and a target value, find the index of the target using
     * linear search. If not found, return -1.
     * Constraints: 1 ≤ N ≤ 100
     * Sample Input:
     * N = 5
     * Array = [4, 2, 7, 1, 9]
     * Target = 7
     * Sample Output:
     * 2
     */
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\nEnter the target: ");
        int target = scanner.nextInt();

        System.out.println("===Operating Linear search=== \nResult: " + linearSearch(arr, target));
    }
}