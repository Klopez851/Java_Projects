//Filename: MainViewController.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainViewController implements ActionListener {
    private MainView mainPage;
    private ProfileViewController profileView;
    private User user;
    private String recipeTitle;
    private Desserts dessertList;

    public MainViewController(User user){
        this.user = user;
        mainPage = new MainView(user, this);
    }

    //add a type fielded to the recipe class
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            switch (e.getActionCommand()){//e.getActionCommand() returns the string associated with the action that
                case "Add Dessert":       // triggered the event.
                    //make sure to not save the recipe there is no recipe title
                    System.out.print("dessert");
                    break;
//                case "Add Main Dish":
//                    //recipeView= new AddRecipeView(this);
//                    System.out.print("main dish");
//                    break;
//                case "Add Breakfast":
//                    //recipeView= new AddRecipeView(this);
//                    System.out.print("breakfast");
//                    break;
//                case "Add Snack":
//                    //recipeView= new AddRecipeView(this);
//                    System.out.print("snack");
//                    break;
                case "Profile":
                    profileView = new ProfileViewController(user);
                    break;
                default:
                    mainPage.dispose();
                    System.out.print("ERROR: button not found main view controller");
            }


            }
        }
    }

