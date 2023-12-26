//Filename: LoginView.java
//Author: Keidy Lopez
//Description: login view for recipe project
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JLabel title1,title2,username,password;
    private JTextField usernameInput;
    private JPasswordField passwordInput;
    private JButton login,createNew;
    private JPanel mainPanel;

    public LoginView(ActionListener listener){
        //sets up the window
        super("loginWindow");
        setSize(500,300);
        mainPanel = new JPanel(new GridLayout(8,4));

        //sets up ui components
        title1 = new JLabel("Recipe");
        title2 = new JLabel("Book");
        username = new JLabel("Username:");
        password = new JLabel("Password:");

        usernameInput = new JTextField();

        passwordInput = new JPasswordField();

        login = new JButton("Login");
        login.addActionListener(listener);
        createNew = new JButton("New Account");
        createNew.addActionListener(listener);

        //adds components to main panel
        for(int i = 0;i<5;i++){mainPanel.add(new JLabel(""));}
        mainPanel.add(title1);
        mainPanel.add(title2);
        for(int i = 0;i<6;i++){mainPanel.add(new JLabel(""));}
        mainPanel.add(username);
        mainPanel.add(usernameInput);
        for(int i = 0;i<2;i++){mainPanel.add(new JLabel(""));}
        mainPanel.add(password);
        mainPanel.add(passwordInput);
        for(int i = 0;i<6;i++){mainPanel.add(new JLabel(""));}
        mainPanel.add(createNew);
        mainPanel.add(login);
        for(int i = 0;i<5;i++){mainPanel.add(new JLabel(""));}

        //adds main panel to frame and makes frame visible
        add(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
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
