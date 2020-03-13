package TP_Note_SongeamSela.Circle_class;

public class Circle {
    private Point center;
    int R;

    public Circle(Point _center, int r){
        center = _center;
        R = r;
    }
    public double length(){
        return 2*Math.PI*R;
    }
    public boolean equals(Circle c){
        if (R == c.R){
            return true;
        }
        else
            return false;
    }
    public boolean greater(Circle c){
        if (length() > c.length()){
            return true;
        }
        else
            return false;
    }
    public void inc(int n){
        R = R+n;
    }
    public void dec(int n){
        if (R < n ){
            System.out.println("Decrease size can't be bigger than radius size");
        }
        else
            R = R - n;
    }

    public static void main(String[] args) {
        Point p1= new Point(0,3);
        Point p2= new Point(4,5);
        Point p3= new Point(7,5);
        Circle c1 = new Circle(p1,10);
        Circle c2 = new Circle(p2,10);
        Circle c3 = new Circle(p3,15);
        if (p1.equals(p2)){
            System.out.println("c1 and c2 circle is equal");
        }
        else
            System.out.println("c1 and c2 circle is not equal");

        if (c1.greater(c3)){
            System.out.println("c1 is greater than c3");
        }
        else
            System.out.println("c1 is not greater than c3");


    }
}
