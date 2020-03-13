package TP7_SeunSiuphing;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Input number to check whether it is prime number: ");
        int number = s.nextInt();
        int j=0;
        int i=2;
        while (i<=number){
            if(number%i==0){
                j++;
            }
            i++;
        }
        if(j==0){
            System.out.println(number +" is a prime number");
        }
        else{
            System.out.println(number +" is not a prime number");
        }
    }
}
