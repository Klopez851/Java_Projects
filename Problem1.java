//Filename: Problem1.java
//Author: Keidy Lopez
//Description: takes a number and determines whether it is odd or even
import java.util.Scanner;

public class Problem1 {
    //Method that takes a number and determines whether it is odd or even
    public static String isOdd(int num){
        if(num%2 != 0){return "Odd";}
        else{return "even";}
    }
    // takes an integer from console and returns 'odd' or 'even' depending on the number
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num;

        System.out.print("please enter an integer :) ");
        num = cin.nextInt();
        System.out.println(isOdd(num));
    }
}
