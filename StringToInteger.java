//Write a program that takes a string from the user and tries to convert it into an integer. Use a try-catch block to handle NumberFormatException and print "Invalid number format" if an error occurs.kjj

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        scanner.close();
    }
}
