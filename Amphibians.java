//Filename: Amphibians.java
//Author: Keidy Lopez
//Description:

public class Amphibians extends Animal {
    private boolean cutaneousRespiration = true;
    private final String _class = "amphibia";

    //-----------------//
    //   CONSTRUCTOR   //
    //-----------------//

    public Amphibians(int id){
        super.setid(id);
    }

    //---------------//
    //   GETTERS(S)  //
    //---------------//

    public String get_class(){return _class;}

    //------------------//
    //   OTHER METHODS  //
    //------------------//

    public boolean hasCutaneousRespiration(){
        return cutaneousRespiration;
    }

    public void hasCutaneousRespiration(boolean flag) {
        cutaneousRespiration = flag;
    }

    public String toString(){
        return String.format("%s, %s, %s %s, %s, %d/%d/%d"
                ,"Amphibian",name, getPhylum(),_class, String.valueOf(sex), birthday,birthmonth,birthyear);
    }
}

