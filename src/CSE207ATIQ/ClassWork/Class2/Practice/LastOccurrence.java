package CSE207ATIQ.ClassWork.Class2.Practice;

import java.util.Scanner;

public class LastOccurrence {
    /**
     * 4. Last Occurrence
     * Problem: Find the last occurrence index of a target value.
     * Constraints: 1 ≤ N ≤ 10^4
     * Sample Input:
     * Array = [5, 6, 5, 6, 7]
     * Target = 6
     * Sample Output:
     * 3
     */
    public static int lastOccurrence(int[] nums, int target) {
        int pos = -1;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == target) pos = i;
        }
        return pos;
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

        System.out.println("===Operating Linear search=== \nResult: " + lastOccurrence(arr, target));
    }
}
