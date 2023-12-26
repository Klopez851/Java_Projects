//Filename: Problem2.java
//Author: Keidy Lopez
//Description: Converts Celcius to  Fahrenheit
import java.util.Scanner;

public class Problem2 {
    // takes Celcius temo and converts it to Fahrenheit temp
    public static double CtoF(double c){
        double f = (1.8*c)+ 32;
        return f;
    }

    //prompts user for a Celcius temp and returns its Fahrenheit equivalent
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double temp;
        double newTemp;

        System.out.print("Enter a Celsius temperature for me to convert to Fahrenheit: ");
        temp = cin.nextDouble();
        newTemp = CtoF(temp);

        //flow control statements
        if(newTemp < 32){
            System.out.printf("%.1f F is really cold!", newTemp);
        }
        if(newTemp > 32 && newTemp < 80){
            System.out.printf("%.1f F", newTemp);
        }
        if(newTemp > 80){
            System.out.printf("%.1f F is really hot!", newTemp);
        }


    }
}
