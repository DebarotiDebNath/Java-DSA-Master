package CSE207ATIQ.ClassWork.Class2;

import java.util.Scanner;

public class QuadraticEquation {
    // Quadratic Equation, (ax^2 + bx + c = 0)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a != 0) {
            // Discriminant = tells about the number and types of solutions(roots) an equation has
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant > 0) {
                System.out.println("The equation has two distinct real roots.");
                double root1 = (- b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (- b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Root 1: " + root1 + " \nRoot 2: " + root2);

            } else if (discriminant == 0) {
                System.out.println("The equation has one repeated real root.");
                double root = - b / (2 * a);
                System.out.println("Roots: " + root);

            } else {
                System.out.println("The equation has imaginary roots.");
                double realPart = - b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}