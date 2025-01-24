package Function;

// This class contains basic arithmetic operations: addition, multiplication, division, and subtraction
public class FunctionDemo {

    // Method to perform addition of two integers
    public static void addition(int a, int b) {
        // Concatenates the integers instead of adding them; fix by adding parentheses around (a + b)
        System.out.println("Addition : " + (a + b));
    }

    // Method to perform multiplication of two integers
    public static void multiplication(int a, int b) {
        System.out.println("Multiplication : " + (a * b));
    }

    // Method to perform division of two integers
    public static void division(int a, int b) {
        // Make sure to handle division by zero to avoid runtime errors
        if (b != 0) {
            System.out.println("Division : " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }

    // Method to perform subtraction of two integers
    public static void subtraction(int a, int b) {
        System.out.println("Subtraction : " + (a - b));
    }

    public static void main(String[] args) {
        // Demonstrating each operation with sample inputs
        addition(10, 20);           // Should print Addition: 30
        multiplication(10, 20);     // Should print Multiplication: 200
        division(10, 2);            // Should print Division: 5
        subtraction(20, 10);        // Should print Subtraction: 10
    }
}
