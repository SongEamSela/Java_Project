package TP18_SongeamSela;

import javax.swing.*;
import java.awt.*;

public class Ex4_GUI extends JFrame {
    private JLabel lbl;
    public Ex4_GUI(){
        super("My First GUI");
        lbl = new JLabel("Hi", JLabel.CENTER);
        lbl.setText("Hello GUI");
        Container pane = getContentPane();
        pane.add(lbl);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex4_GUI();
    }

}
