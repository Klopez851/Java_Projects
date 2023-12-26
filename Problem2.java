//Filename: Problem2.java
//Author: Keidy Lopez
//Description:

import java.util.Locale;
import java.util.Scanner;

public class Problem2 {
    //removes all spaces and punctuation//not working
    public static String stringCleaning(String phrase){
        StringBuilder string=new StringBuilder();
        char char2;
        String phrase2=phrase.replaceAll(" ", "");

        for(int i = 0;i<phrase2.length();i++){
            char2 = phrase2.charAt(i);
            if(char2>=33&&char2<=47||char2>=58&&char2<=64||char2>=91&&char2<=96||char2>=123&&char2<=126){
                i+=1;
            }
            else{
                string.append(char2);
            }
        }
        return string.toString();
    }

    public static void main(String[] args) {
        //variables
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        Scanner input = new Scanner(System.in);
        String phrase,phrase2, ans;
        boolean flag = true;
//asks for a phrase and returns the number of vowels in the phrase and thepercentage of the phrase they make up
        while (flag) {
            System.out.print("please enter a phrase for analysis: ");
            phrase = input.nextLine();
            phrase2=stringCleaning(phrase);
            System.out.print(stringCleaning(phrase));
            for (int I = 0; I < phrase2.length(); I++) {
                if (phrase2.charAt(I) == 65 || phrase2.charAt(I) == 97) {
                    a++;
                } else if (phrase2.charAt(I) == 69 || phrase2.charAt(I) == 101) {
                    e++;
                } else if (phrase2.charAt(I) == 73 || phrase2.charAt(I) == 105) {
                    i++;
                } else if (phrase2.charAt(I) == 79 || phrase2.charAt(I) == 111) {
                    o++;
                } else if (phrase2.charAt(I) == 85 || phrase2.charAt(I) == 117) {
                    u++;
                }

            }
//i couldnt figure out why my percentages arent workin
            System.out.println("letter:    Count:    %:");
            System.out.println("a:         " + a + "         " + phrase2.length()/a + "%");
            System.out.println("e:         " + e + "         " + phrase2.length()/e + "%");
            System.out.println("i:         " + i + "         " + phrase2.length()/i + "%");
            System.out.println("o:         " + o + "         " + phrase2.length()/o + "%");
            System.out.println("u:         " + u + "         " + phrase2.length()/u + "%");


            System.out.print("would you like to encrypt another (Y/N)?");
            ans = input.nextLine();

            if (ans.toUpperCase(Locale.ROOT).equals("N")) {
                flag = false;
            }

        }
    }
}