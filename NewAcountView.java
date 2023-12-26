//Filename: NewAcountView.java
//Author: Keidy Lopez
//Description: create new user view for recipe project
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewAcountView extends JFrame{
    private JLabel title1, title2,name,lastname,username,password;
    private JTextField nameInput,lastnameInput,usernameInput;
    private JPasswordField passwordInput;
    private JButton submit;
    private JPanel mainPanel;

    public NewAcountView(ActionListener listener){
        //sets up window
        super("New Account");
        setSize(500,300);
        mainPanel = new JPanel(new GridLayout(10,4));

        //sets up ui elements
        title1 = new JLabel("Create");
        title2 = new JLabel("Account");
        name= new JLabel("Name:");
        lastname = new JLabel("Lastname:");
        username= new JLabel("Username:");
        password = new JLabel("Password:");
        nameInput = new JTextField();
        lastnameInput = new JTextField();
        usernameInput = new JTextField();
        passwordInput = new JPasswordField();
        submit =new JButton("Create New");
        submit.addActionListener(listener);

        //adds ui elements to main panel
        for(int i = 0;i<5;i++){mainPanel.add(new JLabel());}
        mainPanel.add(title1);
        mainPanel.add(title2);
        for(int i = 0;i<6;i++){mainPanel.add(new JLabel());}
        mainPanel.add(name);
        mainPanel.add(nameInput);
        for(int i = 0;i<2;i++){mainPanel.add(new JLabel());}
        mainPanel.add(lastname);
        mainPanel.add(lastnameInput);
        for(int i = 0;i<2;i++){mainPanel.add(new JLabel());}
        mainPanel.add(username);
        mainPanel.add(usernameInput);
        for(int i = 0;i<2;i++){mainPanel.add(new JLabel());}
        mainPanel.add(password);
        mainPanel.add(passwordInput);
        for(int i = 0;i<6;i++){mainPanel.add(new JLabel());}
        mainPanel.add(submit);
        for(int i = 0;i<6;i++){mainPanel.add(new JLabel());}

        //adds panel to frame and makes it visible
        add(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public String getName(){
        if(!(nameInput.getText().isEmpty())){
            return nameInput.getText();
        }
        return "";
    }

    public String getLastname(){
        if(!(lastnameInput.getText().isEmpty())){
            return lastnameInput.getText();
        }
        return "";
    }

    public String getUsername(){
        if(!(usernameInput.getText().isEmpty())){
            return usernameInput.getText();
        }
        return "";
    }

    public String getPassword(){
        if(!(passwordInput.getPassword().toString().isEmpty())){
            return String.valueOf(passwordInput.getPassword());
        }
        return "";
    }
}
