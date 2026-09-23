package CSE207ATIQ.ClassWork.Class3;

import java.util.Scanner;

public class OperationsOnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", arr[i]);
        }
        System.out.print("\nEnter the value for insertion: ");
        int value = scanner.nextInt();

        System.out.print("Enter the position for insertion: ");
        int pos = scanner.nextInt();

        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
        n++;
        System.out.println("Array after insertion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");

        System.out.print("\nEnter the position for deletion: ");
        int posDel = scanner.nextInt();

        for (int i = posDel; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("Array after deletion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}