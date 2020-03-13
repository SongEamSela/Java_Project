package TP14_SongeamSela.Task3_Drawable_Interface;

import TP14_SongeamSela.Task2_Interrogator.Clock;
import TP14_SongeamSela.Task2_Interrogator.Talkative;

import java.awt.*;

public class CuckooClock extends Clock
        implements Talkative, Drawable {
    protected int hour;

    public CuckooClock(int hour) {
        setHour(hour);
    }

    public void setHour(int hour) {
        if(hour < 1) this.hour = 1;
        else this.hour = Math.min(hour, 12);
    }

    @Override
    public void talk() {
        for(int i=1;i<=hour;i++) {
            System.out.print("Cuckoo ");
        }
        System.out.println();
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(20,80,50,50);
    }

    @Override
    public void erase(Graphics g) {
        g.clearRect(20,80,50,50);
    }
}
