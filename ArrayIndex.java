//Write a program that attempts to access an element at an invalid index in an array. Use a try-catch block to catch the ArrayIndexOutOfBoundsException and print a custom message such as "Invalid index access!".


public class ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Trying to access index 10 which is invalid (only 0 to 4 are valid)
            int value = numbers[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access!");
        }
    }
}
