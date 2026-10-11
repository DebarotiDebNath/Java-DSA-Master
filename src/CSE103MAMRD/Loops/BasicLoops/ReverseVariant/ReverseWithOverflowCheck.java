package CSE103MAMRD.Loops.BasicLoops.ReverseVariant;

import java.util.Scanner;

public class ReverseWithOverflowCheck {
    /**
     * Prevents Integer Overflow
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                System.out.println("Overflow");
                return;
            }
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }
}