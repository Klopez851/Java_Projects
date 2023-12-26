//Filename: Problem3.java
//Author: Keidy Lopez
//Description: takes an unknown amount of numbers and adds them to an arraylist, and that list is then revered

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Problem3 {
    public static void reverse( ArrayList<Integer> intArray){
        Collections.reverse(intArray);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>(10);
        int num;

        do{
            System.out.print("please enter a number ");
            num = input.nextInt();
            intArray.add(num);
        }while(num !=0);

        reverse(intArray);
        System.out.print(intArray);
    }
}
