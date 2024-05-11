package radiusToOtherProperties;

import java.util.Scanner;

public class RadiusToOtherProperties {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference of a circle
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        // Calculate volume and surface area of a sphere
        double sphereVolume = (4.0 / 3.0) + Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Display the results
        System.out.println("Circle:");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);

        System.out.println("Sphere:");
        System.out.println("Volume: " + sphereVolume);
        System.out.println("Surface Area: " + sphereSurfaceArea);

        // Close the scanner
        scanner.close();
    }
}
