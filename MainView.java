//Filename: MainView.java
//Author: Keidy Lopez
//Description: main view of recipe project

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JLabel title1, title2, dessertLabel, mainDishLabel,breakfastLabel,snackLabel;
    private JButton addDessert,addMainDish,addBreakfast,addSnack,profile;
    private JPanel mainPanel;
    private Desserts dessertsList;

    public MainView(User user, ActionListener listener){
        //setting up window
        super("MainView");
        mainPanel = new JPanel(new GridLayout(6,6));
        setSize(800,350);

        // setting up ui elements
        title1 = new JLabel(user.getName()+"'s");
        title2 = new JLabel("Recipes");
        dessertLabel = new JLabel("Desserts");
        mainDishLabel = new JLabel("Main Dish");
        breakfastLabel = new JLabel("Breakfast");
        snackLabel = new JLabel("Snacks");

        addDessert = new JButton("Add Dessert");
        addMainDish = new JButton("Add Main Dish");
        addBreakfast = new JButton("Add Breakfast");
        addSnack = new JButton("Add Snack");
        profile = new JButton("Profile");
        addDessert.addActionListener(listener);
        addMainDish.addActionListener(listener);
        addBreakfast.addActionListener(listener);
        addSnack.addActionListener(listener);
        profile.addActionListener(listener);

        dessertsList = new Desserts(new DessertController());

        //add everything to the panel
        for(int i = 0; i<5;i++)mainPanel.add(new JLabel());
        mainPanel.add(profile);
        for (int i = 0; i <2; i++)mainPanel.add(new JLabel());
        mainPanel.add(title1);
        mainPanel.add(title2);
        for(int i = 0; i<3;i++)mainPanel.add(new JLabel());
        mainPanel.add(new JLabel("Desserts"));
        mainPanel.add(new JLabel("Main Dish"));
        mainPanel.add(new JLabel("Breakfast"));
        mainPanel.add(new JLabel("Snacks"));
        for(int i = 0; i<2;i++)mainPanel.add(new JLabel());
        mainPanel.add(addDessert);
        mainPanel.add(addMainDish);
        mainPanel.add(addBreakfast);
        mainPanel.add(addSnack);
        for(int i = 0; i<2;i++)mainPanel.add(new JLabel());
        mainPanel.add(dessertsList);
        for(int i = 0; i<3;i++)mainPanel.add(new JLabel("lists"));
        for(int i = 0; i<7;i++)mainPanel.add(new JLabel());

        //make window visible
        add(mainPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void updateWindow(){
        update(this.getGraphics());
    }
}
