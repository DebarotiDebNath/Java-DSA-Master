package CSE207ATIQ.LabWork.Lab1;

import java.util.Scanner;

public class SecondLargestElement_InRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("The array elements: ");
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.print("\nEnter the start position for search on array: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end position for search on array: ");
        int end = scanner.nextInt();

        if(start < 0 || end >= n || start > end) System.out.println("Invalid input.");
        else {
            int max = arr[start];
            int secMax = arr[start];

            int loc = start;

            for (int i = start; i <= end; i++) {
                if (arr[i] > max) {
                    secMax = max;
                    max = arr[i];
                    loc = i;
                } else if (arr[i] > secMax && arr[i] != max) {
                    secMax = arr[i];
                    loc = i;
                }
            }

            System.out.println("Second Max element in range [" + start + ", " + end + "] is " + secMax + " at index " + loc);
            System.out.println("Max element in range [" + start + ", " + end + "] is " + max );
        }
    }
}