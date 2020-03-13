package TP7_SeunSiuphing;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give a word to check : ");
        String s1 = sc.nextLine();
        String s2= "";
        int index=s1.length()-1;
        while (index>=0){
            s2+=s1.charAt(index);
            index--;
        }
        if (s1.equals(s2)){
            System.out.println(s1+ " is a palindrome");
        }
        else{
            System.out.println(s1+ " is not a palindrome");
        }
    }
}
