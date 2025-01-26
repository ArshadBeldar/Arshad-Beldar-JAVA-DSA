package OOPS;

public class CarDemo {
    public static void main(String[] args) {
        // Creating a car using the default constructor
        Car car1 = new Car();

        // Creating a car with specific details
        Car car2 = new Car("Toyota", "Camry", 2023);

        // Displaying car details
        car2.displayDetails();
    }
}

class Car {
    String brand;
    String model;
    int year;

    // Default Constructor
    Car() {
        System.out.println("Default Car Constructor is called...");
    }

    // Parameterized Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}
