//Filename: Problem4.java
//Author: Keidy Lopez
//Description: gives usefull information of an arraylist of grades

import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {
    //finds staandard diviation of an arraylist
    public static double std_dv_of_Arraylist(ArrayList myGrades,double mean, int size){
        double num,difference,sumOfDifferences = 0,sumOfDifferences2, std_dv;

        //I was completely lost as to how to do this part, so i got some help from StackOverflow
        for (int i = 0; i < myGrades.size(); i++){
            num = (double) myGrades.get(i);
            difference = Math.pow(num- mean, 2);
            sumOfDifferences += difference;
        }
        sumOfDifferences2 = sumOfDifferences/size;
        std_dv=Math.sqrt(sumOfDifferences2);
        //help from StackOverflow stops here
        return std_dv;
    }


    public static void main(String[] args) {
        ArrayList<Double> myGrades = Grades.getGrades();
        int size = myGrades.size();

        //Java Collections are solutions for all the data manipulation jobs; So i decided to make my life easier and use
        //this class to find most of the requirements
        double sum=0, max=Collections.max(myGrades),min=Collections.min(myGrades);
        double mean,num,difference,sumOfDifferences = 0,sumOfDifferences2, std_dv;

        //adds all the elements
        for(double i:myGrades){
            sum+=i;
        }

        mean=sum/size;
        std_dv = std_dv_of_Arraylist(myGrades,mean,size);

        System.out.printf("Number of elements in Grades: %d\n",size);
        System.out.printf("Highest score: %.2f\n",max);
        System.out.printf("Lowest score: %.2f\n",min);
        System.out.printf("Mean of the score: %.2f\n",mean);
        System.out.printf("The standard deviation of the scores: %.2f",std_dv);

    }
}
