package fileName;

import java.util.Scanner;

public class FileNameMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the drive letter (e.g., C): ");
        String driveLetter = scanner.nextLine();

        System.out.print("Enter the path (e.g., \\Windows\\System): ");
        String path = scanner.nextLine();

        System.out.print("Enter the file name (e.g., Readme): ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the extension (e.g., txt): ");
        String extension = scanner.nextLine();

        System.out.println("Complete file name: " + driveLetter + ":" + path + "\\" + fileName + "." + extension);

        scanner.close();
    }
}
