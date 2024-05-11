package twoInputAndOupt;

import java.util.Scanner;

public class TwoInputAndOutput {

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

        // Print all results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        // Close the scanner
        in.close();
    }

}
