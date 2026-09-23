package CSE207ATIQ.ClassWork.Class2;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch_Extended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("The array elements: ");
        Random rand = new Random(50);
        for (int i = 0; i < n; i++) System.out.printf("%d ", arr[i] = rand.nextInt(100));

        System.out.print("\nEnter the element to find: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Target " + target + " found at " + i);
                found = true;
            }
        }

        if (!found) System.out.println("Targeted element is not in the array.");
    }
}