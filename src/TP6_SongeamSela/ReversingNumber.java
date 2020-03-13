package TP6_SongeamSela;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        System.out.println("Program for reversing a 4 digit number");
        System.out.printf("Please input 4 digit number: ");
        Scanner sc =new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int size = Integer.toString(num).length();
        if (size!=4){
            System.out.println("Invalid input number, please input only 4 digit number. ");
        }
        else {
            int reverse=0;
            while (num!=0){
                reverse = reverse * 10;
                reverse = reverse + num % 10;
                num = num / 10;
            }
            System.out.println("After reverse is : "+ reverse);
        }
    }
}
