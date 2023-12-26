//Filename: Problem3.java
//Author: Keidy Lopez
//Description: tells you how many hrs you need to work to get a desired amount of money depending on hrly rate

import java.util.Scanner;

public class Problem3 {

    //determines if one will need to work overtime to get desired amount
    public static double isOvertimeRequired(double amountDesired, double hourlyRate){
        double a = hourlyRate*40; //determines max amount of money made from regular hrs

        //determines if the desired amount goes above the previously mentioned max
        if(amountDesired>a){
            double b = amountDesired - a;
            double c = hourlyRate*1.5;
            return b/c; //amount of overtime hrs needed
        }
        else{
            return 0.0;
        }

    }
    // calculates total hrs needed to work to get amount of money desired including overtime
    public static double hrsNeeded(double amountDesired, double hourlyRate){
        double overtime = isOvertimeRequired(amountDesired, hourlyRate);//overtime hrs needed

        if(overtime == 0.0){return amountDesired/hourlyRate;}//if no overtime is needed
        else{return 40.0+ overtime;}//if overtime is needed

    }
    public static void main(String[] args) {
        // variables
        Scanner cin = new Scanner(System.in);
        String name;
        double amountDesired,hourlyPay;

        // asks for information needed
        System.out.print("What is your name? ");
        name = cin.nextLine();
        System.out.print("How much do you want to make this week? ");
        amountDesired = cin.nextDouble();
        cin.skip("\n");
        System.out.print("What is your standard rate of pay? ");
        hourlyPay = cin.nextDouble();

        //prints out results
        System.out.println();
        System.out.print(name+"'s Pay stub\n");
        System.out.printf("Rate = %.2f\n", hourlyPay);
        System.out.printf("Gross Pay = %.2f\n", amountDesired);
        System.out.printf("Hours Worked = %.1f",hrsNeeded(amountDesired,hourlyPay));

    }
}
