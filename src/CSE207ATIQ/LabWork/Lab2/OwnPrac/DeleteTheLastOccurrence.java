package CSE207ATIQ.LabWork.Lab2.OwnPrac;

import java.util.Scanner;

public class DeleteTheLastOccurrence {
    /**
     *Problem 4: Delete the Last Occurrence
     * Write a program that deletes only the last occurrence of a given value from an array.
     * Input Format
     * Integer N.
     * N integers.
     * Integer key.
     * Constraints
     * 1 ≤ N ≤ 100
     * Output Format
     * Print the array after deletion, space-separated.
     * If the key does not exist, print Not Found.
     * Sample 1
     * Input:                 Output:
     * 7                      10 25 30 40 50 60
     * 10 25 30 25 40 50 60
     * 25
     * Sample 2
     * Input:                  Output:
     * 4                       Not Found
     * 1 2 3 4
     * 7
     */
    public static int deleteTheLastOccurrence(int[] nums, int n, int target) {
        int idx = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == target) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return n; // Not Found -> size unchanged

        for (int i = idx; i < n - 1; i++) nums[i] = nums[i + 1];
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));
        System.out.println();

        // Required to be input
        int target = scanner.nextInt();

        int newSize = deleteTheLastOccurrence(arr, n, target);

        if (newSize == n) System.out.println("Not Found");
        else {
            for (int i = 0; i < newSize; i++) System.out.print(arr[i] + " ");
        }
    }
}