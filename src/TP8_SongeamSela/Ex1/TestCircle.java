package TP8_SongeamSela.Ex1;

public class TestCircle {
    public static void main(String[] args) {
        Point p1= new Point(0,3);
        Point p2= new Point(4,5);
        Circle c1 = new Circle(p1,p2);
        System.out.println("Radius of the circle is : " + c1.radius());
        System.out.println("Length of the circle is : "+ c1.length());
        System.out.println("Surface of the circle is "+ c1.Surface());
    }
}
