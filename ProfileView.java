//Filename: ProfileView.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class ProfileView extends JFrame {
    private JLabel title1, title2, name, lastname,username,password;
    private JTextField userName, userLastname, userUsername,userPassword;
    private JButton done, logOut;
    private JPanel mainPanel;
    private User user1;

    public ProfileView(User user, ActionListener listener){
        //setting up window
        super("user's profile");
        mainPanel = new JPanel(new GridLayout(7,3));
        setSize(500,300);

        //getting user
        user1 = user;

        //setting up ui elements
        title1 = new JLabel("  "+user.getName()+"'s");
        title2 = new JLabel("profile");
        name = new JLabel("  Name: ");
        lastname = new JLabel("  Lastname:");
        username = new JLabel("  Username:");
        password = new JLabel("  Password:");

        userName = new JTextField(user.getName());
        userLastname = new JTextField(user.getLastname());
        userUsername = new JTextField(user.getUsername());
        userPassword = new JTextField(user.getPassword());

        done = new JButton("Done");
        logOut = new JButton("Log Out");
        done.addActionListener(listener);
        logOut.addActionListener(listener);

        //adding ui elements to main panel
        for(int i = 0; i <3 ; i++){mainPanel.add(new JLabel());}
        mainPanel.add(title1);
        mainPanel.add(title2);
        for (int i = 0; i < 1; i++){mainPanel.add(new JLabel());}
        mainPanel.add(name);
        mainPanel.add(userName);
        for (int i = 0; i < 1; i++){mainPanel.add(new JLabel());}

        mainPanel.add(lastname);
        mainPanel.add(userLastname);
        for (int i = 0; i < 1; i++){mainPanel.add(new JLabel());}

        mainPanel.add(username);
        mainPanel.add(userUsername);
        for (int i = 0; i < 1; i++){mainPanel.add(new JLabel());}
        mainPanel.add(password);
        mainPanel.add(userPassword);
        for (int i = 0; i < 2; i++){mainPanel.add(new JLabel());}
        mainPanel.add(done);
        mainPanel.add(logOut);

        //making frame visible
        add(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public String getName(){
        if(userName.getText() != user1.getName()){return userName.getText();}
        return null;
    }
    public String getLastname(){
        if(userLastname.getText() != user1.getLastname()){return userLastname.getText();}
        return null;
    }
    public String getUsername(){
        if(userUsername.getText() != user1.getUsername()){return userUsername.getText();}
        return null;
    }
    public String getPassword(){
        if(userPassword.getText() != user1.getPassword()){return userPassword.getText();}
        return null;
    }
}
