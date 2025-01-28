package OOPS;

public class Inheritance {

    public static void main(String[] args) {

        // Creating an object of Fish, which is a subclass of Animal
        Fish fish = new Fish();

        // Calling the swimming method of Fish class
        fish.swimming();

        // Calling the inherited breath method from Animal class
        fish.breath();

        // Calling the inherited drinkWater method from Animal class
        fish.drinkWater();

        // Printing the skin color of the fish
        System.out.println(fish.skincolor);
    }
}

// Parent class Animal
class Animal {

    // Method to simulate breathing behavior
    void breath() {
        System.out.println("Breathing..");
    }

    // Method to simulate drinking water behavior
    void drinkWater() {
        System.out.println("Drink Water..");
    }
}

// Child class Fish inherits from Animal class
class Fish extends Animal {

    // Adding a property specific to Fish class
    String skincolor = "red";

    // Method specific to Fish class to simulate swimming
    void swimming() {
        System.out.println("Swimming at 100 km/h");
    }
}
