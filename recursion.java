//Filename: recursion.java
//Author: Keidy Lopez
//Description:

import java.util.Scanner;

public class recursion {
    //my take on recursion
    public static String reverse(String string){
        StringBuilder s = new StringBuilder();

        if(string.equals("")){
            return string;
        }
        else {
            reverse(string.substring(1) + s.charAt(0));
        }

    }
    //class example w/o string buuilder
    public static String reverse(String str){
        if(str.length()<=1)return str;
        return reverse(str.substring(1))+ Character.toString(str.charAt(0));

    }
    //calss example with string builder
    public static void reverse_helper(String str, int curr, StringBuilder res){
        if(curr==str.length())return;
        reverse_helper(str,curr,res);
        res.append(str.charAt(curr));

    }
    public static String reversee(String str){
        StringBuilder res = new StringBuilder();
        //call helper
        reverse_helper(str, 0,res);
        return res.toString();
    }
    //class example ends here

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a string: ");
        String string = input.nextLine();

    }
}
