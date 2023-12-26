//Filename: shiftingStrings.java
//Author: Keidy Lopez
//Description:

public class shiftingStrings {
    //shifts string by a certain amount
    public static String stringShifter(String string, int Shift ){
        //string builder variable
        StringBuilder shiftedString = new StringBuilder();

        //splices string into two parts and addes them to the string builder
        shiftedString.append( string.substring(Shift, string.length()));
        shiftedString.append(string.substring(0,Shift));

        return shiftedString.toString();
    }
    public static void main(String[] args) {
        System.out.print(stringShifter("abdcefghijk",3));
    }
}
