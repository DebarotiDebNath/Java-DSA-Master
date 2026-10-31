package CSE207ATIQ.ClassWork.Class2.Practice;

import java.util.Scanner;

public class FirstOccurrence {
    /**
     * 3. First Occurrence
     * Problem: Find the first occurrence index of a target value.
     * Constraints: 1 ≤ N ≤ 10^4
     * Sample Input:
     * Array = [5, 6, 5, 6, 7]
     * Target = 5
     * Sample Output:
     * 0
     */
    public static int firstOccurrence(int[] nums, int target) {
        for (int i = 0 ; i < nums.length; i++) {
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

        System.out.println("===Operating Linear search=== \nResult: " + firstOccurrence(arr, target));
    }
}