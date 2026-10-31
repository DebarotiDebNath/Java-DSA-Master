package CSE207ATIQ.ClassWork.Class2.Practice;

import java.util.Scanner;

public class ReverseOrder {
    /**
     * 5. Search in Reverse Order
     * Problem: Given an array where the last element is considered to be stored at index 0, the second last at index 1, and so on, search for a given target element by traversing the
     * array from the end. If the element is found, return its corresponding index based on this reverse indexing
     * system; otherwise, return –1. Constraints: 1 ≤ N ≤ 500
     * Sample Input:
     * Array = [10, 20, 30, 40]
     * Target = 20
     * Sample Output:
     * 2
     */
    public static int reverseOrderSearch(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) return nums.length - 1 - i ;
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

        System.out.println("===Operating Linear search=== \nResult: " + reverseOrderSearch(arr, target));
    }
}
