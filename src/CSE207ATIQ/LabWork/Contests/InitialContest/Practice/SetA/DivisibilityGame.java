package CSE207ATIQ.LabWork.Contests.InitialContest.Practice.SetA;

import java.util.Scanner;

public class DivisibilityGame {
    /**
     * Q3 — Divisibility Game
     * Given an integer N:
     * print Fizz if divisible by 3
     * print Buzz if divisible by 5
     * print FizzBuzz if divisible by both
     * otherwise print N
     * Example: Input: 30
     * Output: FizzBuzz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz"); // checking (n % 15 == 0) faster
        else if (n % 3 == 0) System.out.println("Fizz");
        else if (n % 5 == 0) System.out.println("Buzz");
        else System.out.println(n);

    }
}