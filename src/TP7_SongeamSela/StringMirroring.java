package TP7_SongeamSela;

import java.util.Scanner;

public class StringMirroring {
    public static void main(String[] args) {
        System.out.println("Mirror String ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String s1= sc.nextLine();

        String s2= "";
        int i=s1.length()-1;
        while (i>=0){
            s2+=s1.charAt(i);
            i--;
        }
        System.out.println("Mirrored string: "+s1+s2);
    }
}
