package TP10_SongeamSela;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an Integer A : ");
        String num = sc.nextLine();
        int[] digit = new int[num.length()];
        int sumOfDigit = 0;
        int multiOfDigit = 1;

        for (int i=0; i<num.length();i++){
            digit[i]= Integer.parseInt(String.valueOf(num.charAt(i)));
            sumOfDigit += digit[i];
            multiOfDigit *= digit[i];
        }
        if (Math.pow(sumOfDigit,3)== Integer.parseInt(num) * Integer.parseInt(num) ){
            System.out.println("the cube of the sum of digits of this number is equal to A*A.");
        }
        else
            System.out.println("the cube of the sum of digits of this number is not equal to A*A.");



    }
}
