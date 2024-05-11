package twoInputAndOupt;

import java.util.Scanner;

public class TwoInputAndEnhancedOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = in.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2.00;

        int distance = Math.abs(firstNumber - secondNumber);
        int maximum = Math.max(firstNumber, secondNumber);
        int minimum = Math.min(firstNumber, secondNumber);


        // Print all results with proper alignment
        System.out.printf("Sum: %14d\n", sum);
        System.out.printf("Difference: %7d\n", difference);
        System.out.printf("Product: %10d\n", product);
        System.out.printf("Average: %10.2f\n", average);
        System.out.printf("Distance: %9d\n", distance);
        System.out.printf("Maximum: %10d\n", maximum);
        System.out.printf("Minimum: %10d\n", minimum);

        // Close the scanner
        in.close();
    }
}