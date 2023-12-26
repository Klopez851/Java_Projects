//Filename: ProfileViewController.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfileViewController implements ActionListener {
    private User user;
    private ProfileView view;
    private MainView mainPage;
    private LoginView loginPage;
    private LoginViewController loginController;

    public ProfileViewController(User user){
        this.user = user;
        view= new ProfileView(user, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            switch (e.getActionCommand()){//e.getActionCommand() returns the string associated with the action that
                case "Done":              // triggered the event.
                    if(view.getName() != null) {
                        user.setName(view.getName());
                        User.writeCVS("Users");
                    }
                    if(view.getLastname() != null) {
                        user.setLastname(view.getLastname());
                        User.writeCVS("Users");
                    }
                    if(view.getUsername() != null){
                        user.setUsername(view.getUsername());
                        User.writeCVS("Users");
                    }
                    if(view.getPassword() != null){
                        user.setPassword(view.getPassword());
                        User.writeCVS("Users");
                    }
                    view.dispose();
                    break;
                case "Log Out":
                    //dispose of main page
                    loginPage = new LoginView(loginController);
                    break;
                default:
                    System.out.print("ERROR button not found (ProfileViewController)");
                    view.dispose();

            }
        }


        }
    }
