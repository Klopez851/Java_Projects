//Filename: Animal.java
//Author: Keidy Lopez
//Description:

public class Animal {
   private int id;
   private String phylum = "chordata";
   public String name;
   public char sex;
   public int birthyear;
   public int birthmonth;
   public int birthday;

   //-----------------//
   //   CONSTRUCTOR   //
   //-----------------//

   public Animal(){}

   //---------------//
   //   SETTER(S)   //
   //---------------//

   public void setid(int id){this.id = id;}

   //---------------//
   //   GETTERS(S)  //
   //---------------//

   public int getid(){return id;}

   public String getPhylum(){return phylum;}

   //------------------//
   //   OTHER METHODS  //
   //------------------//

   public String toString(){
      return String.format("%d, %s, %s, %s, %d/%d/%d", id, name, phylum,String.valueOf(sex), birthday,birthmonth,
              birthyear);
   }

}
