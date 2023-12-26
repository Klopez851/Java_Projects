//Filename: Problem1.java
//Author: Keidy Lopez
//Description: program that encrypts a phrase using a secret number

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
//encrypts the message excludint punctuation
    public static String encryption(String phrase, int num) {
        StringBuilder string = new StringBuilder();
        char char2;
        int e;

        for (int i = 0; i < phrase.length(); i++) {
            char2=phrase.charAt(i);
            if(char2>=33&&char2<=47||char2>=58&&char2<=64||char2>=91&&char2<=96||char2>=123&&char2<=126)
                string.append(char2);
            else{
                e = char2 ^ num;
                string.append(String.valueOf(e));
            }
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String phrase;
        boolean flag = true;
        String ans;
        Scanner input = new Scanner(System.in);
        int num;
// gets information from user and encrypts it as many times as the user wants
        while (flag) {

            System.out.print("enter the phrase you'd like to encrypt: ");
            phrase = input.nextLine();

            do {
                System.out.print("enter a number between 1 and 255: ");
                num = input.nextInt();
            } while (num > 255 || num < 1);

            System.out.println("Original string: " + phrase);
            System.out.println("Shifted String: " + encryption(phrase, num));

            input.skip("\n");
            System.out.print("would you like to encrypt another (Y/N)?");
            ans = input.nextLine();

            if (ans.toUpperCase(Locale.ROOT).equals("N")) {
                flag = false;
            }

        }
    }
}