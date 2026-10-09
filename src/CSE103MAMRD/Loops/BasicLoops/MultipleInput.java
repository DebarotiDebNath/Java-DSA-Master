package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class MultipleInput {
    /**
     * Problem 5: Multiple input
     * Write a C program that will take a pair of integer numbers (a and b) as input and will display the sum of those numbers.
     * Your program should run until -1 is encountered.
     * Sample Input
     * 2 3
     * 5 10
     * 10 10
     * -1
     * Sample Output
     * 5
     * 15
     * 20
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {
            a = scanner.nextInt();
            if (a == -1) break;
            b = scanner.nextInt();
            if (b == -1) break;

            System.out.println(a + b);
        }
    }
}