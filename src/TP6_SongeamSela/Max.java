package TP6_SongeamSela;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Find Maxinum number");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        for (int i=0;i<8;i++){
            System.out.printf("Input number: ");
            num[i]= sc.nextInt();
        }
        int max= num[0];
        for (int i=1;i<8;i++){
            if(max<num[i]){
                max=num[i];
            }
        }

        System.out.println("Maxinum number among 8 number is : "+ max);
    }
}
