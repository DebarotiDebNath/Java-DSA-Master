package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class PrintNaturalNumbers {
    /**
     * Problem 1: Print Natural Numbers
     * Write a C program to print numbers from 1 to n using a for, while and do-while loop.
     * Input : 5
     * Output: 1 2 3 4 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // For loop
        System.out.println("Using for loop: ");
        for (int i = 1; i <= n; i++) System.out.print(i + " ");

        System.out.println();

        // While loop
        System.out.println("Using while loop: ");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Do-while loop
        System.out.println("Using do-while loop: ");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);

        System.out.println();
    }
}