//Filename: Reptile.java
//Author: Keidy Lopez
//Description:

public class Reptile extends Animal{
   public boolean scales = true;
   private final String _class = "reptilia";
   private int optimalBirthingTemperature;

   //-----------------//
   //   CONSTRUCTOR   //
   //-----------------//

   public Reptile(int id){
      super.setid(id);
   }

   //---------------//
   //   SETTER(S)   //
   //---------------//

   public void changeTemp(int temp){
      optimalBirthingTemperature = temp;
   }
   //---------------//
   //   GETTERS(S)  //
   //---------------//

   public String get_class(){return _class;}

   public int getTemp(){return optimalBirthingTemperature;}

   //------------------//
   //   OTHER METHODS  //
   //------------------//

   public boolean hasScales(){
      return scales;
   }

   public void hasScales(boolean flag) {
      scales = flag;
   }

   public String toString(){
      return String.format("%s, %s, %s %s, %s, %d/%d/%d",
              "Reptile",name, getPhylum(),_class, String.valueOf(sex), birthday,birthmonth,birthyear);
   }
}

