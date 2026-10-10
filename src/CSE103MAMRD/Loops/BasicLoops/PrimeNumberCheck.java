package CSE103MAMRD.Loops.BasicLoops;

import java.util.Scanner;

public class PrimeNumberCheck {
    /**
     * Problem 9: Prime Number Check
     * Input: 17
     * Output: Prime Number
     * Input: 20
     * Output: Not a Prime Number
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        boolean isPrime = num > 1; // num greater 1 will be valid for prime check

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
    }
}