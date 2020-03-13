package TP14_SongeamSela.Task3_Drawable_Interface;

import java.awt.*;

public class RectangleDrawable extends Rectangle implements Drawable ,Comparable{
    Color c;
    @Override
    public void draw(Graphics g) {
        g.drawRect((int)x, (int)y , (int)length, (int)height);
    }

    @Override
    public void erase(Graphics g) {
        g.clearRect((int)x, (int)y, (int)length, (int)height);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Rectangle){
            if (Surface() ==((Rectangle) o).Surface()){
                return 0;
            }
            else if (Surface() >((Rectangle) o).Surface()){
                return 1;
            }
            else
                return -1;
        }
        else{
            System.out.println("Object can't Compared !!");
            return 10;
        }
    }

}
