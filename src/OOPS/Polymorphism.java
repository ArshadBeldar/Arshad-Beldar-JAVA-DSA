package OOPS;  // Package declaration

// Method Overloading - Demonstrating Compile-time Polymorphism
public class Polymorphism {

    public static void main(String[] args) {

        Calculator cal = new Calculator();  // Creating an object of Calculator class

        // Calling sum method with two integer parameters
        System.out.println(cal.sum(10, 20));

        // Calling sum method with three integer parameters
        System.out.println(cal.sum(10, 20, 30));

        // Calling sum method with two float parameters
        System.out.println(cal.sum(20.50f, 20.50f));
    }
}

// Calculator class demonstrating method overloading
class Calculator {

    // Method to add two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two float values
    float sum(float a, float b) {
        return a + b;
    }
}
