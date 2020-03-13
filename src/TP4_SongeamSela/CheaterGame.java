package TP4_SongeamSela;

import java.util.Scanner;

public class CheaterGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Program for guessing your luckiness.");
        System.out.print("Please input a positive number : ");
        n=Integer.parseInt(sc.nextLine());
        n=n+1;
        System.out.println("I got "+n+". I am luckier.");

    }
}
