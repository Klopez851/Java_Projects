//Filename: AddRecipeViewController.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AddRecipeViewController implements ActionListener {
    private AddRecipeView view;
    private String type;
    private Desserts dessertList;
    private User user;
    private File file;


    public AddRecipeViewController(String type, User user){
        view = new AddRecipeView(this);
        this.type = type;
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton source = (JButton) e.getSource();
            if (source.getText().equals("Add")) {
                switch(type){
                    case "desserts":
                        dessertList.addRecipeTitle(view.getRecipeTitle());
//                        file = new File("Recipes");
//                        String directory = (file.getParent()+"Recipes/"+user.getUsername()+"/dessert/dessertTitle");
//                        Desserts.updateTitleFile(directory);
//                        //add recipe
                        break;
                }
            }
        }
    }
}
