//Filename: Problem4.java
//Author: Keidy Lopez
//Description: driver progem for SortedList class

import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> intAry = new ArrayList(4);

        for(int i=1; i<5;i++){
            intAry.add(i);
        }

        SortedList intArry = new SortedList(intAry);


        System.out.println("This is a driver program for the SortedList Class\nThe value at index 2 is 3 and the size is" +
                " 4");
        System.out.println("Testing getValueAtIndex(2)");
        System.out.println(intArry.getValueAtIndex(2));
        System.out.println("Testing add(5)");
        intArry.add(5);
        System.out.println(intArry.getValueAtIndex(4));
        System.out.println("Testing size(), with the newly added index it should be 5");
        System.out.println(intArry.size());

    }
}
