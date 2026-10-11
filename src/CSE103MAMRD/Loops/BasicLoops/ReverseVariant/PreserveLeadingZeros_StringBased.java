package CSE103MAMRD.Loops.BasicLoops.ReverseVariant;

import java.util.Scanner;

public class PreserveLeadingZeros_StringBased {
    /**
     * Preserve the zeros
     * 1203400 -> 004321
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);
    }
}