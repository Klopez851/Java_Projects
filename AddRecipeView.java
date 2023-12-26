//Filename: AddRecipeView.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddRecipeView extends JFrame {
    private JLabel title1, title2, recipeTitle, recipeText;
    private JTextField recipeTitleInput;
    private JTextArea recipeTextInput;
    private JScrollPane scrollPane;
    private JPanel mainPanel;
    private JButton submit;

    public AddRecipeView(ActionListener listener) {
        //setting up window
        super("add recipe");
        mainPanel = new JPanel(new GridLayout(4, 4));
        setSize(500,300);

        //setting up ui elements
        title1 = new JLabel("add");
        title2 = new JLabel("recipe");
        recipeTitle = new JLabel("Recipe Name:");
        recipeText = new JLabel("Recipe:");
        recipeTitleInput = new JTextField();
        recipeTextInput = new JTextArea();
        scrollPane = new JScrollPane(recipeTextInput);
        submit = new JButton("ADD");
        submit.addActionListener(listener);

        //add things to the panel
        for (int i = 0; i < 1; i++) mainPanel.add(new JLabel());
        mainPanel.add(title1);
        mainPanel.add(title2);
        for (int i = 0; i < 2; i++) mainPanel.add(new JLabel());
        mainPanel.add(recipeTitle);
        mainPanel.add(recipeTitleInput);
        for (int i = 0; i < 2; i++) mainPanel.add(new JLabel());
        mainPanel.add(recipeText);
        mainPanel.add(scrollPane);
        for (int i = 0; i < 2; i++) mainPanel.add(new JLabel());
        mainPanel.add(submit);
        for (int i = 0; i < 2; i++)mainPanel.add(new JLabel());

        //making window visible
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(mainPanel);
        setVisible(true);

    }

        public String getRecipeTitle(){
            if(!recipeTitleInput.getText().isEmpty())return recipeTitleInput.getText();
            return "";
        }

        public String getRecipe(){
            if (!recipeTextInput.getText().isEmpty())return recipeTextInput.getText();
            return "";
        }
}
