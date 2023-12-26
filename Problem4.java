//Filename: Problem4.java
//Author: Keidy Lopez
//Description: metric/imperial convertion

import java.util.Scanner;
import java.lang.Thread;

public class Problem4 {
   //gets the convertion system from user
   public static int Metric_Or_Imperial(Scanner input,Thread thread) throws InterruptedException {
      int choice;
      do {
         System.out.println("What would you like to convert?");
         thread.sleep(500);
         System.out.println("1) Metric to Imperial");
         thread.sleep(500);
         System.out.println("2) Imperial to Metric");
         thread.sleep(500);
         System.out.print("Enter your the number of your choice here:");
         choice = input.nextInt();
         input.skip("\n");
      }while(choice>2 || choice<1);
      return choice;
   }
//gets what units the user wants to convert
   public static int convertionUnit(Scanner input, Thread thread) throws InterruptedException {
      int choice;
      do {
         System.out.println("Units available for conversion");
         thread.sleep(500);
         System.out.println("1) Miles <--> Kilometer");
         thread.sleep(500);
         System.out.println("2) Gallons <--> Liters");
         thread.sleep(500);
         System.out.println("3) Yards <--> Meters");
         thread.sleep(500);
         System.out.println("4) Inches <--> Centimeters");
         thread.sleep(500);
         System.out.print("Enter your the number of your choice here:");
         choice = input.nextInt();
         input.skip("\n");
      }while(choice>4||choice<1);
      return choice;
   }
//converts from metric to imperial
   public static double MtoIconvertion(int choice, Scanner input){
      double convertion=0;
      double amount = 0;
      switch (choice){
         case 1:
            System.out.print("length of Kilometer/s: ");
            amount=input.nextDouble();
            convertion=amount*.621371;
            break;
         case 2:
            System.out.print("volume of Liter/s:");
            amount=input.nextDouble();
            convertion=amount*0.264172;
            break;
         case 3:
            System.out.print("length of Meter/s: ");
            amount=input.nextDouble();
            convertion=amount*1.0936;
            break;
         case 4:
            System.out.print("Length: of Centimeter/s: ");
            amount=input.nextDouble();
            convertion=amount*0.393701;
            break;
      }
         return convertion;
   }
//converts from imperial to metric
   public static double ItoMconvertion(int choice, Scanner input) {
      double convertion = 0;
      double amount = 0;
      switch (choice) {
         case 1:
            System.out.print("length of Mile/s: ");
            amount = input.nextDouble();
            convertion = amount * 1.60934;
            break;
         case 2:
            System.out.print("volume of Gallon/s:");
            amount = input.nextDouble();
            convertion = amount * 3.78541;
            break;
         case 3:
            System.out.print("length of Yard/s: ");
            amount = input.nextDouble();
            convertion = amount * 0.9144;
            break;
         case 4:
            System.out.print("Length of Inch/es: ");
            amount = input.nextDouble();
            convertion = amount * 2.54;
            break;
      }
      return convertion;
   }

   public static void main(String[] arg) throws InterruptedException {
      Scanner input = new Scanner(System.in);
      Thread thread = new Thread();
      int metric_or_imperial, convertionUnit;
      double finishedConvertion;
      String Answer;
      boolean flag=true;

      while (flag) {
         metric_or_imperial = Metric_Or_Imperial(input, thread);
         if (metric_or_imperial == 1) {
            convertionUnit = convertionUnit(input, thread);
            finishedConvertion = MtoIconvertion(convertionUnit, input);
            thread.sleep(500);
            System.out.println("\n" + "Calculating...");
            thread.sleep(550);
            System.out.printf("%.2f %n", finishedConvertion);
         } else {
            convertionUnit = convertionUnit(input, thread);
            finishedConvertion = ItoMconvertion(convertionUnit, input);
            thread.sleep(500);
            System.out.println("\n" + "Calculating...");
            thread.sleep(550);
            System.out.printf("%.2f %n",finishedConvertion);
         }
         input.skip("\n");
         System.out.print("do you need to convert another unit(y/n)? ");
         Answer=input.nextLine();

         if(Answer.toUpperCase().equals("N")){
            flag=false;
         }
      }
      System.out.println("Thanks for using my program!");
   }
}