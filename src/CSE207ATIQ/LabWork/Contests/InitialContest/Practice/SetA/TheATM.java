package CSE207ATIQ.LabWork.Contests.InitialContest.Practice.SetA;

import java.util.Scanner;

public class TheATM {
    /**
     * Q5 — The ATM
     * You are given an amount N.
     * An ATM can dispense notes of:
     * 500, 200, 100, 50, 20, 10
     * Find the minimum number of notes required to represent N.
     * If it is impossible, print -1.
     * Example: Input: 880
     * Output: 6
     * One possible breakdown:
     * 500 + 200 + 100 + 50 + 20 + 10
     */
    public static int atm(int[] notes, int amount) {
        int count = 0;
        for (int note : notes) {
            count += amount / note;
            amount %= note;
        }
        if (amount == 0) return count;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = scanner.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10};
        System.out.println(atm(notes, amount));
    }
}