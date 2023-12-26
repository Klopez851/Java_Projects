//Filename: DriverProgram.java
//Author: Keidy Lopez
//Description: driver program for all the classes in Lab8

//couldn't figure out how to share one id variable with all the subclasses when its private (specified in UML diagram)

public class DriverProgram {
    public static void main(String[] args) {

        //testing Animal
        System.out.println("Testing Animal superclass");
        Animal animal = new Animal();
        animal.name = "name";
        animal.sex= 'F';
        animal.birthday = 11;
        animal.birthmonth = 11;
        animal.birthyear = 2011;
        animal.setid(1);
        System.out.println(animal.getid());
        System.out.println(animal.getPhylum());
        System.out.println(animal);

        //testing Mammal
        System.out.println("\nTesting Mammal subclass");
        Mammal animal1 = new Mammal(1);
        animal1.name = "name";
        animal1.sex= 'F';
        animal1.birthday = 11;
        animal1.birthmonth = 11;
        animal1.birthyear = 2011;
        String color = "blue";
        animal1.changeFurColor(color);
        System.out.println(animal1.get_class());
        System.out.println(animal1.hasMammaryGlands());
        animal1.hasMammaryGlands(false);
        System.out.println(animal1.hasMammaryGlands());
        System.out.println(animal1.furColor);
        System.out.println(animal1.getid());
        System.out.println(animal1.getPhylum());
        System.out.println(animal1);

        //Testing Reptile
        System.out.println("\nTesting Reptile subclass");
        Reptile animal2 = new Reptile(2);
        animal2.name = "name";
        animal2.sex= 'F';
        animal2.birthday = 11;
        animal2.birthmonth = 11;
        animal2.birthyear = 2011;
        System.out.println(animal2.get_class());
        System.out.println(animal2.hasScales());
        int temp = 10;
        animal2.changeTemp(temp);
        System.out.println(animal2.getTemp());
        System.out.println(animal2.hasScales());
        animal2.hasScales(false);
        System.out.println(animal2.hasScales());
        System.out.println(animal2.getid());
        System.out.println(animal2.getPhylum());
        System.out.println(animal2);

        //Testing Fish
        System.out.println("\nTesting Fish subclass");
        Fish animal3 = new Fish(3);
        animal3.name = "name";
        animal3.sex= 'F';
        animal3.birthday = 11;
        animal3.birthmonth = 11;
        animal3.birthyear = 2011;
        System.out.println(animal3.haDorsalFin());
        System.out.println(animal3.haVentralFin());
        animal3.hasDorsalFins(false);
        animal3.hasVentralFins(false);
        System.out.println(animal3.haDorsalFin());
        System.out.println(animal3.haVentralFin());
        System.out.println(animal3.getid());
        System.out.println(animal3.getPhylum());
        System.out.println(animal3);

        //Testing Bird
        System.out.println("\nTesting Bird subclass");
        Bird animal4 = new Bird(4);
        animal4.name = "name";
        animal4.sex= 'F';
        animal4.birthday = 11;
        animal4.birthmonth = 11;
        animal4.birthyear = 2011;
        System.out.println(animal4.get_class());
        String feathers = "blue";
        animal4.changeFeatherColor(feathers);
        System.out.println(animal4.getFeatherColor());
        System.out.println(animal4.hasFeathers());
        animal4.hasFeathers(false);
        System.out.println(animal4.hasFeathers());
        System.out.println(animal4.getid());
        System.out.println(animal4.getPhylum());
        System.out.println(animal4);

        //Testing Amphibians
        System.out.println("\nTesting Bird subclass");
        Amphibians animal5 = new Amphibians(5);
        animal5.name = "name";
        animal5.sex= 'F';
        animal5.birthday = 11;
        animal5.birthmonth = 11;
        animal5.birthyear = 2011;
        System.out.println(animal5.get_class());
        System.out.println(animal5.hasCutaneousRespiration());
        animal5.hasCutaneousRespiration(false);
        System.out.println(animal5.hasCutaneousRespiration());
        System.out.println(animal5);




    }
}
