//Filename: Problem1.java
//Author: Keidy Lopez
//Description: compund interest calculator

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Problem1 {
    public static double compoundInterestCalculator(double p, double r, int n, int t ){
//      additional values needed for calculation
        double base,A,c;
        int expo;
//      breakes up interest formula into chucks according to PEMDAS, for ease of calculation
        base = ((r/n)+1);
        expo = n*t;
        c = Math.pow(base, expo);
        A = c*p;

        return A;
    }
    public static void main(String[] args) {
//      variables needed
        Scanner input = new Scanner(System.in);
        int compoundingFrequency, lengthOfInvestment;
        double interestRate, principal, finalAmount;
        String answer;
        boolean flag = true;

//      while loop that calculates as many investments as the user wants
        while (flag) {
            System.out.print("how much are you investing?");
            principal = input.nextDouble();
            input.skip("\n");

            System.out.print("what is the interest rate on this investment(decimal form)?");
            interestRate = input.nextDouble();
            input.skip("\n");

            System.out.print("what is the compounding frequency of the investment(in months)?");
            compoundingFrequency = input.nextInt();
            input.skip("\n");

            System.out.print("for how many years are you making this investment?");
            lengthOfInvestment = input.nextInt();
            input.skip("\n");

            finalAmount = compoundInterestCalculator(principal, interestRate, compoundingFrequency, lengthOfInvestment);

            System.out.printf("after %d of investment at %.2f interest rate, your total is $%.2f %n %n", lengthOfInvestment,
                    interestRate, finalAmount);

            System.out.print("would you like to calculate the interest of another investment(y/n)?");
            answer = input.nextLine();

            if(answer.toUpperCase(Locale.ROOT).equals("N"))flag=false;

        }
        System.out.println("thanks for using my program");
    }
}
