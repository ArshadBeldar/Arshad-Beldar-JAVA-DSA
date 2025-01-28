package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {

        Student1 s1 = new Student1();

        Student1 s2 = new Student1(s1);

        // S1 object Print
        System.out.println(s1.rollno);
        for (int i = 0; i < s1.subject.length; i++){

            System.out.println(s1.subject[i]);
        }

        s2.subject[1] = "Arshad";

        // S2 object print
        System.out.println(s2.rollno);
        for (int i = 0 ; i < s2.subject.length; i++){

            System.out.println(s2.subject[i]);
        }
    }
}

class Student1{

    int rollno;

    String[] subject;


    Student1(){

        rollno = 123;

        subject = new String[]{"Math","Bio","Chem"};

    }

    Student1(Student1 s){

        this.rollno = s.rollno;

        this.subject = new String[s.subject.length];
        for (int i = 0; i < subject.length; i++){

            this.subject[i] = s.subject[i];
        }

    }


}