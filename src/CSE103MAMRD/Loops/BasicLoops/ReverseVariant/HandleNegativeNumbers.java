package CSE103MAMRD.Loops.BasicLoops.ReverseVariant;

import java.util.Scanner;

public class HandleNegativeNumbers {
    /**
     * Handles Negative Numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // -123
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reverse * sign);
    }
}