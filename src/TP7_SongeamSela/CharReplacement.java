package TP7_SongeamSela;

import java.util.Scanner;

public class CharReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String s= sc.nextLine();

        s=s.replaceAll("\\\\n" , "(New_line)");
        s=s.replaceAll("\\\\t" , "(tab)");
        s=s.replaceAll("\\\\\\\\" , "(slash)");
        s=s.replaceAll("//" , "(comment_line)");
        s=s.replaceAll(":\\)" , "(smile)");

        System.out.println("\n"+s);

    }
}
