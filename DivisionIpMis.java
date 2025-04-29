// Write a program that takes an integer input from the user and tries to divide 100 by the entered number. If the user enters 0, catch the ArithmeticException. If the user enters a non-integer value, catch the InputMismatchException.


import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionIpMis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer to divide 100 by: ");
            int number = sc.nextInt();
            int result = 100 / number;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
