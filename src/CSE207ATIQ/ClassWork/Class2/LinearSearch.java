package CSE207ATIQ.ClassWork.Class2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("The array elements: ");
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = (int)(Math.random() * 100));

        System.out.print("\nEnter the element to find: ");
        int target = scanner.nextInt();

        int loc = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                loc = i;
                break;
            }
        }

        if (loc < 0) System.out.println("Targeted element is not in the array.");
        else System.out.println("Target " + target +  " found at " + loc);
    }
}