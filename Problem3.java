//Filename: Problem3.java
//Author: Keidy Lopez
//Description:

import java.util.Locale;
import java.util.Scanner;

public class Problem3 {
    public static String stringFlipping(String phrase) {
        StringBuilder string = new StringBuilder();

        for (int i = 1; i < phrase.length() + 1; i++) {
            string.append(String.valueOf(phrase.charAt(phrase.length() - i)));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        String phrase, ans;
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        while (flag) {
            System.out.print("please enter a phrase: ");
            phrase = input.nextLine();

            System.out.println(stringFlipping(phrase));

            System.out.print("would you like to flip another phrase (Y/N)?");
            ans = input.nextLine();

            if (ans.toUpperCase(Locale.ROOT).equals("N")) {
                flag = false;
            }
        }
    }
}
