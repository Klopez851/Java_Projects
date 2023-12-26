//Filename: Student.java
//Author: Keidy Lopez
//Description:student class for lab 6

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private double GPA;

    public Student(String firstname, String lastname,int age,double GPA){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.GPA=GPA;
    }

    public Student(){
        this.firstname="";
        this.lastname="";
        this.age=0;
        this.GPA=0.0;
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = 0;
        this.GPA = 0.0;
    }


    //getters & setters
    public String getName(){
        return firstname;
    }

    public String getLastname(){return lastname;}

    public int getAge(){return age;}

    public double getGPA(){
        return GPA;
    }

    //allows for the change in age of a student object
    public void changeAge(int age){
        this.age=age;
    }

    //allows for the change in gpa of a student object
    public void changeGPA(double gpa){
        this.GPA=gpa;
    }

    //allows for the change in name of a student object
    public void changeFirstname(String name) {
        this.firstname = name;
    }

    //allows for the change in lastname of a student object
    public void changeLastname(String lastname) {
        this.lastname = lastname;
    }

    // public methods

    //determines in the given gpa is bigger than a 2.0
    public boolean isAbove2(double gpa){
        if(gpa > 2.0) return true;
        return false;
    }
    //compares 2 student gpa, if the gpa used as parameter is less a 1 is returned, if its greater a -1 is returned, if it
    // equal a 0 is returned
    public int compareTo(Student stu){
        if(GPA> stu.getGPA())return 1;//less
        else if(GPA == stu.getGPA())return 0;
        return -1;//greater
    }

    //compares 2 strings, if the string used as parameter is less a 1 is returned, if its greater a -1 is returned, if it
    // equal a 0 is returned
    public int compareTo(String name){
        if(firstname.compareToIgnoreCase(name)==1)return 1; //less
        else if (firstname.compareToIgnoreCase(name)==0) return 0;
        return -1;//greater
    }

    //returns and array with what is missing, 1 = firstname, 2 = lastname, 3 = age, 4 = gpa
    public ArrayList emptyFields() {
        ArrayList<Integer> missing = new ArrayList<>(4);
        if (firstname=="")missing.add(1);
        if (lastname == "")missing.add(2);
        if (age==0)missing.add(3);
        if (GPA==0.0)missing.add(4);

        return missing;
    }




    //static Methods

    //sets a student object attributes
    public static Student getStudent(Scanner input){
        String name, last;
        int age;
        double gpa;

        System.out.print("enter the firstname of the student ");
        name = input.nextLine();

        System.out.print("enter the lastname of the student ");
        last = input.nextLine();

        System.out.print("enter the age of the student ");
        age = input.nextInt();

        System.out.print("enter the gpa of the student ");
        gpa = input.nextDouble();

        return new Student(name,last,age,gpa);

    }
}
