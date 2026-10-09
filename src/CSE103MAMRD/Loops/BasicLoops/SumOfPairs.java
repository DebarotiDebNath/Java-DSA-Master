package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class SumOfPairs {
    /**
     * Problem 4: Sum of pairs
     * Write a C program that takes an integer number (n) as input and then it takes n pairs of integers numbers
     * [(a1, b1), ( a2,b2), ... ... ... (an,bn)] as input and displays the sum of each pair of numbers.
     * Sample input:
     * 3
     * 1 5
     * 5 5
     * 7 8
     * Sample Output:
     * 6
     * 10
     * 15
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sumPairs = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            sumPairs = a + b;
            System.out.println(sumPairs);
        }
    }
}