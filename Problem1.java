//Filename: Problem1.java
//Author: Keidy Lopez
//Description:Driver program for Student class

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student = Student.getStudent(input);
        System.out.printf("%s,%s,%d,%.2f",student.getName(),student.getLastname(),student.getAge(),student.getGPA());
    
    }
}
