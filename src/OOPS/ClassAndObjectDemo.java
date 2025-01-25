package OOPS;

// Main class where the program execution begins
public class ClassAndObjectDemo {

    public static void main(String[] args) {
        // Creating an object of class 'Pen'
        Pen pen = new Pen();

        // Setting values using the setter methods
        pen.setColor("blue");
        pen.setPrice(15);
        pen.setThinknes(5);

        // Calling getter methods to retrieve and display the values
        System.out.println("Color: " + pen.getColor());
        System.out.println("Price: " + pen.getPrice());
        System.out.println("Thickness: " + pen.getThinknes());
    }
}

// Pen class which represents the pen object with its properties and methods
class Pen {

    // Instance variables of the Pen class
    private String color;
    private int price;
    private int thinknes;

    // Setter method to set the color of the pen
    void setColor(String a) {
        color = a;  // Assigning the parameter value to the instance variable 'color'
    }

    // Getter method to get the color of the pen
    public String getColor() {
        return color;  // Returning the value of the 'color' instance variable
    }

    // Setter method to set the price of the pen
    void setPrice(int b) {
        price = b;  // Assigning the parameter value to the instance variable 'price'
    }

    // Getter method to get the price of the pen
    public int getPrice() {
        return price;  // Returning the value of the 'price' instance variable
    }

    // Setter method to set the thickness of the pen
    void setThinknes(int c) {
        thinknes = c;  // Assigning the parameter value to the instance variable 'thinknes'
    }

    // Getter method to get the thickness of the pen
    public int getThinknes() {
        return thinknes;  // Returning the value of the 'thinknes' instance variable
    }
}
