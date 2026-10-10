package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    /**
     * Problem 2: Sum of First N Natural Numbers
     * Write a C program to sum numbers from 1 to n using a for loop and print the sum.
     * Input : 5
     * Output: Sum is 15
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) sum += i;
        System.out.println("Sum is " + sum);

        System.out.println("=== Using Sum Formula ===");
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum is " + sumFormula);
    }
}