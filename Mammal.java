//Filename: Mammal.java
//Author: Keidy Lopez
//Description:

public class Mammal extends Animal{
    public String furColor;
    private final String _class = "mamalia";
    private boolean mammaryGlands = true;

    //-----------------//
    //   CONSTRUCTOR   //
    //-----------------//

    public Mammal(int id){
        super.setid(id);
    }

    //---------------//
    //   SETTER(S)   //
    //---------------//

    public void changeFurColor(String fur){
        this.furColor = fur;
    }

    //---------------//
    //   GETTERS(S)  //
    //---------------//

    public String get_class(){return _class;}

    //------------------//
    //   OTHER METHODS  //
    //------------------//

    public boolean hasMammaryGlands(){
        return mammaryGlands;
    }

    public void hasMammaryGlands(boolean flag) {
        mammaryGlands = flag;
    }

    public String toString(){
        return String.format("%s, %s, %s %s, %s, %d/%d/%d",
                "Mammal",name, getPhylum(),_class, String.valueOf(sex), birthday,birthmonth,birthyear);
    }
}
