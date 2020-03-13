package TP7_SongeamSela;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" Input number to check whether it is prime number: ");
        int num = s.nextInt();
        int count=0;
        int i=2;
        while (i<=num/2){
            if(num%i==0){
                count++;
            }
            i++;
        }

        if(count==0){
            System.out.println(num +" is a prime number");
        }
        else
            System.out.println(num +" is not a prime number");
    }
}
