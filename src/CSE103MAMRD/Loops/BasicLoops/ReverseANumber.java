package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class ReverseANumber {
    /**
     * Problem 7: Reverse a Number
     * Input: 1234
     * Output: 4321
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println(reverse);
    }
}