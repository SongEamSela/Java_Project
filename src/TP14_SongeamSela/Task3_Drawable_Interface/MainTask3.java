package TP14_SongeamSela.Task3_Drawable_Interface;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MainTask3 extends JFrame {
    public MainTask3() throws HeadlessException {
        super("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainTask3();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ArrayList<Drawable> lst = new ArrayList<>();
        lst.add(new CuckooClock(5));
        lst.add(new TextDrawable("អរុណសួស្តី",50,150));
        for(Drawable d:lst) d.draw(g);
        //CuckooClock
        //TextDrawable;
        //RectangleDrawable
        g.setColor(Color.RED);
        g.drawRect(10,70,100,50);
        try {

            Image img = ImageIO.read(new URL("https://royaldesign.com/images/f47948e4-3bf9-4db8-96d4-168cbaa4ea11?w=800&quality=80"));
            g.drawImage(img,80,170,this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
