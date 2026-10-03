package CSE207ATIQ.LabWork.Lab2.Difficult;

import java.util.Scanner;

public class RemoveAllOccurrences {
    /**
     * Question 7 — Remove All Occurrences
     * Write a program that removes all occurrences of a given value from an array without using another
     * array. Print the resulting array and its new size.
     * Sample Input
     * 10
     * 5 2 5 8 5 3 2 5 9 1
     * 5
     * Sample Output
     * 2 8 3 2 9 1
     * New Size = 6
     */
    public static int removeAllOccurrences(int[] nums, int val) {
       int k = 0;

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] != val) {
               nums[k] = nums[i];
               k++;
           }
       }
       return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();
        // Required to be input
        int val = scanner.nextInt();

        // Output
        int result = removeAllOccurrences(arr, val);

        for (int i = 0; i < result; i++) System.out.print(arr[i] + " ");

        if (result == 0) System.out.println("Array is empty.");
        System.out.println("\nNew Size = " + result);
    }
}