package calculateFuelCost;

import java.util.Scanner;

public class CalculateFuelCost {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallonsInTank = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;

        double distance = gallonsInTank * fuelEfficiency;

        System.out.println("Output:-");
        System.out.printf("Cost per 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("Distance with the gas in the tank: %.2f miles\n", distance);

        // Close the scanner
        scanner.close();
    }
}
