package CSE207ATIQ.LabWork.Lab2.OwnPrac;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllOccurrences_ArrayList {
    /**
     * Problem 3: Find All Occurrences
     * Write a program that uses linear search to find every index where a value occurs (0-based).
     * Input Format
     * Integer N.
     * N integers.
     * Integer key.
     * Constraints
     * 1 ≤ N ≤ 100
     * Output Format
     * Print all matching indices in increasing order, space-separated.
     * If the key is absent, print Not Found.
     * Sample 1
     * Input:               Output:
     * 7                    1 3 5
     * 12 25 8 25 19 25 30
     * 25
     * Sample 2
     * Input:              Output:
     * 5                   Not Found
     * 1 2 3 4 5
     * 9
     */
    public static int[] allOccurrences(int[] nums, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) indices.add(i);
        }
        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));
        System.out.println();

        // Required to be input
        int target = scanner.nextInt();

        int[] result = allOccurrences(arr, target);

        if (result.length == 0) System.out.println("Not Found");
        else {
            for (int idx : result) System.out.print(idx + " ");
        }
    }
}