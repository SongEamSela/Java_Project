package TP13_SongeamSela.Task1;

public class Circle extends Form{
    private double r;

    public double surface (){
        return Math.PI * Math.pow(r ,2);
    }
    public double perimeter(){
        return 2* Math.PI * r;
    }

}
