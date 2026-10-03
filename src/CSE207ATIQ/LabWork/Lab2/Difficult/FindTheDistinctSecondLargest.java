package CSE207ATIQ.LabWork.Lab2.Difficult;

import java.util.Scanner;

public class FindTheDistinctSecondLargest {
    /**
     * Question 8 — Find the Second-Largest Element
     * Write a program that traverses an array and finds the second-largest distinct element without sorting
     * the array. If there is no second distinct largest element, print Not Possible.
     * Sample Input Sample Output
     * 8
     * 12 45 7 45 32 18 9 27
     * Second Largest = 32
     */
    public static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) secLargest = num;
        }
        return secLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.println();

        // Output
        int result = secondLargest(arr);

        if (result == Integer.MIN_VALUE) System.out.println("Not possible");
        else {
            int count = 0;
            for (int num : arr) {
                if (num == result) count++;
            }
            if (count > 1) System.out.println("Not possible");
            else System.out.println("Second Largest = " + result);
        }
    }
}