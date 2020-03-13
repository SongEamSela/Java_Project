package TP12_SongeamSela;

import TP8_SongeamSela.Ex1.Point;

public class Line extends Shape{
    Point p1,p2;
    double a,b;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        a = (double) (p2.y-p1.y)/(p2.x-p1.x);
        b = p1.y - (a*p1.x);
    }

    @Override
    public void display() {
        //equation y=ax+b
        System.out.println("the equation of the line is y = "+a+"x"+"+"+b);
    }

    public static void main(String[] args) {
        Point p = new Point(2,30);
        Point p1= new Point(4,6);
        Line l1 = new Line(p,p1);
        l1.display();

    }
}
