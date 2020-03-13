package TP7_SeunSiuphing;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float profit=0;
        for (int i=1 ;i<=12 ; i++){
            System.out.print("Profit for month "+(i)+": ");
            float m =s.nextFloat();
            profit=profit+m;
        }
        System.out.println("Total profits for 12 months: "+profit);
    }
}
