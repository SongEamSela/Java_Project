package TP_Note_SongeamSela.Circle_class;

public class Point {
    int x,y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(int _x){
        x=_x;
        y=0;
    }
    public Point(int _x, int _y){
        x=_x;
        y=_y;
    }
    public double Distance(Point other){
        double distance=0;
        distance= Math.sqrt(Math.pow(other.x - x,2) + Math.pow(other.y - y,2));
        return distance;
    }
}
