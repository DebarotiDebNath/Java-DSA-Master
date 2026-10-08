package CSE207ATIQ.LabWork.Lab2.OwnPrac;

import java.util.Scanner;

public class ThirdLargestDistinctElement {
    /**
     * Problem 8: Third-Largest Distinct Element
     * Write a program that traverses an array and finds the third-largest distinct element without sorting.
     * Input Format
     * Integer N.
     * N integers.
     * Constraints
     * 1 ≤ N ≤ 100
     * -10^6 ≤ arr[i] ≤ 10^6
     * Output Format
     * Third Largest = <value>
     * If fewer than 3 distinct values exist, print Not Possible.
     * Sample 1
     * Input:                      Output:
     * 8                           Third Largest = 27
     * 12 45 7 45 32 18 9 27
     * Sample 2
     * Input:                      Output:
     * 5                           Not Possible
     * 8 8 3 3 3
     */
    public static int thirdLargestDistinctElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secLargest && nums[i] != largest) {
                thirdLargest = secLargest;
                secLargest = nums[i];
            } else if (nums[i] > thirdLargest && nums[i] != largest && nums[i] != secLargest) {
                thirdLargest = nums[i];
            }
        }
        return thirdLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int result = thirdLargestDistinctElement(arr);

        if (result == Integer.MIN_VALUE) System.out.println("Not Possible");
        else System.out.println("Third Largest = " + result);
    }
}