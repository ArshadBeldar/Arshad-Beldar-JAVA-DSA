// Package declaration
package OOPS;

// Main class to run the program
public class Abstraction {

    public static void main(String[] args) {

        // ✅ Creating an anonymous class object
        // Here, we are creating an object of an abstract class `Vehicle`
        // Internally, Java will generate a new subclass and override `carStart()`
        Vehicle vehicle = new Vehicle() {
            @Override
            void carStart() {
                System.out.println("Car is Start : ");
            }
        };

        // Calling overridden method from anonymous class
        vehicle.carStart();  // Output: Car is Start :

        // Calling normal method from abstract class
        vehicle.carStop();   // Output: Car is Stopped :
    }
}

// Abstract class defining a vehicle blueprint
abstract class Vehicle {

    // Abstract method (must be implemented by a subclass or anonymous class)
    abstract void carStart();

    // Concrete method (already implemented, no need to override)
    void carStop() {
        System.out.println("Car is Stopped : ");
    }
}
