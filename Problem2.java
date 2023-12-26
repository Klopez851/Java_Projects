//Filename: Problem2.java
//Author: Keidy Lopez
//Description: Currency converter

import java.util.Scanner;
import java.lang.Thread;

public class Problem2 {                          // tells the program that there will be interruptions in the code
                                                // (i.e. pauses) and to continue the program after the interruption is complete
    public static int optionsMenu(Scanner input, Thread thread) throws InterruptedException {
       int answer;
        do {
           System.out.println("What currency would you like to convert to?");
           thread.sleep(500);
           System.out.println("1) West African CFA franc");
           thread.sleep(500);
           System.out.println("2) Dominican Pesos");
           thread.sleep(500);
           System.out.println("3) Indian Rupee");
           thread.sleep(500);
           System.out.println("4) Euro");
           thread.sleep(500);
           System.out.print("please enter the number your choice here:");

           answer= input.nextInt();
           input.skip("\n");

           if(answer>4||answer<0){
               thread.sleep(300);
               System.out.println("\n"+"please enter a valid option"+"\n");
               thread.sleep(300);
           }

       }while(answer>4||answer<0);

        return answer;
    }

    public static double currencyConvetion(Scanner input,Thread thread,int choice) throws InterruptedException {
        double dollar;
        double total = 0;

        thread.sleep(500);
        System.out.print("please enter your dollar ammount:");
        dollar = input.nextDouble();
        input.skip("\n");

        switch(choice) {
            case 1:
                total = dollar * 612.90;
                break;
            case 2:
                total = dollar * 56.25;
                break;
            case 3:
                total= dollar * 82.52;
                break;
            case 4:
                total= dollar * 0.93;
                break;
        }

        return total;
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Thread thread= new Thread();
        int choice;
        double total;
        String answer;
        boolean flag= true;

        while(flag) {
            choice = optionsMenu(input, thread);
            System.out.println(currencyConvetion(input, thread, choice));
            System.out.print("would you like to do another conversion?(y/n): ");
            answer = input.nextLine();
            if (answer.toUpperCase().equals("N")) {
                flag = false;
            }

        }
        System.out.print("thanks for using my program");

    }
}
