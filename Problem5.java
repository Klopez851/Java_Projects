//Filename: Problem5.java
//Author: Keidy Lopez
//Description:

import java.util.Scanner;
import java.util.Random;

public class Problem5 {
    public static void main(String[] args) {
        //variables
        Scanner cin = new Scanner(System.in);
        Random num = new Random();
        int numberOfRolls;
        int amountRolled;
        int doublesRolled = 0;
        double percentRolled;
        String percentSign = "%";

        //gets amount of rolls
        System.out.print("How many times do want to roll the dice? ");

        // declares values of variables
        numberOfRolls = cin.nextInt();
        amountRolled = numberOfRolls;

        //rolls the amount desired and announces doubles rolled
        for(int i = 0;i<numberOfRolls;i++){
            int die1 =num.nextInt(1,6);
            int die2 =num.nextInt(1,6);

            if(die1 == die2){
                System.out.println("you rolled: "+die1+","+die2);
                System.out.println("    you rolled a double!");
                doublesRolled += 1;
            }
            else{System.out.println("you rolled: "+die1+","+die2);}
        }
        //gets percent of doubles rolled
        percentRolled = ((double)doublesRolled/(double)amountRolled)*100;

        // prints results
        System.out.println("You rolled Doubles "+ doublesRolled+" times out of "+amountRolled);
        System.out.printf("that's %.1f%s",percentRolled,percentSign);




    }
}
