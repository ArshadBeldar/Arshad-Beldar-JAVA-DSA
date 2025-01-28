package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {

        // Creating the first Student1 object s1 using the default constructor
        Student1 s1 = new Student1();

        // Creating the second Student1 object s2 using the copy constructor
        Student1 s2 = new Student1(s1);

        // Printing the details of s1 object
        System.out.println("S1 Object:");
        System.out.println("Rollno: " + s1.rollno);
        // Looping through the subjects array in s1 and printing each subject
        for (int i = 0; i < s1.subject.length; i++) {
            System.out.println(s1.subject[i]);
        }

        // Modifying one element in s2's subjects array to test deep copy behavior
        s2.subject[1] = "Arshad";

        // Printing the details of s2 object
        System.out.println("\nS2 Object (after modification):");
        System.out.println("Rollno: " + s2.rollno);
        // Looping through the subjects array in s2 and printing each subject
        for (int i = 0; i < s2.subject.length; i++) {
            System.out.println(s2.subject[i]);
        }
    }
}

class Student1 {

    int rollno;  // A primitive type variable to store roll number
    String[] subject;  // An array of Strings to store subjects

    // Default Constructor
    Student1() {
        rollno = 123;  // Assigning default rollno
        subject = new String[]{"Math", "Bio", "Chem"};  // Initializing the subjects array with default values
    }

    // Copy Constructor (Deep Copy)
    Student1(Student1 s) {
        this.rollno = s.rollno;  // Copying the rollno value (primitive type)

        // Deep copy for the 'subject' array
        this.subject = new String[s.subject.length];  // Creating a new array with the same size as the original
        for (int i = 0; i < s.subject.length; i++) {
            this.subject[i] = s.subject[i];  // Copying each element from the original array to the new array
        }
    }
}
