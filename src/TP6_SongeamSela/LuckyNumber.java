package TP6_SongeamSela;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println("Program Testing Lucky Number. ");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Input 6 digits number: ");
        int number= Integer.parseInt(sc.nextLine());
        int size= Integer.toString(number).length();

        if(size!= 6)
            System.out.println("Invalid input number, please input only 6 digit number. ");
        else {
            int[] digit = new int[6];
            digit[0] = number%10;
            digit[1] = ((number%100) - digit[0] )/10;
            digit[2] = ((number%1000) - (number%100) )/100;
            digit[3] = ((number%10000) - (number%1000) )/1000;
            digit[4] = ((number%100000) - (number%10000) )/10000;
            digit[5] = ((number%1000000) - (number%100000) )/100000;

            if (digit[0]+digit[1]+digit[2] == digit[3]+digit[4]+digit[5]){
                System.out.println(number+ " is a lucky number");
            }
            else
                System.out.println(number+ " is a not lucky number");
        }
    }
}
