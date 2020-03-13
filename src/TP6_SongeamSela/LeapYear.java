package TP6_SongeamSela;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap Year");
        Scanner sc = new Scanner(System.in);
        System.out.print("input Year: ");
        int y= sc.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0 )
            System.out.println(y + " is leap year");
        else
            System.out.println(y+ " is not leap year");
    }
}
