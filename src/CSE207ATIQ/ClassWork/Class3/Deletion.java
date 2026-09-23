package CSE207ATIQ.ClassWork.Class3;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", arr[i]);
        }

        System.out.print("\nEnter the position for value deletion: ");
        int pos = scanner.nextInt();

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < n - 1; i++) System.out.print(arr[i] + " ");
    }
}