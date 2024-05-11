package numberPowers;

import java.util.Scanner;

public class NumberPowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take Double as an input from user
        System.out.print("Enter a number: ");
        double number = in.nextDouble();

        // Calculate square
        double square = number * number;

        // Calculate cube
        double cube = square * number;

        // Calculate fourth power using Math.pow
        double fourthPower = Math.pow(number, 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);

        // Close the scanner
        in.close();
    }
}
