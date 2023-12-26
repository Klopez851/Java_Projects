//Filename: SortedList.java
//Author: Keidy Lopez
//Description:

import java.util.ArrayList;

public class SortedList {
    private ArrayList<Integer> intAry;

    public SortedList(ArrayList<Integer> intAry){
        this.intAry=intAry;
    }

    //getters
    public int getValueAtIndex(int index){
        return intAry.get(index);
    }

    //other methods
    public void add(int value){
        intAry.add(value);
    }

    public int size(){
        return intAry.size();
    }
}
