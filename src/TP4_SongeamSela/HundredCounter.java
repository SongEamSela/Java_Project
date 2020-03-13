package TP4_SongeamSela;

import java.util.Scanner;

public class HundredCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Input positive number : ");
        n=Integer.parseInt(sc.nextLine());

        int count=n/100;
        System.out.println("There are "+ count +" hundred in number "+n);
    }
}
