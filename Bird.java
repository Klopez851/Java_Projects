//Filename: Birds.java
//Author: Keidy Lopez
//Description:

public class Bird extends Animal {
    private boolean feathers=true;
    public String featherColor;
    private final String _class = "aves";

    //-----------------//
    //   CONSTRUCTOR   //
    //-----------------//

    public Bird(int id){
        super.setid(id);
    }

    //---------------//
    //   SETTER(S)   //
    //---------------//

    public void changeFeatherColor(String feather){
        featherColor = feather;
    }

    //---------------//
    //   GETTERS(S)  //
    //---------------//

    public String get_class(){return _class;}

    public String getFeatherColor(){return featherColor;}

    //------------------//
    //   OTHER METHODS  //
    //------------------//

    public boolean hasFeathers(){
        return feathers;
    }

    public void hasFeathers(boolean flag) {
        feathers = flag;
    }

    public String toString(){
        return String.format("%s, %s, %s %s, %s, %d/%d/%d",
                "Bird",name, getPhylum(),_class, String.valueOf(sex), birthday,birthmonth,birthyear);
    }
}

