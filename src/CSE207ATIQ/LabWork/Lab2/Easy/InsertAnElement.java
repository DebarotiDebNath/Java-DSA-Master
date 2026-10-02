package CSE207ATIQ.LabWork.Lab2.Easy;

import java.util.Scanner;

public class InsertAnElement {
    /**
     * Question 2 — Insert an Element into an Array
     * Write a program that inserts a new element at a given position in an array. The position is 0-based.
     * Sample Input
     * 5
     * 10 20 30 40 50
     * Position = 2
     * Value = 99
     *  Sample Output
     * 10 20 99 30 40 50
     */
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
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        // Required to be input
        System.out.print("\nPosition = ");
        int pos = scanner.nextInt();

        System.out.print("Value = ");
        int val = scanner.nextInt();

        // Output
        insertAnElement(arr, n, pos, val);
        for (int i = 0; i < n + 1; i++) System.out.print(arr[i] + " ");
    }
}
