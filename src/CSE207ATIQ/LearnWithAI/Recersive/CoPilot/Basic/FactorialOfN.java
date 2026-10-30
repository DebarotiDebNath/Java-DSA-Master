package CSE207ATIQ.LearnWithAI.Recersive.CoPilot.Basic;

import java.util.Scanner;

public class FactorialOfN {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " is " +  factorial(n));

    }
}