//Filename: ErrorMessage.java
//Author: Keidy Lopez
//Description:

import javax.swing.*;

public class ErrorMessage extends JFrame {
    private JLabel message;

    public ErrorMessage(String message){
        super("error");
        this.message = new JLabel(message);
        add(this.message);
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
