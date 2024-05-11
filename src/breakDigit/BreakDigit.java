package breakDigit;

import java.util.Scanner;

public class BreakDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer (up to 5 digits): ");
        String numberString = scanner.nextLine();

        System.out.println("The individual digits are:");
        for (int i = 0; i < numberString.length(); i++){
            System.out.print(numberString.charAt(i) + "\t");
        }

        scanner.close();
    }
}
