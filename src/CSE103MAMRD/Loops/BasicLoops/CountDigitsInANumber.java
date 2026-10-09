package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class CountDigitsInANumber {
    /**
     * Problem 8: Count Digits in a Number
     * Input: 10546
     * Output: 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        if ( n == 0) count = 1;

        while (n != 0) {
            int d = n % 10;
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}