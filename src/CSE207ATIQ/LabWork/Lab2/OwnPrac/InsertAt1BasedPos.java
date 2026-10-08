package CSE207ATIQ.LabWork.Lab2.OwnPrac;

import java.util.Scanner;

public class InsertAt1BasedPos {
    /**
     * Problem 2: Insert at 1-Based Position
     * Write a program to insert an element into an array at a 1-based position K.
     * Input Format
     * Integer N, the size of the array.
     * N integers, the array.
     * Integer element to insert.
     * Integer K, the position.
     * Constraints
     * 0 ≤ N ≤ 100
     * Output Format
     * Print the updated array, space-separated.
     * If K < 1 or K > N + 1, print Invalid Input.
     * Sample 1
     * Input:          Output:
     * 5               10 20 99 30 40 50
     * 10 20 30 40 50
     * 99
     * 3
     * Sample 2
     * Input:          Output:
     * 3               5 7 9 100
     * 5 7 9
     * 100
     * 4
     * Sample 3
     * Input:          Output:
     * 3               Invalid Input
     * 5 7 9
     * 100
     * 6
     */
    public static void insertAnElement(int[] nums, int n, int k, int element) {
        if (k < 1 || k > n + 1) {
            System.out.println("Invalid Input");
            return;
        }
        int pos = k - 1;
        for (int i = n; i > pos; i--) {
            nums[i] = nums[i - 1];
        }
        nums[pos] = element;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();

        int k = scanner.nextInt();
        int element = scanner.nextInt();

        System.out.println();

        insertAnElement(arr, n, k, element);
        if (k < 1 || k > n + 1) return;
        for (int i = 0; i < n + 1; i++) System.out.print(arr[i] + " ");

    }
}