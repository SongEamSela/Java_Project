package TP18_SongeamSela.Ex6_LoginForm;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener{
    JPanel panel;
    JLabel user_label, password_label;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, close;
    LoginForm() {
        super("log In form");
        // Username Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        // Password Label
        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();
        // Submit
        submit = new JButton("SUBMIT");
        //close button
        close = new JButton("Close");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(submit);
        panel.add(close);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adding the listeners to components..
        submit.addActionListener(this);
        close.addActionListener(e -> stop());

        add(panel, BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }

    public void stop(){
        System.exit(0);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("Admin") && password.trim().equals("admin")) {
            new LoggedInGUI("Admin");
        } else {
            new FailedGUI();
        }
    }




}
