//Filename: Problem2.java
//Author: Keidy Lopez
//Description: vector class driver program

public class Problem2 {
    public static void main(String[] args) {
        double x=3.0,y=-5.0;
        double x2=-3.0,y2=5.0;
        Vector vector = new Vector(x,y);

        System.out.println("This is a driver program for the Vector Class\nThe X value is 3.0 and the Y value is -5.0");
        System.out.println("testing the modified add method, x = -3.0, y=5.0");
        Vector vector2=vector.add(x2,y2);
        System.out.println(vector2.getX());
        System.out.println(vector2.getY());
    }
}
