package CSE207ATIQ.LearnWithAI.Recersive.CoPilot.Basic;

import java.util.Scanner;

public class PrintNumbersFromNto1 {
    public static void printFromNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printFromNto1(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.print("Print numbers from " + n + " to 1: ");
        printFromNto1(n);
    }
}