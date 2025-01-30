package OOPS;  // Package declaration

// Function Overriding Example in Java

public class Polymorphism {

    public static void main(String[] args) {

        Deer d = new Deer();  // Creating an object of the Deer class

        d.eat();  // Calling the eat() method, which demonstrates method overriding

    }

}

// Parent class: Animal
class Animal {

    // Method to be overridden in the child class
    void eat() {
        System.out.println("Animal eats everything...");
    }

}

// Child class: Deer (inherits from Animal)
class Deer extends Animal {

    // Overriding the eat() method of the Animal class
    @Override
    void eat() {
        System.out.println("Deer eats only grass...");
    }

}
