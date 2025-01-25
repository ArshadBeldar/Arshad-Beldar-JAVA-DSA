package OOPS;

// Main class where the program execution starts
public class GetterSetterMethod {

    public static void main(String[] args) {

        // Creating an object of the Student class
        Student student = new Student();

        // Setting values for the student's properties using setter methods
        student.setStudentName("Arshad");  // Setting the student's name to "Arshad"
        student.setStudentRollNo(73);      // Setting the student's roll number to 73
        student.setStudentStandard(15);    // Setting the student's standard to 15

        // Retrieving and displaying the student's properties using getter methods
        System.out.println("Student Name : " + student.getStudentName());      // Displaying student's name
        System.out.println("Student Roll No : " + student.getStudentRollNo()); // Displaying student's roll number
        System.out.println("Student Standard : " + student.getStudentStandard()); // Displaying student's standard
    }
}

// Student class with private instance variables and public setter/getter methods
class Student {

    // Private instance variables to store student details
    private int studentRollNo;
    private String studentName;
    private int studentStandard;

    // Setter method to set the student's roll number
    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;  // Assigning the parameter value to the instance variable
    }

    // Setter method to set the student's name
    public void setStudentName(String studentName) {
        this.studentName = studentName;  // Assigning the parameter value to the instance variable
    }

    // Setter method to set the student's standard
    public void setStudentStandard(int studentStandard) {
        this.studentStandard = studentStandard;  // Assigning the parameter value to the instance variable
    }

    // Getter method to retrieve the student's roll number
    public int getStudentRollNo() {
        return this.studentRollNo;  // Returning the value of the studentRollNo variable
    }

    // Getter method to retrieve the student's standard
    public int getStudentStandard() {
        return this.studentStandard;  // Returning the value of the studentStandard variable
    }

    // Getter method to retrieve the student's name
    public String getStudentName() {
        return this.studentName;  // Returning the value of the studentName variable
    }
}
