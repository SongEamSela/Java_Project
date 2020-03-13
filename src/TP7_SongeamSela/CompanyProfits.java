package TP7_SongeamSela;

import java.util.Scanner;

public class CompanyProfits {
    public static void main(String[] args) {
        float[] month = new float[12];
        float profit =0;
        int i=0;
        Scanner sc = new Scanner(System.in);
        while (i<12){
            System.out.print("Profit for month "+(i+1)+": ");
            month[i]=sc.nextFloat();
            profit = profit+ month[i];
            i++;
        }

        System.out.println("Total profit for 12 months :  "+ profit);
    }
}
