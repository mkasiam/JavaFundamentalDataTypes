package meterToOthersUnit;

import java.util.Scanner;

public class MeterToOtherUnit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Unit In Meter:");
        double meters = in.nextDouble();

        // Convert meters to miles, feet, and inches
        double miles = meters * Constants.METER_TO_MILES;
        double feet = meters * Constants.METER_TO_FEET;
        double inches = meters * Constants.METER_TO_INCHES;

        // Display the conversion results
        System.out.println("Conversion Results:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);

        // Close the scanner
        in.close();
    }
}
