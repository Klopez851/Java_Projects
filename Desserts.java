//Filename: Desserts.java
//Author: Keidy Lopez
//Description: dessert class for recipe project

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Desserts extends JPanel {
    private static ArrayList<String> recipeTitles = new ArrayList<String>();
    private DefaultListModel<String> listModel;
    private JList<String> list;

    public Desserts(ListSelectionListener listener) {
        listModel = new DefaultListModel<>();
        recipeTitles.add("ur mom");
        recipeTitles.add("ur dad");
        for (int i = 0; i < recipeTitles.size(); i++) {
            listModel.addElement(recipeTitles.get(i));
        }
        list = new JList<>();
        list.setModel(listModel);
        //makes it so that the user can only select 1 option at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(listener);

        add(list);
    }
    public void addRecipeTitle(String title){
        recipeTitles.add(title);
        update(this.getGraphics());
    }

    public static void readTitleFile(String filename) {
        recipeTitles.clear();
        File readFrom = new File(filename);
        try {
            Scanner fileReader = new Scanner(readFrom);
            while (fileReader.hasNextLine()) {
                String title = fileReader.nextLine();
                recipeTitles.add(title);
            }
            fileReader.close();
        } catch (IOException exception) {
            System.out.print("error reading file");
            exception.printStackTrace();
        }
    }

    public static void updateTitleFile(String filename){
        File writeTo = new File(filename);
        PrintStream fileWriter = null;
        try {
            if(writeTo.exists()) {
                fileWriter = new PrintStream(writeTo);
                for (String title : recipeTitles) {
                    fileWriter.print(title);
                }
            }
            fileWriter.close();
        }catch (IOException exception){
            System.out.print("error writing file");
            exception.printStackTrace();
        }
    }

}
