//Filename: User.java
//Author: Keidy Lopez
//Description: User class for Recipe project

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class User {
    //static before this variable means that this variable is shared by all user objects
    private static ArrayList<User> userList = new ArrayList<User>();
    private String name, lastname, username, password;

    //-----------------//
    //   CONSTRUCTOR   //
    //-----------------//

    public User(String name, String lastname, String username, String password){
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.password=password;
    }

    //-------------//
    //   GETTERS   //
    //-------------//

    public String getName(){
        if(!name.isEmpty())return name;
        return "";
    }

    public String getLastname(){
        if(!lastname.isEmpty())return lastname;
        return "";
    }

    public String getUsername(){
        if(!username.isEmpty())return username;
        return "";
    }

    public String getPassword(){
        if(!password.isEmpty())return password;
        return "";
    }

    //-------------//
    //   SETTERS   //
    //-------------//

    public void setName(String newName){
        name = newName;
    }

    public void setLastname(String newLastname){
        lastname = newLastname;
    }

    public void setUsername(String newUsername){
        username = newUsername;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }

    //-------------------//
    //   OTHER METHODS   //
    //-------------------//

    public String toString(){
        return String.format("%s,%s,%s,%s\n",name, lastname,username,password);
    }

    //--------------------//
    //   STATIC METHODS   //
    //--------------------//

    //creates new users and adds them to the user list
    public static User newUser(String name, String lastname, String username, String password){
        User user = new User(name, lastname, username, password);
        userList.add(user);
        return user;
    }

    //writes list of users to a file as a csv
    public static void writeCVS(String filename){
        File writeTo = new File(filename);
        PrintStream fileWriter = null;
        try {
            if(writeTo.exists()) {
                fileWriter = new PrintStream(writeTo);
                fileWriter.print("Name, Lastname, Username, Password\n");
                for (User user : userList) {
                    fileWriter.print(user);
                }
            }
            fileWriter.close();
        }catch (IOException exception){
            System.out.print("error writing file");
            exception.printStackTrace();
        }
    }

    public static void readCSV(String filename){
        userList.clear();
        File readFrom = new File(filename);
        try{
            Scanner fileReader = new Scanner(readFrom);
            String[] header = new String[]{fileReader.nextLine()};
            while(fileReader.hasNextLine()){
                String info = fileReader.nextLine();
                String[] infoSplit = info.split(",");
                String name =infoSplit[0].trim();
                String lastname = infoSplit[1].trim();
                String username =infoSplit[2].trim();
                String password =infoSplit[3].replace("\n","").trim();
                newUser(name,lastname,username,password);
            }
            fileReader.close();
        }catch (IOException exception){
            System.out.print("error reading file");
            exception.printStackTrace();
        }
    }


    public static User findUser(String username, String password){
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username) && userList.get(i).getPassword().equals(password)){
                return userList.get(i);
            }
        }
        return null;
    }

}
