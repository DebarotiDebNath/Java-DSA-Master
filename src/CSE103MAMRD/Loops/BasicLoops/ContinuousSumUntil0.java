package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class ContinuousSumUntil0 {
    /**
     * Problem 10 – Continuous Sum until 0 (do-while)
     * Keep taking numbers as input until the user enters 0.
     * Input: 5 10 15 0
     * Output: Sum = 30
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("Sum = " + sum);
    }
}