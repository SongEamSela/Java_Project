package TP13_SongeamSela.Task1;

public class Triangle extends Form{
    private double x1,y1,x2,y2;

    public Triangle(double x, double y,double x1, double y1, double x2, double y2) {
        this.x  = x;
        this.y  = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public Triangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public double surface (){
        //s=(a+b+c)/2
        //area = √(s(s-a)(s-b)(s-c))
        double s = (distance(x,y,x1,y1) + distance(x1,y1,x2,y2) + distance(x2,y2,x,y)) / 2;
        return Math.sqrt(s * (s - (distance(x,y,x1,y1)) * (s - distance(x1,y1,x2,y2) * (s - distance(x2,y2,x,y)))));
    }

    public double perimeter (){
        // perimeter = a+b+c
        return distance(x,y,x1,y1) + distance(x1,y1,x2,y2) + distance(x2,y2,x,y);
    }
}
