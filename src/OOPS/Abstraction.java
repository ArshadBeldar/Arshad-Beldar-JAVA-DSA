// Package declaration
package OOPS;

// Main class to run the program
public class Abstraction {

    public static void main(String[] args) {

        // Creating an object of Car1 class
        Car1 cr = new Car1();

        // Calling the abstract method (implemented in Car1)
        cr.carStart();

        // Calling the normal method from abstract class
        cr.carStop();
    }
}

// Abstract class defining a blueprint for Vehicles
abstract class Vehicle {

    // Abstract method (must be implemented in subclass)
    abstract void carStart();

    // Concrete method (already implemented, can be used as it is)
    void carStop() {
        System.out.println("Car is Stop : ");
    }
}

// Concrete class extending abstract class Vehicle
class Car1 extends Vehicle {

    // Overriding abstract method and providing implementation
    @Override
    void carStart() {
        System.out.println("Car is Start : ");
    }
}
