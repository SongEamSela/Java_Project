package TP6_SongeamSela;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        String divisibleNumber = "";
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Input a positive number : ");
        number =Integer.parseInt(sc.nextLine());
        if(number<=2)
            System.out.println("It is not prime number, "
            +"because it is less than or equal to 2. ");
        else {
            int halfNumber = number/2;
            int i;
            for (i=2;i<halfNumber;i++){
                if (number %i ==0) divisibleNumber+= " "+i;
            }
            if (divisibleNumber.length()>0)
                System.out.println("It is not a prime number, "
                +" because it is divisible by "+ divisibleNumber);
            else System.out.println("It is a prime number. ");
        }


    }
}
