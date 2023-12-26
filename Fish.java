//Filename: Fish.java
//Author: Keidy Lopez
//Description:

public class Fish extends Animal {
    private boolean dorsalFin = true;
    private boolean ventralFins = true;

    //-----------------//
    //   CONSTRUCTOR   //
    //-----------------//

    public Fish(int id){
        super.setid(id);
    }

    //------------------//
    //   OTHER METHODS  //
    //------------------//

    public boolean haDorsalFin(){
        return dorsalFin;
    }

    public void hasDorsalFins(boolean flag) {
        dorsalFin = flag;
    }

    public boolean haVentralFin(){
        return ventralFins;
    }

    public void hasVentralFins(boolean flag) {
        ventralFins = flag;
    }

    public String toString(){
        return String.format("%s, %s, %s, %s, %d/%d/%d",
                "Fish",name, getPhylum(), String.valueOf(sex), birthday,birthmonth,birthyear);
    }
}

