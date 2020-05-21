package TP18_SongeamSela.Ex6_LoginForm;

import javax.swing.*;
import java.awt.*;

public class FailedGUI extends JFrame {
    public FailedGUI(){
        super(" Failed Log in! ");
        JLabel lbl = new JLabel("Hi", JLabel.CENTER);
        lbl.setText("Incorrect username or password!");
        Container pane = getContentPane();
        pane.add(lbl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
