package TP18_SongeamSela.Ex6_LoginForm;

import javax.swing.*;
import java.awt.*;

public class LoggedInGUI extends JFrame {
    public LoggedInGUI(String name){
        super(" Welcome !! ");
        JLabel lbl = new JLabel("Hi", JLabel.CENTER);
        lbl.setText("Welcome "+ name+ " ! ");
        Container pane = getContentPane();
        pane.add(lbl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
