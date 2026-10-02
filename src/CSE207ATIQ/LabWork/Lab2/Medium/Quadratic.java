package CSE207ATIQ.LabWork.Lab2.Medium;

import java.util.Scanner;

public class Quadratic {
    /**
     * Question 6 — Quadratic Equation
     * Write a program to find the roots of a quadratic equation: ax² + bx + c = 0. The program should
     * determine whether the equation has two distinct real roots, one repeated real root, or no real roots.
     * Sample Input
     * 1 -5 6
     * Sample Output
     * Root 1 = 3.00
     * Root 2 = 2.00
     * Sample Input
     * 1 4 4
     * Sample Output
     * Repeated Root = -2.00
     * Sample Input
     * 1 2 5
     * Sample Output
     * No Real Roots
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (a != 0) {
            if (d > 0) {
                double Root1 = (-b + Math.sqrt(d)) / (2 * a);
                double Root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Root 1 = " + Root1);
                System.out.println("Root 2 = " + Root2);
            } else if (d == 0) {
                double Root = (double) -b / (2 * a);
                System.out.println("Root = " + Root);
            } else {
                System.out.println("No Real Roots");
            }
        }
    }
}