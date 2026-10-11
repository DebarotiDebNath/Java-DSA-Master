package CSE103MAMRD.Loops.BasicLoops.ReverseVariant;

import java.util.Scanner;

public class StandardPosReversed {
    /**
     * Works for positive integers.
     * Drops leading zeros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = 0;

        while (n > 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(r);
    }
}