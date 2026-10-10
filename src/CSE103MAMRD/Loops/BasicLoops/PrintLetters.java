package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class PrintLetters {
    /**
     * Problem 3: Print letters
     * Write a C program that will take two integer numbers as input (x, y),
     * where 1<=x, y<=26 and x<=y, and print the x-th letter to y-th letter in ascending order in English alphabet (uppercase only).
     * Sample Input
     * 1 3
     * Sample Output
     * A B C
     * Sample Input
     * 3 7
     * Sample Output
     * C D E F G
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start < 1 || end > 26) System.out.println("Invalid Input");

        for (int i = start; i <= end; i++) {
            char c = (char)(i + 64); // 'A' is ASCII 65, so Offset by 64
            System.out.print(c + " ");
        }
    }
}