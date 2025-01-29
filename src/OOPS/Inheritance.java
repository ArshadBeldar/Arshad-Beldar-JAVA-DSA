package OOPS; // Package declaration for Object-Oriented Programming concepts

// Main class demonstrating inheritance
public class Inheritance {

    public static void main(String[] args) {
        // Creating an instance of Child class
        Child child = new Child();

        // Calling methods from different levels of the inheritance hierarchy
        child.helloGrandParends(); // Method from GrandParents class
        child.helloParends();      // Method from Parents class
        child.helloChild();        // Method from Child class
    }
}

// Base class representing Grandparents
class GrandParends {

    // Method to print a message from Grandparents
    void helloGrandParends() {
        System.out.println("Hello Grand Parends....");
    }
}

// Intermediate class representing Parents, inheriting from GrandParents
class Parends extends GrandParends {

    // Method to print a message from Parents
    void helloParends() {
        System.out.println("Hello Parends");
    }
}

// Child class inheriting from Parents
class Child extends Parends {

    // Method to print a message from Child
    void helloChild() {
        System.out.println("Hello Child");
    }
}
