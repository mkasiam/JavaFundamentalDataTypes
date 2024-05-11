package removeComma;

import java.util.Scanner;

public class RemoveComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String inputNumber = scanner.nextLine();

        int indexOfComma = inputNumber.indexOf(",");

        String numberWithoutComma = inputNumber.substring(0, indexOfComma) +
                inputNumber.substring(indexOfComma + 1);

        System.out.println(numberWithoutComma);

        scanner.close();
    }
}
