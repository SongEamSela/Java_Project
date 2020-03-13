package TP8_SongeamSela.Ex1;

public class Circle {
    private Point center,p;

    public Circle(Point _center, Point _p){
        center = _center;
        p = _p;
    }
    public double radius(){
        return center.Distance(p);
    }
    public double length(){
        return 2*Math.PI*radius();
    }
    public double Surface(){
        return Math.PI * Math.pow(radius(),2);
    }
}
