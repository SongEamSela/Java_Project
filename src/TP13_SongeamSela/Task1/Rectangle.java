package TP13_SongeamSela.Task1;

public class Rectangle extends Form{
    private double length, height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double surface(){
        return length * height;
    }

    public double perimeter(){
        return (length + height)* 2;
    }
}
