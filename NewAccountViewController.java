//Filename: NewAccountViewController.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAccountViewController implements ActionListener {
    private NewAcountView view;
    private ErrorMessage errorMessage;

    public NewAccountViewController(){
        view = new NewAcountView(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton source = (JButton) e.getSource();
            if (source.getText().equals("Create New")) {
                if(!(view.getName().isEmpty()||view.getLastname().isEmpty()||
                        view.getUsername().isEmpty()||view.getPassword().isEmpty())){//if any of these is empty = true + negation
                    User.newUser(view.getName(), view.getLastname(), view.getUsername(), view.getPassword());
                    User.writeCVS("Users");
                    view.dispose();
                }
                else errorMessage = new ErrorMessage("Please fill out all the fields");
            }
        }
    }

}
