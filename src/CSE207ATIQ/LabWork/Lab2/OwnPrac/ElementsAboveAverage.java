package CSE207ATIQ.LabWork.Lab2.OwnPrac;

import java.util.Scanner;

public class ElementsAboveAverage {
    /**
     * Problem 1: Elements Above Average
     * Write a program that reads N integers into an array, traverses it, and prints the average and how many elements are strictly greater than the average.
     * Input Format
     * First line: integer N.
     * Second line: N space-separated integers.
     * Constraints
     * 1 ≤ N ≤ 100
     * -10^4 ≤ arr[i] ≤ 10^4
     * Output Format
     * Average = <value with 2 decimals>
     * Count = <number of elements above average>
     * Sample Input
     * 5
     * 10 20 30 40 50
     * Sample Output
     * Average = 30.00
     * Count = 2
     */
    public static double average(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return (double)sum / nums.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        // Output
        double average = average(arr);
        System.out.printf("%nAverage = %.2f%n", average);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > average) count++;
        }
        System.out.println("Count = " + count);

    }
}