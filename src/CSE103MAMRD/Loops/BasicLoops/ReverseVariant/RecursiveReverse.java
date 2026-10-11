package CSE103MAMRD.Loops.BasicLoops.ReverseVariant;

import java.util.Scanner;

public class RecursiveReverse {
    public static int reverseRecursive (int number, int reverse) {
        if (number == 0) return reverse;
        return reverseRecursive(number / 10, reverse * 10 + number % 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reverse = 0;

        System.out.println(reverseRecursive(number, reverse));
    }
}