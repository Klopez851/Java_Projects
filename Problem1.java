//Filename: Problem1.java
//Author: Keidy Lopez
//Description: vector class driver program


public class Problem1 {
    public static void main(String[] args){
        double x=3.0,y=-5.0;
        double x2=-3.0,y2=5.0;
        Vector vector = new Vector(x,y);
        Vector vector2 = new Vector(x2,y2);

        System.out.println("This is a driver program for the Vector Class\nThe X value is 3.0 and the Y value is -5.0");
        System.out.println("Testing getX");
        System.out.println(vector.getX());
        System.out.println("Testing getY");
        System.out.println(vector.getY());
        System.out.println("Testing getMagnitude");
        System.out.println(vector.getMagnitudeAtOrigin());
        System.out.println("Testing add, new vector had x value of -3.0 and y value of 5.0");
        System.out.println(vector.add(vector2).getX());
        System.out.println(vector.add(vector2).getY());
        System.out.println("Testing scale, it is being scaled by 2");
        System.out.println("new X value: " +vector.scale(2).getX());
        System.out.println("new Y value: " +vector.scale(2).getY());

    }
}
