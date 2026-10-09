package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class FactorialOfANumber {
    /**
     * Problem 6: Factorial of a Number
     * Input: 6
     * Output: Factorial = 720
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}