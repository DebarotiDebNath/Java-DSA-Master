package CSE207ATIQ.ClassWork.Class4;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid; // found
            else if (nums[mid] < target) left = mid + 1; // search right half
            else right = mid - 1; // search left half
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the sorted array elements: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        System.out.println("=== Operating Binary Search === \nResult: " + binarySearch(arr, target));
    }
}