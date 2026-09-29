package CSE207ATIQ.LabWork.Contests.InitialContest.Practice.SetA;

import java.util.Scanner;

public class DigitStatistics {
    /**
     * Q4 — Digit Statistics
     * Given a positive integer N, determine:
     * number of digits
     * largest digit
     * smallest digit
     * sum of digits
     * Example: Input: 58324
     * Output:
     * 5
     * 8
     * 2
     * 22
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int count = 0;
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (n > 0) {
            int digit = n % 10;
            count++;
            sum += digit;
            if (digit > largest) largest = digit;
            if (digit < smallest) smallest = digit;
            n /= 10;
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Sum of digits: " + sum);
    }
}