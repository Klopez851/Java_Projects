//Filename: Problem2.java
//Author: Keidy Lopez
//Description: adds multiple student objects to an arraylist

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> myStudents = new ArrayList<>(10);
        boolean flag = true;
        String ans;

        //creates as many student objects as a user desires
        while (flag) {
            Student student = Student.getStudent(input);
            myStudents.add(student);

            System.out.print("Would you like to add another student(Y/N)? ");
            input.skip("\n");
            ans = input.nextLine();
            if (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y"))) {
                flag = false;
            }
        }

        //prints out all the attributes for all the Students created
        for (Student student : myStudents) {
            if (student.isAbove2(student.getGPA())) {
                System.out.printf("%s,%s,%d,%.2f,Yes\n", student.getName(), student.getLastname(), student.getAge(),
                        student.getGPA());
            }
            else {
                System.out.printf("%s,%s,%d,%.2f,No\n", student.getName(), student.getLastname(), student.getAge(),
                        student.getGPA());
            }


        }
    }
}