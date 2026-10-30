package CSE207ATIQ.LearnWithAI.Recersive.CoPilot.Basic;

import java.util.Scanner;

public class PrintNumbersFrom1ToN {
    public static void printFrom1toN(int n) {
        if (n == 0) return;
        printFrom1toN(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.print("Print numbers from 1 to " + n + ": ");
        printFrom1toN(n);
    }
}