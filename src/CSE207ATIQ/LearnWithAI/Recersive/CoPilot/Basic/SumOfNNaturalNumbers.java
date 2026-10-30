package CSE207ATIQ.LearnWithAI.Recersive.CoPilot.Basic;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static int sumOfNNum(int n) {
        if (n < 0) return 0;
        return n + sumOfNNum(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Sum of " + n + " numbers " + sumOfNNum(n));
    }
}