package TP12_SongeamSela;

import TP8_SongeamSela.Ex1.Point;

public class Geometry {
    Point p1,p2;

    public Geometry(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public double distance(){
        return Math.sqrt(Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2));
    }
    public Line BuildLine(){
        return new Line(p1,p2);
    }
    public void angle(Line l1, Line l2){
        double tanQ= (l2.a-l1.a)/(1+(l1.a*l2.a));
        double angle1 = Math.atan(tanQ);
        double angle2 = 180 - angle1;
        System.out.println("2 angle between this 2 line are :\n" +
                "Angle1 = "+angle1+"\n" +
                "Angle 2 = "+angle2);
    }

    public static void main(String[] args) {
        Point p1 = new Point(-2,1);
        Point p2= new Point(2,3);
        Point p3 = new Point(2,3);
        Point p4= new Point(-2,-4);
        Geometry g1 = new Geometry(p1,p2);
        Geometry g2 = new Geometry(p3,p4);

        g2.angle(g1.BuildLine(),g2.BuildLine());


    }

}
