package OOPS;  // Package declaration for OOPS

public class StaticMethodExample { // Main class demonstrating static and instance methods

    public static void main(String[] args) {


        // Calling static method using class name
        System.out.println(Student2.addition1(5, 8));


        // Creating an instance of Student2 and calling instance method
        Student2 s1 = new Student2();
        System.out.println(s1.addition(10, 20));

    }
}

class Student2 {

    // Static method for addition, can be accessed without creating an instance
    static int addition1(int a, int b) {
        return a + b;
    }


    // Instance method for addition, requires an object to call
    public int addition(int a, int b) {
        return a + b;
    }


}
