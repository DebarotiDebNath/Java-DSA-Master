package CSE207ATIQ.LabWork.Contests.InitialContest.Practice.SetA;

import java.util.Scanner;

public class TheMiddleNumber {
    /**
     * Q2 — The Middle Number
     * Given three distinct integers a, b, and c, print the number that lies between the other two.
     * Example: Input: 17 5 12
     * Output: 12
     * Restriction: Don't sort the numbers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three distinct integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        int sum = a + b + c;

        int middle = sum - (max + min);

        System.out.println("The middle number: " + middle);
    }
}