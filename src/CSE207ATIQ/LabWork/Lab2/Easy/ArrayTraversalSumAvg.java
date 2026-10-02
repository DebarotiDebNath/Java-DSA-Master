package CSE207ATIQ.LabWork.Lab2.Easy;

import java.util.Scanner;

public class ArrayTraversalSumAvg {
    /**
     * Write a program that takes N integers into an array and traverses the array to calculate the sum and
     * average of all elements.
     * Sample Input
     * 5
     * 10 20 30 40 50
     * Sample Output
     * Sum = 150
     * Average = 30.00
     */
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        // Output
        System.out.println();
        System.out.println("Sum = " + sum(arr));
        System.out.println("Average = " + (double)sum(arr) / n);
    }
}