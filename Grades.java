//File: Grades.java
//Author: Michael Huelsman
//Created On: Spring 2022
//Purpose:
// A simple class for generating grades.

import java.util.Random;
import java.util.ArrayList;

class Grades{
  private static final Random rng = new Random();
  public static ArrayList<Double> getGrades(){
    final double MIN = 56.5;
    final double MAX = 100.00;
    int quantity = rng.nextInt(100) + 1;
    ArrayList<Double> grades = new ArrayList<Double>();
    for(int i = 0;i < quantity;i++){
      grades.add(((MAX-MIN) * rng.nextDouble()) + MIN);
    }
    return grades;
  }
}
