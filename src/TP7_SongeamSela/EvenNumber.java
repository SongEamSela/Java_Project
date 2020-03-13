package TP7_SongeamSela;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Start number: ");
        int i= sc.nextInt();
        while (i<=500){
            if (i%2==0)
                System.out.print(i+",");
            i++;
        }
    }
}
