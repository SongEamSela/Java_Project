package TP18_SongeamSela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeLap extends JFrame implements Runnable{
    JLabel time;
    int sec = 0;
    Thread thread;
    public static boolean isstop = false;
    public TimeLap(){
        super("Time Lap");

        Container pane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        thread = new Thread(this);
        time = new JLabel("00:00:00");
        pane.add(time);

        JButton button1 = new JButton("Start");
        button1.addActionListener((e -> {
           thread.start();
        }));
        pane.add(button1);

        JButton button2 = new JButton("Stop");
        button2.addActionListener(e -> stop());
        pane.add(button2);

        setLayout(new FlowLayout(FlowLayout.RIGHT));


        setSize(500,400);
        setVisible(true);
    }

    public void stop(){
        isstop = true;
    }

    @Override
    public void run() {
        while(!isstop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { e.printStackTrace(); }
            sec++;
            time.setText(String.format("%02d:%02d:%02d", ((sec / 60) / 60), (sec / 60) % 60, sec%60));
        }

    }

    public static void main(String[] args) {
        new TimeLap();
    }
}