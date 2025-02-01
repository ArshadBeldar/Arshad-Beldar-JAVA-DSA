package OOPS;  // Package declaration

public class Static {
    public static void main(String[] args) {

        // Setting the static variable 'collage' for all instances of Student2
        Student2.collage = "Rawal Collage";

        // Creating an instance of Student2
        Student2 s1 = new Student2();

        // Setting name for the student instance
        s1.setName("Arshad");

        // Displaying student details
        s1.display();
    }
}

// Class representing a student
class Student2{

    // Static variable shared among all instances
    static String collage;

    // Instance variable for student name
    String name;

    // Method to set the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Method to display student details
    public void display(){
        System.out.println(name + " - " + collage);
    }
}
