package CSE207ATIQ.ClassWork.Class3;

import java.util.Scanner;

public class Traversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        for (int num : arr) System.out.print(num + " ");
    }
}