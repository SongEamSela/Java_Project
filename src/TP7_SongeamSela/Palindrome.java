package TP7_SongeamSela;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Check Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give a word to check : ");
        String w1 = sc.nextLine();
        String w2= "";
        int i=w1.length()-1;
        while (i>=0){
            w2+=w1.charAt(i);
            i--;
        }
        if (w1.equals(w2))
            System.out.println(w1+ " is a palindrome");
        else
            System.out.println(w1+ " is not a palindrome");

    }
}
