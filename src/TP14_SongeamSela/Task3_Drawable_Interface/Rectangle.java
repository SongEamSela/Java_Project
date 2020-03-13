package TP14_SongeamSela.Task3_Drawable_Interface;

public class Rectangle extends Form {
    double length,height;

    @Override
    double Surface() {
        return length * height;
    }

    @Override
    double perimeter() {
        return (length + height)* 2;
    }
}
