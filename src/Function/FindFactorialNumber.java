package Function; // Package declaration, grouping related classes together

// Class to find the factorial of a number
public class FindFactorialNumber {

    // Method to calculate the factorial of a given number 'n'
    public static void findFactorial(int n) {
        int factorialNo = 1; // Variable to store the factorial, initialized to 1

        // Loop from 1 to n, multiplying the numbers to calculate factorial
        for (int i = 1; i <= n; i++) {
            factorialNo = factorialNo * i; // Update factorial by multiplying with 'i'
        }

        // Print the calculated factorial
        System.out.println(factorialNo);
    }

    public static void main(String[] args) {
        int n = 5; // Input number for which factorial is to be calculated
        findFactorial(n); // Call the method to calculate and print the factorial
    }
}
