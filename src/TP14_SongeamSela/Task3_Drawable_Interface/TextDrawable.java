package TP14_SongeamSela.Task3_Drawable_Interface;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TextDrawable implements Drawable {

    String txt;
    int x,y;
    Font f;
    public TextDrawable(String txt, int x, int y) {
        this.txt = txt;
        this.x = x;
        this.y = y;
        f = new Font("Khmer OS",Font.PLAIN,20);
    }

    @Override
    public void draw(Graphics g) {
        Font old = g.getFont();
        g.setFont(f);
        g.drawString(txt, x, y);
        g.setFont(old);
    }

    @Override
    public void erase(Graphics g) {
        Font old = g.getFont();
        g.setFont(f);
        FontMetrics fm = g.getFontMetrics();
        Rectangle2D r2d = fm.getStringBounds(txt,g);
        g.clearRect(x,y,
                (int)r2d.getWidth(),
                (int)r2d.getHeight());
        g.setFont(old);
    }
}
