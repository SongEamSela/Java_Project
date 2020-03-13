package TP4_SongeamSela;

import java.util.Scanner;

public class rectangle {
    private int  width,height;
    rectangle(int width,int height){
        this.height=height;
        this.width=width;
    }
    public int perimeter(){
        return (this.width+this.height)*2;
    }
    public int surface(){
        return width*height;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w,h;
        System.out.printf("Input Width: ");
        w=Integer.parseInt(sc.nextLine());

        System.out.printf("Input Height: ");
        h=Integer.parseInt(sc.nextLine());

        rectangle r= new rectangle(w,h);
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Surface : " + r.surface());

    }
}
