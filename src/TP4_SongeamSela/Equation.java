package TP4_SongeamSela;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        int y,z;
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Program for calculating equation 1/x = 1/y + 1/z");
        System.out.print("Please input y: ");
        y=Integer.parseInt(sc.nextLine());
        System.out.print("Please input z: ");
        z=Integer.parseInt(sc.nextLine());
        x=(double)(y*z)/(y+z);
        System.out.println("Result x= "+x);

    }
}
