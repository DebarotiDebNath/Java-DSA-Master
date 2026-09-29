package CSE207ATIQ.LabWork.Contests.InitialContest.Practice.SetA;

import java.util.Scanner;

public class ThreeDigitsMathematics {
    /**
     * Q1 — Three-Digit Mathematics
     * Given a three-digit positive integer N, print:
     * the sum of its digits
     * the product of its digits
     * the number obtained by reversing its digits
     * Example: Input: 324
     * Output:
     * 9
     * 24
     * 423
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        int prod = 1;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Sum of its digits: " + sum);
        System.out.println("Prod of its digits: " + prod);
        System.out.println("Reverse of its digits: " + reverse);
    }
}