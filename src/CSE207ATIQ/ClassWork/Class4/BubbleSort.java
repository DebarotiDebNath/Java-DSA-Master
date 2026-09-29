package CSE207ATIQ.ClassWork.Class4;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) { // ascending
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // stop early if already sorted
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println("=== Operating Bubble Sort === \nResult: " + Arrays.toString(bubbleSort(arr)));
    }
}