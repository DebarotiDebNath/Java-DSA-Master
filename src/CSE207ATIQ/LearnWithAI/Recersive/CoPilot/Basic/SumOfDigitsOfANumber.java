package CSE207ATIQ.LearnWithAI.Recersive.CoPilot.Basic;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(n));
    }
}