//Filename: LoginViewController.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginViewController implements ActionListener {
    private LoginView loginPage;
    private MainViewController mainPage;
    private User user;
    private NewAccountViewController newAccountPage;
    private ErrorMessage errorMessage;

    public LoginViewController(){
        //setting up view
        User.readCSV("Users");
        loginPage = new LoginView(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton source = (JButton) e.getSource();
            if (source.getText().equals("Login")){
                user = User.findUser(loginPage.getUsername(), loginPage.getPassword());
                if(user!=null){
                   mainPage = new MainViewController(user);
                   loginPage.dispose();
                }
                else{errorMessage = new ErrorMessage("User not found");}
            }
            else if(source.getText().equals("New Account")){
                newAccountPage = new NewAccountViewController();

            }
        }

    }
}
