package rectanglePropertis;

import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Calculate the area and perimeter of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Calculate the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Display the results
        System.out.println("Rectangle Properties:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of diagonal: " + diagonal);

        // Close the scanner
        scanner.close();
    }
}
