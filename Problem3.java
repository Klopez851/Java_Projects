
//Filename: Problem3.java
//Author: Keidy Lopez
//Description:

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
    //this is supoosed to use a bubble sort algorithm to go through the list of students and sort them by gpa, if the
    // gpa is the same then names would be compared, i think i messed up my understanding if the -1,0,1 of the methods,
    // and in the implemetation of the algorithm as weel, i think the problem is with the if statmentd
    public static void sort(ArrayList<Student> myStudents) {
        for (int i = 0; i < myStudents.size() - 1; i++) {
            for (int j = 0; j < myStudents.size() - 1; j++) {
                Student student1 = myStudents.get(i);
                Student student2 = myStudents.get(j);
                Student student3;
                if (student1.compareTo(student2) == 1) {
                    student3=student1;
                    myStudents.set(i, student2);
                    myStudents.set(j,student3);
                } else if (student1.compareTo(student2) == 0) {
                    if (student1.compareTo(student2.getName()) == -1) {
                        student3=student1;
                        myStudents.set(i, student2);
                        myStudents.set(j, student1);
                    }
                    else if (student1.compareTo(student2.getName()) == 0 || student1.compareTo(student2.getName()) == 1) {
                        continue;
                    }

                } else if (student1.compareTo(student2) == -1) {
                    continue;

                }
            }
        }
    }

    public static double averageGPA(ArrayList<Student> myStudents){
        double average=0.0;
        for(Student s: myStudents){
            average += s.getGPA();
        }
        return average/myStudents.size();
    }

    public static int averageAge(ArrayList<Student> myStudents){
        int average=0;
        for(Student s: myStudents){
            average += s.getAge();
        }
        return average/myStudents.size();
    }

    public static double percentAbove2(ArrayList<Student> myStudents){
        double num =0;
        for(Student s: myStudents){
            if(s.isAbove2(s.getGPA()))
             num += 1;
        }
        return (num/myStudents.size())*100;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> myStudents = new ArrayList<Student>(10);
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

        sort(myStudents);
        for(Student student:myStudents){
            System.out.print(student.getName());
            System.out.println(student.getGPA());
        }
        System.out.printf("average age: %d\naverage gpa: %.2f\npercentage of students with gpa above a 2.0: $.2f ",
                averageAge(myStudents),averageGPA(myStudents),percentAbove2(myStudents));
        }
    }
