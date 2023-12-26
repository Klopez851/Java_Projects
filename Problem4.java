//Filename: Problem4.java
//Author: Keidy Lopez
//Description: tells person whether arc effects will defeat opponents

import java.util.Scanner;

public class Problem4 {
    //takes damage and doubles it according to how the arc count
    public static int arcEffects(int arcCount, int acrDamage) {
        int damage = acrDamage;
        //you declare a variable;//tell the loop how many times to repeat itself;//i is incremented by 1;
        //exclusive just like in python.
        for (int i = 0; i < arcCount; i++) {
            damage *= 2;
        }
        return damage;
    }
    // tells person whether arc effects will defeat opponents
    public static void main(String[] args) {
        // variables
        Scanner cin = new Scanner(System.in);
        int arcCount;
        int opponentHealth;
        int cardDamage;
        int totalDamage;
        int remainingHealth;

        // gets information needed for calculations
        System.out.print("Enter arc count: ");
        arcCount = cin.nextInt();
        cin.skip("\n");
        System.out.print("Enter opponent’s remaining life: ");
        opponentHealth = cin.nextInt();
        cin.skip("\n");
        System.out.print("Enter card damage: ");
        cardDamage = cin.nextInt();
        cin.skip("\n");
        totalDamage = arcEffects(arcCount, cardDamage);
        System.out.println("Total Damage: "+ totalDamage);

        //determines whether the opponent is defeated ot not
        remainingHealth = opponentHealth - totalDamage;
        if (remainingHealth > 0)System.out.println("Opponent is not defeated.");
        else {System.out.println("the opponent is defeated.");}
    }
}