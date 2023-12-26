//Filename: Vector.java
//Author: Keidy Lopez
//Description:
import java.lang.Math;
import java.util.ArrayList;

public class Vector {
    private final double x;
    private final double y;

    //constructor
    public Vector(double x,double y){
        this.x = x;
        this.y = y;
    }

//getters
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
//methods

    //gets distance between two points at the origin of a cartesian plane(returns Double)
    public double getMagnitudeAtOrigin(){
        double magnitude;
        magnitude = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
        return magnitude;
    }

    //returns Vector with the new x,y coords of the two vectors added together
    public Vector add(Vector vector){
        double x2 = vector.getX(),y2 = vector.getY();
        double new_x = x + x2;
        double new_y = y + y2;

        return new Vector(new_x,new_y);

    }

    public Vector add( double xMod,double yMod){
        double new_x = x + xMod;
        double new_y = y + yMod;

        return new Vector(new_x,new_y);
    }


    //scales the instance of a vector by a given amount
    public Vector scale(double n){
        double new_x = x * n;
        double new_y = y * n;

        return new Vector(new_x,new_y);
    }


}
