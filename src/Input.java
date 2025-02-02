
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean correctValue = false;

        while (!correctValue) {
            try {
                System.out.print(message + ": ");
                value = scanner.nextByte();
                correctValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 0 and 100.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean correctValue = false;

        while (!correctValue) {
            try {
                System.out.print(message + ": ");
                value = scanner.nextInt();
                correctValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return value;
    }

    public static float readFloat(String message) {
        float value = 0.0f;
        boolean correctValue = false;

        while (!correctValue) {
            try {
                System.out.print(message + ": ");
                value = scanner.nextFloat();
                correctValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid decimal number (for example: 1.75).");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return value;
    }

    public static double readDouble(String message) {
        double value = 0.0;
        boolean correctValue = false;

        while (!correctValue) {
            try {
                System.out.print(message + ": ");
                value = scanner.nextDouble();
                correctValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid decimal number (for example: 3.1415).");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return value;
    }

    public static char readChar(String message) {
        char value = ' ';
        boolean correctValue = false;

        while (!correctValue) {
            System.out.print(message + ": ");
            String input = scanner.nextLine();
            if (input.length() == 1) {
                value = input.charAt(0);
                correctValue = true;
            } else {
                System.out.println("Error. Enter a single character.");
            }
        }
        return value;
    }

    public static String readString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    public static boolean readYesNo(String message) {
        String value;
        boolean response = false;
        boolean correctValue = false;

        while (!correctValue) {
            System.out.print(message + " (y/n): ");
            value = scanner.nextLine().toLowerCase();
            if (value.equals("y")) {
                response = true;
                correctValue = true;
            } else if (value.equals("n")) {
                correctValue = true;
            } else {
                System.out.println("Error. Please enter 'y' or 'n'.");
            }
        }
        return response;
    }
}
