package CSE207ATIQ.ClassWork.Class2.Practice;

import java.util.Scanner;

public class SearchWithCount {
    /**
     * 2. Search with Count
     * Problem: Find how many times a given integer appears in an array using linear search.
     * Constraints: 1 ≤ N ≤ 1000
     * Sample Input:
     * Array = [1, 2, 3, 2, 2, 5]
     * Target = 2
     * Sample Output:
     * 3
     */
    public static int searchWithCount(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) count++;
        }
        return count;
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

        System.out.println("===Operating Linear search=== \nResult: " + searchWithCount(arr, target));
    }
}