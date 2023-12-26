//Filename: Problem4.java
//Author: Keidy Lopez
//Description: driver program for new constructor, setters, and .isEmpty method of the student class

public class Problem4 {
    public static void main(String[] args) {
        //sets up student 1 and sets the attributes that are missing
        System.out.println("student w/ constructor that takes no arguments");
        Student student1 = new Student();
        System.out.println(student1.emptyFields());

        String name = "name";
        student1.changeFirstname(name);
        System.out.println(student1.emptyFields());

        String last = "last";
        student1.changeLastname(last);
        System.out.println(student1.emptyFields());

        int age = 3 ;
        student1.changeAge(age);
        System.out.println(student1.emptyFields());

        double gpa = 3.0 ;
        student1.changeGPA(gpa);
        System.out.println(student1.emptyFields());

        //sets up student 2 and sets the attributes that are missing
        System.out.println("Student w/ constructor that takes only first and last names");
        Student student2 = new Student(name,last);
        System.out.println(student2.emptyFields());

        student2.changeAge(age);
        System.out.println(student2.emptyFields());

        student2.changeGPA(gpa);
        System.out.println(student2.emptyFields());


    }

}
